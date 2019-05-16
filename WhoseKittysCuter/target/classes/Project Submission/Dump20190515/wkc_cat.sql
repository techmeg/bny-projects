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
-- Table structure for table `cat`
--

DROP TABLE IF EXISTS `cat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cat` (
  `Cat_Id` bigint(20) NOT NULL,
  `Cat_Description` varchar(255) DEFAULT NULL,
  `Cat_Name` varchar(255) DEFAULT NULL,
  `Number_Votes` int(11) DEFAULT NULL,
  `Photo_Link` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Cat_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cat`
--

LOCK TABLES `cat` WRITE;
/*!40000 ALTER TABLE `cat` DISABLE KEYS */;
INSERT INTO `cat` VALUES (85,'Olive is the prettiest cat awake or asleep.','Olive',50,'sleep-oliver.jpg'),(86,'Swede is a big old cat, with a mean streak and a long memory. But he looks pretty sweet when asleep.','Swede',55,'sleep-swede.jpg'),(88,'Chloe is Chloe','Chloe',12,'sleep-chloe.jpg'),(89,'Leo is a lion!','Leo',87,'sleep-leo.jpg'),(90,'Nala is a jungle kitty, but she sleeps like a pussycat. She likes catnip toys and shredding the furniture.','Nala',52,'sleep-nala.jpg'),(91,'This is one snoozy kitty, but fun when she wakes up.','Smokey',17,'sleep-smokey.jpg'),(97,'Lily is a hungry kitty!','Lily',1,'sleep-lily.jpg'),(99,'This is Nilda\'s Cat!!','Nilda\'s cat',99,'nildas-cat.jpg'),(100,'Not sleeping...ran out of sleeping pictures.','Joe',23,'jae-park-1198084-unsplash.jpg'),(105,'Named after the spy, not because he is smiley.','Smiley',1,'matyas-burnek-1291487-unsplash.jpg');
/*!40000 ALTER TABLE `cat` ENABLE KEYS */;
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
