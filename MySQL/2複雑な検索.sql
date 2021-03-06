/* テーブルの生成 */
CREATE TABLE resource(
    code char(6) PRIMARY KEY,
    name varchar(40) NOT NULL,
    class char(4) NOT NULL,
    price int NOT NULL
);

/* データ挿入 */
INSERT INTO resource VALUE('100001', '英語テキスト', 'text', 2500);
INSERT INTO resource VALUE('100002', '数学テキスト', 'text', 2700);
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

/*条件付き検索*/
SELECT name, price FROM `resource` WHERE class='text';

/*
演算子
AND
OR
BETWEEN
IN
*/
SELECT name, price FROM `resource` WHERE price>=3000 AND price<=5000;

SELECT name, price FROM `resource` WHERE class='text' OR class='pbbk';

SELECT name, price FROM `resource` WHERE price BETWEEN 2000 AND 5000;

SELECT name, price FROM `resource` WHERE class IN ('sftw', 'pbbk');

SELECT name, price FROM `resource` WHERE code LIKE '1001%';

/*
順序としては、まず()内のSQL文が実行されます。
まず、()内で、resourceテーブルからpriceが2700となる行の、
カラムclassの値を取得します。
その結果は、「text」なので、外側のSELECT文で、
classが「text」となる行をすべて検索し、表示しています。
*/

SELECT * FROM `resource` WHERE class=(SELECT class FROM `resource` WHERE price = 2700);

/*　
並び替え　
ORDER BY
ASC昇順
DESC降順
*/

SELECT * FROM `resource` ORDER BY price ASC;

/*
複数のデータの並び替え
*/

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

/*
並び替えルール
*/

SELECT * FROM score ORDER BY math DESC, english ASC;
SELECT * FROM score ORDER BY science ASC, english DESC;

/*
集約
*/
SELECT class FROM `resource` GROUP BY class;
SELECT DISTINCT class FROM `resource`; /* 重複のを除くだけ */

/*
集計と関数
*/

SELECT class, AVG(price) FROM `resource` GROUP BY class;

/*
HAVING
必ず GROUP BY + HAVING　のセットで使う
*/

SELECT class, AVG(price) FROM `resource` GROUP BY class HAVING COUNT(class) >= 2;

/*
テーブル結合
INNER JOIN
SELECT テーブル名.カラム名, ... FROM テーブル名1 INNER JOIN テーブル名2 ON テーブル名1.カラム名1 = テーブル名2.カラム名2;
*/

CREATE TABLE class_name(
    class char(4) NOT NULL,
    name varchar(10) NOT NULL
);

INSERT INTO class_name (class, name) VALUE('text','教科書');
INSERT INTO class_name (class, name) VALUE('mdvd','マルチメディアDVD');
INSERT INTO class_name (class, name) VALUE('sftw','ソフトウェア');
INSERT INTO class_name (class, name) VALUE('sbtx','副読本');
INSERT INTO class_name (class, name) VALUE('pbbk','問題集');
INSERT INTO class_name (class, name) VALUE('dict','辞書');
INSERT INTO class_name (class, name) VALUE('comp','コンピューター');

SELECT * FROM `resource` INNER JOIN class_name ON resource.class = class_name.class;

/*
USINGの場合
SELECT * FROM テーブル１ INNER JOIN テーブル２ USING(列名);
*/

SELECT * FROM `resource` INNER JOIN class_name USING(class);

SELECT code, resource.name, price, class_name.name FROM `resource` INNER JOIN class_name USING(class);

/*
交差結合
SELECT * FROM テーブル１ CROSS JOIN テーブル２;
*/

SELECT * FROM `resource` CROSS JOIN class_name; /*WHERE条件を付けても可*/

SELECT * FROM `resource` CROSS JOIN class_name WHERE resource.class = class_name.class; 

/*
外部結合
例文１（左から結合）：SELECT テーブル.カラム名, ...FROM テーブル名１ LEFT OUTER JOIN テーブル名２ ON テーブル1.カラム名1 = テーブル2.カラム名2
例文２（右から結合）：SELECT テーブル.カラム名, ...FROM テーブル名１ RIGHT OUTER JOIN テーブル名２ ON テーブル1.カラム名1 = テーブル2.カラム名2
*/

CREATE TABLE purchase_history(
    date DATE NOT NULL,
    code CHAR(6) NOT NULL,
    num INT NOT NULL
);

INSERT INTO purchase_history(date, code, num) VALUE('2013/1/13', '100001', 100);
INSERT INTO purchase_history(date, code, num) VALUE('2013/1/17', '100002', 20);
INSERT INTO purchase_history(date, code, num) VALUE('2013/2/1', '100103', 31);
INSERT INTO purchase_history(date, code, num) VALUE('2013/2/3', '100101', 5);
INSERT INTO purchase_history(date, code, num) VALUE('2013/3/5', '100203', 31);
INSERT INTO purchase_history(date, code, num) VALUE('2013/3/12', '100003', 13);
INSERT INTO purchase_history(date, code, num) VALUE('2013/4/30', '100201', 24);
INSERT INTO purchase_history(date, code, num) VALUE('2013/5/9', '100001', 50);
INSERT INTO purchase_history(date, code, num) VALUE('2013/7/19', '100C02', 10);
INSERT INTO purchase_history(date, code, num) VALUE('2013/8/25', '100102', 5);

SELECT * FROM purchase_history LEFT OUTER JOIN resource ON purchase_history.code = resource.code;/*左から*/
SELECT * FROM purchase_history RIGHT OUTER JOIN resource ON purchase_history.code = resource.code;/*右から*/

SELECT * FROM purchase_history LEFT OUTER JOIN resource USING(code);/*左から （USINGの場合）*/
SELECT * FROM purchase_history RIGHT OUTER JOIN resource USING(code);/*右から （USINGの場合）*/

/*内部結合が、共通部分があるものしか結合しないのに対して、
外部結合は、共通部分がない行も結合し、該当するデータがないカラムには、
NULLを入れて出力する*/

SELECT * FROM purchase_history INNER JOIN resource USING(code);/*内部結合の場合*/

/*
複数のテーブルを結合
*/

SELECT date, code, resource.name, class_name.name, num, price 
FROM purchase_history INNER JOIN resource USING(code) 
INNER JOIN class_name USING(class);

/*
データ更新
UPDATE テーブル名 SET 列名1 = 値1, 列名2 = 値2, …WHERE [条件];
*/

UPDATE resource SET price = price + 10 WHERE class='text';

/*
データ型を変更
*/

ALTER TABLE tempTbl CHANGE TO_TEL TO_TELEPHONE VARCHAR(11);