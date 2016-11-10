package edu.pucmm.pwa.domains

class GrupoAsignatura {

    String codigo;

    //Profesor tiene un grupo. uno a mucho
    //static belongsTo = [Profesores];
    //o
    Profesores profesor;

    //tomando de la relación mucho a mucho desde el objeto
    //grupo de Asignatura Estudiente,
    Set<Estudiante> getEstudiantes(){
        GrupoAsignaturaEstudiante.findAllByGrupoAsignatura(this).collect {it.estudiante} as Set
    }

    //Datos de transaccion...
    String creadoPor="";
    String modificadoPor="";

    static constraints = {
    }

    static mapping = {
        table 'grupo_asignaturas_fuera_convencion'
    }
}
