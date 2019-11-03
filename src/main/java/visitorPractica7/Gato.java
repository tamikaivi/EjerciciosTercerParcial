package visitorPractica7;

public class Gato implements IAnimales {
    private boolean lesion;
    private boolean infeccion;
    private int pulso;

    public Gato(boolean lesion, boolean infeccion, int pulso) {
        this.lesion = lesion;
        this.infeccion = infeccion;
        this.pulso = pulso;
    }

    public boolean isLesion() {
        return lesion;
    }

    public void setLesion(boolean lesion) {
        this.lesion = lesion;
    }

    public boolean isInfeccion() {
        return infeccion;
    }

    public void setInfeccion(boolean infeccion) {
        this.infeccion = infeccion;
    }

    public int getPulso() {
        return pulso;
    }

    public void setPulso(int pulso) {
        this.pulso = pulso;
    }

    @Override
    public String atender(IVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String definirDeQueEstanEnfermos() {
        if (lesion && infeccion && pulso>=0 && pulso <=30 || !lesion && infeccion && pulso>=0 && pulso <=30 || lesion && !infeccion && pulso>=0 && pulso <=30){
            return "Enfermedad1";
        }else if (lesion && infeccion && pulso>=70 && pulso <=100 || !lesion && infeccion && pulso>=70 && pulso <=100 || lesion && !infeccion && pulso>=70 && pulso <=100){
            return "Enfermedad2";
        }else {
            return "Sano";
        }
    }

}
