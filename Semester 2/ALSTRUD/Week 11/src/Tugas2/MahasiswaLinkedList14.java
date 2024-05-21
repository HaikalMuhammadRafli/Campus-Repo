public class MahasiswaLinkedList14 {
    Mahasiswa14 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Mahasiswa14 temp = head;
            int i = 1;

            System.out.println("Daftar antrian : ");
            while (temp != null) {
                System.out.println("[" + i + "] " + temp.nim + " - " + temp.nama);
                temp = temp.next;
                i++;
            }
            System.out.println("");

        } else {
            System.out.println("Antrian Kosong!");
        }
    }

    void enQueue(int nim, String nama) {
        Mahasiswa14 mhsInput = new Mahasiswa14(nim, nama, null);

        if (!isEmpty()) {
            tail.next = mhsInput;
            tail = mhsInput;
        } else {
            head = mhsInput;
            tail = mhsInput;
        }

        print();
    }

    Mahasiswa14 deQueue() {
        Mahasiswa14 out = head;

        if (!isEmpty()) {
            head = head.next;
            print();
            return out;
        } else if (head == tail) {
            head = tail = null;
            print();
            return out;
        } else {
            System.out.println("Antrian masih kosong, " + "tidak dapat dihapus!");
        }

        return null;
    }
}
