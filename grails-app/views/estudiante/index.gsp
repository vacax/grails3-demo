<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <%-- La forma basica de utilizar el template... --%>
    <meta name="layout" content="miTemplate"/>
    <title>Lista de Estudiantes</title>
</head>
<body>

<h1>Hola Mundo En Grails</h1>

<g:if test="${flash.message}">
    <p>
        ${flash.message}
    </p>
</g:if>

<g:form controller="estudiante" action="procesarEstudiante5">
    Matricula: <input type="number" name="matricula" /> <br/>
    Nombre: <input type="text" name="nombre" /> <br/>
    Apellido: <input type="text" name="apellido" /> <br/>
    <input type="submit" value="Enviar"/>
</g:form>

<table>
    <thead>
    <th>
        Matricula
    </th>
    <th>
        Nombre
    </th>
    <th>
        Apellido  ${otraVariable}
    </th>
    </thead>
    <tbody>
    <g:each in="${listaEstudiante}" var="est">
        <tr>
            <td>${est.matricula}</td>
            <td>${est.nombre}</td>
            <td>${est.apellido}</td>
        </tr>
    </g:each>
    </tbody>
</table>

<br/>
<br/>
%{-- Llamando un Taglib...--}%
<mi:holaMundo matricula="2001-1136" nombre="Carlos Camacho"/>

</body>
</html>