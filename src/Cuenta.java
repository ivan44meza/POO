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
    public void mostrarDatos(){
        System.out.println("El titular con cedula "+ titular + "Tiene la cuenta "+ id + "con un monto de "+ monto);
    }
}
