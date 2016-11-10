package grails3.demo

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/indexBootStrap")
        "/index.gps"(view:"/indexBootStrap")
        "/bootStrap"(view: "/indexBootStrap")

        "500"(view:'/error')
        "404"(view:'/notFound')

        //Asociado a un servicios REST dado un metodo.
        "/miRest"(controller: "miControladorRest", action: "listaProfesor", method: "GET")
        "/miRest/$id"(controller: "miControladorRest", action: "datosProfesor", method: "GET")
    }
}
