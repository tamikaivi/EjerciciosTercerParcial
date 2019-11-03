package bridgePractica7;

public class MonedaEuros implements IMoneda {
    @Override
    public void moneda(int monto) {
        System.out.println(monto*9+" euros");
    }
}
