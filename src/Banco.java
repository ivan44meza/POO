import java.util.Scanner;

public class Banco {
    public static void main(String[] args) throws Exception {
        /* Ejercicio del Banco:
         * 
         * Este ejericio consiste en la creacion de una cuenta bancaria desde cero
         * El usuario pude realizar las siguientes acciones con su cuenta:
         * 1. Retirar
         * 2. Consultar
         * 3. Consignar
         * 4. Transferir
         * 
         * Para esto el usuario debe crear una cuenta con un monto minimo, para este caso sera de 100k pesos
         * El usuairo debe dar su nombre, numero de identificacion, edad, fecha de nacimiento, y el monto
         * que debe ser mayor a 100k pesos
         * 
         * Una vez creada la cuenta el usuario recibe una consignacion de 1 millon
         */

        Scanner sc = new Scanner(System.in); // creamos escaner para leer entradas
        Cliente usuario = new Cliente();
        // Variables que vamos a utilizar
        int opcion;
        
        System.out.println("Bienvenido al banco Banchocombia\nPor favor cree su cuenta");
        usuario.apertura();
        usuario.mostrarDatos();
    }
}
