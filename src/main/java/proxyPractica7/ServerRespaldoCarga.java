package proxyPractica7;

public class ServerRespaldoCarga implements Servidor {

    Carga carga;


    public ServerRespaldoCarga(Carga carga) {
        this.carga = carga;

    }

    @Override
    public void request() {
        System.out.println("Se esta respaldando con solicitud de carga el archivo: "+ this.carga.getNombreArchivo()+""+this.carga.getEstencion());
    }
}
