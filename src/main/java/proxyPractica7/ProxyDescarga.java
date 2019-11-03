package proxyPractica7;

public class ProxyDescarga implements Servidor {
    private Descarga descarga;
    private ServerDescarga server =null;
    private ServerRespaldoDescarga serverRespaldo = null;

    public ProxyDescarga(Descarga descarga){
        this.descarga = descarga;
    }

    @Override
    public void request() {

        if (server == null && serverRespaldo == null){
            server = new ServerDescarga(descarga);
            serverRespaldo = new ServerRespaldoDescarga(descarga);
        }
        //some conditions //filters
        if (descarga.getEstencion().equals(".zip") || descarga.getEstencion().equals(".rar")) {
            this.server.request();
            this.serverRespaldo.request();
        }else{
            System.out.println("porfavor use la extención .zip o .rar");
        }


    }
}
