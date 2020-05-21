/* 2.	Реализовать многопоточное приложение “Робот”. Надо написать робота, который умеет ходить.
 За движение каждой его ноги отвечает отдельный поток. Шаг выражается в выводе в консоль LEFT или RIGHT. */
public class LR8_V1 {

    public static void main(String[] args) {
        Object CommunicationBetweenFoots = new Object();
        RightFoot RightFoot = new RightFoot(CommunicationBetweenFoots);
        LeftFoot LeftFoot = new LeftFoot(CommunicationBetweenFoots);

            RightFoot.start();
            LeftFoot.start();
    }
}
