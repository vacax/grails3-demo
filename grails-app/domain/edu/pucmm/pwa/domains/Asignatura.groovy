package edu.pucmm.pwa.domains

import grails.rest.Resource

@Resource(uri = "/asignatura")
class Asignatura {

    String nombre;
    String codigoMateria;

    //Datos de transaccion...
    String creadoPor="sistemas";
    String modificadoPor="sistemas";
    //Campos generados de forma automatica.
    Date dateCreated
    Date lastUpdated

    static constraints = {
    }

    static mapping = {
        table 'asignaturas'
    }
}
