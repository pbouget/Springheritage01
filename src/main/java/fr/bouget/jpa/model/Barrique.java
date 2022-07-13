package fr.bouget.jpa.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BAR")
public class Barrique extends Vin {
    public static final long serialVersionUID=987654378L;
    
    private int contenance;
    
    public Barrique(){
        super();
        contenance=0;
    }
    
    public Barrique(int contenance){
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
        if(! (obj instanceof Barrique)){
            return false;
        }else{
            Barrique b=(Barrique)obj;
            return super.equals(b) && contenance==b.contenance;
        }
    }
    
    @Override
    public String toString(){
        return super.toString()+" contenance : "+contenance;
    }
}
