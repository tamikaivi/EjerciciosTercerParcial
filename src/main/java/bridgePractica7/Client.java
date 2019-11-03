package bridgePractica7;

public class Client {
    public static void main(String[] args) {



        MonedaBolivianos bolivianos = new MonedaBolivianos();
        MonedaDoalres doalres = new MonedaDoalres();
        MonedaEuros euros = new MonedaEuros();

        CuentaCredito cuentaCredito1= new CuentaCredito(bolivianos);
        CuentaCredito cuentaCredito2 = new CuentaCredito(doalres);
        CuentaCredito cuentaCredito3 = new CuentaCredito(euros);

        CuentaPlazoFijo cuentaPlazoFijo1 = new CuentaPlazoFijo(bolivianos);
        CuentaPlazoFijo cuentaPlazoFijo2 = new CuentaPlazoFijo(doalres);
        CuentaPlazoFijo cuentaPlazoFijo3 = new CuentaPlazoFijo(euros);

        CuntaAhorro cuntaAhorro1 = new CuntaAhorro(bolivianos);
        CuntaAhorro cuntaAhorro2 = new CuntaAhorro(doalres);
        CuntaAhorro cuntaAhorro3 = new CuntaAhorro(euros);

        cuentaCredito1.interes();
        cuentaCredito2.interes();
        cuentaCredito3.interes();

        cuentaPlazoFijo1.interes();
        cuentaPlazoFijo2.interes();
        cuentaPlazoFijo3.interes();

        cuntaAhorro1.interes();
        cuntaAhorro2.interes();
        cuntaAhorro3.interes();

    }
}
