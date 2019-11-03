package adapterPractica7;

public class Refrigeradores implements IEmpresaArtefactos2 {
    private int vida=60;
    private int precio=20000;

    @Override
    public int costo() {
        System.out.println("El costo ddel refrigerador es: "+ precio +" bs.");
        return precio;
    }

    @Override
    public int tiempoGarantia() {
        System.out.println("El tiempo de garantia del refrigerador es: "+ vida +" años");
        return vida;
    }
}
