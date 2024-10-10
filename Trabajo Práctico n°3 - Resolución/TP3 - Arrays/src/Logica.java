import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Logica {

    private static boolean regresarMenu() {
        //Creamos un método para invocar la salida al menú principal.
        Scanner sc = new Scanner(System.in);
        System.out.println("" +
                "\n¿Desea regresar al menú principal?" +
                "\n* Sí" +
                "\n* No");
        String rta = sc.nextLine();
        System.out.println("");
        Main.delay();
        return rta.equalsIgnoreCase("si");
    }

    public static void opcion1() {
        //Punto 2
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Creamos un array de dimensión 5.
            int [] array = new int[5];

            //Le solicitamos al usuario que ingrese los valores para el array.
            System.out.println("Ingrese 5 números: ");

            for (int i=0; i < array.length; i++){
                System.out.print((i + 1) + ". ");
                array[i] = sc.nextInt();
            }

            System.out.println("");

            //Imprimimos el array.
            System.out.println(Arrays.toString(array));

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion2() {
        //Punto 3
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Solicitamos al usuario que ingrese el tamaño del array.
            System.out.println("Ingrese el tamaño para el Array: ");
            int tamano = sc.nextInt();
            int [] array = new int[tamano];

            System.out.println("");

            //Solicitamos al usuario que ingrese un número para calcular los múltiplos.
            System.out.println("Ingrese un número entero para calcular los múltiplos: ");
            int num = sc.nextInt();

            //Calculamos los multiplos del array.
            for (int i = 0; i < array.length; i++){
                array[i] = num * (i + 1);
            }
            System.out.println("");

            //Imprimimos el resultado al usuario.
            System.out.println("Los múltiplos de " + num + " son: "+ Arrays.toString(array));

            //Invocamos al método de salida.
            esc = regresarMenu();
        }

    }

    public static void opcion3() {
        //Punto 4
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            Double[] array = new Double[20];
            double mayor = 0, menor = 0, rango;

            //Solicitamos al usuario el ingreso de 20 números decimales.
            System.out.println("Ingrese 20 número decimales: ");

            for (int i = 0; i < array.length; i++ ) {
                System.out.print((i + 1) + ". ");
                array[i] = sc.nextDouble();

                //Obtenemos el número menor ingresado en el array.
                if (array[i] > mayor){
                    mayor = array[i];
                    menor = mayor;
                }
            }

            for (int i = 0; i < array.length; i++) {
                //Obtenemos el número mayor ingresado en el array.
                if (array[i] < menor){
                    menor = array[i];
                }
            }

            //Obtenemos el rango entre en n° mayor y el n° menor.
            rango = mayor - menor;

            //Imprimimos el mensaje al usuario.
            System.out.println("El mayor numero de los ingresados es:   " + mayor);
            System.out.println("El menor numero de los ingresados es:   " + menor);
            System.out.println("El rango entre los números " + mayor + " y " + menor + " es:    " + rango);

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion4() {
        //Punto 5
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            int[] array = new int[20];
            int suma = 0;

            //Ingresamos 20 números pares aleatorios al array.
            for (int i = 0; i < array.length; i++) {
                int numRandom = (int) (Math.random() * 100) + 1;

                if(numRandom % 2 == 0){
                    array[i] = numRandom;
                }else {
                    array[i] = numRandom + 1;
                }
                suma += array[i];
            }

            //Calculamos el promedio aritmético.
            int promedio = suma / array.length;

            //Calculamos cuantos números son mayores, menores o iguales al promedio.
            int igualPromedio = 0;
            int mayorPromedio = 0;
            int menorPromedio = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == promedio) {
                    igualPromedio++;
                } else if (array[i] > promedio) {
                    mayorPromedio++;
                } else {
                    menorPromedio++;
                }
            }

            System.out.println("");

            //Imprimimos el resultado al usuario.
            System.out.println("Array:          "+ Arrays.toString(array) +
                    "\n" +
                    "\nPromedio:    " + promedio +
                    "\n" +
                    "\nMayor que el promedio:   " + mayorPromedio +
                    "\nIgual que el promedio:   " + igualPromedio +
                    "\nMenor que el promedio:   " + menorPromedio);

            //Invocamos al método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion5() {
        //Punto 6
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean esc = false;

        while (!esc) {
            int [] array = new int [50];

            //Generamos aleatoriamente 50 números para el array.
            for(int i = 0; i<array.length; i++){
                array[i]= random.nextInt(100);
            }

            //Imprimimos el array generado al usuario.
            System.out.println(Arrays.toString(array));

            System.out.println("");

            //Le solicitamos al usuario que ingrese el número que desea buscar.
            System.out.println("Ingrese el número que desee buscar: ");
            int num = sc.nextInt();

            System.out.println("");

            //Buscamos el número ingresado en el array.
            boolean encon = false;

            for(int i = 0; i < array.length; i++){
                if (num == array[i]){
                    System.out.println("El número " + num + " se encuentra en la posición: " + i);
                    encon = true;
                }
            }

            if(!encon){
                System.out.println("El número ingresado no se encuentra en el Array.");
            }

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion6() {
        //Punto 7
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            int [] array = new int[20];
            int par = 0;
            int impar = 0;

            //Le solicitamos al usuario que ingrese 20 números enteros.
            System.out.println("Ingrese 20 números: ");

            for(int i = 0; i < array.length; i++) {
                System.out.print((i + 1) + ". ");
                array[i]=sc.nextInt();

                //Separamos los números entre pares e impares, y los sumamos.
                if(array[i]%2==0){
                    par += array[i];
                }else{
                    impar += array[i];
                }
            }

            //Imprimimos el mensaje al usuario.
            System.out.println("" +
                    "\nArray:   " + Arrays.toString(array) +
                    "\n" +
                    "\nTotal de la suma de los n° pares:        " + par +
                    "\nTotal de la suma de los n° impares:      " + impar);

            //Invocamos al método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion7() {
        //Punto 8
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            int dim = 10;
            int [] array = new int[dim];

            //Le solicitanos 10 números enteros al usuario.
            System.out.println("Ingrese 10 numeros enteros: ");
            for(int i = 0; i < array.length; i++) {
                System.out.print((i + 1) + ". ");
                array[i] = sc.nextInt();

            }

            //Ordenamos los números de manera ascendente y descebdente.
            int [] desc = new int[dim];
            int [] asc;

            asc = array;

            for(int i = 0; i < array.length; i++){
                desc[(dim-1)-i] = asc[i];
            }

            //Imprimimos los resultados para el usuario final.
            System.out.println("Ascendente:     " + Arrays.toString(asc) +
                    "\nDescendente:     " + Arrays.toString(desc));

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion8() {
        //Punto 9
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Le solicitamos al usuario el ingreso de los números.
            System.out.println("Ingrese una cadena de números separadas por guiones: ");
            String str = sc.nextLine();

            //Creamos un Array, añadiendo los números y eliminando el guión.
            String [] numStr = str.split("-");
            int [] numInt = new int [numStr.length];
            int suma = 0;
            double promedio = 0;


            for(int i = 0; i < numStr.length;i++){
                numInt[i] = Integer.parseInt(numStr[i]);
                suma+= numInt[i];
            }
            promedio = suma / numInt.length;

            System.out.println("");

            //Imprimimos el resultado al usuario.
            System.out.println("La suma total es:            " + suma +
                    "\nEl promedio total es:        " + promedio);

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion9() {
        //Punto 10
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Le solicitamos al usuario el ingreso de su DNI.
            System.out.println("Ingrese su DNI: ");
            long dni = sc.nextLong();

            //Calculamos la letra del DNI.
            char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
            int resto = (int) dni % 23;
            String dniToString = String.valueOf(dni);

            //Invocamos el método de obtenerLetra.
            String dniLetras = obtenerLetra(resto, letras, dniToString);
            System.out.println("DNI con letra: " + dniLetras);

            //Invocamos un método de salida
            esc = regresarMenu();
        }

    }
    public static String obtenerLetra (int resto, char[]letras, String dniToString) {
        //Buscamos la letra que corresponda.
        char letra = letras[resto];
        String letraToString = String.valueOf(letra);
        return dniToString + letraToString;
    }

    public static void opcion10() {
        //Punto 11
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Le solicitamos al usuario el ingreso de 5 enteros para el primer array.
            int[] array1 = new int[5];
            System.out.println("Ingrese 5 números: ");
            for(int i = 0; i < array1.length; i++){
                System.out.print((i + 1) + ". ");
                array1[i] = sc.nextInt();
            }

            //Le solicitamos al usuario el ingreso de 10 enteros para el segundo array.
            int[] array2 = new int[10];
            System.out.println("Ingrese 10 números: ");
            for(int i = 0; i < array2.length; i++){
                System.out.print((i + 1) + ". ");
                array2[i] = sc.nextInt();
            }

            //Realizamos la suma de ambos arrays
            int[] array3 = new int[5];
            for(int i = 0; i < array1.length; i++){
                array3[i] = 0;
                for(int j = 0; j < array2.length; j++){
                    array3[i] += array1[i] * array2[j];
                }
            }

            //Imprimimos el resultado al usuario.
            System.out.println();
            System.out.println("Primer array:       " + Arrays.toString(array1));
            System.out.println("Segundo array:      " + Arrays.toString(array2));
            System.out.println("Resultado final:    " + Arrays.toString(array3));

            //Invocamos el método de salida.
            esc = regresarMenu();
        }

    }

    public static void opcion11() {
        //Punto 12
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            int[] array = new int[10];

            //Le solicitamos al usuario que ingrese 10 números enteros.
            System.out.println("Ingrese 10 números: ");

            for(int i = 0; i < array.length; i++){
                System.out.print((i + 1) + ". ");
                array[i] = sc.nextInt();
            }

            System.out.println();

            //Imprimimos el Array completo al usuario.
            System.out.println(Arrays.toString(array));

            System.out.println();

            //Solicitamos al usuario que ingrese que número desea eliminar.
            System.out.println("Ingrese un número que desee eliminar: ");
            int supr = sc.nextInt();

            int cont = 0;

            //Buscamos el número para borrar.
            for(int i = 0; i < array.length; i++){
                if(array[i] != supr){
                    cont++;
                }
            }


            int[] array2 = new int[cont];
            int index = 0;

            //Generamos un nuevo array sin incluir el número a borrar.
            for(int i = 0; i < array.length; i++){
                if(array[i] != supr){
                    array2[index++] = array[i];
                }
            }

            System.out.println("");

            //Imprimimos el mensaje al usuario.
            System.out.println(Arrays.toString(array2));

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }
}