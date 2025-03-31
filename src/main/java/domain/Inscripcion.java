package domain;

import java.util.List;
import lombok.Setter;

public class Inscripcion {
    private List<Materia> materiasInscripcion;
    @Setter
    private Alumno alumno;

    public Inscripcion(List<Materia> materiasInscripcion) {
        this.materiasInscripcion = materiasInscripcion;
    }

    public boolean aprobada() {
        for(Materia materia : materiasInscripcion) {
            if(!materia.cumpleCorrelativas(this.alumno)){
                return false;
            }
        }
        return true;
    }
}
