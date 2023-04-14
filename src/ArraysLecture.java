import rpg.Monster;

import java.util.Arrays;
public class ArraysLecture {

    public static Monster[] addMonster(Monster[] monstersArray, Monster newMonster){
        Monster[] newMonsterArray = Arrays.copyOf(monstersArray, monstersArray.length + 1);
        newMonsterArray[newMonsterArray.length - 1] = newMonster;
        return newMonsterArray;
    }

    public static void main(String[] args) {
        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);

        Monster[] monsters = {orc, ogre, blueDragon};

        Monster cloaker = new Monster("Cloaker", 14, 78, 10);

        Monster[] newMonsterArray = ArraysLecture.addMonster(monsters, cloaker);

//        for (Monster monster : monsters){
//            System.out.println(monster.getName());
//        }

        for (Monster monster : newMonsterArray){
            System.out.println(monster.getName());
        }

        int[] moreNumbers = {33, 52, 22, 8, 1};

//        Arrays.sort(moreNumbers);
//        for (int number : moreNumbers){
//            System.out.println(number);
//        }


    }



}
