# <p align="center">LAPORAN JOBSHEET XIII - TREE</p>

### **IDENTITAS MAHASISWA**
**Nama :** Haikal Muhammad Rafli<br>
**NIM :** 2341720008<br>
**Kelas :** TI-1B<br>
**Absen :** 14

## PRAKTIKUM

### **1.0 Percobaan 1**

### 1.1 Kode Percobaan : 

``Node14.java`` <br>
```java
public class Node14 {

    int data;
    Node14 left;
    Node14 right;

    public Node14() {
    }

    public Node14(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
}
```

``BinaryTree14.java`` <br>
```java
public class BinaryTree14 {

    Node14 root;

    public BinaryTree14() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node14(data);
        } else {
            Node14 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node14(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node14(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node14 current = root;

        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return result;
    }

    void traversePreOrder(Node14 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node14 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node14 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node14 getSuccessor(Node14 del) {
        Node14 successor = del.right;
        Node14 successorParent = del;

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }

        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }

        Node14 parent = root;
        Node14 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node14 successor = getSuccessor(current);
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
                successor.left = current.left;
            }
        }
    }
}
```

``BinaryTreeMain14.java`` <br>
```java
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
        System.out.println("");
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
    }
}
```

### 1.2 Verifikasi Hasil Percobaan :

![Hasil](./docs/1.2.PNG)

### 1.3 Pertanyaan dan Jawaban :

1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa? <br>
**Jawaban :** <br> ``   ``

2. Untuk apakah di class Node, kegunaan dari atribut left dan right? <br>
**Jawaban :** <br> ``   ``

3. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree? dan Ketika objek tree pertama kali dibuat, apakah nilai dari root? <br>
**Jawaban :** <br> ``   ``

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi? <br>
**Jawaban :** <br> ``   ``

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?

    ```java
    if(data<current.data){
        if(current.left!=null){
            current = current.left;
        }else{
            current.left = new Node(data);
        break;
        }
    }
    ``` 
    **Jawaban :** <br> ``   ``

<br><hr>

### **2.0 Percobaan 2**

### 2.1 Kode Percobaan : 

``BinaryTreeArray14.java`` <br>
```java
public class BinaryTreeArray14 {

    int[] data;
    int idxLast;

    public BinaryTreeArray14() {
        data = new int[10];
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }
}
```

``BinaryTreeArrayMain14.java`` <br>
```java
public class BinaryTreeArrayMain14 {

    public static void main(String[] args) {

        BinaryTreeArray14 bta = new BinaryTreeArray14();
        int data[] = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
        int idxLast = 6;

        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");
    }
}
```

### 2.2 Verifikasi Hasil Percobaan : 

![Hasil](./docs/2.2.PNG)

### 2.3 Pertanyaan dan Jawaban : 

1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray? <br>
**Jawaban :** <br> ``   ``

2. Apakah kegunaan dari method populateData()? <br>
**Jawaban :** <br> ``   ``

3. Apakah kegunaan dari method traverseInOrder()? <br>
**Jawaban :** <br> ``   ``

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing? <br>
**Jawaban :** <br> ``   ``

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4? <br>
**Jawaban :** <br> ``   ``

<br><hr>

## TUGAS PRAKTIKUM

### **4.1.0 Soal 1**

### 4.1.1 Kode Percobaan : 

``Node14.java`` <br>
```java