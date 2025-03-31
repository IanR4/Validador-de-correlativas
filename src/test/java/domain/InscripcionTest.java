package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    @DisplayName( "Inscripcion aprobada")
    public void apruebaInscripcion() {
        Materia ayed = new Materia(null);
        Materia pdp = new Materia(Set.of(ayed));
        Materia dsi = new Materia(Set.of(pdp));
        Materia am1 = new Materia(null);
        Materia aga = new Materia(null);
        Materia am2 = new Materia(Set.of(am1, aga));

        Alumno alumno1 = new Alumno(Set.of(ayed, pdp, am1, aga));

        Inscripcion inscripcion = new Inscripcion(Set.of(dsi, am2));
        inscripcion.setAlumno(alumno1);

        Assertions.assertTrue(inscripcion.aprobada());

    }

}