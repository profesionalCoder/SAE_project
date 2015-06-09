-- psql -h localhost dbprojekt projekt -f tables.sql

DROP TABLE IF EXISTS genre, film, login, mitwirkende, taetigkeit, 
genre_film, bewertung, film_mitwirkende;


-- Create Table
CREATE TABLE genre
(
genre_id SERIAL,
genre_name VARCHAR(50) NOT NULL,
PRIMARY KEY (genre_id)
);

CREATE TABLE film
(
film_id SERIAL,
titel VARCHAR(100) NOT NULL,
beschreibung VARCHAR(500),
jahr integer,
cover VARCHAR(500) DEFAULT 'http://www.schuetzenverein-finkenstein.de/Pictures/test.jpg',
anzahl integer DEFAULT 0,
summe float DEFAULT 0,
PRIMARY KEY (film_id)
);

CREATE TABLE login
(
login_id SERIAL,
login_name VARCHAR(50) NOT NULL UNIQUE CHECK (login_name <> ''),
password VARCHAR(50) NOT NULL,
PRIMARY KEY (login_id)
);

CREATE TABLE mitwirkende
(
mitwirkende_id SERIAL,
v_name VARCHAR(50) NOT NULL,
n_name VARCHAR(50) NOT NULL,
portrait VARCHAR(500) DEFAULT 'http://www.schuetzenverein-finkenstein.de/Pictures/test.jpg',
PRIMARY KEY (mitwirkende_id)
);

CREATE TABLE taetigkeit
(
taetigkeit_id SERIAL,
taetigkeit VARCHAR(100) NOT NULL,
PRIMARY KEY (taetigkeit_id)
);

CREATE TABLE genre_film
(
fk_film_id INT,
fk_genre_id INT,
PRIMARY KEY (fk_film_id, fk_genre_id),
FOREIGN KEY (fk_film_id) REFERENCES film(film_id),
FOREIGN KEY (fk_genre_id) REFERENCES genre(genre_id)
);

CREATE TABLE bewertung
(
fk_login_id INT,
fk_film_id INT,
bewertung FLOAT NOT NULL,
CHECK (bewertung <= 10),
CHECK (bewertung >= 0),
kommentar VARCHAR(500),
PRIMARY KEY (fk_film_id, fk_login_id),
FOREIGN KEY (fk_film_id) REFERENCES film(film_id),
FOREIGN KEY (fk_login_id) REFERENCES login(login_id)
);

CREATE TABLE film_mitwirkende
(
fk_film_id INT,
fk_mitwirkende_id INT,
fk_taetigkeit_id INT,
PRIMARY KEY (fk_film_id, fk_mitwirkende_id, fk_taetigkeit_id),
FOREIGN KEY (fk_film_id) REFERENCES film(film_id),
FOREIGN KEY (fk_mitwirkende_id) REFERENCES mitwirkende(mitwirkende_id),
FOREIGN KEY (fk_taetigkeit_id) REFERENCES taetigkeit(taetigkeit_id)
);

-- Create Trigger Function update
CREATE OR REPLACE FUNCTION update_bewertung_function()
  RETURNS trigger AS
'
BEGIN
	IF NEW.bewertung <> OLD.bewertung THEN
		UPDATE film SET summe =  summe + (NEW.bewertung - OLD.bewertung)
		WHERE film_id = NEW.fk_film_id;
	END IF;
	 
	RETURN NEW;
END;
' LANGUAGE plpgsql
;

CREATE TRIGGER update_bewertung
  BEFORE UPDATE
  ON bewertung
  FOR EACH ROW
  EXECUTE PROCEDURE update_bewertung_function();

-- Create Trigger Function insert
CREATE OR REPLACE FUNCTION insert_bewertung_function()
  RETURNS trigger AS
'
BEGIN
	BEGIN
		UPDATE film SET summe =  summe + NEW.bewertung,
		anzahl = anzahl + 1
		WHERE film_id = NEW.fk_film_id;
	END;
	 
	RETURN NEW;
END;
' LANGUAGE plpgsql
;

CREATE TRIGGER insert_bewertung
  BEFORE INSERT
  ON bewertung
  FOR EACH ROW
  EXECUTE PROCEDURE insert_bewertung_function();
