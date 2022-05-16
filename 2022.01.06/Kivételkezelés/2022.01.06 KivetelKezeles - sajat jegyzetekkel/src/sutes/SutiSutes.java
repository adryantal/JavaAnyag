/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sutes;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SutiSutes {

    private Suto suto;

    public SutiSutes() {
        suto = new Suto();
    }

    void sutes() {
        //ős nem lehet első
        suto.setBekapcsolva(true); //csak a problémás kódot rakom t/c blokkba
        try {
            suto.sut();
        } 
         //legspec. kivétel
        catch (IOException ex) {
            System.err.println(ex.getMessage());
            //ha itt véget ér a program, de a sütő még nem lesz kikapcs., és nekünk ki kell kapcs.
            //suto.setBekapcsolva(false);
        } 
        catch (SutesException ex) {
            System.err.println(ex.getMessage());
        } 
        //legált. kivétel
        catch (Exception ex) {
            System.err.println("ez nem lehet...");
        } finally {
            suto.setBekapcsolva(false); //itt a jó helye, itt biztosan le fog futni; u.is lehet, h. a catchben megszakad a program
        }

        System.out.println(suto);
    }

//    public Suto getSuto() {
//        //bújtatott setter!!!!!
//        return suto;
//    }
    Boolean sutoAllapota() {
        return suto.isBekapcsolva();
    }

}
