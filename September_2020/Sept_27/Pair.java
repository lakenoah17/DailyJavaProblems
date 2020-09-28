package September_2020.Sept_27;

public class Pair<T, J> {
    private T val1;
    private J val2;

    public Pair(T val1, J val2){
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public J getVal2() {
        return val2;
    }

    public void setVal2(J val2) {
        this.val2 = val2;
    }


}
