<%--
  Created by IntelliJ IDEA.
  User: vacax
  Date: 10/06/14
  Time: 07:15 PM
--%>

<g:applyLayout name="plantillaBootStrap">
    <content tag="encabezado">
        <h1>Proyecto en Grails - Utilizando Bootstrap</h1>

    </content>

    <content tag="breadcrumb">
        <li class="active">
            <i class="fa fa-file"></i> Inicio
        </li>
    </content>

    <content tag="contenido">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">Consulta de Estudiante ${estudiante.matricula} - ${estudiante.nombre}</h3>
            </div>
            <div class="panel-body">
                <ul>
                    <li><strong>Id:</strong> ${estudiante.id}</li>
                    <li><strong>Nombre:</strong> ${estudiante.nombre}</li>
                    <li><strong>Apellido:</strong> ${estudiante.apellido}</li>
                    <li><strong>Email:</strong> ${estudiante.email}</li>
                </ul>

            </div>

        </div>
        <g:link controller="estudiante" class="btn btn-primary" action="consultaEstudiante">Ir a Consulta</g:link>
    </content>


</g:applyLayout>
