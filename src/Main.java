public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 4;
        if (clientOS == 0) {
            System.out.println("Please download the App via the link for AppStore below");
        } else if (clientOS == 1) {
            System.out.println("Please download the App via the link for Play Market below");
        } else {
            System.out.println("You entered the wrong data. Please try again");
        }
    }
}
