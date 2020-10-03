package October_2020.Oct_2;

import java.util.function.IntConsumer;

public class Task {
    private int time;
    private IntConsumer function;

    public Task(int time, IntConsumer function){
        this.time = time;
        this.function = function;
    }

    public int getTime() {
        return time;
    }

    public IntConsumer getFunction() {
        return function;
    }
}
