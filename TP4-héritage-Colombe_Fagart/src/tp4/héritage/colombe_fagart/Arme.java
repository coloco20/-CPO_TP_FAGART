/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.héritage.colombe_fagart;

/**
 *
 * @author 33768
 */
public class Arme {
    public String Nom = "";
    public int atq_dm=0;
   
    public Arme(String N, int a ) {
      
      Nom=N;
      if (a > 100) {
           atq_dm=100;

        } else if(a<0) {
            atq_dm=0;
        }else {
            atq_dm=a;
        }
      
}
 @Override
    public String toString() {
        return ("\nNom :" +Nom+"\n Niveau d’attaque :"+atq_dm);
    }}
