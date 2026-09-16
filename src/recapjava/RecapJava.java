/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recapjava;

import java.util.ArrayList;

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
        
        PointDeLivraison DepotFrance = new PointDeLivraison("Toulouse",AdresseFrance, new ArrayList<Colis>());
        PointDeLivraison DepotAllemagne = new PointDeLivraison("<Frankfurt>",AdresseAllemagne, new ArrayList<Colis>());



        Colis colis1 = new Colis(300, "Alice Martin", AdresseFrance, DepotAllemagne);
        Colis colis2 = new Colis(1500, "Bruno Petit", AdresseFrance, DepotAllemagne);
        Colis colis3 = new Colis(3500, "Chloé Robert", AdresseAllemagne, DepotFrance);
        Colis colis4 = new Colis(6000, "David Simon", AdresseAllemagne, DepotFrance);


        DepotFrance.rentabilite();
        DepotAllemagne.rentabilite();
    }
    
}
