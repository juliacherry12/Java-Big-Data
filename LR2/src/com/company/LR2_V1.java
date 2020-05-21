package com.company;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Scanner;

public class LR2_V1 {

    public static void main(String[] args) {
        Scanner scan;
        int countLatinWords = 0;
        String text;
        String[] textArray;
        ArrayList<String> wordsList = new ArrayList<>();

        System.out.println("Введите предложение:");
        scan = new Scanner(System.in);
        text = scan.nextLine();

        textArray = text.split(" "); // создаем массив слов - разделяем по пробелу
        for(int i = 0; i < textArray.length; i++) {
            textArray[i] = textArray[i].replaceAll("[“:”,\"'`;()?_-]", ""); // убираем знаки и символы
            if(findLatinOnly(textArray[i]) > 0) {
                wordsList.add(textArray[i]);
            }
        }

        for(String word : wordsList) { // подсчитываем колличество слов, удовлетворяющих условию задачи:
                //слова, содержащие только символы латинского алфавита с равным числом гласных и согласных букв
            if(checkVowelsConsonants(word)) {
                countLatinWords++;
            }
        }

        System.out.print("Количество слов:\n" + countLatinWords);
    }

    private static int findLatinOnly(String word) { // поиск слов из латинских букв
        int length = 0;
        if(word.length() == word.replaceAll("[а-я]", "").length()) { //замена букв на пустое множество
            length = word.length(); // длина слова
        }
        return length;
    }

    private static boolean checkVowelsConsonants(String word) { // поиск глассных букв
        boolean result = false;
        int vowel = 0;
        int consonant = 0;
        // массив гласных букв латинского алфавита
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList('A','a','E','e','I','i','O','o','U','u','Y','y'));
        char[] chars = word.toCharArray();
        for(char c : chars) {
            if(charList.contains(c)) {
                vowel++;
            }
            else {
                consonant++;
            }
        }
        result = vowel == consonant ? true : false; // сравнение колличества глассных и согласных
        return result;
    }
}