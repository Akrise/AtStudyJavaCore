package homework_solution.lesson14.helpers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import homework_solution.lesson14.model.Person;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JsonHelper {

    public static List<Person> getPersonsFromFile(String path) throws FileNotFoundException {
        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);
        StringBuilder fileAsStrings = new StringBuilder();
        while(scanner.hasNextLine()){
            fileAsStrings.append(scanner.nextLine());
        }
        List<Person> persons = new ArrayList<>();
        persons = new Gson().fromJson(fileAsStrings.toString(), new TypeToken<List<Person>>(){}.getType());
        return persons;
    }
}
