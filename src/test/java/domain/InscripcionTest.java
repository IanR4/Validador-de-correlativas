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
        Alumno alumno2 = new Alumno(Set.of(aga));

        Inscripcion inscripcion1 = new Inscripcion(Set.of(dsi, am2));
        inscripcion1.setAlumno(alumno1);
        Inscripcion inscripcion2 = new Inscripcion(Set.of(am2));
        inscripcion2.setAlumno(alumno2);

        Assertions.assertTrue(inscripcion1.aprobada());
        Assertions.assertFalse(inscripcion2.aprobada());

    }

}

class AlumnoTest {

    @Test
    @DisplayName( "Alumno aprobo ASI")
    public void apruebaMateria() {
        Materia asi = new Materia(null);
        Materia an = new Materia(null);

        Alumno alumno1 = new Alumno(Set.of(asi));

        Assertions.assertTrue(alumno1.aprobo(asi));
        Assertions.assertFalse(alumno1.aprobo(an));

    }

}