/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_fagart;

import java.util.Scanner;

/**
 *
 * @author 33768
 */
public class TP2_convertisseurObjet_FAGART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scanner = new Scanner(System.in);
          
         System.out.println("Ecrire une conversion:KelvinVersCelsius:1 CelsiusVersKelvin:2 FahrenheitVersKelvin:3 KelvinVersFahrenheit:4 CelsiusVersFahrenheit:5 FahrenheitVersCelsius: 6 ");
         int nombrec = scanner.nextInt();
        // Affiche le nombre saisit par l'utilisateur

         // Affiche "Ecrire un nombre: "
        System.out.println("Ecrire un nombre: ");

        //Lit l'entier écrit par l'utilisateur et l'affecte 
        // à  la variable nombre du programme
        double nombre = scanner.nextDouble();
        // Affiche le nombre saisit par l'utilisateur
       
        Convertisseur no=new Convertisseur();
        if (nombrec==1){
        no.KelvinVersCelsius(nombre);
        
        }
        if (nombrec==2){
        no.CelsiusVersKelvin(nombre);
        
        }if (nombrec==3){
        no.FahrenheitVersKelvin(nombre);
        
        }if (nombrec==4){
        no.KelvinVersFahrenheit(nombre);
        
        }if (nombrec==5){
        no.CelsiusVersFahrenheit(nombre);
        
        }if (nombrec==6){
        no.FahrenheitVersCelsius(nombre);
        
        }
        
        
    }
    
}
