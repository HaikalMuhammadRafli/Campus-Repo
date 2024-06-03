package Tugas.Film;

public class Node {
    Node prev, next;
    int id;
    String judul;
    double rating;

    Node(Node prev, int id, String judul, double rating, Node next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}
