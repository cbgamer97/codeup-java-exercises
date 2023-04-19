package rpg;

import Animals.Animal;
import Animals.Quote;

import java.util.ArrayList;

public class RPG {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        fighter1.setName("Arata");
        fighter1.setHitPoints(17);
        fighter1.setMaxDamage(14);
//        fighter1.printStats();

        Fighter fighter2 = new Fighter();
        fighter2.setName("Sozalix");
        fighter2.setHitPoints(25);
        fighter2.setMaxDamage(23);
//        fighter2.printStats();

        Fighter fighter3 = new Fighter("Shrek", 95, 45);
//        fighter3.printStats();

        int d20Roll = D20.rollD20();
//        System.out.println(d20Roll);


        // collections
        ArrayList<Monster> monsterList = new ArrayList<>();
    }
}
