# SAE_project
# SQL-Statements

-- Diese Datei NICHT mit NETBEANS durchlaufen lassen,
-- da Netbeans die $$ in der PROCEDURE nicht richtig anwendet.
-- Stattdessen psql verwenden !!!!!!!!!!!!!

--psql -h localhost dbprojekt projekt 
-- dann \i <datei>
DROP VIEW IF EXISTS v_genrefilm, v_userfilm, v_mitwirkendefilm;

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

-- View
CREATE VIEW v_genrefilm AS
SELECT titel,
jahr,
genre_name AS genre,
cover
FROM film inner join genre_film
ON film_id=fk_film_id
inner join genre
on genre_id = fk_genre_id;

CREATE VIEW v_userfilm AS
SELECT login_name,
titel,
bewertung,
kommentar
FROM film inner join bewertung
ON film_id=fk_film_id
inner join login
on login_id = fk_login_id;

CREATE VIEW v_mitwirkendefilm AS
SELECT titel,
v_name,
n_name,
taetigkeit
FROM film inner join film_mitwirkende
ON film_id=fk_film_id
inner join mitwirkende
on mitwirkende_id = fk_mitwirkende_id
inner join taetigkeit
on taetigkeit_id = fk_taetigkeit_id;


-- LOGIN
INSERT INTO login VALUES
    (DEFAULT, 'admin', 'abc');

INSERT INTO login VALUES
    (DEFAULT, 'fabian', 'abc');

INSERT INTO login VALUES
    (DEFAULT, 'sebastian', 'abc');

-- Genere
INSERT INTO genre VALUES
    (DEFAULT, 'Fantasy');

INSERT INTO genre VALUES
    (DEFAULT, 'Drama');

INSERT INTO genre VALUES
    (DEFAULT, 'Thriller');

INSERT INTO genre VALUES
    (DEFAULT, 'Komödie');

INSERT INTO genre VALUES
    (DEFAULT, 'Action');

INSERT INTO genre VALUES
    (DEFAULT, 'Horror');

INSERT INTO genre VALUES
    (DEFAULT, 'Western');


-- Filme
INSERT INTO film VALUES
    (DEFAULT, 'Die Üblichen Verdaechtigen', 'Der Gauner Verbal überlebt eine Schiffsexplosion und erzählt wie es dazu kam.', 1995, 'http://ecx.images-amazon.com/images/I/51F79NR50JL.jpg');

INSERT INTO film VALUES
    (DEFAULT, 'Wall-E', 'Wall-E reumt als letzter die Erde auf.', 2008, 'http://www.empireonline.com/images/features/100greatestcharacters/photos/63.jpg');

INSERT INTO film VALUES
    (DEFAULT, 'Saw', 'Psycho-Killer quält seine Opfer.', 2004);

INSERT INTO film VALUES
    (DEFAULT, 'Die Verurteilten', 'Erzählt die Geschichte und Freundschaft zwischen 2 Häftlingen.', 1994);



-- Genre_Film
INSERT INTO genre_film VALUES
    (1, 3);

INSERT INTO genre_film VALUES
    (2, 4);

INSERT INTO genre_film VALUES
    (3, 3);

INSERT INTO genre_film VALUES
    (3, 6);

INSERT INTO genre_film VALUES
    (4, 2);


-- Taetigkeit
INSERT INTO taetigkeit VALUES
    (DEFAULT, 'Hauptdarsteller');

INSERT INTO taetigkeit VALUES
    (DEFAULT, 'Nebendarsteller');

INSERT INTO taetigkeit VALUES
    (DEFAULT, 'Regiseur');

INSERT INTO taetigkeit VALUES
    (DEFAULT, 'Anderes');


-- Mitwirkende
INSERT INTO mitwirkende VALUES
    (DEFAULT, 'Kevin', 'Spacey', 'http://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/KevinSpaceyApr09.jpg/640px-KevinSpaceyApr09.jpg');

INSERT INTO mitwirkende VALUES
    (DEFAULT, 'Bryan', 'Singer', 'http://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Bryan_Singer_by_Gage_Skidmore.jpg/220px-Bryan_Singer_by_Gage_Skidmore.jpg');

INSERT INTO mitwirkende VALUES
    (DEFAULT, 'Tobin', 'Bell', 'http://www.cam.co.uk/_uploads/imgsrv/talent-size/_uploads/userassets/images/clients/tobin-bell-rs.jpg');

INSERT INTO mitwirkende VALUES
    (DEFAULT, 'Leigh', 'Whannell', 'http://i4.dailyrecord.co.uk/incoming/article2988989.ece/alternates/s615/Leigh-Whannell.png');

INSERT INTO mitwirkende VALUES
    (DEFAULT, 'Morgan', 'Freeman', 'http://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/Morgan_Freeman%2C_2006.jpg/640px-Morgan_Freeman%2C_2006.jpg');

INSERT INTO mitwirkende VALUES
    (DEFAULT, 'Tim', 'Robbins', DEFAULT);


-- Film_mitwirkende
INSERT INTO film_mitwirkende VALUES
    (1, 1, 1);

INSERT INTO film_mitwirkende VALUES
    (1, 2, 3);

INSERT INTO film_mitwirkende VALUES
    (3, 3, 2);

INSERT INTO film_mitwirkende VALUES
    (3, 4, 1);


-- Bewertung
INSERT INTO bewertung VALUES
    (1, 1, 10, 'Super Film mit klasse Ende! unbedingt sehenswert.');

INSERT INTO bewertung VALUES
    (1, 2, 7, 'Netter Film zum Zeitvertreib');

INSERT INTO bewertung VALUES
    (2, 1, 9, 'KLASSE!.');
