DROP TABLE IF EXISTS person;

CREATE TABLE person (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL
);

INSERT INTO person (first_name, last_name, career) VALUES
  ('vidya', 'Dutta', 'ABC'),
  ('RS', 'Gates', 'XYZ'),
  ('Ishaan', 'Alakija', 'DEF-primrose');