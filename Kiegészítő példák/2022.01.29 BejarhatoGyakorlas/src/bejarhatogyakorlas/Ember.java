/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bejarhatogyakorlas;


public class Ember {
    private String nev;
    private int kor;

    public Ember(String nev, int kor) {
        this.nev = nev;
        this.kor = kor;
    }

    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", kor=" + kor + '}';
    }
}
