/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.6.24 : Database - project
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`project` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `project`;

/*Table structure for table `checkingin` */

DROP TABLE IF EXISTS `checkingin`;

CREATE TABLE `checkingin` (
  `Id` int(11) NOT NULL,
  `Eid` int(11) NOT NULL,
  `Date` date NOT NULL,
  `CheckIn` int(11) NOT NULL DEFAULT '0',
  `CheckOut` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`Id`),
  KEY `Eid` (`Eid`),
  CONSTRAINT `Eid` FOREIGN KEY (`Eid`) REFERENCES `employees` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `checkingin` */

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `createTime` date NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `department` */

/*Table structure for table `employees` */

DROP TABLE IF EXISTS `employees`;

CREATE TABLE `employees` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Password` varchar(30) NOT NULL,
  `Number` int(11) NOT NULL,
  `comeTime` date NOT NULL,
  `Status` varchar(30) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employees` */

/*Table structure for table `friend` */

DROP TABLE IF EXISTS `friend`;

CREATE TABLE `friend` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Password` varchar(30) NOT NULL,
  `Nickname` varchar(30) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `friend` */

insert  into `friend`(`Id`,`Password`,`Nickname`) values (1,'1',''),(2,'1','0'),(3,'1','2'),(4,'','0'),(5,'123','asd'),(6,'',''),(7,'1','1');

/*Table structure for table `message` */

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `createTime` datetime NOT NULL,
  `sender` int(11) NOT NULL,
  `Target` int(11) NOT NULL,
  `Context` varchar(30) NOT NULL,
  `Course` varchar(30) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `message` */

/*Table structure for table `overtime` */

DROP TABLE IF EXISTS `overtime`;

CREATE TABLE `overtime` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Eid` int(11) NOT NULL,
  `begin` date NOT NULL,
  `end` date NOT NULL,
  `Last` date NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `Eids` (`Eid`),
  CONSTRAINT `Eids` FOREIGN KEY (`Eid`) REFERENCES `employees` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `overtime` */

/*Table structure for table `position` */

DROP TABLE IF EXISTS `position`;

CREATE TABLE `position` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(30) CHARACTER SET latin1 NOT NULL,
  `Lv` int(11) NOT NULL,
  `createTime` date NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `position` */

/*Table structure for table `resume` */

DROP TABLE IF EXISTS `resume`;

CREATE TABLE `resume` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `createTime` date NOT NULL,
  `Name` varchar(30) NOT NULL,
  `selfIntroduction` varchar(30) NOT NULL,
  `Phone` int(20) NOT NULL,
  `Education` varchar(30) NOT NULL,
  `Major` varchar(30) NOT NULL,
  `graduateInstitutions` varchar(30) NOT NULL,
  `languageSkill` varchar(30) NOT NULL,
  `Location` varchar(30) NOT NULL,
  `iDNumber` int(30) NOT NULL,
  `Gender` tinyint(1) NOT NULL,
  `Birth` date NOT NULL,
  `Nativeplace` varchar(30) NOT NULL,
  `Experience` varchar(30) NOT NULL,
  `Achievement` varchar(30) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `resume` */

/*Table structure for table `salary` */

DROP TABLE IF EXISTS `salary`;

CREATE TABLE `salary` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Date` date NOT NULL,
  `sendTime` date NOT NULL,
  `Base` double NOT NULL,
  `socialSecurity` double NOT NULL,
  `Eid` int(11) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `Eidsss` (`Eid`),
  CONSTRAINT `Eidsss` FOREIGN KEY (`Eid`) REFERENCES `employees` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `salary` */

/*Table structure for table `salaryabout` */

DROP TABLE IF EXISTS `salaryabout`;

CREATE TABLE `salaryabout` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Eid` int(11) NOT NULL,
  `Money` double NOT NULL,
  `Cause` varchar(30) NOT NULL,
  `time` date NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `Eidss` (`Eid`),
  CONSTRAINT `Eidss` FOREIGN KEY (`Eid`) REFERENCES `employees` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `salaryabout` */

/*Table structure for table `train` */

DROP TABLE IF EXISTS `train`;

CREATE TABLE `train` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(30) NOT NULL,
  `Time` date NOT NULL,
  `Datails` varchar(30) NOT NULL,
  `Speaker` varchar(30) NOT NULL,
  `Feedback` varchar(30) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `train` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
