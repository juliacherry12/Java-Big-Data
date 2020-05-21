/* 2.	Реализовать многопоточное приложение “Робот”. Надо написать робота, который умеет ходить.
 За движение каждой его ноги отвечает отдельный поток. Шаг выражается в выводе в консоль LEFT или RIGHT. */
public class LeftFoot extends Thread {
    Object CommunicationBetweenFoots = new Object();

    public LeftFoot(Object communicationBetweenFoots) {
        this.CommunicationBetweenFoots = communicationBetweenFoots;
    }

    public LeftFoot(Runnable target, Object communicationBetweenFoots) {
        super(target);
        CommunicationBetweenFoots = communicationBetweenFoots;
    }

    public LeftFoot(ThreadGroup group, Runnable target, Object communicationBetweenFoots) {
        super(group, target);
        CommunicationBetweenFoots = communicationBetweenFoots;
    }

    public Object getCommunicationBetweenFoots() {
        return CommunicationBetweenFoots;
    }

    public void setCommunicationBetweenFoots(Object communicationBetweenFoots) {
        CommunicationBetweenFoots = communicationBetweenFoots;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("LEFT");
            try {
                sleep(2000);
            } catch (InterruptedException e1) {
            }
            synchronized (CommunicationBetweenFoots) {
                CommunicationBetweenFoots.notify();
            }
            try {
                synchronized (CommunicationBetweenFoots) {
                    CommunicationBetweenFoots.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}