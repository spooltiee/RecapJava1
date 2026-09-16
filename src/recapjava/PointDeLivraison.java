package recapjava;

import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benjaminbastide
 */
public class PointDeLivraison {
    private String nom;
    private Adresse adresse;
    private List<Colis> colisDeposes;

    public PointDeLivraison(String nom, Adresse adresse, List<Colis> colisDeposes) {
        this.nom = nom;
        this.adresse = adresse;
        this.colisDeposes = colisDeposes;
    }
    
    public void associerColis(Colis colis){
         this.colisDeposes.add(colis);
    }
}
