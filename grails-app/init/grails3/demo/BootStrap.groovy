package grails3.demo

import edu.pucmm.pwa.domains.Estudiante

class BootStrap {

    def init = { servletContext ->
        println("Iniciando Aplicación Demo - Grails 3")
        new Estudiante(matricula: 20011136, nombre: "Carlos", apellido: "Camacho", email: "ccas@asd.com").save(failOnError: true)
    }
    def destroy = {

    }
}
