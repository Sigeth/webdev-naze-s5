# Projet de Webdev - Groupe NAZE

## Informations sur le projet

* Projet de 5ème semestre à l'ISEN
* Projet rendu le 07/01/2024
* Le projet à été réalisé en JAVA et MYSQL

## Utilisation de l'API

### Prérequis
* En premier lieu, notre projet fonctionne avec une Base de Donnée MYSQL. Veiller à avoir une version récente de mysql avant de lancer le projet.<br>
Une fois la base de données installée, vous devez vous connectez en tant que superutilisateur (ou un utilisateur ayant le droit de créer et gérer des utilisateurs et des databases) et effectuez ces commandes :
```sql
CREATE USER 'vmaster'@'localhost' IDENTIFIED BY 'VM4sterS:)';
CREATE DATABASE NazeDB;
GRANT ALL PRIVILEGES ON NazeDB.* TO 'vmaster'@'localhost';
```
Toutes les tables seront ensuite créées et remplies automatiquement par le programme.
* Ouvrir un terminal et effectuez la commande ```git clone https://github.com/Sigeth/webdev-naze-s5```
* Avoir le projet dans un IDE style **Intellij IDEA** ou avoir installé Quarkus

### Lancer le programme
#### Intellij IDEA

* Ouvrir le projet dans un IDE style **Intellij IDEA**
* Attendre que le programme charge le code et les imports
* Executer webdev-naze-s5.main en Quarkus.
* Attendre que le programme se lance
* Se rendre sur [localhost:8080/docs]() pour avoir accès à la documentation générée automatiquement

#### En installant Quarkus
* Ouvrir un terminal à la racine du projet
* Éxecuter le prompt `quarkus dev`
* Attendre que le programme se lance
* Se rendre sur [localhost:8080/docs]() pour avoir accès à la documentation générée automatiquement

### Utilisation et tests

À l'adresse [localhost:8080/docs](), vous avez accès à une documentation générée automatiquement. Dans cette documentation, vous pouvez tester l'API avec une interface style **Postman** et une explication de comment sont définies les classes/interfaces/enums. Vous pouvez donc intéragir directement depuis cette page pour tester l'API.

## Informations sur le groupe
Groupe NAZE composé de :
* Isaure SERVET-BOUDOU - Création de la base de données
* Maxime SOLA - Création des models et des services grâce à Modelio
* Robin METAIS - Création du dataset pour la démonstration et aide à la création de la base de données
* Bastient SCHNEIDER - Implémentation des services
* Thomas SEIGNOUR - Implémentation des services