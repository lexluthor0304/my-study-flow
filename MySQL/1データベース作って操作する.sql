# データベース　SCHOOL　を作成する
CREATE DATABASE SCHOOL;

# データベースを切り替える
USE SCHOOL;

# テーブルstudentを作成する
CREATE TABLE student(
    id int PRIMARY KEY,
    name varchar(128),
    grade int
);

#データの挿入
INSERT INTO student (id, name, grade) VALUE(1001,'山田太郎',1);