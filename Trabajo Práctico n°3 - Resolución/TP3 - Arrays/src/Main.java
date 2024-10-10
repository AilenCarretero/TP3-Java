import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void delay() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        //Generamos un menú principal.
        while(!exit) {
            System.out.println(" ====== Menú Principal ====== " +
                    "\n" +
                    "\n1.   Creación y llenado de un Array." +
                    "\n2.   Llenando un Array con múltiplos." +
                    "\n3.   Buscar el decimal más grande y más chico." +
                    "\n4.   Promedios de los números pares en el Array." +
                    "\n5.   Búsqueda de un número en el Array." +
                    "\n6.   Suma de pares e impares del Array." +
                    "\n7.   Ordenando un Array de diferentes maneras." +
                    "\n8.   Calculando el promedio de un Array." +
                    "\n9.   Buscando la letra del DNI." +
                    "\n10.  Sumando a dos Arrays." +
                    "\n11.  Eliminando un elemento del Array." +
                    "\n" +
                    "\n0.   Salir");

            int opcion = sc.nextInt();
            System.out.println("");

            switch(opcion) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    Logica.opcion1();
                    break;
                case 2:
                    Logica.opcion2();
                    break;
                case 3:
                    Logica.opcion3();
                    break;
                case 4:
                    Logica.opcion4();
                    break;
                case 5:
                    Logica.opcion5();
                    break;
                case 6:
                    Logica.opcion6();
                    break;
                case 7:
                    Logica.opcion7();
                    break;
                case 8:
                    Logica.opcion8();
                    break;
                case 9:
                    Logica.opcion9();
                    break;
                case 10:
                    Logica.opcion10();
                    break;
                case 11:
                    Logica.opcion11();
                    break;
                default:
                    System.out.println("El número ingresado no es válido, intente nuevamente.");
            }
        }
    }
}