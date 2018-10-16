START TRANSACTION ;

CREATE TABLE `configuration` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `key` varchar(100) NOT NULL,
  `value` varchar(200) NOT NULL,
  `created_date` datetime NOT NULL default CURRENT_TIMESTAMP,
  `last_updated_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY unique_key (`key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

COMMIT ;
