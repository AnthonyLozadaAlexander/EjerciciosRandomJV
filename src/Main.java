public class Main {
    public static void Piramide(int n){
    int i, j, k;
        // n es la altura de la pirámide = 5
        for (i = 1; i <= n ; i++) {

            // imprime espacios antes de los asteriscos
            // n-i es el número de espacios a imprimir
            for (j = 0; j <= n-i ; j++) {
                System.out.print(" "); // espacios
            }

            // imprime asteriscos
            // 2*i-1 es el número de asteriscos a imprimir
            // en cada fila de la pirámide
            // en la primera fila se imprime 1 asterisco,
            // en la segunda fila 3, en la tercera fila 5, etc.
            // esto crea la forma de pirámide
            // con la altura n
            // y la base de 2*n-1 asteriscos
            // en la última fila se imprimen 2*n-1 asteriscos
            for(k = 1; k <= (2 * i -1); k++){
                System.out.print("*"); // asteriscos
            }
            // imprime saltos de línea después de cada fila
            System.out.println(""); // saltos de linea
        }
    }

    public static void PiramideI(int n){
        int i, j, k;
        // n es la altura de la pirámide = 5
        for (i = n; i >= 1 ; i--) {

            // imprime espacios antes de los asteriscos
            // n-i es el número de espacios a imprimir
            for (j = 0; j <= n-i ; j++) {
                System.out.print(" "); // espacios
            }

            // imprime asteriscos
            // 2*i-1 es el número de asteriscos a imprimir
            // en cada fila de la pirámide
            // en la primera fila se imprime 1 asterisco,
            // en la segunda fila 3, en la tercera fila 5, etc.
            // esto crea la forma de pirámide
            // con la altura n
            // y la base de 2*n-1 asteriscos
            // en la última fila se imprimen 2*n-1 asteriscos
            for(k = 1; k <= (2 * i -1); k++){
                System.out.print("*"); // asteriscos
            }
            // imprime saltos de línea después de cada fila
            System.out.println(""); // saltos de linea
        }
    }

    public static void main(String[] args) {
        int n = 5; // altura para la piramide
        Piramide(n);
        System.out.println("Piramide de altura: " + n + " creada.");
    }
}
