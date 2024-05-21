public class MahasiswaLinkedList {
    Mahasiswa head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Mahasiswa temp = head;

            System.out.print("Isi Linked List Mahasiswa :     ");
            while (temp != null) {
                System.out.print(temp.nim + " - " + temp.nama + "\t");
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list Mahasiswa Kosong!");
        }
    }

    void addFirst(int nim, String nama) {
        Mahasiswa mhsInput = new Mahasiswa(nim, nama, null);

        if (!isEmpty()) {
            mhsInput.next = head;
            head = mhsInput;
        } else {
            head = mhsInput;
            tail = mhsInput;
        }
    }

    void addLast(int nim, String nama) {
        Mahasiswa mhsInput = new Mahasiswa(nim, nama, null);

        if (!isEmpty()) {
            tail.next = mhsInput;
            tail = mhsInput;
        } else {
            head = mhsInput;
            tail = mhsInput;
        }
    }

    void insertAfter(int key, int nim, String nama) {
        Mahasiswa mhsInput = new Mahasiswa(nim, nama, null);
        Mahasiswa temp = head;

        do {
            if (temp.nim == key) {
                mhsInput.next = temp.next;
                temp.next = mhsInput;

                if (mhsInput.next == null) {
                    tail = mhsInput;
                    break;
                }
            }

            temp = temp.next;
        } while (temp != null);
    }

    void insertAfter(String key, int nim, String nama) {
        Mahasiswa mhsInput = new Mahasiswa(nim, nama, null);
        Mahasiswa temp = head;

        do {
            if (key.equals(temp.nama)) {
                mhsInput.next = temp.next;
                temp.next = mhsInput;

                if (mhsInput.next == null) {
                    tail = mhsInput;
                    break;
                }
            }

            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int nim, String nama) {

        if (index < 0) {
            System.out.println("Index tidak boleh kurang dari 0!");
        } else if (index == 0) {
            addFirst(nim, nama);
        } else {
            Mahasiswa temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = new Mahasiswa(nim, nama, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
