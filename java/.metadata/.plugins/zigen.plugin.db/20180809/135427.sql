USE school;

/*
テーブルscoreを作る
*/
CREATE TABLE score(
    id INT NOT NULL,
    math INT NOT NULL,
    english INT NOT NULL,
    science INT NOT NULL
);

/*
データ挿入
*/
INSERT INTO score (id, math, english, science) VALUE(1001, 90, 80, 95);
INSERT INTO score (id, math, english, science) VALUE(2001, 52, 60, 100);
INSERT INTO score (id, math, english, science) VALUE(3001, 76, 98, 64);
INSERT INTO score (id, math, english, science) VALUE(3002, 30, 20, 45);

select * from score;