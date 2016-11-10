<%--
  Created by IntelliJ IDEA.
  User: vacax
  Ejemplo del uso de la plantilla
--%>

%{--Etiqueta para cargar la plantilla--}%
<g:applyLayout name="miPlatillaContenido">
    %{--Cambiando el contenido...--}%
    <content tag="titulo">
        Framework Grails 3.0
    </content>

    <content tag="menuContenido">
         <h1>Menú Contenido</h1>
    </content>

    %{--No importan el orden lo ubica donde corresponde...--}%
    <content tag="encabezado">
        <h1>Ejemplo de uso de plantilla en Grails...</h1>
    </content>

    <content tag="articulos">
        <h1>Ejemplo de uso de plantilla en Grails...</h1>
        <article>
            <h2>Formulario<h2>
                <p> Crear elementos de prueba....</p>
        </article>
    </content>

    <content tag="piePagina">
        <h5>pie de pagina....</h5>
    </content>

</g:applyLayout>
