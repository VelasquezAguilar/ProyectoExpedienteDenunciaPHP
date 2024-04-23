<?php

$ContendidoDatosInputs = file_get_contents('Entidades.json');
$Entidaes = json_decode($ContendidoDatosInputs, true);
$Entidaes[] = $_POST;
$Archivo = fopen('Entidaes.json', 'w');

fwrite($Archivo, json_encode($Entidaes));
fclose($Archivo);
echo '';
var_dump($Entidaes);
echo '';
//echo $Entidaes;

echo 'datos ingresados';


?>



<table>
    <thead>
        <tr>
            <th>Primer Nombre</th>
            <th>Primer Apellido</th>

        </tr>
    </thead>
    <tbody>
        <?php

        for($i = 0; $i <serialize($Entidaes); $i++) {
        echo '
        <h3>Nombre Completo</h3>
        <tr>
          <th>'.$Entidaes[$i]["ID"].'</th>
          <th>'.$Entidaes[$i]["PrimerNombre"].'</th>
          <th>'.$Entidaes[$i]["PrimerApellido"].'</th>
          <th>'.$Entidaes[$i]["SegundoApellido"].'</th>
          <th>'.$Entidaes[$i]["SegundoApellido"].'</th>
          <th>'.$Entidaes[$i]["Genero"].'</th>
          <th>'.$Entidaes[$i]["Edad"].'</th>



        </tr><br>

        <h3>Nombre Completo</h3>
        <tr>
        <th>'.$Entidaes[$i]["departamento"].'</th>
        <th>'.$Entidaes[$i]["municipio"].'</th>
        <th>'.$Entidaes[$i]["codigopostal"].'</th>
        <th>'.$Entidaes[$i]["aldea"].'</th>
        <th>'.$Entidaes[$i]["bloque"].'</th>
        <th>'.$Entidaes[$i]["numerocasa"].'</th>';
        }

            ?>
    </tbody>
</table>
