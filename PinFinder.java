// ============================================================
// MISSION 1 : le coffre (version Java - juste l'algorithme)
//
// Fichier a ouvrir : coffre.zip (il doit etre dans le MEME dossier que ce fichier)
// L'ouverture du zip protege par mot de passe est deja geree par testerPin,
// grace a la librairie zip4j fournie dans lib/ (Java ne sait pas le faire
// nativement, contrairement au module zipfile de Python).
//
// Pour compiler puis lancer (depuis ce dossier) :
//   Linux / Mac :
//     javac -cp lib/zip4j-2.11.6.jar PinFinder.java
//     java  -cp "lib/zip4j-2.11.6.jar:." PinFinder
//   Windows (cmd / PowerShell) :
//     javac -cp lib\zip4j-2.11.6.jar PinFinder.java
//     java  -cp "lib\zip4j-2.11.6.jar;." PinFinder
//
// A FAIRE : ecrire l'algorithme dans trouverPin (les 4 boucles).
// Ne modifie pas testerPin : elle ne teste qu'un seul PIN a la fois.
//
// Une fois que ca marche en Java, tu peux demander a une IA de traduire
// ton algorithme (juste les boucles, pas testerPin) en Python pour
// completer trouver_pin dans main.py : c'est ce fichier-la qui sert
// pour la soumission officielle de la mission.
// ============================================================
import net.lingala.zip4j.ZipFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class PinFinder {

    /** Renvoie le contenu du fichier si le PIN est bon, sinon null. */
    static byte[] testerPin(String cheminZip, String fichier, String pin) {
        try {
            ZipFile archive = new ZipFile(cheminZip, pin.toCharArray());
            try (InputStream flux = archive.getInputStream(archive.getFileHeader(fichier))) {
                ByteArrayOutputStream contenu = new ByteArrayOutputStream();
                byte[] tampon = new byte[4096];
                int lus;
                while ((lus = flux.read(tampon)) != -1) {
                    contenu.write(tampon, 0, lus);
                }
                return contenu.toByteArray();
            }
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * A toi de jouer : teste les PIN de 0000 a 9999 (quatre chiffres, donc
     * quatre boucles imbriquees, comme dans le cours).
     * Renvoie le PIN trouve des que testerPin reussit, ou null si aucun
     * PIN ne marche.
     */
    static String trouverPin(String cheminZip, String fichier) {
        // TODO : les 4 boucles
        return null;
    }

    public static void main(String[] args) {
        String fichier = "mission.txt";
        String pin = trouverPin("coffre.zip", fichier);

        if (pin == null) {
            System.out.println("Aucun PIN trouve.");
            return;
        }

        byte[] contenu = testerPin("coffre.zip", fichier, pin);
        System.out.println("PIN trouve : " + pin);
        System.out.println(new String(contenu));
    }
}
