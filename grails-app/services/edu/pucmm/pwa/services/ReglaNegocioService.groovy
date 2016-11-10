package edu.pucmm.pwa.services

import grails.transaction.Transactional

/**
 * Representa la clase que maneja las transacciones de nuestra aplicacion.
 */
@Transactional
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
}
