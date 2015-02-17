import java.util.Scanner;

public class BusApp {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int opt;
        
        do {
            System.out.println("1. Create new Bus");
            System.out.println("2. Delete existing Bus");
            System.out.println("3. Edit existing Bus");
            System.out.println("4. View all Bus'");
            System.out.println("5. Exit");
            System.out.println();
        
            System.out.print("Enter option: ");
            String line = keyboard.nextLine();
            opt = Integer.parseInt(line);
        
            System.out.println("You chose option " + opt);
            switch (opt) {
                case 1: {
                    System.out.println("Creating bus");
                    break;
                }
                case 2: {
                    System.out.println("Deleting bus");
                    break;
                }
                case 3: {
                    System.out.println("Editing bus");
                    break;
                }
                case 4: {
                    System.out.println("Viewing bus");
                    break;
                }
            }
        }
        while (opt != 5);
    }
}