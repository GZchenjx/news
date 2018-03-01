CREATE DATABASE IF NOT EXISTS d_new DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

use d_new;

DROP TABLE IF EXISTS t_admin;
CREATE TABLE t_admin (
  id varchar(36) NOT NULL,
  phone varchar(11) NOT NULL,
  pwd varchar(64) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO t_admin VALUES ('8454cb69773011e79e8e80fa5b2e8425', '18888888888', '4QrcOUm6Wau+VuBX8g+IPg==');

DROP TABLE IF EXISTS t_user;
CREATE TABLE t_user (
  id varchar(36) NOT NULL,
  phone varchar(11) NOT NULL,
  pwd varchar(64) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS t_article_type;
CREATE TABLE t_article_type (
  id varchar(36) NOT NULL,
  name varchar(20) NOT NULL,
  des varchar(500) DEFAULT NULL,
  admin_id varchar(36) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY fk_article_type_admin_id (admin_id),
  CONSTRAINT fk_article_type_admin_id FOREIGN KEY (admin_id) REFERENCES t_admin (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS t_article;
CREATE TABLE t_article (
  id varchar(36) NOT NULL,
  title varchar(50) NOT NULL,
  abstracts varchar(200) DEFAULT NULL,
  content text NOT NULL,
  pub_time datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  type_id varchar(36) DEFAULT NULL,
  admin_id varchar(36) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY fk_article_admin_id (admin_id),
  KEY fk_article_type_id (type_id),
  CONSTRAINT fk_article_admin_id FOREIGN KEY (admin_id) REFERENCES t_admin (id),
  CONSTRAINT fk_article_type_id FOREIGN KEY (type_id) REFERENCES t_article_type (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS t_article_view;
CREATE TABLE t_article_view (
  id varchar(36) NOT NULL,
  user_id varchar(36) DEFAULT NULL,
  article_id varchar(36) DEFAULT NULL,
  view_time datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS t_comment;
CREATE TABLE t_comment (
  id varchar(36) NOT NULL,
  content text,
  comment_time datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  article_id varchar(36) DEFAULT NULL,
  user_id varchar(36) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY fk_comment_user_id (user_id),
  KEY fk_comment_article_id (article_id),
  CONSTRAINT fk_comment_article_id FOREIGN KEY (article_id) REFERENCES t_article (id),
  CONSTRAINT fk_comment_user_id FOREIGN KEY (user_id) REFERENCES t_user (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
