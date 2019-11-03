package compositePractica7;

public class Client {
    public static void main(String []args){
        Composite kidProduct1 = new Composite("Lavoratorio 1");
        kidProduct1.add(new Computadora("Computadora 1"));
        kidProduct1.add(new Computadora("Computadora 2"));


        Composite kidProduct2 = new Composite("Lavoratorio 2");
        kidProduct2.add(new Computadora("Computadora 3"));
        kidProduct2.add(new Computadora("Computadora 4"));


        Composite kidProduct3 = new Composite("Contenedor");
        kidProduct3.add(kidProduct1);
        kidProduct3.add(kidProduct2);

        kidProduct3.print();

    }
}