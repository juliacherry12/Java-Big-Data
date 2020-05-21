/* 6.	В предложении из n слов первое слово поставить на место второго, второе – на место третьего, и т.д.,
 (n-1)-е слово – на место n-го, n-е слово поставить на место первого. В исходном и преобразованном предложениях
  между словами должны быть или один пробел, или знак препинания и один пробел. */
import java.util.Scanner;

public class LR7_V3 {
    public static void main(String[] args) {

        System.out.println("Введите текст из нескольких предложений: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] arrayString = str.split("[\\!|\\.|\\?]\\s?");
        String[] stringResult = new String[arrayString.length];

        for (int i = 0; i < arrayString.length; i++){
            stringResult[i] = arrayString[i].trim().replaceAll("(?U)^(\\w+)(.*)(\\b\\w+)([.?!]?$)", "$3$4 $1$2");
        }

        //$3$2$1$4
        // Солнце светило очень уж ярко. Ты думаешь это так задумано? Какой прекрасный день, подумал я!
        for (String s : stringResult){
            System.out.println(s);
        }
    }
}
