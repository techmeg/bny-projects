-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: wkc
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `contest`
--

DROP TABLE IF EXISTS `contest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `contest` (
  `id` bigint(20) NOT NULL,
  `contestBlurb` varchar(255) DEFAULT NULL,
  `contestName` varchar(255) DEFAULT NULL,
  `deadline` datetime DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `winner_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKcabty9lun62vhb9pdi5f2ie2t` (`winner_id`),
  CONSTRAINT `FKcabty9lun62vhb9pdi5f2ie2t` FOREIGN KEY (`winner_id`) REFERENCES `winner` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contest`
--

LOCK TABLES `contest` WRITE;
/*!40000 ALTER TABLE `contest` DISABLE KEYS */;
INSERT INTO `contest` VALUES (53,'If you don\'t want to curl up and pet these purr-fect cats, well you just aren\'t cat-parent material. Choose the one you\'d most like to snuggle up with.\"','Sweet sleepers (awwww)! ','2019-05-14 23:00:00','current',NULL),(58,'Your little tiger or tigress can make some pretty ferocious faces. You know \"the look\" when you\'ve been away. Or maybe played too hard. Let\'s see them.','Fiercest Kitty Face','2019-05-21 23:00:00','next',NULL),(59,'Like that troublesome cat in Dr. Seuss\' famous story. Berets, top hats, wooly hats. Kitties on Easter parade!','Cats in Hats','2019-05-28 23:00:00','future',NULL),(98,'flub','MORE FLUB','2012-12-12 00:00:00','flub',NULL),(101,'CONTEST INFO','NEW CONTEST','2019-06-11 23:00:00','future',NULL);
/*!40000 ALTER TABLE `contest` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-15 23:06:46
