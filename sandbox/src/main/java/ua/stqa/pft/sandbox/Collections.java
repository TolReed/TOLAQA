package ua.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.List;

public class Collections {

    public static void main (String[] args) {
        String [] langs = new String [7]; // створений масив може зберігати 7 елементів, кількість елементів неможливо змінити після ініціалізації масиву
        langs[0] = "Java";
        langs[1] = "C#";
        langs[2] = "Python";
        langs[3] = "PHP";
        langs[4] = "Perl";
        langs[5] = "JavaScript";
        langs[6] = "Swift";

        // !!!another way - String[] langs = ["Java", "C#", "Python", "PHP", "Perl", "JavaScript", "Swift"]
        for (String l : langs) {
            System.out.println("Я хочу вивчати " + l);
        }

        List<String> languages = new ArrayList<String>();// розмір при ініціалізації рівний нулю і його можна міняти
        languages.add("Java");
        languages.add("C#");
        languages.add("Python");
        languages.add("PHP");
        languages.add("Perl");
        languages.add("JavaScript");
        languages.add("Swift");

        // !!!another way - List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP", "Perl", "JavaScript", "Swift");
        for (String l : languages) {
            System.out.println("Я хочу вивчати " + l + " - create and print from Lists");
        }


    }

}
// another one option: for (int i = 0; i < langs.lenght(); i++) {system.out.println(" " + langs[i])}
// another one option: for (int i = 0; i < languages.size(); i++) {system.out.println(" " + languages.get(i))}
