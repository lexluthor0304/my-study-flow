/*データベース　SCHOOL　を作成する*/
CREATE DATABASE SCHOOL;

/*  データベースを切り替える*/
USE SCHOOL;

/* テーブルstudentを作成する*/
CREATE TABLE student(
    id int PRIMARY KEY,
    name varchar(128),
    grade int
);

/* データの挿入*/
INSERT INTO student (id, name, grade) VALUE(1001, 'Taro YAMADA', 1);
INSERT INTO student (id, name, grade) VALUE(2001, 'Takashi OTA', 2);
INSERT INTO student (id, name, grade) VALUE(3001, 'Atsuko HAYASHI', 3);
INSERT INTO student (id, name, grade) VALUE(4001, 'Jiro ICHIKAWA', 4);

/* 
データの検索
書式
SELECT 列名１, 列名２, …　FROM　テーブル名[条件]
*/

SELECT * FROM student;

SELECT id, name FROM student;