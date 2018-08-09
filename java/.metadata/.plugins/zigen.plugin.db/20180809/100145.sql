/*ãƒ?ãƒ¼ã‚¿ãƒ™ã?¼ã‚¹ã€?SCHOOLã€?ã‚’ä½œæ?ã™ã‚?*/
CREATE DATABASE SCHOOL;

/*  ãƒ?ãƒ¼ã‚¿ãƒ™ã?¼ã‚¹ã‚’å??ã‚Šæ›¿ãˆã‚‹*/
USE SCHOOL;

/* ãƒ?ãƒ¼ãƒ–ãƒ«studentã‚’ä½œæ?ã™ã‚?*/
CREATE TABLE student(
    id int PRIMARY KEY,
    name varchar(128),
    grade int
);

/* ãƒ?ãƒ¼ã‚¿ã®æŒ¿å…¥*/
INSERT INTO student (id, name, grade) VALUE(1001, 'Taro YAMADA', 1);
INSERT INTO student (id, name, grade) VALUE(2001, 'Takashi OTA', 2);
INSERT INTO student (id, name, grade) VALUE(3001, 'Atsuko HAYASHI', 3);
INSERT INTO student (id, name, grade) VALUE(4001, 'Jiro ICHIKAWA', 4);

/* 
ãƒ?ãƒ¼ã‚¿ã®æ¤œç´¢
æ›¸å¼?
SELECT åˆ—å?¼?, åˆ—å?¼?, â€¦ã€?FROMã€?ãƒ?ãƒ¼ãƒ–ãƒ«å[æ¡ä»¶]
*/

SELECT * FROM student;

SELECT id, name FROM student;