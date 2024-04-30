package tugas;

public class Queue {
    Pembeli[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        data = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(Pembeli dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
        }

        data[rear] = dt;
        size++;
    }

    public Pembeli deQueue() {
        Pembeli dt = new Pembeli();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;

            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }

        return dt;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].nama + " " + data[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(data[i].nama + " " + data[i].noHP);
            System.out.println("Jumlah pembeli = " + size);
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + data[front].nama + " " + data[front].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen paling belakang : " + data[rear].nama + " " + data[rear].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String nama) {
        boolean isFound = false;
        if (!isEmpty()) {
            for (int i = 0; i < data.length; i++) {
                if (nama.equals(data[i].nama)) {
                    System.out.println("Pembeli ditemukan");
                    System.out.println("Posisi pembeli : " + i);
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                System.out.println("Pembeli tidak ditemukan");
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].nama + " " + data[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(data[i].nama + " " + data[i].noHP);
            System.out.println("Jumlah pembeli = " + size);
        }
    }
}
