
package adatszerkezetgyakorlas;

import java.text.Collator;
import java.util.Comparator;

public class CimComparator implements Comparator<Dal> {

    @Override
     public int compare(Dal d1, Dal d2) {
      Collator col = Collator.getInstance();
       return col.compare((d1.getCim()+d1.getEloado()), (d2.getCim()+d2.getEloado()));
      
     //a (cím+előadó) konkatenációra kell alkalmazunk a Collator compare metódusát, mivel az osztályt a Treeset-hez használjuk fel    
     //ha csak a címre alkalmaznánk, akkor az azonos címmel rendelkező dalokat kivágná a halmazból, még a különböző előadójúakat is
     //ha összevonjuk a címet és az előadót egy stringgé, akkor az azonos című, de kül. előadójú dalok nem számítanak duplikátumoknak
     //így a Treeset meg fogja azokat tartani
    
    
}

    
}
