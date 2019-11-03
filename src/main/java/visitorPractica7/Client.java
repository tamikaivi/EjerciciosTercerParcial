package visitorPractica7;

public class Client {
    public static void main(String[] args) {
        Perro perro = new Perro(false,true,10);
        Gato gato = new Gato(false,false, 55);
        Caballo caballo =new Caballo(true, true , 80);


        Veterinario veterinario = new Veterinario("Vivian");

        System.out.println("Resultado de Perro: ");
        System.out.println(perro.atender(veterinario));
        System.out.println("Resultado de Gato: ");
        System.out.println(gato.atender(veterinario));
        System.out.println("Resultado de Cabello: ");
        System.out.println(caballo.atender(veterinario));

    }
}
