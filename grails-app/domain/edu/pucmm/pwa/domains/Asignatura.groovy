package edu.pucmm.pwa.domains

class Asignatura {

    String nombre;
    String codigoMateria;

    //Datos de transaccion...
    String creadoPor;
    String modificadoPor;

    static constraints = {
    }

    static mapping = {
        table 'asignaturas'
    }
}
