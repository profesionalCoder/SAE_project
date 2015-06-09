-- psql -h localhost dbprojekt projekt -f data.sql

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
    (DEFAULT, 'Die Ueblichen Verdaechtigen', 'Der Gauner Verbal ueberlebt eine Schiffsexplosion und erzählt wie es dazu kam.', 1995, 'http://ecx.images-amazon.com/images/I/51F79NR50JL.jpg');

INSERT INTO film VALUES
    (DEFAULT, 'Wall-E', 'Wall-E räumt als letzter die Erde auf.', 2008, 'http://wallerz.net/wp-content/uploads/2015/01/3731_wall-e.jpg');

INSERT INTO film VALUES
    (DEFAULT, 'Saw', 'Psycho-Killer quält seine Opfer.', 2004, 'http://schmoesknow.com/wp-content/uploads/2014/03/saw_v_2_by_hassoomi-d31v9zz.jpg');

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
