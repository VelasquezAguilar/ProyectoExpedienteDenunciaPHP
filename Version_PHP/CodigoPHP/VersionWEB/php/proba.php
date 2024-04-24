<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
     include_once ("conexionPosgres.php");

     // Crear una instancia de la clase conexionPosgres
     $conexion = new conexionPosgres();

     // Llamar al método conexionbase en la instancia creada
     $conexion->conexionbase();  

     //conexionPosgres::conexionbase();

    
    
    
    
    
    ?>
    

</body>
</html>