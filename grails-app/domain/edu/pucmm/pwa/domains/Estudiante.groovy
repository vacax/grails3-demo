package edu.pucmm.pwa.domains

class Estudiante {

    int matricula;
    String nombre;
    String apellido
    String email
    transient String noIrPerteneceAlModelo;

    //Los setea automatico...
    Date dateCreated
    Date lastUpdated

    //Uno a Mucho.
    static hasMany = [listaDirecciones : DireccionEstudiante]

    //Permite definir validaciones...
    static constraints = {
        matricula(unique: true)
        email(email: true);
        nombre(blank: false)
        apellido blank: false
    }


}
