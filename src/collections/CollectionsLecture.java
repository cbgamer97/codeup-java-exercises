package collections;

import rpg.Monster;

import java.util.*;

import static java.util.Map.entry;

public class CollectionsLecture {
    public static class CodingLanguage {
        private String name;
        private int createdDate;
        private String creator;

        public CodingLanguage(String name, int createdDate, String creator) {
            this.name = name;
            this.createdDate = createdDate;
            this.creator = creator;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(int createdDate) {
            this.createdDate = createdDate;
        }

        public String getCreator() {
            return creator;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }
    }

    public static void main(String[] args) {
        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);
        Monster werewolf = new Monster("Wereworlf", 13, 13, 13);
        Monster goblin = new Monster("Goblin", 13, 13, 13);
        Monster frostGiant = new Monster("Frost Giant", 13, 13, 13);


//        ArrayList<Monster> monsterList = new ArrayList<>();
//        monsterList.add(orc);
//        monsterList.add(ogre);
//        monsterList.add(blueDragon);

//        ArrayList<Monster> monsterList = new ArrayList<>(List.of(orc, ogre, blueDragon));


//        Monster[] monsters = {orc, ogre, blueDragon};
//        ArrayList<Monster> monsterList = new ArrayList<>(Arrays.asList(monsters));
//        for (Monster monster : monsterList){
//            System.out.println(monster.getName());
//        }
//
//        System.out.println(monsterList.size());
//
//        System.out.println(monsterList.get(1).getName());
        ArrayList<CodingLanguage> codingLanguages = new ArrayList<>();

        CodingLanguage java = new CodingLanguage("Java", 1995, "Sun Microsystems");
        codingLanguages.add(java);

        CodingLanguage python = new CodingLanguage("Python", 1991, "Guido van Rossum");
        codingLanguages.add(python);

        CodingLanguage javascript = new CodingLanguage("JavaScript", 1995, "Netscape Communications Corporation");
        codingLanguages.add(javascript);

        CodingLanguage c = new CodingLanguage("C", 1972, "Dennis Ritchie");
        codingLanguages.add(c);

        CodingLanguage cPlusPlus = new CodingLanguage("C++", 1983, "Bjarne Stroustrup");
        codingLanguages.add(cPlusPlus);

        CodingLanguage go = new CodingLanguage("Go", 2009, "Google");
        codingLanguages.add(go);

        CodingLanguage swift = new CodingLanguage("Swift", 2014, "Apple Inc.");
        codingLanguages.add(swift);

        CodingLanguage rust = new CodingLanguage("Rust", 2010, "Mozilla Foundation");
        codingLanguages.add(rust);

        CodingLanguage kotlin = new CodingLanguage("Kotlin", 2011, "JetBrains");
        codingLanguages.add(kotlin);

        CodingLanguage ruby = new CodingLanguage("Ruby", 1995, "Yukihiro Matsumoto");
        codingLanguages.add(ruby);

        CodingLanguage php = new CodingLanguage("PHP", 1995, "Rasmus Lerdorf");
        codingLanguages.add(php);

        CodingLanguage objectiveC = new CodingLanguage("Objective-C", 1983, "Brad Cox");
        codingLanguages.add(objectiveC);

        CodingLanguage sql = new CodingLanguage("SQL", 1974, "IBM");
        codingLanguages.add(sql);

        CodingLanguage swiftObjectiveC = new CodingLanguage("Swift/Obj-C", 2014, "Apple Inc.");
        codingLanguages.add(swiftObjectiveC);

        CodingLanguage perl = new CodingLanguage("Perl", 1987, "Larry Wall");
        codingLanguages.add(perl);

        CodingLanguage groovy = new CodingLanguage("Groovy", 2003, "James Strachan");
        codingLanguages.add(groovy);

        CodingLanguage scala = new CodingLanguage("Scala", 2004, "Martin Odersky");
        codingLanguages.add(scala);

        CodingLanguage lua = new CodingLanguage("Lua", 1993, "Roberto Ierusalimschy");
        codingLanguages.add(lua);

        CodingLanguage r = new CodingLanguage("R", 1993, "Ross Ihaka and Robert Gentleman");
        codingLanguages.add(r);

        codingLanguages.sort(Comparator.comparing(CodingLanguage::getName));
        codingLanguages.sort(Comparator.comparingInt(CodingLanguage::getCreatedDate));

//        for(CodingLanguage language : codingLanguages) {
//            System.out.printf("%s was created in %d by %s.%n", language.getName(), language.getCreatedDate(), language.getCreator());
//        }

        // HASH MAPS

        HashMap<String, Integer> careerWins = new HashMap<>();

        // ADDING ELEMENTS TO A HASHMAP

        careerWins.put("Gregg Popovich", 1366);
        careerWins.put("Don Nelson", 1335);
        careerWins.put("Lenny Wilkens", 1332);

        // TO RETRIEVE AN ITEM FROM A HASHMAP USE .GET AND PASS THE KEY

        System.out.println(careerWins.get("Gregg Popovich"));

        //TO REPLACE A VALUE USE .REPLACE

        careerWins.replace("Gregg Popovich", 1367);
        System.out.println(careerWins.get("Gregg Popovich"));


//        HashMap<String, Monster> monsterHashMap = new HashMap<>();

        // TO ADD MULTIPLE ENTRIES USE MAP.OFENTERIES()
        //RETURNS AN UNMODIFIABLE MAP
        // MUST BE CONVERTED TO A HASH MAP TO MODIFY

        Map<String, Monster> monsterMap = Map.ofEntries(
                entry("Orc", orc),
                entry("Blue Dragon", blueDragon),
                entry("Ogre", ogre),
                entry("Werewolf", werewolf),
                entry("Goblin", goblin),
                entry("Frost Giant", frostGiant)
        );

        // CONVERTING MAP TO HASH MAP

        Map<String, Monster> monsterHashMap = new HashMap<>(monsterMap);

        monsterHashMap.put("Skeleton", new Monster("Skeleton", 13, 13, 5));

        for(Map.Entry<String, Monster> monsterEntry : monsterHashMap.entrySet()){
            System.out.printf("The key is %s.%n", monsterEntry.getKey());
            System.out.printf("%s has %d hit points.%n", monsterEntry.getValue().getName(), monsterEntry.getValue().getHitPoints());
        }

        monsterHashMap.forEach((name, monster)->{
            System.out.printf("%s has %d hit points%n", name, monster.getHitPoints());
        });

    }



}
