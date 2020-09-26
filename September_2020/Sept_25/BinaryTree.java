package September_2020.Sept_25;

public class BinaryTree<T> {
    private Node<T> root;

    public BinaryTree(Node<T> root){
        this.root = root;
    }

    public String serialize(Node<T> root){
        if (root.getLeft() == null){
            return root.getVal() + "~";
        }

        return root.getVal()+ "`" + serialize(root.getLeft()) + serialize(root.getRight());
    }

    public Node<T> deSerialize(String serialized){

        if (!serialized.contains("`")){
            return new Node<T>((T)serialized.substring(0, serialized.indexOf("~")), null, null);
        }
        return new Node<T>((T)serialized.substring(0, serialized.indexOf("`")),
                            deSerialize(serialized.substring(serialized.indexOf("`") + 1)),
                            deSerialize(serialized.substring(serialized.indexOf("~") + 1)));
    }

    public Node<T> getRoot(){
        return root;
    }
}
