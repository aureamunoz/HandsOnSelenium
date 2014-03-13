#HandsOnSelenium
===============

##Prérequis 


## 
Pour chaque exercice, vous trouverez un ou plusieurs tests qui ne passent pas. Il faudra alors rajouter du code uniquement dans le test pour le faire passer. Vous ne devez pas modifier l'application, sauf indication contraire dans l'énoncé de l'exercice.
Les exercices seront corrigés à l'oral et vous aurez une version d'une solution (comme partout, il peut y en avoir plusieurs),


## Selenium
### Action Basiques 
####Exercice0.java
Initialiser le driver, Aller sur la page d'accueil (le test vérifie le titre de la page) et fermer le driver.
####Exercice1.java
Cliquer sur le bouton "about" puis sur le boutton "blog"
####Exercice2.java       
Remplir les informations du formulaire et le valider, vérifier l'affichage de "Thanks".
Vérifier le focus sur les informations manquantes lors d'un renseignement partiel du formulaire.
####Exercice3.java       
Récuperer le cookie "luke".
####Exercice4.java
Accepter puis refuser l'alerte javascript.
####Exercice5.java
Retourner sur la dernière page visitée.
####Exercice6.java
Modifier via javascript le text de "bigButton".

          
Drivers - Prez 10 min (correction + prez driver) 15 min
Utiliser htmldriver
Utiliser un autre driver (ChromeDriver, FirefoxDriver)     
Ajax - (Correction + prez driver) 5 min + 30 min
              je me rends sur une page, je clique sur next et je verifie que les données ont bien changées
a : en utilisant un timer explicit
b : en utilisant un timer implicit
Avec FluentWait
Sans FluentWait
pendant l’attente, supprimer l’id et le recréer pour avoir l’exception specifique
Page object Pattern - Prez concept : 8 min + 30 min
    - Refactoring de tests existants
        Sans utilisation des webelement
        Avec l’utilisation des webelement
        
        
FluentLenium (Si temps)
              je me rends sur une page, je clique et je verifie bien que la page a changé sans ID
Ajax time Explicit
Photo lors d’un test fail
Partage avec @SharedDriver
Page Object Pattern
