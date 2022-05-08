package homework.seven.files;

import java.io.IOException;

import static homework.seven.files.StringTask.searchAndCountChars;
import static homework.seven.files.StringTask.searchAndCountWord;

public class Main {
    public static void main (String[] args) throws IOException {
        System.out.println("Задание 47.");
        MyFiles file = new MyFiles("myFile.txt");
        String txt = "Prints, an Object and then terminate the line.";
        file.saveToFile(txt);

        String readTxt = file.readFromFile();
        System.out.println(readTxt);
        System.out.println("Знаков препинания: "+searchAndCountChars(readTxt,"[^.?!,;:-]"));
        System.out.println("Слов: "+searchAndCountWord(readTxt));

    }
}
