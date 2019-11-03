package compositePractica7;

public class Computadora extends Component {
    private int precio = 6000;
    public int precioTotal;

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Computadora(String name){
        super(name);
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void print() {
        setPrecioTotal(getPrecioTotal()+precio);
        System.out.println("\t \t Producto : "+this.getName()+ " "+ precio +" bs.");
    }

    @Override
    public void add(Component component) {

        System.out.println("not applicable on Product");
    }

    @Override
    public void remove(Component component) {
        System.out.println("not applicable on Product");
    }

    @Override
    public void precioTota(Component component) {

    }

    @Override
    public void getChild(int position) {
        System.out.println("\t Producto :"+this.getName()+precio+" bs.");
    }
}