
package bejarhatogyakorlas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Nevsor implements Iterable<Ember>{
    private ArrayList<Ember> emberLista;

    public Nevsor() {
        emberLista = new ArrayList<>();
        emberLista.add(new Ember("Péter", 22));
        emberLista.add(new Ember("Pál", 23));
        emberLista.add(new Ember("Pisti", 25));
    }
    
    //biztonságos getter egy másolattal:
    public ArrayList<Ember> getEmberLista(){
        return new ArrayList<>(emberLista); //létrehoz egy úgy ArrayList példányt (ez lesz a másolatlista), és emberLista elemeit belemásolja
    }
    
    //nem módosítható lista:
    public List<Ember> getEmberUnModLista(){
        return Collections.unmodifiableList(emberLista);
    }

    @Override
    public Iterator<Ember> iterator() {
        return emberLista.iterator();
    }
}
