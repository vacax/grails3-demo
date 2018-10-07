package grails3.demo

import edu.pucmm.pwa.domains.Asignatura
import edu.pucmm.pwa.domains.Estudiante
import edu.pucmm.pwa.domains.Roles
import edu.pucmm.pwa.domains.Usuario
import edu.pucmm.pwa.domains.UsuarioRoles

class BootStrap {

    def springSecurityService

    def init = { servletContext ->
        println("Iniciando Aplicación Demo - Grails 3")
        new Estudiante(matricula: 20011136, nombre: "Carlos", apellido: "Camacho", email: "ccas@asd.com").save(failOnError: true)

        //Creando el asuario admin.
        Usuario admin =new Usuario(username: "admin", password: springSecurityService.encodePassword("admin"), email: "admin@admin.com").save(failOnError: true)
        Usuario usuario =new Usuario(username: "usuario", password: springSecurityService.encodePassword("admin"), email: "usuario@admin.com").save(failOnError: true)

        //Creando los roles.
        def roleAdmin = new Roles(authority: "ROLE_ADMIN") .save(failOnError: true)
        def roleUsuario = new Roles(authority: "ROLE_USUARIO").save(failOnError: true);

        //Asociando el usuario y los roles.
        UsuarioRoles.create(admin, roleAdmin);
        UsuarioRoles.create(usuario, roleUsuario);

        //creando asignaturas.
        new Asignatura(codigoMateria: "ISC-517", nombre: "Internet Avanzado").save(failOnError: true)

    }

    def destroy = {
        println("Salida de la aplicación....")
    }
}
