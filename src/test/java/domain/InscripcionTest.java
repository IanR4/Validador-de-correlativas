package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    @DisplayName( "Inscripcion aprobada")
    public void apruebaInscripcion() {
        Materia ayed = new Materia(null);
        Materia pdp = new Materia(List.of(ayed));
        Materia dsi = new Materia(List.of(pdp));
        Materia am1 = new Materia(null);
        Materia aga = new Materia(null);
        Materia am2 = new Materia(List.of(am1, aga));

        Alumno alumno1 = new Alumno(List.of(ayed, pdp, am1, aga));

        Inscripcion inscripcion = new Inscripcion(List.of(dsi, am2));
        inscripcion.setAlumno(alumno1);

        Assertions.assertTrue(inscripcion.aprobada());

    }

}