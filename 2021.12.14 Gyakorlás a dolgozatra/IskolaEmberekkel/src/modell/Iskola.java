
package modell;

import java.util.ArrayList;
import java.util.List;


public class Iskola extends Epulet {
    
    private List<Ember> emberek;

    public Iskola(boolean biztonsagos) {
        super(biztonsagos);
    }

    
  public String letszaminfo(){

return "Ennyi a létszám";
}

    /*SAJÁT KIEGÉSZÍTÉS*/

    
  
public List<Ember> getEmberek(){
return emberek;
}
     
    
    public Iskola() {
        this(true);
        //legyen 5 diák és 5 tanár
               
        emberek=new ArrayList<>(); 
        for (int i = 0; i < 5; i++) {
            emberek.add(new Diak("Diák"+String.valueOf(i),eloAllitVeletlenKor()));
        }
        for (int j = 5; j < 10; j++) {
            emberek.add(new Tanar("Tanár"+String.valueOf(j),eloAllitVeletlenKor(),"T"+String.valueOf(j)));
        }
        
        
    }
    
 public int eloAllitVeletlenKor(){
 int kor = (int)(Math.random()*50)+18; //18-67
 return kor;
 }   

 
  public String getEmberekIskola(){
    String txt = "";
    for (Ember ember : emberek) {
            if(ember instanceof Diak){
                txt+="{Diák neve:"+((Diak)ember).getNev() + " | Diák kora: "+((Diak)ember).getKor() + " | Diák átlaga: " + ((Diak)ember).getAtlag()+"}\n";
        }
    }
     for (Ember ember : emberek) {
            if(ember instanceof Tanar){
                txt+="{Tanár neve:"+((Tanar)ember).getNev() + " | Tanár kora: "+((Tanar)ember).getKor() + " | Tantárgy: " + ((Tanar)ember).getTargy()+"}\n";
        } 
   
  }  
 return txt;
}  

    @Override
    public String toString() {
        return getEmberekIskola();
    }
  
  

}