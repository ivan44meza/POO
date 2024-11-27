import java.util.Scanner; 

public class Cuenta {
    
    private int id = 1;
    private int titular; // es int porque usare la cedula para identificarlo
    private double monto;

    public Cuenta(int titular, double monto, int id){
        this.id = id;
        this.titular = titular;
        this.monto = monto;
    }

    // Getters

    public int getTitular(){
        return titular;
    }

    public double getMonto(){
        return monto;
    }

    // Setters

    public void setTitular(int titular){
        this.titular = titular;
    }

    public void setMonto(double monto){
        this.monto = monto;
    }

    // metodo para mostrar datos
    public void mostrarDatosCuenta(){
        System.out.println("El titular con cedula "+ titular + " Tiene la cuenta "+ id + " con un monto de "+ monto);
    }

    // metodo para mostrar los datos de cuenta modificados
    void mostrarMontoModificado(){
        System.out.println("Su monto ahora es de: "+ monto);
    }

    // metodo para consignar
    double consignacion(){
        // Tomamos el dato de la consignacion
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de cuenta al que consigna");
        String c = sc.nextLine(); // No hace nada solo es por el ejemplo

        System.out.println("Ingrese el monto a consignar: ");
        double montoConsignar = Double.parseDouble(sc.nextLine());

        if (montoConsignar > 0) {
            monto += montoConsignar;
            
            return monto;
        } else {
            System.out.println("La consignacion tiene que ser positiva");
            
            return monto;
        }
    }

    //metodo para retirar
    double retiro(){
        // Tomamos los datos del retiro 
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto a retirar");
        double montoRetirar = Double.parseDouble(sc.nextLine());

        if (montoRetirar < monto) {
            monto -= montoRetirar;
            
            return monto;
        } else {
            System.out.println("Fondos insuficientes :(");
            
            return monto;
        }
    }

    // metodo de transferencia
    double transferir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el titular de la cuenta desde la que hace la transferencia: ");
        int confirmacionTitular = Integer.parseInt(sc.nextLine());
        
        if (confirmacionTitular == titular) {
            System.out.println("Ingrese el numero de cuenta al que envia el dinero: ");
            String c = sc.nextLine();

            System.out.println("Ingrese el monto que envia: ");
            double montoTransferencia = Double.parseDouble(sc.nextLine());
            if (montoTransferencia < monto) {
                monto -= montoTransferencia;
                System.out.println("Transferencia completada");
                return monto;
            } else {
                System.out.println("Fondos insuficientes");
                return monto;
            }
        } else {
            System.out.println("No es el titular correcto de la cuenta");
            return monto;
        }
    }
}
