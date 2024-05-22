public class SLLBasket14 {
    Node14 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    Node14 getTeam(String namaTim) {
        Node14 temp = head;

        while (temp != null) {
            if (namaTim.equalsIgnoreCase(temp.tim.nama)) {
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }

    void addNewTeam(String nama) {
        Tim14 newTeam = new Tim14(nama, 0, 0, 0, 0, 0);
        Node14 newNode = new Node14(newTeam, null);

        if (!isEmpty()) {
            tail.next = newNode;
            tail = newNode;
        } else {
            head = newNode;
            tail = newNode;
        }
    }

    void recordMatchResult(String timHome, int skorHome, String timAway, int skorAway) {

        Node14 nodeHome = getTeam(timHome);
        Node14 nodeAway = getTeam(timAway);

        if (nodeHome == null) {
            System.out.println("Error : Tim home tidak ditemukan!");
        } else if (nodeAway == null) {
            System.out.println("Error : Tim away tidak ditemukan!");
        } else {
            nodeHome.tim.recordStats(skorHome, skorAway);
            nodeHome.tim.recordRiwayat(skorHome, timAway, skorAway);
            nodeAway.tim.recordStats(skorAway, skorHome);
            nodeAway.tim.recordRiwayat(skorAway, timHome, skorHome);
            sortKlasemen();
        }
    }

    void printRiwayat(String key) {
        if (!isEmpty()) {
            Node14 temp = getTeam(key);

            if (temp != null) {
                System.out.println(
                        "=======================================================================================================");
                System.out.println(
                        "                                       Riwayat Pertandingan Tim                                        ");
                System.out.println(
                        "=======================================================================================================");
                System.out.printf("| %-2s | %-34s | %-4s | %-34s | %-4s |  %-5s |\n",
                        "No", "Nama Tim", "Skor", "Nama Tim Lawan", "Skor", "Hasil");
                System.out.println(
                        "=======================================================================================================");
                for (int i = 0; i < temp.tim.riwayat.length; i++) {
                    if (temp.tim.riwayat[i][0] != null) {
                        System.out.printf("| %-2s | %-34s | %-4s | %-34s | %-4s |  %-5s |\n",
                                i + 1, temp.tim.nama, temp.tim.riwayat[i][0], temp.tim.riwayat[i][1],
                                temp.tim.riwayat[i][2], temp.tim.riwayat[i][3]);
                    }
                }
                System.out.println(
                        "=======================================================================================================");
            } else {
                System.out.println("Error : Tim tidak ditemukan!");
            }
        } else {
            System.out.println("Error : Linked List Masih Kosong!");
        }
    }

    void printKlasemen() {
        Node14 temp = head;
        if (!isEmpty()) {
            System.out.println("==========================================================================");
            System.out.println("                   Klasemen Liga Bola Basket Indonesia                    ");
            System.out.println("==========================================================================");
            System.out.printf("| %-4s | %-32s | %-3s | %-3s | %-3s | %-3s | %-4s |\n", "Rank", "Nama Tim", "G", "W",
                    "L",
                    "PTS", "DIFF");
            System.out.println("==========================================================================");
            for (int i = 1; temp != null; i++) {
                System.out.printf("| %-4d | %-32s | %-3d | %-3d | %-3d | %-3d | %-4d |\n", i, temp.tim.nama,
                        temp.tim.pertandingan, temp.tim.menang, temp.tim.kalah, temp.tim.poin, temp.tim.selisih);
                temp = temp.next;
            }
            System.out.println("==========================================================================");
        } else {
            System.out.println("Error : Linked List Masih Kosong!");
        }
    }

    void sortKlasemen() {
        if (!isEmpty()) {
            Node14 current;
            Node14 previous;
            boolean sorted;

            do {
                sorted = true;
                current = head;
                previous = null;

                while (current.next != null) {
                    if (current.tim.poin < current.next.tim.poin || (current.tim.poin == current.next.tim.poin
                            && current.tim.selisih < current.next.tim.selisih)) {
                        Node14 temp = current.next;
                        if (previous == null) {
                            head = temp;
                        } else {
                            previous.next = temp;
                        }
                        current.next = temp.next;
                        temp.next = current;

                        sorted = false;
                        previous = temp;

                    } else {
                        previous = current;
                        current = current.next;
                    }
                }
            } while (!sorted);
        } else {
            System.out.println("Error : Linked List Masih Kosong!");
        }
    }
}
