package proxyPractica7;

public class Client {
    public static void main (String [] args){
        // create proxy
        Servidor proxyCarga = new ProxyCarga(new Carga("archivo",".zip"));
        Servidor proxyCarga2 = new ProxyCarga(new Carga("archivo",".rar"));
        Servidor proxyCarga3 = new ProxyCarga(new Carga("archivo",".txt"));
        Servidor prxyDescarga = new ProxyDescarga(new Descarga("documento",".rar"));
        Servidor prxyDescarga2 = new ProxyDescarga(new Descarga("documento",".zip"));
        Servidor prxyDescarga3 = new ProxyDescarga(new Descarga("documento",".txt"));

        prxyDescarga.request();
        proxyCarga.request();
        proxyCarga2.request();
        proxyCarga3.request();
        prxyDescarga2.request();
        prxyDescarga3.request();
    }
}
