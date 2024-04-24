

<?php

class daProjects {

    public function insert($objDemandantes) {
        $postgreSQL = new PostgreSQL();
        
        try {
            $con = $postgreSQL->connectDatabase();
            $stmt = $con->prepare("INSERT INTO developer.demandante (id_demandante, nombre, apellido, edad) VALUES (?, ?, ?, ?)");

            foreach ($objDemandantes as $demandante) {
                $stmt->bindParam(1, $demandante->getid());
                $stmt->bindParam(2, $demandante->getNombre());
                $stmt->bindParam(3, $demandante->getApellido());
                $stmt->bindParam(4, $demandante->getEdad());
                $stmt->execute();
            }
        } catch (PDOException $ex) {
            echo $ex->getMessage();
        }
    }

    public function select() {
        $postgreSQL = new PostgreSQL();
        $query = "SELECT * FROM developer.demandante";

        try {
            $con = $postgreSQL->connectDatabase();
            $stmt = $con->prepare($query);
            $stmt->execute();

            while ($row = $stmt->fetch(PDO::FETCH_ASSOC)) {
                echo "project_id: " . $row['id_demandante'] . " | ";
                echo "name: " . $row['nombre'] . " | ";
                echo "created_at: " . $row['apellido'] . " | ";
                echo "project_edad: " . $row['edad'] . " | ";
                echo "<br>";
            }
        } catch (PDOException $ex) {
            echo $ex->getMessage();
        }
    }

    public function delete($id_demandante) {
        $postgreSQL = new PostgreSQL();
        $query = "DELETE FROM developer.demandante WHERE id_demandante = :id_demandante";

        try {
            $con = $postgreSQL->connectDatabase();
            $stmt = $con->prepare($query);
            $stmt->bindParam(':id_demandante', $id_demandante);
            $stmt->execute();
            echo "Registro eliminado exitosamente.";
        } catch (PDOException $ex) {
            echo "Error al eliminar el registro: " . $ex->getMessage();
        }
    }

    public function update($id_demandante, $nombre, $apellido, $edad) {
        $postgreSQL = new PostgreSQL();
        $query = "UPDATE developer.demandante SET nombre = :nombre, apellido = :apellido, edad = :edad WHERE id_demandante = :id_demandante";

        try {
            $con = $postgreSQL->connectDatabase();
            $stmt = $con->prepare($query);
            $stmt->bindParam(':nombre', $nombre);
            $stmt->bindParam(':apellido', $apellido);
            $stmt->bindParam(':edad', $edad);
            $stmt->bindParam(':id_demandante', $id_demandante);
            $stmt->execute();
            echo "Registro actualizado exitosamente.";
        } catch (PDOException $ex) {
            echo "Error al actualizar el registro: " . $ex->getMessage();
        }
    }
}

?>
