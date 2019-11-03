package bridgePractica7;

public class CuntaAhorro implements ICuenta {

    private IMoneda arquitectura;
    private int monto=2000;

    public CuntaAhorro(IMoneda arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void interes() {
        System.out.print("Cuenta de Ahorro con monto de: ");
        arquitectura.moneda((2*monto/100)+monto);
    }

}
