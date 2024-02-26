create database bloom;
grant all privileges on bloom.* to ohgiraffers@'%';
use bloom;
DROP TABLE IF EXISTS report;

CREATE TABLE IF NOT EXISTS report
(
    rep_no    INT AUTO_INCREMENT COMMENT '신고번호',
    rep_mem    VARCHAR(30) NOT NULL COMMENT '신고회원',
    rep_rmem    VARCHAR(30) NOT NULL COMMENT '피신고회원',
    rep_rea      VARCHAR(3000) NOT NULL COMMENT '신고사유',
    rep_date   DATETIME   NOT NULL COMMENT '신고날짜',
    PRIMARY KEY (rep_no)
    ) ENGINE=INNODB COMMENT '신고';

select * from report;


INSERT INTO REPORT (report_mem, report_rmem, report_rea, report_date)
VALUES('이후영', '후뿌뿡', '배가너무 고픔', );