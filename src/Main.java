import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BENVENUTO NELLA CALCOLATRICE ===");

        System.out.print("Inserisci il primo numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Inserisci il secondo numero: ");
        double num2 = scanner.nextDouble();

        int scelta;

        do {
            System.out.println("\n--- SCEGLI L'OPERAZIONE --- \n 1. Addizione (+) \n 2. Sottrazione (-) \n 3. Moltiplicazione (*) \n 4. Divisione (/) \n 0. Esci \n La tua scelta: ");
            scelta = scanner.nextInt();

            double risultato;

            switch (scelta) {
                case 1:
                    risultato = num1 + num2;
                    System.out.println("--> Risultato: " + num1 + " + " + num2 + " = " + risultato);
                    break;

                case 2:
                    risultato = num1 - num2;
                    System.out.println("--> Risultato: " + num1 + " - " + num2 + " = " + risultato);
                    break;

                case 3:
                    risultato = num1 * num2;
                    System.out.println("--> Risultato: " + num1 + " * " + num2 + " = " + risultato);
                    break;

                case 4:
                    if (num2 != 0) {
                        risultato = num1 / num2;
                        System.out.println("--> Risultato: " + num1 + " / " + num2 + " = " + risultato);
                    } else {
                        System.out.println("--> Errore: Impossibile dividere per zero!");
                    }
                    break;

                case 0:
                    System.out.println("--> Uscito dalla calcolatrice con successo!");
                    break;

                default:
                    System.out.println("--> Scelta non valida! Inserisci un numero compreso tra 0 e 4.");
            }
        }
        while (scelta != 0);

        scanner.close();
    }
}