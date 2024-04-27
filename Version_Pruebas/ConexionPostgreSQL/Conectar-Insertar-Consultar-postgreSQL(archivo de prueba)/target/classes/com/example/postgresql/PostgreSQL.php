

<?php

class PostgreSQL {
    
    private $bundle;

    public function __construct() {
        $this->bundle = parse_ini_file("PostgreSQL.properties");
    }

    public function connectDatabase() {
        $host = $this->bundle['host'];
        $port = $this->bundle['port'];
        $database = $this->bundle['database'];
        $user = $this->bundle['user'];
        $password = $this->bundle['password'];

        return $this->cnx($host, $port, $database, $user, $password);
    }

    private function cnx($host, $port, $database, $user, $password) {
        $url = "";
        try {
            // Registrar el driver de PostgresSQL
            try {
                $pdo = new PDO("pgsql:host=$host;port=$port;dbname=$database", $user, $password);
            } catch (PDOException $e) {
                die("Error al conectar con la base de datos de PostgreSQL: " . $e->getMessage());
            }

            // Conexión exitosa
            echo "Éxito al conectar con la base de datos de PostgreSQL ($url)";

            return $pdo;
        } catch (PDOException $e) {
            die("Error al conectar con la base de datos de PostgreSQL ($url): " . $e->getMessage());
        }
    }
}

?>
