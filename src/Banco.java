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
        usuario.mostrarDatosCliente();

        // Opciones para el Usuario
        Cuenta cuentaUsuario = usuario.getCuentaAsociada();

        System.out.println("Seleccione una opcion para continuar");
        System.out.println("1. Consignar");
        System.out.println("2. Retirar");
        System.out.println("3. Transferir");
        System.out.println("4. Consultar");

        opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 1:
                cuentaUsuario.consignacion();
                cuentaUsuario.mostrarMontoModificado();
                break;

            case 2:
                cuentaUsuario.retiro();
                cuentaUsuario.mostrarMontoModificado();
                break;

            case 3:
                cuentaUsuario.transferir();
                cuentaUsuario.mostrarMontoModificado();
                break;

            case 4:
                cuentaUsuario.mostrarDatosCuenta();
                break;
        
            default:
                System.out.println("Porfavor escoja una de las opciones anteriores");
                break;
        }

        sc.close();
    }
}
