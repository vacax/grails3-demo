package grails3.demo

/**
 * http://docs.grails.org/latest/guide/theWebLayer.html#taglibs
 */
class PruebaTagLib {

    //Por defecto inicia con la g
    static namespace = "mi"

    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def holaMundo = { attrs, body ->
       out << "Hola Mundo $attrs.nombre - $attrs.matricula"
    }
}
