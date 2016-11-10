package edu.pucmm.pwa.controllers


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(EstudianteInterceptor)
class EstudianteInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test estudiante interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"estudiante")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
