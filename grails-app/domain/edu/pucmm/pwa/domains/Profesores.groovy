package edu.pucmm.pwa.domains

import grails.rest.Resource

/**
 * Profesores,
 *
 * Esta creado como un recurso REST de frente con el domino, ver la documentacion oficial
 * http://docs.grails.org/latest/guide/single.html#REST
 */
@Resource(uri = "/profesores", formats = ["json"] )
class Profesores {

    String cedula;
    String nombre;
    String direccion;

    //Datos de transaccion...
    String creadoPor="sistema";
    String modificadoPor="sistema";

    //
    static hasMany = [listaGrupos : GrupoAsignatura]

    static constraints = {
    }

    static mapping = {
        table 'mi_profesores'
    }
}
