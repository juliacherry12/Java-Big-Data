/* 9.	Преобразовать каждое слово в тексте, удалив из него все последующие (предыдущие)
вхождения первой (последней) буквы этого слова */

public class LR7_V4 {
    public static void main(String[] args) {

        // АбриАкосы ррррастуррт в апреааале - последующий
        StringBuilder sbSubsequent = new StringBuilder();
        String textSubsequent = "АбриАкосы ррррастуррт в апреааале";
        System.out.println("Исходная строка: " + textSubsequent);
        String[] arrayTextSubsequent =    textSubsequent.split(" ");

        for (String strSubsequent : arrayTextSubsequent) {
            char distCharSubsequent = strSubsequent.charAt(0);
            sbSubsequent.append(strSubsequent.charAt(0));
            for (int i = 1; i < strSubsequent.length(); i++) {
                if (strSubsequent.charAt(i) != distCharSubsequent) {
                    sbSubsequent.append(strSubsequent.charAt(i));
                }
            }
            sbSubsequent.append(" ");
        }
        String resultSubsequent = sbSubsequent.toString();
        System.out.println(resultSubsequent);

        // Анаыыыныасы не иметттют цветввввков - предыдущий
        StringBuilder sbPrevious = new StringBuilder();
        String textPrevious = "Анаыыыныасы не иметттют цветввввков";
        System.out.println("Исходная строка: " + textPrevious);
        String[] arrayTextPrevious =    textPrevious.split(" ");

        for (String strPrevious : arrayTextPrevious) {
            char distCharPrevious = strPrevious.charAt(strPrevious.length()-1);

            for (int i = 0; i < strPrevious.length(); i++) {
                if (strPrevious.charAt(i) != distCharPrevious) {
                    sbPrevious.append(strPrevious.charAt(i));
                }
            }
            sbPrevious.append(strPrevious.charAt(strPrevious.length()-1));
            sbPrevious.append(" ");
        }
        String resultPrevious = sbPrevious.toString();
        System.out.println(resultPrevious);

    }
}
