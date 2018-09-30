<%--
  Created by IntelliJ IDEA.
  User: vacax
  Date: 10/11/14
  Time: 10:59 PM
--%>

<g:applyLayout name="plantillaBootStrap">
    <content tag="encabezado">
        Proyecto en Grails - Utilizando Bootstrap
        <small>Ejemplos</small>
    </content>

    <content tag="breadcrumb">
        <li class="active">
            <i class="fa fa-file"></i> Inicio
        </li>
    </content>

    <content tag="contenido">
        <div class="jumbotron">
            <h1>Versión de Grails...: <g:meta name="app.grails.version"/></h1>
            <p>Proyecto para demostrar la funcionalidad del framework, ir recorriendo los diferentes ejemplos...</p>
        </div>

        %{--
        Taglib incluido con el plugins de Seguridad, ver
        http://grails-plugins.github.io/grails-spring-security-core/guide/helperClasses.html
        --}%
        <sec:ifAnyGranted roles="ROLE_ADMIN">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Panel Solo visible ROLE_ADMIN</h3>
                </div>
                <div class="panel-body">
                    Panel visible solo para el role, ROLE_ADMIN
                </div>
            </div>
        </sec:ifAnyGranted>

        <sec:ifAnyGranted roles="ROLE_USUARIO">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Panel Solo visible ROLE_USUARIO</h3>
                </div>
                <div class="panel-body">
                    Panel visible solo para el role, ROLE_USUARIO
                </div>
            </div>
        </sec:ifAnyGranted>

        <sec:ifAnyGranted roles="ROLE_USUARIO, ROLE_ADMIN">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Panel Solo visible ROLE_USUARIO y ROLE_ADMIN</h3>
                </div>
                <div class="panel-body">
                    Panel visible solo para el role, ROLE_USUARIO y ROLE_ADMIN
                </div>
            </div>
        </sec:ifAnyGranted>

    </content>


</g:applyLayout>