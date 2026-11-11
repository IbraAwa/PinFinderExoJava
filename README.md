# OPÉRATION EL JEFE — Mission 1 : le coffre (variante Java)

*Confidentiel. Destruction après lecture.*

Agent,

Votre cellule vous a contacté personnellement. Vous êtes les meilleurs, et c'est pour ça qu'on fait appel à vous.

La mission El Jefe vise le cartel de Sinaloa et son chef. Dans cette mission, une sous-mission concerne un coffre numérique, `coffre.zip`, saisi lors d'une perquisition. Il est verrouillé par un code PIN à 4 chiffres, et personne n'a réussi à l'ouvrir. Le coffre est impossible à ouvrir à la main : c'est pour ça qu'on compte sur vous.

**Votre mission**

1. Écrivez l'algorithme qui teste tous les codes possibles, de `0000` à `9999`.
2. Pour chaque code, essayez d'ouvrir le coffre. Une mauvaise combinaison ne doit pas faire planter le programme.
3. Dès que le bon code est trouvé, arrêtez la recherche et récupérez le contenu du coffre.

## Ce repo, c'est quoi ?

Une version Java de la mission, pour s'entraîner sur l'algorithme avant de passer à la version officielle Python (repo [PinFinderPython](https://github.com/IbraAwa/PinFinderPython)).

Java ne sait pas ouvrir nativement un zip protégé par mot de passe (contrairement au module `zipfile` de Python), donc `testerPin` est déjà écrit et gère tout ça pour vous, grâce à la librairie [zip4j](https://github.com/srikanth-lingala/zip4j) fournie dans `lib/`. **Il ne vous reste que l'algorithme à écrire dans `trouverPin`.**

## Compiler et lancer

Depuis ce dossier :

```bash
# Linux / Mac
javac -cp lib/zip4j-2.11.6.jar PinFinder.java
java  -cp "lib/zip4j-2.11.6.jar:." PinFinder

# Windows (cmd / PowerShell)
javac -cp lib\zip4j-2.11.6.jar PinFinder.java
java  -cp "lib\zip4j-2.11.6.jar;." PinFinder
```

Avec `trouverPin` vide (TODO non rempli), le programme affiche `Aucun PIN trouve.` — c'est normal, c'est à vous de jouer.

## Et après ?

Une fois votre algorithme qui fonctionne en Java, demandez à une IA de le traduire (pas `testerPin`) en Python, pour compléter `trouver_pin` dans `main.py` du repo [PinFinderPython](https://github.com/IbraAwa/PinFinderPython) : c'est ce fichier-là qui sert pour la soumission officielle de la mission.

*Fin du message.*
