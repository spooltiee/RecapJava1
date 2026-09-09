/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recapjava;

/**
 *
 * @author benjaminbastide
 */
public class Adresse {
    private String pays;
    private String ville;
    private int codePostal;
    private String voie;
    
    public Adresse(String pays, String ville, int codePostal, String voie){
        this.pays=pays;
        this.ville=ville;
        this.codePostal=codePostal;
        this.voie=voie;
    }
            
    
    
    
    
    public boolean estEnFrance(){
        return (this.pays.equals("France"));
    
    }
    
    
}
