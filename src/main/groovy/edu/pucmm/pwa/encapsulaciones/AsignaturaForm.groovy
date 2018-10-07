package edu.pucmm.pwa.encapsulaciones

import grails.validation.Validateable

/**
 *  Utilizando los comandos, fuera del controlador, es necesario
 *  incluir la interfaz grails.validation.Validateable. Ver comentario:
 *  http://docs.grails.org/latest/guide/theWebLayer.html#commandObjects
 */
class AsignaturaForm implements Validateable {

    //
    String nombre
    String codigoMateria

    static constraints = {
        nombre(minSize: 5, blank: false)
    }
}
