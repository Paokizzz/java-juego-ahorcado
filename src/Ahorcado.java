import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        // Clase scanner que nos permite que el usario escri
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control: Iterativa (bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            
            letrasAdivinadas[i] = '_';
            
        }

        // Estructura de control: Iterativa (bucle)
        while (!palabraAdivinada && intentos < intentosMaximos) {
                                                            // Esto se usa cuando tenemos una palabra de chars
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " " + palabraSecreta.length() + "letras");

            System.out.println("Introduce una letra, por favor");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                //Estructura de control: condicional
                if (palabraSecreta.charAt(i) == letra) { 
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("incorrecto Te quedan " + (intentosMaximos - intentos) + " intentos ");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades, has adivinado la palabra secreta: " + palabraSecreta);
            }

        }
        if (!palabraAdivinada) {
            System.out.println("Te quedaste sin intentos GAME OVER");
        }
        
        scanner.close();

    }
}
