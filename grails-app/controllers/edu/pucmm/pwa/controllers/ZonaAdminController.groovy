package edu.pucmm.pwa.controllers

import edu.pucmm.pwa.domains.Usuario
import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_ADMIN"])
class ZonaAdminController {

    def springSecurityService;

    def index() {
        Usuario usuario = springSecurityService.currentUser;
        [usuario: usuario]
    }
}
