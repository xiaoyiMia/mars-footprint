CREATE TABLE `continents` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `countries` (
  `id` int NOT NULL AUTO_INCREMENT,
  `continent_id` int NOT NULL,
  `name` varchar(50) NOT NULL,
  `longitude` decimal(12,9) NOT NULL,
  `latitude` decimal(12,9) NOT NULL,
  `description` longtext,
  `status` tinyint unsigned NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `continent_id_idx` (`continent_id`),
  FOREIGN KEY (`continent_id`) REFERENCES `continents` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `mars_footprint`.`continents` (`name`) VALUES ('Asia');
INSERT INTO `mars_footprint`.`continents` (`name`) VALUES ('Africa');
INSERT INTO `mars_footprint`.`continents` (`name`) VALUES ('North America');
INSERT INTO `mars_footprint`.`continents` (`name`) VALUES ('South America');
INSERT INTO `mars_footprint`.`continents` (`name`) VALUES ('Antarctica');
INSERT INTO `mars_footprint`.`continents` (`name`) VALUES ('Europe');
INSERT INTO `mars_footprint`.`continents` (`name`) VALUES ('Australia');

