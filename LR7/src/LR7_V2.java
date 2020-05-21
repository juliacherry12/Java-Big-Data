/*2. Найти и напечатать, сколько раз повторяется в тексте каждое слово, которое встречается в нем.*/

import java.util.HashMap;
import java.util.Scanner;

public class LR7_V2 {
    public static void main(String[] args)
    {
        System.out.println("Введите текст: ");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();

        String[] arrayWords = string.split("\\s+");
        HashMap<String, Integer> wordToCount = new HashMap<>();

        for (String word:arrayWords) {
            if (!wordToCount.containsKey(word)){
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet()) {
            System.out.println(word + " - " + wordToCount.get(word));

            // aaa bbb ccc ddd eee fff aaa iii eee fff
        }
    }
}
