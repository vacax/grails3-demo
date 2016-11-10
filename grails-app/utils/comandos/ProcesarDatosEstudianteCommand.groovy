package comandos

import grails.validation.Validateable

/**
 * Representa una clase comando..
 */
class ProcesarDatosEstudianteCommand implements Validateable {

    int matricula;
    String nombre;
    String apellido;

    static constraints = {
        nombre(blank: false)
        apellido(blank: false)
        matricula(blank: false, range: 20010000..20019999)
    }
}
