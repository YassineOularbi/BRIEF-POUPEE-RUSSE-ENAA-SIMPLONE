# Application de gestion de poupées russes pour le collectionneur

## Description
Ce projet consiste en une application console en Java simulant les poupées russes de différentes tailles pour un collectionneur passionné par ces objets uniques. L'application permet à l'utilisateur de créer, manipuler et afficher des ensembles de poupées russes imbriquées, avec la possibilité d'ajouter des fonctionnalités supplémentaires telles que la coloration des poupées.

## Fonctionnalités

### Poupee (class Poupee)
- Classe de base représentant une poupée russe.
- Contient les propriétés communes à toutes les poupées.
- Possède des méthodes abstraites pour ouvrir, fermer, placer dans et sortir de la poupée.

### PoupéeRusse (class PoupéeRusse)
- Classe concrète héritant de la classe Poupee.
- Implémente les méthodes spécifiques pour ouvrir, fermer, placer dans et sortir de la poupée.
- Permet également la coloration des poupées russes en utilisant une méthode supplémentaire.

### Collectionneur (class Collectionneur)
- Représente un collectionneur de poupées russes.
- Possède des attributs tels que nom, adresse et nombre de poupées dans sa collection.
- Contient des méthodes pour ajouter et supprimer des poupées de la collection.

### Collection (class Collection)
- Représente la collection de poupées russes du collectionneur.
- Possède des attributs tels que nombreTotal et des méthodes pour ajouter, supprimer et afficher des poupées dans la collection.

### Menu (class Menu)
- Gère l'interface utilisateur en console.
- Affiche les options disponibles, recueille l'entrée de l'utilisateur et déclenche les actions appropriées en fonction de ce que l'utilisateur choisit.

## Instructions d'exécution
1. Clonez ce dépôt avec la commande `git clone https://github.com/YassineOularbi/BRIEF-POUPEES-RUSSES.git`.
2. Accédez au répertoire du projet avec la commande `cd BRIEF-POUPEES-RUSSES`.
3. Compilez le code source avec la commande `javac Main.java`.
4. Exécutez le programme avec la commande `java Main`.
5. Suivez les instructions affichées dans la console pour utiliser l'application.

## Auteurs
Ce projet a été développé par [Yassine OULARBI], sous la supervision de l'école ENAA Béni Mellal.

## Contact
Pour toute question ou commentaire, veuillez contacter [yassineoularbi4@gmail.com] ou [+212 6 10 44 60 80].

LinkedIn : "www.linkedin.com/in/yassine-oularbi-79730424b"

Plannification Trello : "https://trello.com/b/1fQHhE9z/brief-poupee-russe-enaa-simplone"