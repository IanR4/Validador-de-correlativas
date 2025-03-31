package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Materia {
    @Setter
    @Getter
    private String nombre;
    private List<Materia> correlativas;

    public Materia(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public boolean cumpleCorrelativas(Alumno alumno) {
        if(correlativas == null) return true;
        for(Materia materiaCorrelativa : correlativas) {
            if(!alumno.getMateriasAprobadas().contains(materiaCorrelativa) || !materiaCorrelativa.cumpleCorrelativas(alumno)){
                return false;
            }
        }
        return true;
    }
}
