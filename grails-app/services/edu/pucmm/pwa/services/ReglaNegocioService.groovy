package edu.pucmm.pwa.services

import edu.pucmm.pwa.domains.Estudiante
import grails.gorm.transactions.Transactional


/**
 * Representa la clase que maneja las transacciones de nuestra aplicacion.
 * http://docs.grails.org/latest/guide/single.html#services
 */
@Transactional //por defecto los servicios manejan la transaccion
class ReglaNegocioService {

    /**
     * Corresponde a la sintaxis Groovy, elemento más dinamico
     * @param param1
     * @param param2
     */
    def miServicioDinamico(def param1, def param2){
        //última linea corresponde al retorno.
    }

    /**
     * Forma tradicional, permite tener mayor control en el desarrollo y evitamos
     * los errores en runtime
     * @param param1
     * @param param2
     */
    public void metodoTradicional(int param1, String param2){

    }

    /**
     * Transacción de tipo lectura.
     * @return
     */
    @Transactional(readOnly = true)
    public List<Estudiante> listaEstudiante(){
        return Estudiante.list()
    }


}
