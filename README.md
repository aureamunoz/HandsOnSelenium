#HandsOnSelenium
===============

##Prérequis 


## 
Pour chaque exercice, vous trouverez un ou plusieurs tests qui ne passent pas. Il faudra alors rajouter du code uniquement dans le test pour le faire passer. Vous ne devez pas modifier l'application, sauf indication contraire dans l'énoncé de l'exercice.
Les exercices seront corrigés à l'oral et vous aurez une version d'une solution (comme partout, il peut y en avoir plusieurs),


## Selenium
### Action Basiques 
####Exercice1.java
Aller sur une page, cliquer sur le bouton avec l'id "myId"
Aller sur une page, cliquer sur le bouton dont le commentaire commence par <-- exercice1 --> dans le code html
####Exercice2.java       
Remplir le login avec "Luke" et le mot de passe "Skywalker". Valider le formulaire.
####Exercice3.java       
Ajouter le code pour que la page précédente soit affichée.
####Exercice4.java
Vérifier que le cookie "deathstar" est bien présent.
####Exercice5.java
Lorsque la fenetre d'alerte apparait, cliquez sur "Annuler" pour faire passer le test.
Exercice6.java
Modifier via javascript la valeur du champ avec l'id "help" pour que le test passe.

          
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
