package libreria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanti libri vuoi inserire nel catalogo? ");
        int numeroLibri = scanner.nextInt();
        scanner.nextLine();

        Libro[] catalogo = new Libro[numeroLibri];

        for (int i = 0; i < numeroLibri; i++) {
            try {
                System.out.println("Inserisci i dati per il libro " + (i + 1) + ":");
                System.out.print("Titolo: ");
                String titolo = scanner.nextLine();
                System.out.print("Numero di pagine: ");
                int numeroPagine = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Autore: ");
                String autore = scanner.nextLine();
                System.out.print("Editore: ");
                String editore = scanner.nextLine();

                catalogo[i] = new Libro(titolo, numeroPagine, autore, editore);

            } catch (IllegalArgumentException e) {
                System.out.println("Errore: " + e.getMessage());
                i--;
            }
        }

        System.out.println("Catalogo dei libri:");
        for (Libro book : catalogo) {
            if (book != null) {
                System.out.println(book.toString());
                System.out.println();
            }
        }
    }
}