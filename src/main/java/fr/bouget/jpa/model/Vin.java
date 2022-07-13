package fr.bouget.jpa.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("VIN")
public class Vin extends Article {
    public static final long serialVersionUID=987654378L;
    
    private String region;
    private String couleur;
    private int annee;
    
    public Vin(){
    }
    
    @Column(length = 60)
    public String getRegion() {
        return region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
    
    @Column(length = 45)
    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
    public int getAnnee() {
        return annee;
    }
    
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    
    @Override
    public boolean equals(Object obj){
        if(! (obj instanceof Vin)){
            return false;
        }else{
            Vin v=(Vin)obj;
            return super.equals(v) && region.equals(v.region) && couleur.equals(v.couleur) && annee==v.annee ;
        }
    }
    
    @Override
    public String toString(){
        return super.toString()+" région : "+region+" "+couleur;
    }
}
