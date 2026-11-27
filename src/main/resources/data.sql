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

INSERT INTO product(title, age, category, subcategory, author_id, image, cantidad)
VALUES ('Carcassonne', 8, 1, 'juegos de mesa', 2, 'carcassonne_game.jpg', 3);
INSERT INTO product(title, age, category, subcategory, author_id, image, cantidad)
VALUES ('Carcassonne: The City', 8, 1, 'juegos de mesa', 2, 'carcassonnecity_game.jpg', 0);
INSERT INTO product(title, age, category, subcategory, author_id, image, cantidad)
VALUES ('Catan', 10, 1, 'juegos de mesa', 4, 'catan_game.jpg', 1);
INSERT INTO product(title, age, category, subcategory, author_id, image, cantidad)
VALUES ('UNO', 7, 1, 'juegos de mesa', 5, 'uno_game.jpg', 3);
INSERT INTO product(title, age, category, subcategory, author_id, image, cantidad)
VALUES ('Dixit: Daydreams', 6, 1, 'juegos de mesa', 6, 'dixitdaydream_game.jpg', 1);
INSERT INTO product(title, age, category, subcategory, author_id, image, cantidad)
VALUES ('Aventureros al tren', 8, 1, 'juegos de mesa', 1, 'aventureros_game.jpg', 3);
INSERT INTO product(title, age, category, subcategory, author_id, image, cantidad)
VALUES ('Dixit: Memories', 6, 1, 'juegos de mesa', 6, 'dixitmemories_game.jpg', 2);

INSERT INTO product(title, age, category, subcategory, author_id, image, cantidad)
VALUES ('Los Juegos del Hambre', 12, 2, 'ficción distópica', 7, 'juegoshambre_book.jpg', 4);
INSERT INTO product(title, age, category, subcategory, author_id, image, cantidad)
VALUES ('Los Juegos del Hambre: En llamas', 12, 2, 'ficción distópica', 7, 'enllamas_book.jpg', 1);
INSERT INTO product(title, age, category, subcategory, author_id, image, cantidad)
VALUES ('Balada de pájaros cantores y serpientes', 12, 2, 'ficción distópica', 7, 'balada_book.jpg', 1);
INSERT INTO product(title, age, category, subcategory, author_id, image, cantidad)
VALUES ('Tierra', 15, 2, 'novela contemporánea', 8, 'tierra_book.jpg', 3);
INSERT INTO product(title, age, category, subcategory, author_id, image, cantidad)
VALUES ('El archivo de Sherlock Holmes', 12, 2, 'misterio', 9, 'sherlock_book.jpg', 3);
INSERT INTO product(title, age, category, subcategory, author_id, image, cantidad)
VALUES ('Alicia en el País de las Maravillas', 9, 2, 'literatura infantil', 10, 'alicia_book.jpg', 2);

INSERT INTO product(title, age, category, subcategory, author_id, image, cantidad)
VALUES ('Super Mario Nintendo Switch', 7, 1, 'videojuego', 11, 'supermario_videogame.jpg', 4);

INSERT INTO product(title, age, category, subcategory, author_id, image, cantidad)
VALUES ('Don´t worry Darling', 16, 7, 'thriller psicológico', 12, 'dontworrydarling_movie.jpg', 2);
INSERT INTO product(title, age, category, subcategory, author_id, image, cantidad)
VALUES ('Los juegos del hambre', 12, 7, 'ciencia ficción', 7, 'juegoshambre_movie.jpg', 1);

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
VALUES (1, 2, '2025-10-29', '2025-11-06');
INSERT INTO loan(product_id, client_id, start_date, end_date)
VALUES (2, 3, '2024-10-29', '2024-11-06');
INSERT INTO loan(product_id, client_id, start_date, end_date)
VALUES (3, 12, '2025-10-30', '2025-11-10');
INSERT INTO loan(product_id, client_id, start_date, end_date)
VALUES (8, 9, '2026-10-29', '2026-11-06');
INSERT INTO loan(product_id, client_id, start_date, end_date)
VALUES (5, 7, '2026-05-02', '2026-05-13');
INSERT INTO loan(product_id, client_id, start_date, end_date)
VALUES (5, 5, '2026-09-29', '2026-10-06');