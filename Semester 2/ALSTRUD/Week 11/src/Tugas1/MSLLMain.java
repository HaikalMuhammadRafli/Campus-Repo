public class MSLLMain {

    public static void main(String[] args) {
        MahasiswaLinkedList mhsLL = new MahasiswaLinkedList();
        mhsLL.print();
        mhsLL.addFirst(112, "Prita");
        mhsLL.print();
        mhsLL.addLast(115, "Sari");
        mhsLL.print();
        mhsLL.addFirst(111, "Anton");
        mhsLL.print();
        mhsLL.insertAfter(112, 113, "Yusuf");
        mhsLL.print();
        mhsLL.insertAt(3, 114, "Doni");
        mhsLL.print();
    }
}
