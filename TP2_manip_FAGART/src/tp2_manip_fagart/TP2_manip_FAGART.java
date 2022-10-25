/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_fagart;

/**
 *
 * @author 33768
 */
public class TP2_manip_FAGART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        System.out.println("nb de calories de Assiette 2 : "
                + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : "
                + assiette3.nbCalories);
        assiette2.nbCalories += 1;
        System.out.println("nb de calories de Assiette 3 : "
                + assiette3.nbCalories);
        Tartiflette assiette4 = assiette1;
        assiette1 = assiette2;
        assiette2 = assiette4;
        System.out.println("nb de calories de Assiette 1 : "
                + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : "
                + assiette2.nbCalories);
        //Moussaka assiette666 = assiette1 ;
//Moussaka assiette667 = new Tartiflette() ;
        //non les 2 sont fausses, 6)non c'est impossible
        Moussaka boln[] = new Moussaka[10]; 
        for (int b=0;b<9;b++){
          boln[b]=new Moussaka(5+b);
         
        }
        
    }

}
