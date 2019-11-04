package compositePractica7;

public class Client {
    public static void main(String []args){
        Composite lavoratorio = new Composite("Lavoratorio 1");
        lavoratorio.add(new Computadora("Computadora 1"));
        lavoratorio.add(new Computadora("Computadora 2"));


        Composite laboratorio1 = new Composite("Lavoratorio 2");
        laboratorio1.add(new Computadora("Computadora 3"));
        laboratorio1.add(new Computadora("Computadora 4"));


        Composite contenedor = new Composite("Contenedor");
        contenedor.add(lavoratorio);
        contenedor.add(laboratorio1);

        contenedor.print();

    }
}