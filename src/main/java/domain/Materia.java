package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

public class Materia {
    @Setter
    @Getter
    private String nombre;
    private Set<Materia> correlativas;

    public Materia(Set<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public boolean cumpleCorrelativas(Alumno alumno) {
        if(correlativas == null) return true;
        for(Materia materiaCorrelativa : correlativas) {
            if(!alumno.aprobo(materiaCorrelativa) || !materiaCorrelativa.cumpleCorrelativas(alumno)){
                return false;
            }
        }
        return true;
    }
}
