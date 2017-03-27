package mco364;

import java.util.ArrayList;

public class EntryPoint {

    public static void main(String[] args) {
        ArrayList<SuperClass> superMen = new ArrayList<>();
        
        superMen.add(new SuperClass());
        superMen.add(new Markov());
        superMen.add(new SuperYisroel());
        
        
        for (Object o: superMen)
        {
            System.out.println(o);
        }

        
    }
}
