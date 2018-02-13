
package ss.view;

import ss.model.Note;
import ss.model.Samsung;

public class TestSamsung {
    public static void main(String[] args) {
        Samsung s1 = new Samsung(123,"S7",15000);
        System.out.println(s1);
        
        Note s2 = new Note(3000,456,"Note 8",30000);
        System.out.println(s2);
    }
}
