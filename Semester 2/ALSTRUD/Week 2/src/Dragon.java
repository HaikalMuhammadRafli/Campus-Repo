public class Dragon {

    int x, y, width, height;

    Dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        x--;
        if (x >= 0) {
            printPosition();
        } else {
            detectCollision(x, y);
            x++;
        }
    }

    void moveRight() {
        x++;
        if (x <= width) {
            printPosition();
        } else {
            detectCollision(x, y);
            x--;
        }
    }

    void moveUp() {
        y--;
        if (y >= 0) {
            printPosition();
        } else {
            detectCollision(x, y);
            y++;
        }
    }

    void moveDown() {
        y++;
        if (y <= height) {
            printPosition();
        } else {
            detectCollision(x, y);
            y--;
        }
    }

    void printPosition() {
        System.out.println("Position : " + x + " | " + y);
    }

    void detectCollision(int x, int y) {
        System.out.println("Game over!");
        if (x < 0 || x > width) {
            System.out.println("x position is out of bounds");
        } else if (y < 0 || y > height) {
            System.out.println("y position is out of bounds");
        }

        // untuk mengakhiri game. dicomment saja jika untuk testing
        System.exit(0);
    }
}
