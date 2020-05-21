/* 2.	Реализовать многопоточное приложение “Робот”. Надо написать робота, который умеет ходить.
 За движение каждой его ноги отвечает отдельный поток. Шаг выражается в выводе в консоль LEFT или RIGHT. */
public class RightFoot extends Thread{
    Object CommunicationBetweenFoots = new Object();

    public RightFoot(Object communicationBetweenFoots) {
        this.CommunicationBetweenFoots = communicationBetweenFoots;
    }

    public RightFoot(Runnable target, Object communicationBetweenFoots) {
        super(target);
        CommunicationBetweenFoots = communicationBetweenFoots;
    }

    public RightFoot(ThreadGroup group, Runnable target, Object communicationBetweenFoots) {
        super(group, target);
        CommunicationBetweenFoots = communicationBetweenFoots;
    }

    public RightFoot(String name, Object communicationBetweenFoots) {
        super(name);
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

        while(true) {
            try {
                synchronized(CommunicationBetweenFoots) {
                    CommunicationBetweenFoots.wait();
                }
            } catch (InterruptedException e) {}
            System.out.println("RIGHT");
            try {
                sleep(1000);
            } catch (InterruptedException e1) {}
            synchronized(CommunicationBetweenFoots) {
                CommunicationBetweenFoots.notify();
            }

        }
    }

}