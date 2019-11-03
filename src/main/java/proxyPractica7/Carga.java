package proxyPractica7;

public class Carga {

    private String nombreArchivo;
    private String estencion;

    public Carga(String nombreArchivo, String estencion) {
        this.nombreArchivo = nombreArchivo;
        this.estencion = estencion;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getEstencion() {
        return estencion;
    }

    public void setEstencion(String estencion) {
        this.estencion = estencion;
    }

}
