<g:applyLayout name="plantillaBootStrap">
    <content tag="encabezado">
        <h1 class="h2">Zona Admin - Acceso Restringido....</h1>
    </content>

    <content tag="breadcrumb">
        <li class="active">
            <i class="fa fa-file"></i> Inicio
        </li>
    </content>

    <content tag="contenido">
        <div class="jumbotron">
            <h1>Zona Admin</h1>
            <p>Solo el usuario ${usuario.email}, que tiene el ROLE_ADMIN puede acceder...
            Si accedes con el usuario <strong>usuario</strong>, no puedes entrar...</p>
        </div>
    </content>


</g:applyLayout>