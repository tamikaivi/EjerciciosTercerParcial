package bridgePractica7;

public class MonedaDoalres implements IMoneda {
    @Override
    public void moneda(int monto) {
        System.out.println(monto*7+" dolares");
    }
}


