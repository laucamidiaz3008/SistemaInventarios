/*
 * 
 */
package sistemainventarios;
import java.util.Scanner;

/**
 *
 * @author Camila Díaz - Alejandro Velandia - Daniel Ayala
 */
public class SistemaInventarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Sistema de inventarios");
            System.out.println("1. Ingresar articulo");
            System.out.println("2. Ingresar ubicacion");
            System.out.println("3. Mostrar articulos");
            System.out.println("4. Mostrar ubicaciones");
            System.out.println("5. Salir");
            System.out.println("Digite una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresar articulo");
                    break;
                case 2:
                    System.out.println("Ingresar ubicacion");
                    break;
                case 3:
                    System.out.println("Mostrar articulos");
                    break;
                case 4:
                    System.out.println("Mostrar ubicaciones");
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 5);
    }
}