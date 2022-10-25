/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_fagart;

/**
 *
 * @author 33768
 */
public class Voiture {
    public String Marque = "";
    public String Modele="";
    public int PuissanceCV=0;
    Personne proprietaire ;
   

    

    public Voiture(String Modelee,String Marquee, int PuissanceCVe ) {
      Modele=Modelee;
      Marque=Marquee;
      PuissanceCV=PuissanceCVe;
      proprietaire=null;
      
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner ="\nModele:" +Modele+"\nMarque :"+Marque+"\nPuissanceCV :"+PuissanceCV ;
        return chaine_a_retourner;
    }

}
