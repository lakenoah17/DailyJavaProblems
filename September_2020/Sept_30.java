package September_2020;

import September_2020.Sept_25.BinaryTree;
import September_2020.Sept_25.Node;

public class Sept_30 {
    //Good morning! Here's your coding interview problem for today.
    //
    //This problem was asked by Google.
    //
    //A unival tree (which stands for "universal value") is a tree
    // where all nodes under it have the same value.
    //
    //Given the root to a binary tree, count the number of unival
    // subtrees.
    //
    //For example, the following tree has 5 unival subtrees:
    //
    //   0
    //  / \
    // 1   0
    //    / \
    //   1   0
    //  / \
    // 1   1

    public static void main(String[] args){
        BinaryTree<Integer> tree = new BinaryTree<>(new Node<>(0, null, null));
        tree.getRoot().setLeft(new Node<>(1, null, null));
        tree.getRoot().setRight(new Node<>(0, new Node<>(1, new Node<>(1, null, null),
                                                                    new Node<>(1, null, null)),
                                                  new Node<>(0, null, null)));

        System.out.println(solution1(tree.getRoot()));
    }

    public static int solution1(Node<Integer> root){
        //Checks if node is a bottom node. If it is return 1
        if (root.getLeft() == null){
            return 1;
        }

        //Checks if both right and left nodes have the same
        // value as the current node if they do add one to the return value
        if (root.getLeft().getVal().equals(root.getVal()) && root.getRight().getVal().equals(root.getVal())){
            return solution1(root.getLeft()) + solution1(root.getRight()) + 1;
        }

        //Recurses all the way down the list
        return solution1(root.getLeft()) + solution1(root.getRight());
    }
}
