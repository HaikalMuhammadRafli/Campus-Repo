package Tugas.Vaksin;

public class VaksinDLL {
    Node head;
    int size;

    public VaksinDLL() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node current = head;

            System.out.printf("| %-5s | %-10s |\n", "No.", "Nama");

            while (current != null) {
                System.out.printf("| %-5d | %-10s |\n", current.nomor, current.nama);
                current = current.next;
            }
            System.out.println("Sisa antrian : " + size());
        } else {
            System.out.println("Antrian Kosong!");
        }
    }

    public void enQueue(int nomor, String nama) {
        if (isEmpty()) {
            head = new Node(null, nomor, nama, null);
        } else {
            Node newNode = new Node(null, nomor, nama, head);
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    public Node deQueue() throws Exception {
        Node temp = head;

        if (isEmpty()) {
            throw new Exception("Antrian masih kosong, tidak dapat melayani!");
        } else if (size == 1) {
            head = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }

        return temp;
    }
}
