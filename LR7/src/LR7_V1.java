/* 9.	Из текста удалить все слова заданной длины, начинающиеся на согласную букву.*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LR7_V1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = input.nextLine();

        System.out.println("Будут удалены слова длинной 3");

        // Мне очень хотелось сделать это задание при помощи регулярных выражений, поэтому длина не задается пользователем :)
        Pattern regular = Pattern.compile("(?i:[qwrtpsdfghjklzxcvbnm]){3}");
        Matcher stringText = regular.matcher(text);

        while(stringText.find()) {
            System.out.println( stringText.replaceAll(""));
        }

        // aaa bbb ccc ddd eee fff
        // aaa iii eee fff

    }
}
