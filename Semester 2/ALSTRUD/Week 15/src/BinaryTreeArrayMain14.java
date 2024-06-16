public class BinaryTreeArrayMain14 {

    public static void main(String[] args) {

        BinaryTreeArray14 bta = new BinaryTreeArray14();
        int data[] = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
        int idxLast = 6;

        bta.populateData(data, idxLast);
        System.out.print("InOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");
        System.out.println("Menambahkan data baru (100)");
        bta.add(100);
        System.out.print("PreOrder Traversal : ");
        bta.traversePreOrder(0);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bta.traversePostOrder(0);
        System.out.println("");
    }
}
