<%--
  Created by IntelliJ IDEA.
  User: vacax
  Date: 10/18/14
  Time: 09:41 PM
--%>

<g:applyLayout name="plantillaBootStrap">
    <content tag="encabezado">
        Proyecto en Grails - Utilizando Bootstrap...
        <small>Ejemplos</small>
    </content>

    <content tag="breadcrumb">
        <li class="active">
            <i class="fa fa-file"></i> Inicio
        </li>
    </content>

    <content tag="contenido">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">Consulta de un Estudiante</h3>
            </div>
            <div class="panel-body">
                <g:form action="visualizarEstudiante" role="form">
                    <div class="form-group">
                        <label for="matricula">Matrícula</label>
                        <input type="number" class="form-control" id="matricula" name="matricula" placeholder="Digite la matrícula" value="2001001"/>
                    </div>
                    <button type="submit" class="btn btn-default">Consultar</button>
                </g:form>
            </div>
        </div>
    </content>


</g:applyLayout>