/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sutes;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Program {
     public static void main(String[] args) {
         
         SutiSutes suti = new SutiSutes();
         suti.sutes();
         
         
         
     
//     Suto suto = new Suto();
//     suto.setBekapcsolva(true); //csak a problémás kódot rakom t/c blokkba
//         try {
//             suto.sut();
//         } catch (IOException ex) {
//             System.err.println(ex.getMessage());
//             //ha itt véget ér a program, de a sütő még nem lesz kikapcs., és nekünk ki kell kapcs.
//                //suto.setBekapcsolva(false);
//         }finally{
//             suto.setBekapcsolva(false); //itt a jó helye, mert lehet, h. a catchben megszakad a program
//         }
//   
//     System.out.println(suto);
//     }



//     /*lehet setternek használni a gettert*/
//     Suto s= suti.getSuto();
//      System.out.println(s);
      
////      s.setBekapcsolva(true);
////       System.out.println(s);


System.out.println("sütő bekapcsolva: " +suti.sutoAllapota());


     }
}
