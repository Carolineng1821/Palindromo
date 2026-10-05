import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Palindromo palindromo = new Palindromo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe alguna palabra: ");
        String palabra = scanner.nextLine();
        boolean resultado = palindromo.esPalindromo(palabra);

        if (resultado) {
            System.out.println("si es palíndromo");
        }
        else {
            System.out.println("no es palíndromo");
        }


    }
}