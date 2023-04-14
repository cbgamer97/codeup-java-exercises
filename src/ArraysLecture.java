import rpg.Monster;

import java.util.Arrays;
public class ArraysLecture {

    public static void main(String[] args) {
        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);

        Monster[] monsters = {orc, ogre, blueDragon};

//        for (Monster monster : monsters){
//            System.out.println(monster.getName());
//
//        }

        int[] moreNumbers = {33, 52, 22, 8, 1};

        Arrays.sort(moreNumbers);
        for (int number : moreNumbers){
            System.out.println(number);
        }


    }



}
