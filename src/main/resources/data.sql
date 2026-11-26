INSERT INTO category(name, subcategory)
VALUES ('juegos', 'juegos de mesa');
INSERT INTO category(name, subcategory)
VALUES ('libros', 'ficción distópica');
INSERT INTO category(name, subcategory)
VALUES ('libros', 'novela contemporánea');
INSERT INTO category(name, subcategory)
VALUES ('libros', 'misterio');
INSERT INTO category(name, subcategory)
VALUES ('libros', 'literatura infantil');
INSERT INTO category(name, subcategory)
VALUES ('juegos', 'videojuego');
INSERT INTO category(name, subcategory)
VALUES ('películas', 'thriller psicológico');
INSERT INTO category(name, subcategory)
VALUES ('películas', 'ciencia ficción');

INSERT INTO author(name, nationality)
VALUES ('Alan R. Moon', 'GBR');
INSERT INTO author(name, nationality)
VALUES ('Klaus-Jürgen Wrede', 'DEU');
INSERT INTO author(name, nationality)
VALUES ('Dirk Henn', 'DEU');
INSERT INTO author(name, nationality)
VALUES ('Klaus Teuber', 'DEU');
INSERT INTO author(name, nationality)
VALUES ('Merle Robbins', 'USA');
INSERT INTO author(name, nationality)
VALUES ('Jean-Louis Roubira', 'FRA');

INSERT INTO author(name, nationality)
VALUES ('Suzanne Collins', 'USA');
INSERT INTO author(name, nationality)
VALUES ('Eloy Moreno', 'ESP');
INSERT INTO author(name, nationality)
VALUES ('Arthur Conan Doyle', 'GBR');
INSERT INTO author(name, nationality)
VALUES ('Lewis Carroll', 'GBR');
INSERT INTO author(name, nationality)
VALUES ('Nintendo', 'JPN');
INSERT INTO author(name, nationality)
VALUES ('Olivia Wilde', 'USA');

INSERT INTO product(title, age, category, subcategory, author_id, image)
VALUES ('Carcassonne', 8, 'juegos', 'juegos de mesa', 2, 'carcassonne_game.jpg');
INSERT INTO product(title, age, category, subcategory, author_id, image)
VALUES ('Carcassonne: The City', 8, 'juegos', 'juegos de mesa', 2, 'carcassonnecity_game.jpg');
INSERT INTO product(title, age, category, subcategory, author_id, image)
VALUES ('Catan', 10, 'juegos', 'juegos de mesa', 4, 'catan_game.jpg');
INSERT INTO product(title, age, category, subcategory, author_id, image)
VALUES ('UNO', 7, 'juegos', 'juegos de mesa', 5, 'uno_game.jpg');
INSERT INTO product(title, age, category, subcategory, author_id, image)
VALUES ('Dixit: Daydreams', 6, 'juegos', 'juegos de mesa', 6, 'dixitdaydream_game.jpg');
INSERT INTO product(title, age, category, subcategory, author_id, image)
VALUES ('Aventureros al tren', 8, 'juegos', 'juegos de mesa', 1, 'aventureros_game.jpg');
INSERT INTO product(title, age, category, subcategory, author_id, image)
VALUES ('Dixit: Memories', 6, 'juegos', 'juegos de mesa', 6, 'dixitmemories_game.jpg');

INSERT INTO product(title, age, category, subcategory, author_id, image)
VALUES ('Los Juegos del Hambre', 12, 'libros', 'ficción distópica', 7, 'juegoshambre_book.jpg');
INSERT INTO product(title, age, category, subcategory, author_id, image)
VALUES ('Los Juegos del Hambre: En llamas', 12, 'libros', 'ficción distópica', 7, 'enllamas_book.jpg');
INSERT INTO product(title, age, category, subcategory, author_id, image)
VALUES ('Balada de pájaros cantores y serpientes', 12, 'libros', 'ficción distópica', 7, 'balada_book.jpg');
INSERT INTO product(title, age, category, subcategory, author_id, image)
VALUES ('Tierra', 15, 'libros', 'novela contemporánea', 8, 'tierra_book.jpg');
INSERT INTO product(title, age, category, subcategory, author_id, image)
VALUES ('El archivo de Sherlock Holmes', 12, 'libros', 'misterio', 9, 'sherlock_book.jpg');
INSERT INTO product(title, age, category, subcategory, author_id, image)
VALUES ('Alicia en el País de las Maravillas', 9, 'libros', 'literatura infantil', 10, 'alicia_book.jpg');

INSERT INTO product(title, age, category, subcategory, author_id, image)
VALUES ('Super Mario Nintendo Switch', 7, 'juegos', 'videojuego', 11, 'supermario_videogame.jpg');

INSERT INTO product(title, age, category, subcategory, author_id, image)
VALUES ('Don´t worry Darling', 16, 'películas', 'thriller psicológico', 12, 'dontworrydarling_movie.jpg');
INSERT INTO product(title, age, category, subcategory, author_id, image)
VALUES ('Los juegos del hambre', 12, 'películas', 'ciencia ficción', 7, 'juegoshambre_movie.jpg');

INSERT INTO client(name)
VALUES ('Anna López Albacete');
INSERT INTO client(name)
VALUES ('Lucía Llano Murillo');
INSERT INTO client(name)
VALUES ('Vicente Banda Cajal');
INSERT INTO client(name)
VALUES ('Pedro Cáceres Hera');
INSERT INTO client(name)
VALUES ('David Moreno Gimenez');
INSERT INTO client(name)
VALUES ('Andres Gonazalez Medina');
INSERT INTO client(name)
VALUES ('Jorge Moya Flores');
INSERT INTO client(name)
VALUES ('Marc Montero Lozano');
INSERT INTO client(name)
VALUES ('Martin Rojas Mendez');
INSERT INTO client(name)
VALUES ('Pedro Ramirez Vega');
INSERT INTO client(name)
VALUES ('Adrian Vazquez Molina');
INSERT INTO client(name)
VALUES ('Juan Campos Sanz');
INSERT INTO client(name)
VALUES ('Aurora Vidal Cortes');
INSERT INTO client(name)
VALUES ('Isabel Alonso Vidal');
INSERT INTO client(name)
VALUES ('Victoria Soler Ferrer');
INSERT INTO client(name)
VALUES ('María Mar Sanchez');
INSERT INTO client(name)
VALUES ('Sara Serrano Cruz');
INSERT INTO client(name)
VALUES ('Carolina Fuentes Castillo');
INSERT INTO client(name)
VALUES ('Nerea Peña Alonso');
INSERT INTO client(name)
VALUES ('Eva Nuñez Marin');

INSERT INTO loan(product_id, client_id, start_date, end_date)
VALUES (2, 3, '2026-10-26', '2026-10-28');
INSERT INTO loan(product_id, client_id, start_date, end_date)
VALUES (6, 1, '2026-10-24', '2026-10-30');
INSERT INTO loan(product_id, client_id, start_date, end_date)
VALUES (4, 2, '2026-10-29', '2026-11-06');