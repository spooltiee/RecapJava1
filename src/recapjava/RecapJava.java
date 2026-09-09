/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recapjava;

/**
 *
 * @author benjaminbastide
 */
public class RecapJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Adresse AdresseFrance = new Adresse("France","Muret",31600,"157 route d'eaunes");
        Adresse AdresseAllemagne = new Adresse("Allemagne","Frankfurt",60529,"Rheinlandstr. 66-68");
        
        System.out.println(AdresseFrance.estEnFrance());
        System.out.println(AdresseAllemagne.estEnFrance());

    }
    
}
