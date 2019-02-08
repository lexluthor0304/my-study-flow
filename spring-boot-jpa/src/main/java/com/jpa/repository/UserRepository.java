package com.jpa.repository;

import com.jpa.model.User;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);

    /*
    カスタムクエリには
    BTW
    And , Or などを使用するのが可能
     */
//    void deleteById(Long id);
//
//    List<User> findByEmailLike(String email);
//    User findByUserNameIgnoreCase(String userName);
//    List<User> findByUserNameOrderByEmailDesc(String email);

    /**
     * 削除と更新する際には
     * @Transactionalと
     * @Modifyingは
     * 必要となってる
     * */
    @Transactional(timeout = 10)
    @Modifying
    @Query("update User set userName = ?1 where id = ?2")
    int modifyById(String userName, Long id);

    @Transactional
    @Modifying
    @Query("delete from User where id = ?1")
    void deleteById(Long id);

    @Query("select u from User u where u.email = ?1")
    User findByEmail(String email);

    @Query("select u from User u")
    Page<User> findAll(Pageable pageable);

    Page<User> findByNickName(String nickName, Pageable pageable);

    Page<User> findByNickNameAndEmail(String nickName, String email, Pageable pageable);

    /**
    Keyword	Sample	JPQL snippet
    And	findByLastnameAndFirstname	… where x.lastname = ?1 and x.firstname = ?2
    Or	findByLastnameOrFirstname	… where x.lastname = ?1 or x.firstname = ?2
    Is，Equals	findByFirstnameIs，findByFirstnameEquals	… where x.firstname = ?1
    Between	findByStartDateBetween	… where x.startDate between ?1 and ?2
    LessThan	findByAgeLessThan	… where x.age < ?1
    LessThanEqual	findByAgeLessThanEqual	… where x.age ⇐ ?1
    GreaterThan	findByAgeGreaterThan	… where x.age > ?1
    GreaterThanEqual	findByAgeGreaterThanEqual	… where x.age >= ?1
    After	findByStartDateAfter	… where x.startDate > ?1
    Before	findByStartDateBefore	… where x.startDate < ?1
    IsNull	findByAgeIsNull	… where x.age is null
    IsNotNull，NotNull	findByAge(Is)NotNull	… where x.age not null
    Like	findByFirstnameLike	… where x.firstname like ?1
    NotLike	findByFirstnameNotLike	… where x.firstname not like ?1
    StartingWith	findByFirstnameStartingWith	… where x.firstname like ?1 (parameter bound with appended %)
    EndingWith	findByFirstnameEndingWith	… where x.firstname like ?1 (parameter bound with prepended %)
    Containing	findByFirstnameContaining	… where x.firstname like ?1 (parameter bound wrapped in %)
    OrderBy	findByAgeOrderByLastnameDesc	… where x.age = ?1 order by x.lastname desc
    Not	findByLastnameNot	… where x.lastname <> ?1
    In	findByAgeIn(Collection ages)	… where x.age in ?1
    NotIn	findByAgeNotIn(Collection age)	… where x.age not in ?1
    TRUE	findByActiveTrue()	… where x.active = true
    FALSE	findByActiveFalse()	… where x.active = false
    IgnoreCase	findByFirstnameIgnoreCase	… where UPPER(x.firstame) = UPPER(?1)
     */


}
