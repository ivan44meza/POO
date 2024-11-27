import java.util.Scanner;
import java.time.format.*;
import java.time.LocalDate;

public class Cliente {

    private String nombre;
    private int edad;
    private int cedula;
    private LocalDate fechaNacimiento;
    private double montoApertura;
    private Cuenta cuentaAsociada;

    public Cliente(){}

    public Cliente(String nombre, int edad, int cedula, String fechaNacimiento, double montoApertura, Cuenta cuentaAsociada){
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formato);
        this.montoApertura = montoApertura;
        this.cuentaAsociada = new Cuenta(this.cedula, montoApertura,1);
    }

    // Getters

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public int getCedula(){
        return cedula;
    }

    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }

    public double getMontoApertura(){
        return montoApertura;
    }

    //Setters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        if (edad > 0) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad debe ser un numero positivo");
        }
        
    }

    public void setCedula(int cedula){
        this.cedula = cedula;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setMontoApertura(double montoApertura){
        if (montoApertura > 100000) {
            this.montoApertura = montoApertura;
        } else {
            throw new IllegalArgumentException("El monto debe ser superior a 100.000 pesos");
        }
    }

    // metodo de apertura de cuenta
    public void apertura(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        setNombre(sc.nextLine());

        System.out.println("Ingrese su edad: ");
        setEdad(Integer.parseInt(sc.nextLine()));

        System.out.println("Ingrese su numero de cedula: ");
        setCedula(Integer.parseInt(sc.nextLine()));

        System.out.println("Ingrese su fecha de nacimiento en formato dd/mm/aaaa: ");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        setFechaNacimiento(LocalDate.parse(sc.nextLine(), formato));

        System.out.println("Ingrese el monto inicial (debe ser mayor a 100.000 pesos)");
        setMontoApertura(Integer.parseInt(sc.nextLine()));

        sc.close();
    }

    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
        System.out.println("La cedula es: "+cedula);
        System.out.println("La fecha de nacimeinto es: "+fechaNacimiento);
        cuentaAsociada.mostrarDatos();
    }
}
