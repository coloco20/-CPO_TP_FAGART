/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_fagart;

/**
 *
 * @author 33768
 */
public class TP2_Bieres_FAGART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        uneBiere.lireEtiquette();
        

            System.out.println(uneBiere);
        // TODO code application logic here
        BouteilleBiere uneBiere2 = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        uneBiere2.lireEtiquette();
 BouteilleBiere uneBiere3 = new BouteilleBiere("Leffe Ruby", 3.5, "Abbaye de Leffe");
        uneBiere3.lireEtiquette();
        BouteilleBiere uneBiere4 = new BouteilleBiere("1664", 4.0, "mauvaise brasserie");
        BouteilleBiere uneBiere5 = new BouteilleBiere("pecheresse", 100, "tres bonne brasserie");
         uneBiere.Décapsuler();
         uneBiere2.Décapsuler();
         uneBiere3.Décapsuler();
         uneBiere4.Décapsuler();
         uneBiere.lireEtiquette();
         uneBiere2.lireEtiquette();
         uneBiere3.lireEtiquette();
         uneBiere4.lireEtiquette();
          uneBiere5.lireEtiquette();
    }
    }



