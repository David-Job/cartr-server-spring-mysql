drop `db_cartr`;
CREATE DATABASE `db_cartr` /*!40100 DEFAULT CHARACTER SET utf32 COLLATE utf32_spanish2_ci */;
use `db_cartr`;
CREATE TABLE `items` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `item_id` varchar(80) COLLATE utf32_spanish2_ci NOT NULL,
  `brand` varchar(20) COLLATE utf32_spanish2_ci NOT NULL,
  `price` float(5,2) NOT NULL,
  `stock` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_items` (`item_id`,`brand`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;
INSERT INTO `items` (`id`,`item_id`,`brand`,`price`,`stock`) VALUES (1,'leche-desnatada-omega3-1L','PELUVA',1.29,50);
INSERT INTO `items` (`id`,`item_id`,`brand`,`price`,`stock`) VALUES (2,'nata-cocina-espesa-o-ligera-250ml','PSERITEND',1.16,20);
INSERT INTO `items` (`id`,`item_id`,`brand`,`price`,`stock`) VALUES (3,'yogur-frutas-4u-125g','DININI_ICTIVII',1.99,15);
INSERT INTO `items` (`id`,`item_id`,`brand`,`price`,`stock`) VALUES (4,'flan-huevo-4u','DUL',1.99,10);
