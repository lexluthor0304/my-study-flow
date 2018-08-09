USE school;

/* テーブルの生成 */
CREATE TABLE resource(
    code char(6) PRIMARY KEY,
    name varchar(40) NOT NULL,
    class char(4) NOT NULL,
    price int NOT NULL
);

/* データ挿入 */
INSERT INTO resource VALUE('100001', '英語テキスト', 'text', 1500);
INSERT INTO resource VALUE('100002', '数学テキスト', 'text', 1700);
INSERT INTO resource VALUE('100003', '国語テキスト', 'text', 3000);
INSERT INTO resource VALUE('100101', '英語DVD', 'mdvd', 3000);
INSERT INTO resource VALUE('100102', '数学学習ソフト', 'sftw',4900);
INSERT INTO resource VALUE('100103', '英語学習ソフト', 'sftw',5400);
INSERT INTO resource VALUE('100201', '国語副読本', 'sbtx', 1100);
INSERT INTO resource VALUE('100202', '英語問題集', 'pbbk', 2100);
INSERT INTO resource VALUE('100203', '数学問題集', 'pbbk', 2100);
INSERT INTO resource VALUE('100C01', '英語辞書', 'dict', 8210);

/* 全データの検索 */
SELECT * FROM resource;