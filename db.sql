-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: StonksDB
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cities`
--

DROP TABLE IF EXISTS `cities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cities` (
  `city_id` int NOT NULL AUTO_INCREMENT,
  `image_url` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `original_portal_url` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`city_id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cities`
--

LOCK TABLES `cities` WRITE;
/*!40000 ALTER TABLE `cities` DISABLE KEYS */;
INSERT INTO `cities` VALUES (1,'https://upload.wikimedia.org/wikipedia/commons/e/e5/Bras%C3%A3o_Adamantina.png','Adamantina','http://transparenciadamantina.sp.gov.br/'),(2,'https://www.mbi.com.br/mbi/files/media/image/simbolopedia/municipio-adolfo-brasao-simb-brsesp0100400204.jpg','Adolfo','https://www.adolfo.sp.gov.br/'),(3,'https://upload.wikimedia.org/wikipedia/commons/4/40/Aguai_brasao.png','Aguai','https://aguai.sp.gov.br/home/portal-da-transparecia/'),(4,'https://www.cmaguasdaprata.sp.gov.br/public/admin/globalarq/uploads/files/bras%C3%A3o%20municipal.jpg','Aguas da Prata','https://www.portaltransparencia.gov.br/localidades/3500402-aguas-da-prata'),(5,'https://upload.wikimedia.org/wikipedia/commons/1/1e/%C3%81guas_de_Lind%C3%B3ia.PNG','Aguas de Lindoia','https://www.aguasdelindoia.sp.gov.br/cria/transparencia'),(6,'https://www.aguasdesantabarbara.sp.gov.br/images/imagesnoticias/14/principal_arquivos/image001.png','Aguas de Santa Barbara','https://transparencia.aguasdesantabarbara.sp.gov.br/?idCidade=1'),(7,'https://upload.wikimedia.org/wikipedia/commons/4/4f/Bras%C3%A3o_%C3%81guas_de_S%C3%A3o_Pedro.png','Aguas de Sao Pedro','http://scpiaguasdesaopedro.dcfiorilli.com.br:8079/transparencia/'),(8,'https://upload.wikimedia.org/wikipedia/commons/4/43/Brasao_de_agudo.gif','Agudos','https://s2.asp.srv.br/etransparencia.pm.agudos.sp/servlet/portal'),(9,'https://upload.wikimedia.org/wikipedia/pt/b/b6/Brasao_Alambari.jpg','Alambari','http://www.alambari.sp.gov.br/'),(10,'https://www.alfredomarcondes.sp.gov.br/arquivos/galeria/639bcda408e3e6ec2a367030c78cefb1/fotos/1520861018259306.jpg','Alfredo Marcondes','http://18.229.249.165/pronimtb/'),(11,'https://upload.wikimedia.org/wikipedia/commons/d/d1/Bras%C3%A3o_de_Guzol%C3%A2ndia%2C_SP.jpg','Guzolandia','http://189.57.173.114:5656/transparencia/'),(12,'https://upload.wikimedia.org/wikipedia/commons/7/7e/Bras%C3%A3o_de_Guarulhos.png','Guarulhos','http://portaltransparencia.guarulhos.sp.gov.br/'),(13,'https://upload.wikimedia.org/wikipedia/commons/7/70/Bras%C3%A3o_de_Guatapar%C3%A1.jpg','Guatapara','https://e-gov.betha.com.br/transparencia/01037-121/recursos.faces'),(14,'https://herculandia.sp.gov.br/images/topo1.png','Herculandia','http://201.62.66.91:5656/transparencia/'),(15,'http://www.heraldry-wiki.com/heraldrywiki/images/9/99/Holambra.jpg','Holambra','https://www.holambra.sp.gov.br/central.html'),(16,'https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Brasao_Hortolandia_SaoPaulo_Brasil_v2.svg/1200px-Brasao_Hortolandia_SaoPaulo_Brasil_v2.svg.png','Hortolandia','http://www2.hortolandia.sp.gov.br/portaldatransparencia'),(17,'https://upload.wikimedia.org/wikipedia/commons/b/b6/Brasao_iacanga.jpg','Iacanga','http://sppmiacanga.dcfiorilli.com.br:8077/transparencia/'),(18,'https://www.iacri.sp.gov.br/images/Braso_Iacri.jpg','Iacri','https://www.iacri.sp.gov.br/transparencia/ '),(19,'https://consulta.siscam.com.br/camaraiaras/Arquivos/Brasao.png','Iaras','http://transparencia.iaras.sp.gov.br/?idCidade=50'),(20,'https://www.heraldry-wiki.com/heraldrywiki/images/e/e7/Ibate.jpg','Ibate','http://200.205.131.110:5656/transparencia/'),(21,'https://upload.wikimedia.org/wikipedia/commons/f/ff/Bras%C3%A3o_Itapetininga.png','Itapetininga','https://www.itapetininga.sp.gov.br/pagina/6/transparencia'),(22,'https://seeklogo.com/images/B/brasao-prefeitura-de-itapeva-logo-E62D960A92-seeklogo.com.png','Itapeva','https://itapeva.sp.gov.br/?page_id=2876'),(23,'https://upload.wikimedia.org/wikipedia/commons/0/06/Bras%C3%A3o_Itapevi.png','Itapevi','http://www.itapevi.sp.gov.br/portaltransparencia/home/index.php'),(24,'https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Brasao_Itapira_SaoPaulo_Brasil.svg/1200px-Brasao_Itapira_SaoPaulo_Brasil.svg.png','Itapira','http://transparencia.itapira.sp.gov.br:8079/Transparencia/'),(25,'https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Itapirapu%C3%A3_Paulista.PNG/600px-Itapirapu%C3%A3_Paulista.PNG','Itapirapua Paulista','https://www.itapirapuapaulista.sp.leg.br/transparencia'),(26,'https://www.itapolis.swop.com.br/imgeditor/BRASAO(1).jpg','Itapolis','https://www.portaltransparencia.gov.br/localidades/3522703-itapolis'),(27,'https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Itaporanga_sp_brasao.svg/1200px-Itaporanga_sp_brasao.svg.png','Itaporanga','http://www.portaltransparencia.gov.br/localidades/3522802-itaporanga'),(28,'https://www.itapui.sp.gov.br/imgeditor/26a3681df5839657d57ff250a17a6743.jpg','Itapua','https://www.itapui.sp.gov.br/portal/transparencia'),(29,'https://upload.wikimedia.org/wikipedia/commons/4/44/Bras%C3%A3o_Itapura.jpg','Itapura','http://s2.asp.srv.br/etransparencia.pm.itapura.sp/servlet/portal'),(30,'https://upload.wikimedia.org/wikipedia/commons/c/c5/Itaquaquecetuba.PNG','Itaquaquecetuba','https://leideacesso.etransparencia.com.br/itaquaquecetuba.ipm.sp/TDAPortalClient.aspx?416'),(31,'https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/BrasaoSorocaba.svg/1119px-BrasaoSorocaba.svg.png','Sorocaba','https://www.portaltransparencia.gov.br/localidades/3552205-sorocaba'),(32,'https://pbs.twimg.com/profile_images/278348070/Bras_o_de_Sud_Mennucci__branco__400x400.JPG','Sud Mennucci','http://168.194.201.126:8079/Transparencia/'),(33,'https://www.mbi.com.br/mbi/files/media/image/simbolopedia/municipio-sumare-brasao-simb-brsesp0703252403.jpg','Sumare','https://sumare.atende.net/?pg=transparencia'),(34,'https://www.suzanapolis.sp.gov.br/admin/ckeditor/getimage?imageId=4','Suzanopolis','http://177.72.48.34:8079/transparencia/'),(35,'https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/BrasaoSuzano.svg/400px-BrasaoSuzano.svg.png','Suzano','https://www.suzano.sp.gov.br/web/transparencia/'),(36,'https://www.tabapua.sp.gov.br/home/images/turismo/brasao-bandeira/brasao-tabapua.png','Tabapua','https://www.tabapua.sp.gov.br/home/index.php/transparencia'),(37,'https://upload.wikimedia.org/wikipedia/commons/4/40/Bras%C3%A3o_de_Tabatinga_SP.png','Tabatinga','https://transparenciamunicipalaam.org.br/p/tabatinga'),(38,'https://upload.wikimedia.org/wikipedia/commons/a/ab/Bras%C3%A3o_de_Tabo%C3%A3o_da_Serra.jpg','Taboao da Serra','https://ts.sp.gov.br/leis-e-normas/portal-da-transparencia'),(39,'https://upload.wikimedia.org/wikipedia/commons/e/e8/Bras%C3%A3o_Taciba.jpg','Taciba','https://taciba.sp.gov.br/transparencia/'),(40,'https://upload.wikimedia.org/wikipedia/commons/e/ea/Bras%C3%A3o_Tagua%C3%AD.png','Itaguai','https://transparencia.itaguai.rj.gov.br/'),(41,'https://aptaconcursos.com.br/logo/1584798670_tra.png','Trabiju','http://45.171.122.200:5656/transparencia/'),(42,'https://seeklogo.com/images/B/brasao-do-municipio-de-tremembe-logo-A05C127F5E-seeklogo.com.png','Tremembe','https://tremembe.sp.gov.br/portal-da-transparencia/'),(43,'https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/Bras%C3%A3o_de_Tr%C3%AAs_Fronteiras.jpg/716px-Bras%C3%A3o_de_Tr%C3%AAs_Fronteiras.jpg','Tres Fronteiras','http://143.0.124.201:6565/'),(44,'http://tuiuti.sp.gov.br/wp-content/uploads/2016/06/prefeitura-de-tuiuti-144x144.png','Tuiuti','https://tuiuti.sp.gov.br/transparencia/'),(45,'https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/BrasaoTupa.svg/717px-BrasaoTupa.svg.png','Tupa','http://sistemas.tupa.sp.gov.br:8079/transparencia/'),(46,'https://upload.wikimedia.org/wikipedia/commons/7/7d/Brasao_tupi_paulista.jpg','Tupi Paulista','https://portaltransparencia.4rtec.com.br/wpportal.aspx?93,ME0gdAFwEnxnWfsXGB%2bRJg'),(47,'https://upload.wikimedia.org/wikipedia/commons/a/a0/Bras%C3%A3o_Turiuba.jpg','Turiuba','http://45.163.196.250:6565/'),(48,'https://upload.wikimedia.org/wikipedia/commons/7/76/Bras%C3%A3o_de_Turmalina%2C_SP.jpg','Turmalina','http://cidadesmg.com.br/portaltransparencia/faces/user/portal.xhtml?Param=Turmalina'),(49,'https://www.ubarana.sp.gov.br/public/admin/globalarq/uploads/files/Brasao(1).png','Ubarana','http://186.225.128.68:5656/transparencia/'),(50,'https://www.ubatuba.sp.gov.br/wp-content/uploads/sites/2/2015/02/brasao.png','Ubatuba','https://transparencia.ubatuba.sp.gov.br/');
/*!40000 ALTER TABLE `cities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_8sewwnpamngi6b1dwaa88askk` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (2,'ROLE_ADMIN'),(1,'ROLE_USER');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `fullname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `login` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `city_id` int DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `UK_6dotkott2kjsp8vw4d0m25fb7` (`email`),
  UNIQUE KEY `UK_ow0gan20590jrb00upg3va2fn` (`login`),
  KEY `FKn36jwt4acj3il2ixvv2c0ncco` (`city_id`),
  CONSTRAINT `FKn36jwt4acj3il2ixvv2c0ncco` FOREIGN KEY (`city_id`) REFERENCES `cities` (`city_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'teste@email.com','admin','admin','$2a$10$JnZ2arGI7IWFrVex2nZiCOYVkC9.Xcb1O99Wew/hp4gOFhYPB2taO','91234-1234',NULL),(2,'aline_satio@ig','Aline','aline','$2a$10$pdiLpybNzuTJr6z8UrNFdusqA6PLSTxQ79FvbA9rdITGLltBfrug6','91234-1234',NULL),(3,'matheus_sena@yahoo','Matheus','mateus','$2a$10$D3BDwA1hh2X185CprhNG2.cLpAo0O/jd2NBTCafapPCMvJfFNbte6','91234-1234',NULL),(5,'vinicius_scarabelli@outlook','vinicius','vinicius','$2a$10$a7u1oBif2blVvNn/kMqu9OvRP02lAE.B4ZXlgMVQt4JQ5avShK12S','91234-1234',18),(6,'pedro_chaves@gmail','pedro','pedro','$2a$10$l8i7hr5wtRjcanCs8ngZOOx7H.LbO2AC1pItGltfMu35GAtdTt0i6','91234-1234',26),(7,'jose_ventura@terra','jose','jose','$2a$10$vHTCRm2T20Zhcqolt5HoUuIUPVKQfBuGMLah9VedoKaWE884siKIi','91234-1234',33);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_roles`
--

DROP TABLE IF EXISTS `users_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users_roles` (
  `user_user_id` int NOT NULL,
  `roles_id` bigint NOT NULL,
  KEY `FK15d410tj6juko0sq9k4km60xq` (`roles_id`),
  KEY `FK27iuqlfirca39l6y61p4p4qo2` (`user_user_id`),
  CONSTRAINT `FK15d410tj6juko0sq9k4km60xq` FOREIGN KEY (`roles_id`) REFERENCES `role` (`id`),
  CONSTRAINT `FK27iuqlfirca39l6y61p4p4qo2` FOREIGN KEY (`user_user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_roles`
--

LOCK TABLES `users_roles` WRITE;
/*!40000 ALTER TABLE `users_roles` DISABLE KEYS */;
INSERT INTO `users_roles` VALUES (1,2),(2,2),(3,2),(5,1),(6,1),(7,1);
/*!40000 ALTER TABLE `users_roles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-18  9:35:52
