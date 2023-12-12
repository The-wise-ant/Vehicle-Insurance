import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your vehicle type: ");
        System.out.println("car, truck, bus, motorcycle");

        // Read the vehicle type input from the user
        String type = scan.nextLine();

        int premium = 0;

        // Use a switch statement to determine the premium based on the vehicle type
        switch (type) {
            case "car":
                premium = 200;
                break;
            case "truck":
                premium = 300;
                break;
            case "bus":
                premium = 400;
                break;
            case "motorcycle":
                System.out.println("Enter your motorcycle type:");
                System.out.println("1 (low power), 2 (medium), 3 (high)");

                // Read the motorcycle type input from the user
                String motorCycleType = scan.nextLine();
                int motorCycleInt = Integer.parseInt(motorCycleType);

                // Use another switch statement to determine the motorcycle premium
                switch (motorCycleInt) {
                    case 1:
                        premium = 300;
                        break;
                    case 2:
                        premium = 400;
                        break;
                    case 3:
                        premium = 500;
                        break;
                    default:
                        System.out.println("Unknown motorcycle type");
                }
                break;
            default:
                System.out.println("Unknown vehicle type");
        }

        // Close the Scanner object to release resources
        scan.close();

        // Print the calculated premium based on the vehicle type
        System.out.println("The premium is $" + premium);
    }
}
