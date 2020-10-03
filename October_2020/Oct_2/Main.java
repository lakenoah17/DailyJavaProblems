package October_2020.Oct_2;

public class Main {
    //Good morning! Here's your coding interview problem for today.
    //
    //This problem was asked by Apple.
    //
    //Implement a job scheduler which takes in a function f and an
    // integer n, and calls f after n milliseconds.
    static int numToPrint;

    public static void main(String[] args){
        JobScheduler jobs = new JobScheduler();
        jobs.queueTask(new Task(2000, Main::multByTen));

        jobs.queueTask(new Task(7000, Main::multByTen));

        jobs.queueTask(new Task(10000, Main::multByTen));

        jobs.queueTask(new Task(1000, Main::addTwo));
    }

    public static void multByTen(int num){
        numToPrint = num*10;
    }

    public static void addTwo(int num){
        numToPrint+=2;
    }
}
