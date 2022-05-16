
package adatszerkezetgyakorlas;

import java.text.Collator;
import java.util.Comparator;
import java.util.Objects;

public class EloadoNevComparator implements Comparator <Dal>{

    @Override
    public int compare(Dal d1, Dal d2) {
      Collator col = Collator.getInstance();
     return col.compare((d1.getEloado()+d1.getCim()), (d2.getEloado()+d2.getCim()));
    }
    
     //a (előadó+cím) konkatenációra kell alkalmazunk a Collator compare metódusát, mivel az osztályt a Treeset-hez használjuk fel    
     //ha csak az előadóra alkalmaznánk, akkor az azonos előadóval rendelkező dalokat kivágná a halmazból, még a különböző címűeket is
     //ha összevonjuk a az előadót és a címet egy stringgé, akkor az azonos előadójú, de kül. című dalokat nem tekinti duplikátumoknak
     //így a Treeset meg fogja azokat tartani
    
    

    
}
