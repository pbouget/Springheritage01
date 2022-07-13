package fr.bouget.jpa.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BOU")
public class Bouteille extends Vin {

	private static final long serialVersionUID = 1L;
	
	private int contenance;
    
    public Bouteille(){
        super();
        contenance=0;
    }
    
    public Bouteille(int contenance){
        this.contenance=contenance;
    }
    
    public int getContenance() {
        return contenance;
    }
    
    public void setContenance(int contenance) {
        this.contenance = contenance;
    }
    
    @Override
    public boolean equals(Object obj){
        if(! (obj instanceof Bouteille)){
            return false;
        }else{
            Bouteille b=(Bouteille)obj;
            return super.equals(b) && contenance==b.contenance;
        }
    }
    
    @Override
    public String toString(){
        return super.toString()+" contenance : "+contenance;
    }
}
