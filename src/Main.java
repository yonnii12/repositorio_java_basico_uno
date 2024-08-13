public class Main {
    public static void main(String[] args){

// Desarrollado con un FOR

    int n = 10;
    int suma = 0;

        for (int i = 1; i <= n; i++) {
        suma += i;
    }
        System.out.println("Con for:\nLa suma de los números enteros del 1 al 10 con un FOR es: " + suma);

// Desarrollado con un WHILE
        int a = 10;
        int sumatoria = 0;
        int i = 1;

        while (i <= a) {
            sumatoria += i;
            i++;
        }
        System.out.println("Con While:\nLa suma de los números enteros del 1 al 10 con un WHILE es: " + sumatoria);



    }
}