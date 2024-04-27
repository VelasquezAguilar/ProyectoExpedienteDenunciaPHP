<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php

    include_once ('Persona.php');
    $objperosna = new Persona();
    $objDenunciante = new Persona();
    $objDenunciante->setPrimerNombre("Orlin");
    $objDenunciante->setPrimerApellido("Aguilar");

    echo "<h1>" . "Su primer nombre es :" . $objDenunciante->getPrimerNombre() . " " . ". Su primer apellido es: " . $objDenunciante->getPrimerApellido() . "</h1>"





        ?>


</body>

</html>

<?php 





?>