package proxyPractica7;

public class ServerRespaldoDescarga implements Servidor {

    Descarga descarga;
;

    public ServerRespaldoDescarga(Descarga descarga) {
        this.descarga = descarga;

    }

    @Override
    public void request() {
        System.out.println("Se esta respaldando con solicitud de descarga el archivo: "+ this.descarga.getNombreArchivo()+""+this.descarga.getEstencion());
    }
}
