DROP TABLE IF EXISTS `proprietario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proprietario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cpf` int(11) DEFAULT NULL,
  `estado_civil` varchar(255) DEFAULT NULL,
  `nacionalidade` varchar(80) NOT NULL,
  `name` varchar(180) NOT NULL,
  `rg` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_e77cl3xeb01lpy2vhsutsxeaa` (`cpf`)
)