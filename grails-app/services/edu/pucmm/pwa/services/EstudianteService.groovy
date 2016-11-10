package edu.pucmm.pwa.services

import comandos.ProcesarDatosEstudianteCommand
import edu.pucmm.pwa.domains.DireccionEstudiante
import edu.pucmm.pwa.domains.Estudiante
import grails.transaction.Transactional

/**
 * Clase que representa un servicio.
 */
@Transactional
class EstudianteService {

    /**
     *
     * @param form
     */
    public Estudiante crearEstudiante(ProcesarDatosEstudianteCommand form){
        def estu=Estudiante.findByMatricula(form.matricula);
        if(estu){
            /**
             * El RollBack Grails lo realiza cuando se dispara una excepcion del tipo RuntineException.
             */
            throw new RuntimeException("Existe el usuario en la base de datos.");
        }

        estu=new Estudiante() // Propiedades..
        estu.matricula=form.matricula;
        estu.nombre=form.nombre;
        estu.apellido=form.apellido;

        //Insertar direcciones.
        (1..(Math.random()%10)).each {
            estu.addToListaDirecciones(new DireccionEstudiante(direccion: "Mi direccion $it"))
        }

        estu.save(failOnError: true);
    }
}
