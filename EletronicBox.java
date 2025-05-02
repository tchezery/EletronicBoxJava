import java.util.Scanner;

public class EletronicBox {
    private static double balance = 3000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n===== ELETRONIC BOX =====");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Select the option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    seeBalance();
                    break;
                case 2:
                    depositar(scanner);
                    break;
                case 3:
                    sacar(scanner);
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Invalid Option.");
            }
        } while (option != 4);
        scanner.close();
    }

    private static void seeBalance() {
        System.out.printf("Current Balance: R$ %.2f%n", balance);
    }

    private static void depositar(Scanner scanner) {
        System.out.print("Type the value to deposit: R$ ");
        double value = scanner.nextDouble();
        if (value > 0) {
            balance += value;
            System.out.println("Deposit successfully realized!");
        } else {
            System.out.println("Invalid Value");
        }
    }

    private static void sacar(Scanner scanner) {
        System.out.print("Type value to withdraw: R$ ");
        double value = scanner.nextDouble();
        if (value > 0 && value <= balance) {
            balance -= value;
            System.out.println("Withdrawal successfully realized!");
        } else {
            System.out.println("Invalid Withdrawal. Verify your value or balance.");
        }
    }
}