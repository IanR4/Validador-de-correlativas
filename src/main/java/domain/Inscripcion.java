package domain;

import java.util.Set;

import lombok.Setter;

public class Inscripcion {
    private Set<Materia> materiasInscripcion;
    @Setter
    private Alumno alumno;

    public Inscripcion(Set<Materia> materiasInscripcion) {
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
