package bridgePractica7;

public class MonedaBolivianos implements IMoneda {
    @Override
    public void moneda(int monto) {
        System.out.println(monto+" bolivianos");
    }
}
