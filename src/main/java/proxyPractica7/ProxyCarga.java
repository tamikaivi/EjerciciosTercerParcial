package proxyPractica7;

public class ProxyCarga implements Servidor {
    private Carga carga;
    private ServerCarga server =null;
    private ServerRespaldoCarga serverRespaldo = null;

    public ProxyCarga(Carga carga){
        this.carga = carga;
    }

    @Override
    public void request() {

        if (server == null && serverRespaldo == null){
            server = new ServerCarga(carga);
            serverRespaldo = new ServerRespaldoCarga(carga);
        }
        //some conditions //filters
        if (carga.getEstencion().equals(".zip") || carga.getEstencion().equals(".rar")) {
            this.server.request();
            this.serverRespaldo.request();
        }else{
            System.out.println("porfavor use la extención .zip o .rar");
        }


    }
}
