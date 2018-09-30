<%--
  Created by IntelliJ IDEA.
  User: vacax
  Date: 10/12/14
  Time: 01:11 AM
--%>

<g:applyLayout name="plantillaBootStrap">
    <content tag="encabezado">
        <h1 class="h2">Uso de formularios en Grails</h1>
    </content>

    <content tag="breadcrumb">
        <li>
            <g:link uri="/bootStrap"><i class="fa fa-fw fa-dashboard"></i> Inicio </g:link>
        </li>
        <li class="active">
            <i class="fa fa-file"></i> Formularios
        </li>
    </content>

    <content tag="contenido">



        <div class="jumbotron">
            <h2>Formulario Simple - Consulta Estudiante - Sin Parametros</h2>

        %{--Validanod el errror--}%
            <g:if test="${flash.error}">
                <div class="alert alert-danger">
                    ${flash.error}
                </div>
            </g:if>

            <g:form action="formulario1">
                Matricula: <input type="number" name="matricula"/>
                <input type="submit" value="Enviar"/>
            </g:form>

            <g:if test="${estudiante}">
                <p>
                    El estudiante ${estudiante.nombre} - ${estudiante.apellido}  fue seleccionado..
                </p>
            </g:if>
        </div>


        <div class="jumbotron">
            <h2>Formulario Simple 2 - Consulta Estudiante</h2>
            <g:if test="${flash.error}">
                <div class="alert alert-danger">
                    ${flash.error2}
                </div>
            </g:if>
            <g:form action="formulario2">
                Matricula: <input type="text" name="matricula"/>
                <input type="submit" value="Enviar"/>
            </g:form>

            <g:if test="${estudiante2}">
                <p>
                    El estudiante ${estudiante2.nombre} - ${estudiante2.apellido}  fue seleccionado..
                </p>
            </g:if>
        </div>

        <div class="jumbotron">
            <h2>Formulario Simple 3 - Uso de Command</h2>
            <g:if test="${flash.error}">
                <div class="alert alert-danger">
                    ${flash.error3}
                </div>
            </g:if>
            <g:form action="creacionEstudiante">
                Matricula: <input type="text" name="matricula"/><br/>
                Nombre: <input type="text" name="nombre"/> <br/>
                Apellido: <input type="text" name="apellido"/> <br/>
                Email: <input type="text" name="email"/> <br/>
                <input type="submit" value="Enviar"/> <br/>
            </g:form>

            <g:if test="${estudiante3}">
                <p>
                    El estudiante ${estudiante3?.nombre} - ${estudiante3?.apellido}  fue seleccionado..
                </p>
            </g:if>
        </div>

        <div class="jumbotron">
            <h2>Formulario Simple - Evitando Doble Procesamiento</h2>

        %{--Validanod el errror--}%
            <g:if test="${flash.error4}">
                <div class="alert alert-danger">
                    ${flash.error4}
                </div>
            </g:if>

            <g:form action="formulario4" useToken="true">
                Matricula: <input type="number" name="matricula"/>
                <input type="submit" value="Enviar"/>
            </g:form>

            <g:if test="${estudiante4}">
                <p>
                    El estudiante ${estudiante4?.nombre} - ${estudiante4?.apellido}  fue seleccionado..
                </p>
            </g:if>
        </div>

    </content>
</g:applyLayout>