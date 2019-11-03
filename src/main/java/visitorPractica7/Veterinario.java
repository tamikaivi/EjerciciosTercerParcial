package visitorPractica7;

import java.util.Calendar;

public class Veterinario implements IVisitor {
    private String nombre;

    public Veterinario(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String visit(Perro perro) {
        if (perro.definirDeQueEstanEnfermos().equals("Enfermedad1")){
            System.out.println("Se le recetará al perro paracetamol 20 comprimidos por diagnostico de enfermedad 1");
            Calendar tiempo = Calendar.getInstance();
            int mes = tiempo.get(Calendar.MONTH)+1;
            int dia = tiempo.get(Calendar.DAY_OF_MONTH);
            int anio = tiempo.get(Calendar.YEAR);
            int hora = tiempo.get(Calendar.HOUR_OF_DAY);
            int minuto = tiempo.get(Calendar.MINUTE);
            return ("Fecha: "+dia+"/"+mes+"/"+anio+" Hora: "+ hora+":"+minuto);
        }else if (perro.definirDeQueEstanEnfermos().equals("Enfermedad2")) {
            System.out.println("Se le recetará al perro Hibuprofeno 50 comprimidos por diagnostico de enfermedad 2");
            Calendar tiempo = Calendar.getInstance();
            int mes = tiempo.get(Calendar.MONTH)+1;
            int dia = tiempo.get(Calendar.DAY_OF_MONTH);
            int anio = tiempo.get(Calendar.YEAR);
            int hora = tiempo.get(Calendar.HOUR_OF_DAY);
            int minuto = tiempo.get(Calendar.MINUTE);
            return ("Fecha: "+dia+"/"+mes+"/"+anio+" Hora: "+ hora+":"+minuto);
        }else {
            return "El perro esta sano";
        }
    }

    @Override
    public String visit(Gato gato) {
        if (gato.definirDeQueEstanEnfermos().equals("Enfermedad1")){
            System.out.println("Se le recetará al gato paracetamol 20 comprimidos por diagnostico de enfermedad 1");
            Calendar tiempo = Calendar.getInstance();
            int mes = tiempo.get(Calendar.MONTH)+1;
            int dia = tiempo.get(Calendar.DAY_OF_MONTH);
            int anio = tiempo.get(Calendar.YEAR);
            int hora = tiempo.get(Calendar.HOUR_OF_DAY);
            int minuto = tiempo.get(Calendar.MINUTE);
            return ("Fecha: "+dia+"/"+mes+"/"+anio+" Hora: "+ hora+":"+minuto);
        }else if (gato.definirDeQueEstanEnfermos().equals("Enfermedad2")) {
            System.out.println("Se le recetará al agto Hibuprofeno 50 comprimidos por diagnostico de enfermedad 2");
            Calendar tiempo = Calendar.getInstance();
            int mes = tiempo.get(Calendar.MONTH)+1;
            int dia = tiempo.get(Calendar.DAY_OF_MONTH);
            int anio = tiempo.get(Calendar.YEAR);
            int hora = tiempo.get(Calendar.HOUR_OF_DAY);
            int minuto = tiempo.get(Calendar.MINUTE);
            return ("Fecha: "+dia+"/"+mes+"/"+anio+" Hora: "+ hora+":"+minuto);
        }else {
            return "El gato esta sano";
        }
    }

    @Override
    public String visit(Caballo caballo) {
        if (caballo.definirDeQueEstanEnfermos().equals("Enfermedad1")){
            System.out.println("Se le recetará al caballo paracetamol 20 comprimidos por diagnostico de enfermedad 1");
            Calendar tiempo = Calendar.getInstance();
            int mes = tiempo.get(Calendar.MONTH)+1;
            int dia = tiempo.get(Calendar.DAY_OF_MONTH);
            int anio = tiempo.get(Calendar.YEAR);
            int hora = tiempo.get(Calendar.HOUR_OF_DAY);
            int minuto = tiempo.get(Calendar.MINUTE);
            return ("Fecha: "+dia+"/"+mes+"/"+anio+" Hora: "+ hora+":"+minuto);
        }else if (caballo.definirDeQueEstanEnfermos().equals("Enfermedad2")) {
            System.out.println("Se le recetará al caballo Hibuprofeno 50 comprimidos por diagnostico de enfermedad 2");
            Calendar tiempo = Calendar.getInstance();
            int mes = tiempo.get(Calendar.MONTH)+1;
            int dia = tiempo.get(Calendar.DAY_OF_MONTH);
            int anio = tiempo.get(Calendar.YEAR);
            int hora = tiempo.get(Calendar.HOUR_OF_DAY);
            int minuto = tiempo.get(Calendar.MINUTE);
            return ("Fecha: "+dia+"/"+mes+"/"+anio+" Hora: "+ hora+":"+minuto);
        }else {
            return "El caballo esta sano";
        }
    }
}
