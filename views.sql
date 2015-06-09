-- psql -h localhost dbprojekt projekt -f views.sql

DROP VIEW IF EXISTS v_genrefilm, v_userfilm, v_mitwirkendefilm, v_rating;

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

--RATING
CREATE VIEW v_rating AS
SELECT * ,
    CASE WHEN anzahl > 2 THEN summe / anzahl
        ELSE 0
    END AS "rating"
FROM "public".film;
