package edu.pucmm.pwa.controllers

import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_ADMIN"])
class ZonaAdminController {

    def index() { }
}
