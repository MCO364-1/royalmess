package mco364;

import java.util.ArrayList;

public class EntryPoint {

    public static void main(String[] args) {
        ArrayList<SuperClass> superMen = new ArrayList<>();

        superMen.add(new SuperClass());
        superMen.add(new MegaFafnik());
        superMen.add(new SuperYisroel());
        superMen.add(new losev());
        superMen.add(new losev());
        //Hey
        superMen.add(new losev());
        superMen.add(new LiffClass());

        for (Object o : superMen) {
            System.out.println(o);
        }

    }
}
