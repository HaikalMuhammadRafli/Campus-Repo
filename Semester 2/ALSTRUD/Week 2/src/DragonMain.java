public class DragonMain {

    public static void main(String[] args) {

        Dragon play = new Dragon(5, 5, 10, 10);
        System.out.println("\nUp test");
        for (int i = 0; i < 6; i++) {
            play.moveUp();
        }
        System.out.println("\nDown test");
        for (int i = 0; i < 11; i++) {
            play.moveDown();
        }
        System.out.println("\nLeft test");
        for (int i = 0; i < 6; i++) {
            play.moveLeft();
        }
        System.out.println("\nRight test");
        for (int i = 0; i < 11; i++) {
            play.moveRight();
        }
    }
}
