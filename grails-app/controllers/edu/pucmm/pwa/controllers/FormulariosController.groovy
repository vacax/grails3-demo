package edu.pucmm.pwa.controllers

import edu.pucmm.pwa.domains.Estudiante

class FormulariosController {

    def vistaBootStrap(){
        println("....")
        render(view: "/indexBootStrap", model: [objeto1 : "hola", otro: "2"])
    }

    def accionSinVista(){
        println("Debe mostrar un error, no tiene vista asociada...")
    }

    def index() {
        println("Entrando al index de los formularios...")
    }

    /**
     * Formulario simple tomando los parametros.
     */
    def formulario1(){

        //Puedo tomar la información directamente de la variable de ambiente de params.
        //para ver las variables de ambientes disponibles ver:
        //http://grails.org/doc/latest/guide/theWebLayer.html#controllersAndScopes
        def matricula=params.matricula; //params['matricula'];
        if(!matricula){
            flash.error="Debe especificar la matricula"
            flash.otroMensaje= "Otro mensaje";
            redirect(action: "index")
        }else{
            //ORM.
            def estudiante=Estudiante.findByMatricula(matricula)

            if(!estudiante){ //en Groovy, el valor null de frente considerado falso.
                flash.error="No Existe la matricula indicada"
                redirect(action: "index")
                return;
            }else {
                render(view: "index", model: [estudiante: estudiante])
            }
        }
    }

    /**
     * Realiza el bind de manera automatica para los parametros recuperados..
     * @param matricula
     */
    def formulario2(int matricula){ //La forma recomendada...
        println("Matricula recuperada $matricula")
        if(!matricula){
            flash.error2="Debe especificar la matricula"
            redirect(action: "index")
        }else{

            def estudiante=Estudiante.findByMatricula(matricula)

            if(!estudiante){ //en Groovy, el valor null de frente considerado falso.
                flash.error="No existe la matricula indicada"
                redirect(action: "index")
                return;
            }else {
                render(view: "index", model: [estudiante2: estudiante])
            }
        }
    }

    /**
     *
     * @param estudianteCommand
     * @return
     */
    def creacionEstudiante(EstudianteCommand estudianteCommand){
        println("El formualio cumple con las validaciones: "+estudianteCommand.validate())
        if(!estudianteCommand.validate()){
            render ""+estudianteCommand.errors;
            return;
        }

        //
        def estudiante=new Estudiante(estudianteCommand.properties)
        estudiante.save(failOnError: false, flush: true);
        if(estudiante.hasErrors()){
            render("El error guardando el estudiante: "+estudiante.errors)
            return;
        }

        render(view: "index", model: [estudiante3: estudiante])
    }

    /**
     *
     * @param matricula
     * @return
     */
    def formulario4(int matricula){ //La forma recomendad...
        withForm {
            sleep(1000);
            // good request
            println("Matricula recuperada $matricula")
            if(!matricula){
                flash.error4="Debe especificar la matricula"
                redirect(action: "index")
            }else{
                def estudiante=Estudiante.findByMatricula(matricula)
                render(view: "index", model: [estudiante4: estudiante])
            }
        }.invalidToken {
            // bad request
            flash.error4="Doble procesamiento del formulario, toquen no valido"
            redirect(action: "index")
        }

    }
}

/**
 * Clase command, para encapsular la información enviada
 * a un action. Tengo dos formas de hacerlo:
 * 1) Creando la clase en el mismo archivo del controlador, como esté caso.
 * 2) Incluir en un clase, la anotación: @grails.validation.Validateable
 * Ver documentación en: http://grails.org/doc/latest/guide/theWebLayer.html#commandObjects
 *
 */
class EstudianteCommand{
    int matricula;
    String nombre;
    String apellido
    String email

    static constraints = {
        email(email: true);
        nombre(blank: false)
        apellido blank: false
    }
}
