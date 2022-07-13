package fr.bouget.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * 
 * @author PBouget
 * Cet exemple nous montre comment générer une table unique Article avec un champ
 * nommé "Discriminator" pour identifier les différentes sous-classes.
 * classe mère dite classe de base :
 * la classe discriminante est précisée par l'annotation discriminatorcolumn
 * C'est la valeur discriminatorvalue de chaque Entité qui permettra son identification (sous-classe)
 */

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DISCRIMINATOR",discriminatorType=DiscriminatorType.STRING, length=3) 
@DiscriminatorValue("ART")
public class Article implements Serializable {
    public static final long serialVersionUID=987654378L;
    
    private Integer codeArticle;
    private String designation;
    private double prix;
    private double remise;
    private int quantite;
    
    public Article(){
        this(0,"",0.0,0.0,0);
    }
    
    public Article(Integer codeArticle,String designation,double prix,double remise,int quantite){
        this.codeArticle=codeArticle;
        this.designation=designation;
        this.prix=prix;
        this.remise=remise;
        this.quantite=quantite;
    }
    
    public Article(Article article){
    	
    	this(article.codeArticle, article.designation,article.prix, article.remise,article.quantite);
    }
    
    @Id
    public Integer getCodeArticle(){
        return codeArticle;
    }
    
    public void setCodeArticle(Integer codeArticle){
        this.codeArticle=codeArticle;
    }
    
    public String getDesignation(){
        return designation;
    }
    
    @Column(length = 55)
    public void setDesignation(String designation){
        this.designation=designation;
    }
    
    public double getPrix(){
        return prix;
    }
    
    public void setPrix(double prix){
        this.prix=prix;
    }
    
    public double getRemise(){
        return remise;
    }
    
    public void setRemise(double remise){
        this.remise=remise;
    }
    
    public int getQuantite(){
        return quantite;
    }
    
    public void setQuantite(int quantite){
        this.quantite=quantite;
    }
    
    @Override
    public boolean equals(Object obj){
        if(! (obj instanceof Article)){
            return false;
        }else{
            Article a=(Article)obj;
            return codeArticle.equals(a.codeArticle) && designation.equals(a.designation) &&
                    prix==a.prix && remise==a.remise && quantite==a.quantite;
        }
    }
    
    @Override
    public String toString(){
        return codeArticle+" "+designation+" "+prix+" "+remise+" "+quantite;
    }
}
