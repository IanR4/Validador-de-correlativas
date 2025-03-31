package domain;

import java.util.List;
import lombok.Getter;
import lombok.Setter;


public class Alumno {
    @Setter
    @Getter
    private String nombre;
    @Getter
    private List<Materia> materiasAprobadas;

    public Alumno(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}
