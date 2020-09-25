package September_2020.Sept_25;

public class Node<T> {
    //class Node:
    //    def __init__(self, val, left=None, right=None):
    //        self.val = val
    //        self.left = left
    //        self.right = right

    T val;
    Node<T> left;
    Node<T> right;

    public Node(T val, Node<T> left, Node<T> right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
