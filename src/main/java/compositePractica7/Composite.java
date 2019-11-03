package compositePractica7;



import java.util.ArrayList;

public class Composite extends Component {
    private ArrayList<Component> list = new ArrayList<>();
    private int precioTotal;

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Computadora computadora) {
        this.precioTotal = computadora.getPrecioTotal();
    }

    public Composite(String name){
        super(name);
    }


    @Override
    public void print() {
        // some actions when we do iteration with list

        System.out.println("\t "+this.getName()+" precio: "+ precioTotal+" bs.");
        for (Component comp: list) {
            System.out.print("\t ");
            comp.print();
        }

    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void precioTota(Component component) {

    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getName());
    }
}