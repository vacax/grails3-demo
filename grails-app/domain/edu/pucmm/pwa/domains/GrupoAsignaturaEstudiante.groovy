package edu.pucmm.pwa.domains

/**
 *  Clase para implementar una relación mucho a mucho..
 */
class GrupoAsignaturaEstudiante implements Serializable {

    Estudiante estudiante;
    GrupoAsignatura grupoAsignatura;

    //Datos de transaccion...
    String creadoPor="";
    String modificadoPor="";
    //Los setea automatico...
    Date dateCreated
    Date lastUpdated

    static GrupoAsignaturaEstudiante get(long estudianteId, long grupoAsignaturaId){
         find("from GrupoAsignaturaEstudiante  where estudiante.id = :estudianteId and grupoAsignatura.id = :grupoAsignaturaId", [estudianteId: estudianteId, grupoAsignaturaId: grupoAsignaturaId])
    }

    static GrupoAsignaturaEstudiante create(Estudiante estudiante1, GrupoAsignatura grupoAsignatura1){
          new GrupoAsignaturaEstudiante(estudiante: estudiante1, grupoAsignatura: grupoAsignatura1).save(flush: true);
    }

    static boolean remove(Estudiante estudiante1, GrupoAsignatura grupoAsignatura1){
        GrupoAsignaturaEstudiante instancia = GrupoAsignaturaEstudiante.findByEstudianteAndGrupoAsignatura(estudiante1,grupoAsignatura1);
        if(!instancia){
           return false;
        }

        instancia.delete(flush: true);
        return true;
    }

    static constraints = {
    }

    /**
     * Creando la entidad e indicando que el id será
     * la unificacion de los campos estudiantes y grupoAsignatura
     */
    static mapping = {
        table 'grupoasignatura_estudiantes'
        id(composite: ['estudiante', 'grupoAsignatura'])
        version(false) //eliminando el campo de versiones...
    }
}
