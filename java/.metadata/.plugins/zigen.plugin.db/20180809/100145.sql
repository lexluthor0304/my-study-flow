/*�?ータベ�?�ス�?SCHOOL�?を作�?�す�?*/
CREATE DATABASE SCHOOL;

/*  �?ータベ�?�スを�??り替える*/
USE SCHOOL;

/* �?ーブルstudentを作�?�す�?*/
CREATE TABLE student(
    id int PRIMARY KEY,
    name varchar(128),
    grade int
);

/* �?ータの挿入*/
INSERT INTO student (id, name, grade) VALUE(1001, 'Taro YAMADA', 1);
INSERT INTO student (id, name, grade) VALUE(2001, 'Takashi OTA', 2);
INSERT INTO student (id, name, grade) VALUE(3001, 'Atsuko HAYASHI', 3);
INSERT INTO student (id, name, grade) VALUE(4001, 'Jiro ICHIKAWA', 4);

/* 
�?ータの検索
書�?
SELECT 列名?�?, 列名?�?, …�?FROM�?�?ーブル名[条件]
*/

SELECT * FROM student;

SELECT id, name FROM student;