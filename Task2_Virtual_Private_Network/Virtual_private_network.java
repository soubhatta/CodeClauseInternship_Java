import java.util.*;

class Virtual_private_network{
    private static boolean isConnected = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Virtual Private Network (VPN) Menu");
            System.out.println("1. 'Connect' to the VPN");
            System.out.println("2. 'Disconnect' from theVPN");
            System.out.println("3. 'Send Data' through VPN");
            System.out.println("4. 'Quit' the VPN program");
            System.out.print("\nEnter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    connectToVPN();       // This will makes connection to VPN
                    break;
                case 2:
                    disconnectFromVPN();  // This will makes disconnect from VPN
                    break;
                case 3:
                    sendData();    // This will allow to send data when connected to VPN
                    break;
                case 4:
                    System.out.println("\nExiting program...\n\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }
        }
    }

    private static void connectToVPN() {
        if (isConnected) {
            System.out.println("\nAlready connected to VPN.\n");
        } else {
            isConnected = true;
            System.out.println("\nConnected to VPN.\n");
        }
    }

    private static void disconnectFromVPN() {
        if (isConnected) {
            isConnected = false;
            System.out.println("\nDisconnected from VPN.\n");
        } else {
            System.out.println("\nNot connected to VPN.\n");
        }
    }

    private static void sendData() {
        if (isConnected) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter data to send: ");
            String data = scanner.nextLine();
            System.out.println("\nSending data through VPN: " + data + "\n");
        } else {
            System.out.println("\nNot connected to VPN. Please connect first.\n");
        }
    }
}
