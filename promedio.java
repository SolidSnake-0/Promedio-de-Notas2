import java.util.Scanner;

public class promedio {

    public static void main(String[] args) {
        int cantidadNotas = Pedirnotas();
        float sumaNotas = Sumarnotas(cantidadNotas);
        float promedio = calcularPromedio(sumaNotas, cantidadNotas);
        mostrarPromedio(promedio);
    }

    private static int Pedirnotas() {
        Scanner scanner = new Scanner(System.in);
        int cantidad = 0;
        while (cantidad <= 0) {
            System.out.print("Ingrese la cantidad de notas a promediar: ");
            if (scanner.hasNextInt()) {
                cantidad = scanner.nextInt();
                
            }
        }
        return cantidad;
    }

    private static float Sumarnotas(int cantidadNotas) {
        Scanner scanner = new Scanner(System.in);
        float totalNotas = 0;
        for (int i = 1; i <= cantidadNotas; i++) {
            System.out.print("Ingrese la nota N°" + i + ": ");
            
            
            totalNotas += scanner.nextFloat();
        }
        return totalNotas;
    }

    private static float calcularPromedio(float sumaNotas, int cantidadNotas) {
        return sumaNotas / cantidadNotas;
    }

    private static void mostrarPromedio(float promedio) {
        System.out.println("El promedio es: " + promedio);
    }
}
