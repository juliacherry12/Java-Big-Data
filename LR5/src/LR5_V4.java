/*При выполнении следующих заданий для вывода результатов создавать новую директорию и файл средствами класса File
 2.	Прочитать текст Java-программы и записать в другой файл в обратном порядке символы каждой строки. */
import java.io.*;

public class LR5_V4 {
    public static void main(String[] args) throws IOException {
        String backOrderString = "";

        BufferedReader br = new BufferedReader(new FileReader("C:/Users/User/IdeaProjects/LR5/reverse.txt"));
        String line = "";
        String FileContent = "";
        String NL = System.getProperty("line.separator");
        while ((line = br.readLine()) != null) {
            int i = line.length();
            while (i > 0) {
                backOrderString = backOrderString + line.charAt(i - 1);
                i--;
            }
            FileContent = backOrderString + NL;
        }
        br.close();

        System.out.println(FileContent);
        File file = new File("C:/Users/User/IdeaProjects/LR5/reverse_out.txt");
        if (file.createNewFile()) {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(FileContent);
            bw.close();
        }
    }

}