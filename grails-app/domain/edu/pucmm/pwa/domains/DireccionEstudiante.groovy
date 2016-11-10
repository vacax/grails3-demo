package edu.pucmm.pwa.domains

class DireccionEstudiante {

    String direccion;

    static belongsTo = [estudiante : Estudiante] //El cascada..
    //Estudiante estudiante; // Es lo mismo, sin el cascada...

    static constraints = {
       estudiante(nullable: true) //Permitiendo la agregración...
    }
}
