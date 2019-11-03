package bridgePractica7;

public class CuentaCredito implements ICuenta {

    private IMoneda arquitectura;
    private int monto=400;

    public CuentaCredito(IMoneda arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void interes() {
        System.out.print("Cuenta de Credito con monto de: ");
        arquitectura.moneda(monto);
    }
}



