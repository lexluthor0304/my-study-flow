USE school;

/* �e�[�u���̐��� */
CREATE TABLE resource(
    code char(6) PRIMARY KEY,
    name varchar(40) NOT NULL,
    class char(4) NOT NULL,
    price int NOT NULL
);

/* �f�[�^�}�� */
INSERT INTO resource VALUE('100001', '�p��e�L�X�g', 'text', 1500);
INSERT INTO resource VALUE('100002', '���w�e�L�X�g', 'text', 1700);
INSERT INTO resource VALUE('100003', '����e�L�X�g', 'text', 3000);
INSERT INTO resource VALUE('100101', '�p��DVD', 'mdvd', 3000);
INSERT INTO resource VALUE('100102', '���w�w�K�\�t�g', 'sftw',4900);
INSERT INTO resource VALUE('100103', '�p��w�K�\�t�g', 'sftw',5400);
INSERT INTO resource VALUE('100201', '���ꕛ�ǖ{', 'sbtx', 1100);
INSERT INTO resource VALUE('100202', '�p����W', 'pbbk', 2100);
INSERT INTO resource VALUE('100203', '���w���W', 'pbbk', 2100);
INSERT INTO resource VALUE('100C01', '�p�ꎫ��', 'dict', 8210);

/* �S�f�[�^�̌��� */
SELECT * FROM resource;