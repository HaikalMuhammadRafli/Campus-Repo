public class BinaryTreeMain14 {

    public static void main(String[] args) {

        BinaryTree14 bt = new BinaryTree14();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("InOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node : " + bt.find(5));
        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("");
        System.out.println("Latihan Praktikum : ");
        System.out.println("Menambahkan data 100 dengan rekursif");
        bt.addRecursively(100);
        System.out.println("Menampilkan data terbesar dan terkecil :");
        bt.findMaxMin();
        System.out.print("Menampilkan leaf yang ada di dalam tree : ");
        bt.printLeaves(bt.root);
        System.out.println("");
        bt.countLeaves();
    }
}
