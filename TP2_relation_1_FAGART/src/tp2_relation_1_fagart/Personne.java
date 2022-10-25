/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_fagart;

/**
 *
 * @author 33768
 */
public class Personne {

    public String nom = "";
    public String prenom = "";
    int nbVoitures;
    public Voiture[] liste_voitures;

//(j'ajoute e a la fin pour signifier que c'est une entrée, donc locale)
    public Personne(String nome, String prenome) {
        nom = nome;
        prenom = prenome;
        liste_voitures = new Voiture[3];

    }

    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "nom :" + nom + "\nprenom :" + prenom;
        return chaine_a_retourner;
    }

    Voiture a = new Voiture("", "", 0);

    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        // … a completer

        if (voiture_a_ajouter.proprietaire != null) {
            return (false);
        } else {
            for (int j = 0; j < 3; j++) {
                if (liste_voitures[j] == null) {
                    liste_voitures[j] = voiture_a_ajouter;
                    voiture_a_ajouter.proprietaire = this;
                    return (true);
                }
            }

        }

        return (false);

    }
}
