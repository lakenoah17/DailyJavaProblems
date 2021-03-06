package September_2020.Sept_27;

public class Main {
    //This problem was asked by Jane Street.
    //
    //cons(a, b) constructs a pair, and car(pair) and cdr(pair)
    // returns the first and last element of that pair. For example,
    // car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
    //
    //Given this implementation of cons:
    //
    //def cons(a, b):
    //    def pair(f):
    //        return f(a, b)
    //    return pair
    //Implement car and cdr.
    public static void main(String[] args){
        Pair<Integer, Integer> coords = new Pair<>(4,9);

        System.out.println(coords.getVal1());
        System.out.println(coords.getVal2());
    }
}
