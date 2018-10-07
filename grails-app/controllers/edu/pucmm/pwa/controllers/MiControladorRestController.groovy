package edu.pucmm.pwa.controllers

import edu.pucmm.pwa.domains.Asignatura
import edu.pucmm.pwa.domains.Profesores
import edu.pucmm.pwa.encapsulaciones.AsignaturaForm
import grails.converters.JSON

/**
 * Controlador para mostrar las funcionalidades REST.
 */
class MiControladorRestController {

    def index() {
        render "Vista generica"
    }

    /**
     * Listado de los profesores asociado a una llamada RESTFul desde el URLMapping
     * @return
     */
    def listaProfesor(){
        render Profesores.list(sort: "id", order: "desc") as JSON
    }

    /**
     * Asociada el metodo asociado a una llamada RESTful desde el URLMapping.
     * @param id
     * @return
     */
    def datosProfesor(long id){
        render Profesores.get(id) as JSON
    }

    /**
     *
     */
    def pruebaChartGoogle(){
        //Mandando los datos.

        def myDailyActivitiesColumns = [['string', 'Task'], ['number', 'Hours per Day']]
        def myDailyActivitiesData = [['Work', 11], ['Eat', 2], ['Commute', 2], ['Watch TV', 2], ['Sleep', 7]]
        //retornando...
        [myDailyActivitiesColumns: myDailyActivitiesColumns, myDailyActivitiesData : myDailyActivitiesData];
    }

    /**
     * Probando el uso de la asignaturaForm como objeto de validación
     * @param asignaturaForm
     */
    def creacionAsignatura(AsignaturaForm asignaturaForm){
        if(!asignaturaForm.validate()){
            response.sendError(403, "Parametros no enviados de forma correcta: "+asignaturaForm.errors.properties)
            return
        }

        def a = new Asignatura(asignaturaForm.properties).save(failOnError: true)
        respond(a)
    }
}
