package Tugas.Vaksin;

public class Node {
    int nomor;
    String nama;
    Node prev, next;

    Node(Node prev, int nomor, String nama, Node next) {
        this.nomor = nomor;
        this.nama = nama;
        this.prev = prev;
        this.next = next;
    }
}
