package proxyPractica7;

public class ServerDescarga implements Servidor {

    Descarga descarga;


    public ServerDescarga(Descarga descarga) {
        this.descarga = descarga;
    }

    @Override
    public void request() {
        System.out.println("Se está descargando el archivo: "+ this.descarga.getNombreArchivo()+""+this.descarga.getEstencion());
    }
}
