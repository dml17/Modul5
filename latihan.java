class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }

    public class Binarytreee{
        public Node root;

        public void NewNode(int data){
            root = NewNode(root, new Node(data));
        }
        private Node NewNode(Node root, Node newData) {
            if (root == null) {
                root = newData;
                return root;
            }
            if (newData.data < root.data) {
                root.left = NewNode(root.left, newData);
            } else {
                root.right = NewNode(root.right, newData);
            }
            return root;
        }


        public void preOrder(Node node) {
            if (node != null) {
                System.out.print(node.data + " ");
                preOrder(node.left);
                preOrder(node.right);
            }
        }

        public void inOrder(Node node) {
            if (node != null) {
                inOrder(node.left);
                System.out.print(node.data + " ");
                inOrder(node.right);
            }
        }



        public void postOrder(Node node) {
            if (node != null) {
                postOrder(node.left);
                postOrder(node.right);
                System.out.print(node.data + " ");
            }
        }
    }
        public void main(String[] args) {
            Binarytree biner = new Binarytree();

            biner.NewNode(20);
            biner.NewNode(2);
            biner.NewNode(25);
            biner.NewNode(37);
            biner.NewNode(16);
            System.out.print("\n");
            System.out.println("Data yg diinputkan : 20, 2, 25, 37, 16");

            System.out.print("       20\n" +
                    "      /  \\\n" +
                    "     2    25\n" +
                    "      \\     \\\n" +
                    "       16   37");

            System.out.print("\n");
            System.out.print("\n");

            System.out.print("Pre Order : ");
            biner.preOrder(biner.root);
            System.out.print("\n");

            System.out.print("In Order : ");
            biner.inOrder(biner.root);
            System.out.print("\n");

            System.out.print("Post Order : ");
            biner.postOrder(biner.root);
            System.out.print("\n");
        }
    }
