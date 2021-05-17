import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {

        System.out.println("Welcome");
        Scanner scanner = new Scanner(System.in);

        boolean shouldQuit = false;
        do {
            String cmd = scanner.nextLine();
            if ("quit".equals(cmd)){
                shouldQuit = true;
            break;
            }
            System.out.println("Unknown command");
        }while (shouldQuit);
    }
}
