/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.héritage.colombe_fagart;

/**
 *
 * @author 33768
 */

    public class epee extends Arme {
    public int finesse;
    public epee(String N, int a, int i){
            super(N,a);
    
    if (i > 100) {
            finesse = 100;

        } else if(i<0){
            finesse = 0;
        }else{
          finesse = i;  
        }}

    
}


