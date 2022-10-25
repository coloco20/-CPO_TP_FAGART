package tp2_convertisseurobjet_fagart;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 33768
 */
public class Convertisseur {

    public Convertisseur() {
        nbConversions = 0;
    }

    @Override
    public String toString() {
        return ("nb de conversions : " + nbConversions);

    }
    public int nbConversions;

    public double KelvinVersCelsius(double TK) {
        nbConversions+=1;
        System.out.println(TK - 273.15);
        return (TK - 273.15);
    }

    public double CelsiusVersKelvin(double TC) {
        nbConversions+=1;
        System.out.println(TC + 273.15);
        return (TC + 273.15);
    }

    public double FahrenheitVersKelvin(double TF) {
        nbConversions+=1;
        System.out.println((TF  +459.67)*5/9.0);
        return ((TF  +459.67)*5/9.0);
    }

    public double KelvinVersFahrenheit(double TK) {
        nbConversions+=1;
        System.out.println(TK *9/5.0-459.67);
        return (TK *9/5.0-459.67);
    }

    public double CelsiusVersFahrenheit(double TC) {
        nbConversions+=1;
        System.out.println(TC*9/5.0+32 );
        return (TC*9/5.0+32 );
    }

    public double FahrenheitVersCelsius(double TF) {
        nbConversions+=1;
        System.out.println((TF-32 )*5/9.0);
        return ((TF-32 )*5/9.0);
    }
    



}
