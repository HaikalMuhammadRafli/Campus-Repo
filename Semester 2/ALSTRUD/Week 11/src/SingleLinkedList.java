public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;

            System.out.print("Isi Linked List :     ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    void addFirst(int input) {
        Node ndInput = new Node(input, null);

        if (!isEmpty()) {
            ndInput.next = head;
            head = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void addLast(int input) {
        Node ndInput = new Node(input, null);

        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;

        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;

                if (ndInput.next == null) {
                    tail = ndInput;
                    break;
                }
            }

            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int input) {

        if (index < 0) {
            System.out.println("Index tidak boleh kurang dari 0!");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = new Node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    // Percobaan 2

    int getData(int index) {
        Node tmp = head;

        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int indexOf(int key) {
        Node tmp = head;
        int index = 0;

        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }

        if (tmp != null) {
            return index;
        } else {
            return -1;
        }
    }

    void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else if (head == tail) {
            head = tail = null;
        } else {
            System.out.println("Linked list masih kosong, " + "tidak dapat dihapus!");
        }
    }

    void removeLast() {
        if (!isEmpty()) {
            Node temp = head;

            while (temp.next != tail) {
                temp = temp.next;
            }

            temp.next = null;
            tail = temp.next;
        }
    }

    void remove(int key) {
        if (!isEmpty()) {
            Node temp = head;

            while (temp != null) {
                if (temp.data == key && temp == head) {
                    removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;

                    if (temp.next == null) {
                        tail = temp;
                    }

                    break;
                }

                temp = temp.next;
            }
        }
    }

    void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;

            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
