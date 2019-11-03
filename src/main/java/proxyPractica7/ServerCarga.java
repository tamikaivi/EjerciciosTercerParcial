package proxyPractica7;

public class ServerCarga implements Servidor {

    Carga carga;


    public ServerCarga(Carga carga) {
        this.carga = carga;
    }

    @Override
    public void request() {
        System.out.println("Se esta subiendo el archivo: "+ this.carga.getNombreArchivo()+""+this.carga.getEstencion());
    }
}
