/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teglalap;

/**
 *
 * @author hallgato
 */
public class Teglalap0 {

    public static void main(String[] args) {

        try {
            Teglalap t2 = new Teglalap(3, 4);
            System.out.println(t2.toString());
            
            Teglalap t3 = new Teglalap(8, 4);
             t3.setA(-5);
            System.out.println(t3.toString());
            

            Teglalap t1 = new Teglalap(-1, 2);
            System.out.println(t1.toString());
            
            
            
            

        } catch (IllegalArgumentException e) {
            System.out.println("Nem szerkeszthető meg!");
        }
    }

}
