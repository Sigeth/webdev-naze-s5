-- Insérer des données dans la table Company
INSERT INTO NazeDB.Company (id_company, name, sector) VALUES (1, 'Macompagni', 'Ordi');

-- Insérer des données dans la table Folder
INSERT INTO NazeDB.Folder (id_folder, name, company_folder_id_company) VALUES
(1, 'Fichierprince', 1),
(2, 'Boulot', 1),
(3, 'Taff', 1);

-- Insérer des données dans la table Project
INSERT INTO NazeDB.Project (id_project, name, folder_project_id_folder) VALUES
(1, 'MainProject', 1),
(2, 'Projet2', 1),
(3, '3proge', 1);

-- Insérer des données dans la table ServiceLevel
INSERT INTO NazeDB.ServiceLevel (id_service, name, price, carbon) VALUES
(1, 0, 49.99, 4.20),
(2, 1, 99.99, 10.10),
(3, 2, 499.99, 8.69);

-- Insérer des données dans la table Contact
INSERT INTO NazeDB.Contact (id_contact, first_name, last_name, email, phone, address, post_code, city, country)
VALUES (1, 'Adrien', 'Nougaret', 'zerator@mandatory.gg', '+33 7 96 78 45 25', '42 Rue de la Vie', 34000, 'Montpellier', 'France');

-- Insérer des données dans la table Order en utilisant les clés étrangères
INSERT INTO NazeDB.OrderVM (id_order, solution_name, solution_description, location, license, price, carbon, project_order_id_project, service_order_id_service, contact_order_id_contact)
VALUES (1, 'Solution', 'Description', 0, 0, 400.0, 20.0, 1, 1, 1);

-- Insérer des données dans la table Availability
INSERT INTO NazeDB.Availability (id_day, day, morning, afternoon) VALUES
(1, 0, false, true),
(2, 1, true, false),
(3, 2, true, true),
(4, 3, true, true),
(5, 4, true, true),
(6, 5, false, true),
(7, 6, false, false);

-- Insérer des données dans la table Available
INSERT INTO NazeDB.Contact_Availability (availabilities_id_day, Contact_id_contact) VALUES
(1, 1),
(2, 1),
(3, 1),
(4, 1),
(5, 1),
(6, 1),
(7, 1);