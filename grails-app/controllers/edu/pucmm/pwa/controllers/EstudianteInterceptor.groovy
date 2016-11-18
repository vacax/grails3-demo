package edu.pucmm.pwa.controllers

/**
 * Realizan la función de los filtros:
 * http://docs.grails.org/latest/guide/theWebLayer.html#interceptors
 */
class EstudianteInterceptor {

    EstudianteInterceptor(){
        match(controller: "estudiante") //aplica para todas las llamadas del controlador
    }

    boolean before() {
        println "Aplicando el filtro antes de la llamada"
        //controlando una URL.
        if(actionName == "noEntraPorFiltro"){
            render "No puedes entrar, controlado por el interceptor...."
            return false;
        }
        //Para continuar debo retornar true
        true
    }

    boolean after() {
        //
        println("Aplicando el filtro luego de la llamada")
        //Para continuar debo retornar true
        true
    }

    void afterView() {
        // no-op
    }
}
