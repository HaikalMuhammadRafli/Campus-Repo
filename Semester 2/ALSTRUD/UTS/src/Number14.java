public class Number14 {

    int[] list;

    Number14(int[] arr) {
        list = arr;
    }

    void showAll() {
        System.out.println("Showing all numbers :");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    void selectionSortASC() {
        for (int i = 0; i < list.length; i++) {
            int min = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
            }

            int temp = list[min];
            list[min] = list[i];
            list[i] = temp;
        }
    }

    void selectionSortDESC() {
        for (int i = 0; i < list.length; i++) {
            int max = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] > list[max]) {
                    max = j;
                }
            }

            int temp = list[max];
            list[max] = list[i];
            list[i] = temp;
        }
    }

    int binarySearchASC(int key, int left, int right) {

        int mid;

        if (right >= left) {
            mid = (right + left) / 2;

            if (key == list[mid]) {
                return mid;
            } else if (key < list[mid]) {
                return binarySearchASC(key, left, mid - 1);
            } else {
                return binarySearchASC(key, mid + 1, right);
            }
        }

        return -1;
    }

    int binarySearchDESC(int key, int left, int right) {

        int mid;

        if (right >= left) {
            mid = (right + left) / 2;

            if (key == list[mid]) {
                return mid;
            } else if (key > list[mid]) {
                return binarySearchDESC(key, left, mid - 1);
            } else {
                return binarySearchDESC(key, mid + 1, right);
            }
        }

        return -1;
    }

    void search(int key) {

        boolean isFound = false;
        int idx = binarySearchASC(key, 0, list.length - 1);
        String description = null;

        if (idx > -1) {
            isFound = true;
            description = "ASC Method";
        } else {
            idx = binarySearchDESC(key, 0, list.length - 1);

            if (idx > -1) {
                isFound = true;
                description = "DESC Method";
            }
        }

        if (isFound) {
            System.out.println("=============");
            System.out.println("Number found!");
            System.out.println("Method  : " + description);
            System.out.println("Number  : " + list[idx]);
            System.out.println("Index   : " + idx);
            System.out.println("=============");

        } else {
            System.out.println("=====================");
            System.out.println("Number doesn't exist!");
            System.out.println("=====================");
        }
    }
}
