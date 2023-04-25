import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {
    public static void main(String[] args) {

        // CREATING FILES

        String directory = "data";
        String filename = "groceries.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if(Files.notExists(dataDirectory)){
            try {
                Files.createDirectories(dataDirectory);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(Files.notExists(dataFile)){
            try {
                Files.createFile(dataFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // ADDING TO FILES


        List<String> groceryList = Arrays.asList("Coffee", "Milk", "Double Stuf Oreos");
        try {
            Files.write(dataFile, groceryList);
            List<String> moreGroceries = Arrays.asList("Peanut Oil", "Flour", "Egg's");
            Files.write(
                    dataFile,
                    moreGroceries,
                    StandardOpenOption.APPEND
                    );
        } catch (IOException e) {
            e.printStackTrace();
        }

        //READING FILES

        try {
            List<String> groceryListFromFile = Files.readAllLines(dataFile);
            for(int i = 1; i <= groceryListFromFile.size(); i++){
                System.out.println(i + ": " + groceryListFromFile.get(i - 1));
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        //CHECKING FOR ITEMS IN LIST ADD IF IT DOESN'T

        Boolean hasPowderedSugar = false;

        try {
            List<String> lines = Files.readAllLines(dataFile);
            for(String line : lines){
                if(line.equals("Powdered Sugar")){
                    hasPowderedSugar = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(!hasPowderedSugar) {
            List<String> moreGroceries = Arrays.asList("Powdered Sugar");
            try {
                Files.write(
                        dataFile,
                        moreGroceries,
                        StandardOpenOption.APPEND
                );
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        try{
            List<String> lines = Files.readAllLines(dataFile);
            List<String> newList = new ArrayList<>();
            for(String line : lines) {
                if(line.equals("Double Stuf Oreos")){
                    newList.add("Regular Oreo's");

                } else {
                    newList.add(line);
                }
            }
            Files.write(dataFile, newList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
