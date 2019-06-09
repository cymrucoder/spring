DROP TABLE IF EXISTS books;
 
CREATE TABLE books (
  id int AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  author VARCHAR(250) NOT NULL,
  color VARCHAR(250) NOT NULL,
  font_color VARCHAR(250) NOT NULL,
  year_published int NOT NULL,
  quote VARCHAR(250) NOT NULL
);