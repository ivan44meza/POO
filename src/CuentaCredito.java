public class CuentaCredito {
    
    private double montoAprovado;
    private boolean aprovacion;
    private double montoAprovar;

    public CuentaCredito(double montoAprovado, double montoAprovar){
        this.montoAprovado = montoAprovado;
        this.montoAprovar = montoAprovar;
    }

    public boolean peticionCredito (int montoAprovar){
        if (montoAprovar < 2000000 && montoAprovar >= 1000000) {
            return true;
        } else {
            System.out.println("Monto no aprovado");
            return false;
        }
    }

    
}
