package October_2020.Oct_2;

import java.util.ArrayList;

public class JobScheduler {
    private ArrayList<Task> tasks;

    public JobScheduler(){
        tasks = new ArrayList<>();
    }

    public void queueTask(Task t){
        tasks.add(t);

        Thread taskThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(t.getTime());
                    t.getFunction().accept(2 * Main.numToPrint);
                    System.out.println(Main.numToPrint);
                    tasks.remove(t);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        taskThread.start();
    }
}
