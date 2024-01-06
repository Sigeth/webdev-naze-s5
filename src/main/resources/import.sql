-- Insérer des données dans la table Company
INSERT INTO NazeDB.Company (id_company, name, sector) VALUES (0, 'Macompagni', 'Ordi');

-- Insérer des données dans la table Folder
INSERT INTO NazeDB.Folder (id_folder, name, company_folder_id_company) VALUES
(0, 'Fichierprince', 1),
(1, 'Boulot', 1),
(2, 'Taff', 1);

-- Insérer des données dans la table Project
INSERT INTO NazeDB.Project (id_project, name, folder_project_id_folder) VALUES
(0, 'MainProject', 0),
(1, 'Projet2', 0),
(2, '3proge', 0);

-- Insérer des données dans la table ServiceLevel
INSERT INTO NazeDB.ServiceLevel (id_service, name, price, carbon) VALUES
(0, 0, 49.99, 4.20),
(1, 1, 99.99, 10.10),
(2, 2, 499.99, 8.69);

-- Insérer des données dans la table Contact
INSERT INTO NazeDB.Contact (id_contact, first_name, last_name, email, phone, address, post_code, city, country)
VALUES (0, 'Adrien', 'Nougaret', 'zerator@mandatory.gg', '+33 7 96 78 45 25', '42 Rue de la Vie', 34000, 'Montpellier', 'France');

-- Insérer des données dans la table Order en utilisant les clés étrangères
INSERT INTO NazeDB.OrderVM (id_order, solution_name, solution_description, location, license, price, carbon, project_order_id_project, service_order_id_service, contact_order_id_contact)
VALUES (0, 'Solution', 'Description', 0, 0, 400.0, 20.0, 0, 0, 0);

-- Insérer des données dans la table Availability
INSERT INTO NazeDB.Availability (id_day, day, morning, afternoon) VALUES
(0, 0, false, true),
(1, 1, true, false),
(2, 2, true, true),
(3, 3, true, true),
(4, 4, true, true),
(5, 5, false, true),
(6, 6, false, false);

-- Insérer des données dans la table Available
INSERT INTO NazeDB.Contact_Availability (availabilities_id_day, Contact_id_contact) VALUES
(0, 0),
(1, 0),
(2, 0),
(3, 0),
(4, 0),
(5, 0),
(6, 0);