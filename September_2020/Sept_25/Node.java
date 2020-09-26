package September_2020.Sept_25;

public class Node<T> {
    //class Node:
    //    def __init__(self, val, left=None, right=None):
    //        self.val = val
    //        self.left = left
    //        self.right = right

    private T val;
    private Node<T> left;
    private Node<T> right;

    public Node(T val, Node<T> left, Node<T> right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public Node<T> getLeft(){
        return left;
    }

    public Node<T> getRight(){
        return right;
    }

    public void setLeft(Node<T> node){
        left = node;
    }

    public void setRight(Node<T> node){
        right = node;
    }


    public T getVal() {
        return val;
    }

    public void setVal(T value) {
        val = value;
    }
}
