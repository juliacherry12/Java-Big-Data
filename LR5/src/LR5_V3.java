/* В следующих заданиях требуется ввести последовательность строк из текстового потока и выполнить указанные действия.
При этом могут рассматриваться два варианта:
        • каждая строка состоит из одного слова;
        • каждая строка состоит из нескольких слов.
Имена входного и выходного файлов, а также абсолютный путь к ним могут быть введены как параметры командной
строки или храниться в файле.
4. Найти и вывести слова текста, для которых последняя буква одного слова совпадает с первой буквой следующего слова. */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LR5_V3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Set<String> words = new HashSet<String>();

            System.out.println("Для завершения ввода дважды нажмите enter.");
            System.out.println("Введите несколько строк через пробел:");
            String s = null;
            while ( true ) {
                s = scanner.nextLine();
                if ( s.isEmpty() )
                    break;
                words.addAll(Arrays.asList(s.split("\\s+")));
            }

            for ( String tail : words )
                for ( String head : words )
                    if ( tail.charAt(tail.length() - 1) == head.charAt(0) )
                        System.out.println(tail + " -> " + head);

            scanner.close();
        }
}
