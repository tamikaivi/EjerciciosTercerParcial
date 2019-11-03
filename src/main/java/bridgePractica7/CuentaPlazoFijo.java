package bridgePractica7;

public class CuentaPlazoFijo implements ICuenta {

    private IMoneda arquitectura;
    private  int monto=5000;

    public CuentaPlazoFijo(IMoneda arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void interes() {
        System.out.print("Cuenta de Plazo Fijo con monto de: ");
        arquitectura.moneda((5*monto/100)+monto);
    }

   }
