package recapjava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benjaminbastide
 */
public class Colis {
    private int poidsEnGramme;
    private String nomDestinataire;
    private Adresse adresseClient;
    private PointDeLivraison pointDeLivraison;

    public Colis(int poidsEnGramme, String nomDestinataire, Adresse adresseClient, PointDeLivraison pointDeLivraison) {
        this.poidsEnGramme = poidsEnGramme;
        this.nomDestinataire = nomDestinataire;
        this.adresseClient = adresseClient;
        this.pointDeLivraison = pointDeLivraison;
        this.pointDeLivraison.associerColis(this);
    }
    public float calculerPrix(){
        float prix=0;
        if(poidsEnGramme<500){
            prix=1.99f;
            
      }else if(poidsEnGramme<2000){
          prix=3.99f;
          
      }else if(poidsEnGramme<5000){
          prix=5.99f;
          
      }else{
          prix=8.99f;
      }
        
      if(adresseClient.estEnFrance()){
          return prix;
      }
          return prix+=6;
    }
}
