

package iskolaemberekkelprogram;

import modell.Epulet;
import modell.Iskola;

public class IskolaEmberekkel {

    private Epulet iskolaEpulet;
    private boolean biztonsagos;
   
 public void run(){
 
    biztonsagos = true;
    iskolaEpulet = new Iskola();
     
  System.out.println(iskolaEpulet.toString());
  System.out.println(iskolaEpulet.isBiztonsagos());
  System.out.println(((Iskola)iskolaEpulet).getEmberek().get(5).toString());
    
 }  
    
}
