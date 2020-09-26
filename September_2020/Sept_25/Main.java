package September_2020.Sept_25;

public class Main {
    //Good morning! Here's your coding interview problem for today.
    //
    //This problem was asked by Google.
    //
    //Given the root to a binary tree, implement serialize(root),
    // which serializes the tree into a string, and deserialize(s),
    // which deserializes the string back into the tree.
    //
    //For example, given the following Node class
    //
    //class Node:
    //    def __init__(self, val, left=None, right=None):
    //        self.val = val
    //        self.left = left
    //        self.right = right
    //The following test should pass:
    //
    //node = Node('root', Node('left', Node('left.left')), Node('right'))
    //assert deserialize(serialize(node)).left.left.val == 'left.left'

    public static void main(String[] args){
        Node<String> node = new Node<>("LeftEndLeft", null, null);
        Node<String> node1 = new Node<>("LeftEndRight", null, null);
        Node<String> node2 = new Node<>("Left", node, node1);
        Node<String> node3 = new Node<>("RightEndLeft", null, null);
        Node<String> node4 = new Node<>("RightEndRight", null, null);
        Node<String> node5 = new Node<>("Right", node3, node4);
        Node<String> node6 = new Node<>("Root", node2, node5);

        BinaryTree<String> tempTree = new BinaryTree<>(node6);
        String serialized = tempTree.serialize(tempTree.getRoot());
        System.out.println(serialized);
        BinaryTree<String> tempTree2 = new BinaryTree<>(tempTree.deSerialize(serialized));
        System.out.println(tempTree2.serialize(tempTree2.getRoot()));
    }
}
