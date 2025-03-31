package domain;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;


public class Alumno {
    @Setter
    @Getter
    private String nombre;
    private Set<Materia> materiasAprobadas;

    public Alumno(Set<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public boolean aprobo(Materia unaMateria) {
        return this.materiasAprobadas.contains(unaMateria);
    }
}

