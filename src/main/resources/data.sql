DROP TABLE IF EXISTS screens;
DROP table IF EXISTS movies;


CREATE TABLE movies (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(100) DEFAULT NULL,
  age_restriction int DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE screens (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(100) DEFAULT NULL,
  movie int DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT FK_movieScreen FOREIGN KEY (movie) REFERENCES movies (id)
  ON DELETE SET NULL ON UPDATE CASCADE
);


insert into movies (name, age_restriction)values('Movie 1', 16);
insert into movies (name, age_restriction)values('Movie 2', 10);
insert into movies (name, age_restriction)values('Movie 3', 3);
insert into movies (name, age_restriction)values('Movie 4', 18);

insert into screens (name, movie) values ('Screen 1', 1);
insert into screens (name, movie) values ('Screen 2', 3);
insert into screens (name, movie) values ('Screen 3', 2);
insert into screens (name, movie) values ('Screen 4', 4);

