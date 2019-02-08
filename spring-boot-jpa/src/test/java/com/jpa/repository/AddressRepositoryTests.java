package com.jpa.repository;

import com.jpa.model.Address;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressRepositoryTests {

    @Resource
    private AddressRepository addressRepository;

    @Test
    public void testSave() {

        addressRepository.save(new Address(1L, "sinagawaku", "tokyo", "sinagawa1"));
        addressRepository.save(new Address(2L, "墨田区", "東京都", "緑1-4-6"));
    }
}
