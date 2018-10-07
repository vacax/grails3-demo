package edu.pucmm.pwa.controllers

import comandos.ProcesarDatosEstudianteCommand
import edu.pucmm.pwa.domains.Estudiante
import grails.converters.JSON
import grails.converters.XML

/**
 * Clase controlador
 * http://docs.grails.org/latest/guide/theWebLayer.html
 */
class EstudianteController {

    //Injectando la referencia del services.
    def estudianteService;

    //Otro Servicio...
    def reglaNegocioService;

    /**
     *
     * @return
     */
    def index() {
        println("Ejecutando el index....")

        def listaEstudiante=Estudiante.list(); // Todos los estudiantes.

        //Retornando datos a la vista....
        [listaEstudiante: listaEstudiante, otraVariable: "hola mundo"]
    }

    /**
     *
     * @return
     */
    def listarEstudiantesJson(){
        def lista=Estudiante.list(order: 'asc', sort: 'id');

        render lista as JSON;
    }

    /**
     *
     * @return
     */
    def listarEstudiantesXml(){
        def lista=Estudiante.list(order: 'asc', sort: 'id');

        render lista as XML;
    }

    /**
     * Accion para mostrar una llamada
     */
    def consultaEstudiante(){

    }

    /**
     *
     * @param matricula
     */
    def visualizarEstudiante(int matricula){
        //
        //int matricula = params['matricula'] as Integer
        println("Los parametros recibidos: "+params)
        if(!matricula){ //params.matricula
            render "Debe enviar el parametro de matricula...."
        }  else{
            def estudiante = Estudiante.findByMatricula(matricula); // def sintaxis groovy...
            if(!estudiante){
                //render "Estudiante no existe...";
                response.addHeader("error_matricula", "no existe la matricula...")
                flash.error = "No  existe la matrícula enviada"
                flash.otroKey = "Otra cosa...."
                redirect(action: "consultaEstudiante")
                return;
            }else {
                [estudiante: estudiante, fecha: new Date()]; //Enviando a la vista...
            }
        }
    }

    /**
     * No permite la entrada la entrada por el filtro.
     * Ver la clase EstudianteInterceptor
     * @return
     */
    def noEntraPorFiltro(){
        reglaNegocioService.metodoTradicional(10, "123123");
        render "Nunca entrará por el filtro actual."
    }

    /**
     * Procesando los estudiante.
     * @return
     */
    def procesarEstudiante(){
        params.each { key, it->
            println("param[$key] = $it");
        }
        render "Matricula $params.matricula, Nombre: $params.nombre, Apellido: $params.apellido"
    }

    /**
     * Procesando el formulario indicando los parametros.
     * @param matricula
     * @param nombre
     * @param apellido
     * @return
     */
    def procesarEstudiante2(int matricula, String nombre, String apellido){
        render "Matricula $matricula, Nombre: $nombre, Apellido: $apellido"
    }

    /**
     *
     * @param formEstu
     * @return
     */
    def procesarEstudiante3(ProcesarDatosEstudianteCommand formEstu){

        if(!formEstu.validate()){
            flash.message=formEstu.errors;
            redirect(action: "index")
        }else{

            //
            render "Matricula $formEstu.matricula, Nombre: $formEstu.nombre, Apellido: $formEstu.apellido"
        }
    }

    /**
     *
     * @param formEstu
     * @return
     */
    def procesarEstudiante4(ProcesarDatosEstudianteCommand formEstu){

        if(!formEstu.validate()){
            flash.message=formEstu.errors;
            redirect(action: "index")
        }else{
            //Insertando información en el modelo.
            def estudiante=Estudiante.findByMatricula(formEstu.matricula);
            if(!estudiante){
                estudiante=new Estudiante(formEstu.properties); //Pasando las propiedades del command al constructor del domain.
                estudiante.save(); //Luego que sale, inserta...

            }

            //
            render "Matricula $estudiante.matricula, Nombre: $estudiante.nombre, Apellido: $estudiante.apellido"
        }
    }

    def procesarEstudiante5(ProcesarDatosEstudianteCommand formEstu){

        if(!formEstu.validate()){
            flash.message=formEstu.errors;
            redirect(action: "index")
        }else{

            def estudiante=estudianteService.crearEstudiante(formEstu);

            //
            //render "Matricula $estudiante.matricula, Nombre: $estudiante.nombre, Apellido: $estudiante.apellido"
            redirect(action: "index")
        }

    }

    def pruebaInterceptor(){
       render "Ejecutando...";
    }
}

