import java.util.List;
import java.util.Scanner;

public class MauriG {
    public static void main(String[] args) {
        String palabra;
        Integer puntaje = 0;

        List<Character> letras = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("\ningrese palabra");
            palabra = scan.next();

            for (Character c : palabra.toLowerCase().toCharArray()) {
                for (int i = 0; i < letras.size(); i++) {
                    if (c.equals(letras.get(i))) {
                        puntaje += (i + 1);
                    }
                }
            }

            System.out.println("La palabra vale: " + puntaje);

            if (puntaje >= 100) {
                System.out.println("Lograste 100 de puntaje. Adios");
                break;
            }
        }


    }
}
