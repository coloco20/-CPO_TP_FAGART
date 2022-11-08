/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.héritage.colombe_fagart;

/**
 *
 * @author 33768
 */
public class baton extends Arme {

    public int age;

    public baton(String N, int a, int i) {
        super(N, a);
        
        if (i > 100) {
            age = i;}
else if(i<0) {
            age=0;
        }else {
            age=i;
        }
    }

}
