package grails3.demo

class MiTareaJob {
    static triggers = {
      simple repeatInterval: 60000l // Se ejecuta cada minuto.
    }

    def execute() {
        // execute job
        println("Hola mundo Job....")
    }
}
