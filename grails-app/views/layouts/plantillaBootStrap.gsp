<%--
  Created by IntelliJ IDEA.
  User: vacax
  Date: 10/11/14
  Time: 10:28 PM
--%>

<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title><g:layoutTitle default="Aplicación Demostración en Grails"/></title>

    %{--
    Este bloque representa los recursos utilizados por defecto en el template, comentandolo
    con el objetivo de utilizar los asset-pipeline.
    --}%
    <!-- Bootstrap Core CSS -->
    %{--<link href="css/bootstrap.min.css" rel="stylesheet">--}%
    <!-- Custom CSS -->
    %{--<link href="css/sb-admin.css" rel="stylesheet">--}%
    <!-- Custom Fonts -->
    %{--<link href="font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">--}%

    %{--
    Llamando los recursos de una manera más comoda.
    --}%
   %{-- <asset:stylesheet src="principal.css"/>
    <asset:javascript src="principal.js" />--}%

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    %{----}%
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.3/css/bootstrap.min.css" >
    %{--Utilizando el plugin de assets--}%
    <asset:link rel="stylesheet" href="dashboard.css"/>

    %{----}%
    <g:layoutHead/>

    %{-- Para incluir otras recursos.--}%
    <g:pageProperty name="page.header"/>

</head>

<body>
<nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0">
    <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Demo Grails 3</a>
    <label style="color: white;">Bienvenido <strong><sec:username/></strong></label>
    <ul class="navbar-nav px-3">
        <li class="nav-item text-nowrap">
            %{--
                       Para acceder directamente al logout debe ser una llamada POST.
                       Puedo llamarlo desde un controlador, via el servicio de Spring.
                       --}%
            <form name="submitForm" method="POST" action="${createLink(controller: 'logout')}">
                <input type="hidden" name="" value="">
            </form>
            <a class="nav-link" href="javascript:document.submitForm.submit()">Log Out</a>
        </li>
    </ul>
</nav>

<div class="container-fluid">
    <div class="row">
        <nav class="col-md-2 d-none d-md-block bg-light sidebar">
            <div class="sidebar-sticky">
                <ul class="nav flex-column">
                    <li class="nav-item">
                        <g:link class="nav-link active" uri="/bootStrap" >
                            <span data-feather="home"></span>
                            Dashboard <span class="sr-only">(current)</span>
                        </g:link>
                    </li>
                    <li class="nav-item">
                        <g:link class="nav-link" controller="formularios" action="index" >
                            <span data-feather="file"></span>
                            Formularios
                        </g:link>
                    </li>
                    <li class="nav-item">
                        <g:link class="nav-link" controller="grupoAsignatura" action="index" >
                            <span data-feather="shopping-cart"></span>
                            Estudiante Scaffold
                        </g:link>
                    </li>
                    <li class="nav-item">
                        <g:link class="nav-link" controller="zonaAdmin" action="index" >
                            <span data-feather="users"></span>
                            Zona Seguridad
                        </g:link>
                    </li>
                    <li class="nav-item">
                        <g:link class="nav-link" controller="miControladorRest" action="pruebaChartGoogle" >
                            <span data-feather="bar-chart-2"></span>
                            Prueba Google Chart
                        </g:link>
                    </li>
                </ul>
                <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
                    <span>Otros Ejemplos</span>
                    <a class="d-flex align-items-center text-muted" href="#">
                        <span data-feather="plus-circle"></span>
                    </a>
                </h6>
                <ul class="nav flex-column mb-2">
                    <li class="nav-item">
                        <g:link class="nav-link" controller="estudiante" action="listarEstudiantesJson" >
                            <span data-feather="file-text"></span>
                            Render a JSON
                        </g:link>
                    </li>
                    <li class="nav-item">
                        <g:link class="nav-link" controller="estudiante" action="listarEstudiantesXml" >
                            <span data-feather="file-text"></span>
                            Render a XML
                        </g:link>
                    </li>
                    <li class="nav-item">
                        <g:link class="nav-link" controller="estudiante" action="consultaEstudiante" >
                            <span data-feather="file-text"></span>
                            Consultar Estudiante
                        </g:link>
                    </li>
                    <li class="nav-item">
                        <g:link class="nav-link" controller="estudiante" action="noEntraPorFiltro" >
                            <span data-feather="file-text"></span>
                            No Entrar Bloqueo
                        </g:link>
                    </li>
                </ul>
            </div>
        </nav>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
                <g:pageProperty name="page.encabezado">
                    <h1 class="h2">Dashboard</h1>
                </g:pageProperty>
            </div>

            <g:pageProperty name="page.contenido">

            </g:pageProperty>
            
        </main>
    </div>
</div>

%{--
Comentado el uso de JS directo y utilizandolo por el asset-pipeline
--}%
<!-- jQuery Version 1.11.0 -->
%{--<script src="js/jquery-1.11.0.js"></script>--}%

<!-- Bootstrap Core JavaScript -->
%{--<script src="js/bootstrap.min.js"></script>--}%

<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="/webjars/jquery/3.0.0/jquery.min.js" ></script>
<script src="/webjars/popper.js/1.14.3/popper.min.js"></script>
<script src="/webjars/bootstrap/4.1.3/js/bootstrap.min.js" ></script>

</body>
</html>