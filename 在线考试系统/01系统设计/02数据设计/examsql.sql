/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.53 : Database - exam
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`exam` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `exam`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `adid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号 adid',
  `adname` varchar(10) DEFAULT NULL COMMENT '用户名 adname',
  `adpw` varchar(8) DEFAULT NULL COMMENT '密码 adpw',
  `qx` varchar(2) DEFAULT NULL COMMENT '权限 qx(1,2)',
  PRIMARY KEY (`adid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin` */

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `cid` int(11) NOT NULL AUTO_INCREMENT COMMENT '课程号（cid）',
  `cname` varchar(10) DEFAULT NULL COMMENT '课程名称 cname',
  `zyname` varchar(10) DEFAULT NULL COMMENT '专业名称 zyname',
  `tname` varchar(10) DEFAULT NULL COMMENT '任课老师 tname',
  `caddtime` datetime DEFAULT NULL COMMENT '添加时间 caddtime',
  `cupdatetime` datetime DEFAULT NULL COMMENT '修改时间 cupdatetime',
  `caddperson` varchar(10) DEFAULT NULL COMMENT '添加人 caddperson',
  `cupdateperson` varchar(10) DEFAULT NULL COMMENT '修改人 cupdateperson',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `course` */

/*Table structure for table `dj` */

DROP TABLE IF EXISTS `dj`;

CREATE TABLE `dj` (
  `djid` int(11) NOT NULL AUTO_INCREMENT COMMENT '答卷 djid',
  `khid` int(11) DEFAULT NULL COMMENT '考号（外）khid',
  `sjid` int(11) DEFAULT NULL COMMENT '，试卷号（外） sjid',
  `ksda` char(100) DEFAULT NULL COMMENT '考生答案 ksda',
  `score` int(11) DEFAULT NULL COMMENT '得分 score',
  `isreade` varchar(2) DEFAULT NULL COMMENT '是否己批卷 isreade',
  `djaddtime` datetime DEFAULT NULL COMMENT '添加时间 djaddtime',
  `djupdatetime` datetime DEFAULT NULL COMMENT '修改时间 djupdatetime',
  `djaddperson` varchar(10) DEFAULT NULL COMMENT '添加人 djaddperson',
  `djupdateperson` varchar(10) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`djid`),
  KEY `fk_khid` (`khid`),
  CONSTRAINT `fk_khid` FOREIGN KEY (`khid`) REFERENCES `students` (`khid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dj` */

/*Table structure for table `jky` */

DROP TABLE IF EXISTS `jky`;

CREATE TABLE `jky` (
  `jkid` int(11) NOT NULL AUTO_INCREMENT,
  `jkcourse` varchar(10) DEFAULT NULL COMMENT '监考课程',
  `jkname` varchar(10) DEFAULT NULL COMMENT '姓名 jkname',
  `jkpw` varchar(13) DEFAULT NULL COMMENT '密码',
  `jkaddtime` datetime DEFAULT NULL COMMENT '添加时间',
  `jkupdatetime` datetime DEFAULT NULL COMMENT '修改时间',
  `jkaddperson` varchar(10) DEFAULT NULL COMMENT '添加人',
  `jkupdateperson` varchar(10) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`jkid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `jky` */

/*Table structure for table `kcxx` */

DROP TABLE IF EXISTS `kcxx`;

CREATE TABLE `kcxx` (
  `kcid` int(11) NOT NULL AUTO_INCREMENT,
  `kcname` varchar(10) DEFAULT NULL COMMENT '课程名称',
  `kcnum` int(11) DEFAULT NULL COMMENT '总人数 kcnum',
  `badnum` int(11) DEFAULT NULL COMMENT '作弊人数 badnum',
  `nullnum` int(11) DEFAULT NULL COMMENT '缺考人数 nullnum',
  `jkname` varchar(10) DEFAULT NULL COMMENT '监考人',
  `kcno` varchar(8) DEFAULT NULL COMMENT '考场编号 kcno',
  `kccomments` varchar(50) DEFAULT NULL COMMENT '备注）kccomments',
  `kcaddtime` datetime DEFAULT NULL COMMENT '添加时间',
  `kcupdatetime` datetime DEFAULT NULL COMMENT '修改时间',
  `kcaddperson` varchar(10) DEFAULT NULL COMMENT '添加人',
  `kcupdateperson` varchar(10) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`kcid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `kcxx` */

/*Table structure for table `ksda` */

DROP TABLE IF EXISTS `ksda`;

CREATE TABLE `ksda` (
  `daid` int(11) NOT NULL AUTO_INCREMENT,
  `stid` int(11) DEFAULT NULL COMMENT '试题号（外）stid',
  `dacontain` char(100) DEFAULT NULL COMMENT '答案内容 dacontain',
  `daaddtime` datetime DEFAULT NULL COMMENT '添加时间',
  `daupdatetime` datetime DEFAULT NULL COMMENT '修改时间',
  `daaddperson` varchar(10) DEFAULT NULL COMMENT '添加人',
  `daupdateperson` varchar(10) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`daid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ksda` */

/*Table structure for table `sj` */

DROP TABLE IF EXISTS `sj`;

CREATE TABLE `sj` (
  `sjid` int(11) NOT NULL AUTO_INCREMENT COMMENT '试卷号（sjid）',
  `sjname` varchar(8) DEFAULT NULL COMMENT '试卷名称 sjname',
  `kstime` datetime DEFAULT NULL COMMENT '考试时间 kstime',
  `rjrno` varchar(8) DEFAULT NULL COMMENT '阅卷人编号 rjrno',
  `cjrq` datetime DEFAULT NULL COMMENT '出圈日期 cjrq',
  `delay` varchar(2) DEFAULT NULL COMMENT '是否延时 delay',
  `delaypw` varchar(8) DEFAULT NULL COMMENT '延时口令 delaypw',
  `sjaddtime` datetime DEFAULT NULL COMMENT '添加时间',
  `sjupdatetime` datetime DEFAULT NULL COMMENT '修改时间',
  `sjaddperson` varchar(10) DEFAULT NULL COMMENT '添加人',
  `sjupdateperson` varchar(10) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`sjid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sj` */

/*Table structure for table `students` */

DROP TABLE IF EXISTS `students`;

CREATE TABLE `students` (
  `khid` int(11) NOT NULL AUTO_INCREMENT COMMENT '考号ID',
  `zyid` int(11) DEFAULT NULL COMMENT '专业zyid',
  `sname` varchar(10) DEFAULT NULL COMMENT '姓名 sname',
  `ssex` varchar(2) DEFAULT NULL COMMENT '性别ssex',
  `spw` varchar(8) DEFAULT NULL COMMENT '密码 spw',
  `addtime` datetime DEFAULT NULL COMMENT '添加时间',
  `supdatetime` datetime DEFAULT NULL COMMENT '修改时间',
  `saddperson` varchar(8) DEFAULT NULL COMMENT '添加人',
  `supdateperson` varchar(8) DEFAULT NULL COMMENT '修改人',
  `scomments` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`khid`),
  KEY `fk_zyid` (`zyid`),
  CONSTRAINT `fk_zyid` FOREIGN KEY (`zyid`) REFERENCES `zy` (`zyid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `students` */

/*Table structure for table `teachers` */

DROP TABLE IF EXISTS `teachers`;

CREATE TABLE `teachers` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `tname` varchar(10) DEFAULT NULL COMMENT '姓名',
  `tno` varchar(13) DEFAULT NULL COMMENT '工号',
  `taddtime` datetime DEFAULT NULL COMMENT '密码 tpw',
  `tupdatetime` datetime DEFAULT NULL COMMENT '添加时间',
  `taddperson` varchar(10) DEFAULT NULL COMMENT '修改时间',
  `tupdateperson` varchar(10) DEFAULT NULL COMMENT '添加人',
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teachers` */

/*Table structure for table `testquestion` */

DROP TABLE IF EXISTS `testquestion`;

CREATE TABLE `testquestion` (
  `stid` int(11) NOT NULL AUTO_INCREMENT COMMENT '题号（ stid）',
  `cid` int(11) DEFAULT NULL COMMENT '课程号',
  `type` varchar(8) DEFAULT NULL COMMENT '题型',
  `contain` char(255) DEFAULT NULL COMMENT '试题内容',
  `answer` char(100) DEFAULT NULL COMMENT '答案',
  `degree` varchar(30) DEFAULT NULL COMMENT '分值',
  `tid` int(11) DEFAULT NULL COMMENT '出卷教师',
  `staddtime` datetime DEFAULT NULL COMMENT '添加时间',
  `stupdatetime` datetime DEFAULT NULL COMMENT '修改时间',
  `staddperson` varchar(10) DEFAULT NULL COMMENT '添加人',
  `stupdateperson` varchar(10) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`stid`),
  KEY `fk_cid` (`cid`),
  KEY `fk_tid` (`tid`),
  CONSTRAINT `fk_tid` FOREIGN KEY (`tid`) REFERENCES `teachers` (`tid`),
  CONSTRAINT `fk_cid` FOREIGN KEY (`cid`) REFERENCES `course` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `testquestion` */

/*Table structure for table `tt` */

DROP TABLE IF EXISTS `tt`;

CREATE TABLE `tt` (
  `ttid` int(11) NOT NULL AUTO_INCREMENT COMMENT '抽卷 ttid',
  `sjid` int(11) DEFAULT NULL COMMENT '试卷号（外）sjid',
  `stid` int(11) DEFAULT NULL COMMENT '题号',
  `ttaddtime` datetime DEFAULT NULL COMMENT '添加时间',
  `ttupdatetime` datetime DEFAULT NULL COMMENT '修改时间',
  `ttaddperson` varchar(10) DEFAULT NULL COMMENT '添加人',
  `ttupdateperson` varchar(10) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`ttid`),
  KEY `fk_sjid` (`sjid`),
  KEY `fk_stid` (`stid`),
  CONSTRAINT `fk_stid` FOREIGN KEY (`stid`) REFERENCES `testquestion` (`stid`),
  CONSTRAINT `fk_sjid` FOREIGN KEY (`sjid`) REFERENCES `sj` (`sjid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tt` */

/*Table structure for table `zy` */

DROP TABLE IF EXISTS `zy`;

CREATE TABLE `zy` (
  `zyid` int(11) NOT NULL AUTO_INCREMENT,
  `zyno` varchar(10) DEFAULT NULL COMMENT '专业代号',
  `zyname` varchar(10) DEFAULT NULL COMMENT '专业名称',
  `zyaddtime` datetime DEFAULT NULL COMMENT '添加时间',
  `zyupdatetime` datetime DEFAULT NULL COMMENT '修改时间',
  `zyaddperson` varchar(10) DEFAULT NULL COMMENT '添加人',
  `zyupdateperson` varchar(10) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`zyid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `zy` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
