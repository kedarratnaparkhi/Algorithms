


public class BinarySearchTree {

    BSTNode root;

    public void addNode(int key, String value){

        if(root == null){
            root = new BSTNode(key, value);
        }else{
            BSTNode focusNode = root;
            BSTNode parent;
            while(true){
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if(focusNode == null){
                        parent.leftChild = new BSTNode(key, value);
                        return;
                    }
                } else{
                    focusNode = focusNode.rightChild;
                    if(focusNode == null){
                        parent.rightChild = new BSTNode(key, value);
                        return;
                    }
                }
            }
        }
    }

    public void traverseTree(BSTNode focusNode){
        if(focusNode != null){
            traverseTree(focusNode.leftChild);

            System.out.println(focusNode.key + ": " + focusNode.value);

            traverseTree(focusNode.rightChild);
        }

    }



    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.addNode(50, "Boss");
        bst.addNode(25, "VP");
        bst.addNode(15, "Office Manager");
        bst.addNode(30, "Secretary");
        bst.addNode(75, "SalesManager");
        bst.addNode(85, "Salesman 1");

        bst.traverseTree(bst.root);
    }


}

class BSTNode{

    int key;
    String value;

    BSTNode leftChild;
    BSTNode rightChild;

    BSTNode(int key, String value){
        this.key = key;
        this.value = value;
    }

}