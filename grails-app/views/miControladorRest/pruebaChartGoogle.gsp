<%--
  Created by IntelliJ IDEA.
  User: vacax
  Date: 10/18/14
  Time: 10:26 PM
--%>

<g:applyLayout name="plantillaBootStrap">

    <content tag="header">
        %{-- Importando la libreria Google--}%
        <gvisualization:apiImport/>


    </content>

    <content tag="encabezado">
        <h1 class="h2">Ejemplo del Plugins de Google Chart</h1>
    </content>

    <content tag="breadcrumb">
        <li class="active">
            <i class="fa fa-file"></i> Google Charts
        </li>
    </content>

    <content tag="contenido">
        <gvisualization:pieCoreChart elementId="piechart" title="My Daily Activities" width="${500}" height="${500}"
                                      columns="${myDailyActivitiesColumns}" data="${myDailyActivitiesData}" />
        <div id="piechart"></div>
    </content>


</g:applyLayout>