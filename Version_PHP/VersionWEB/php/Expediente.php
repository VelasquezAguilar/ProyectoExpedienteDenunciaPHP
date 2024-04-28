<?php

include_once("Delito.php");
class expediente{

    private $ListaDenunciantes;
    private $ListaDenunciados;
    private $ListaOfendidos;
    private $NumExpediente;
    private $objDelito;


// Para los objetos denunciante, denunciado y ofendido se implementa concepto de
    // agregacion
    // y para el objeto delito se implementa concepto de composicion.

    public function __construct($ListaDenunciantes, $ListaDenunciados, $ListaOfendidos, $NumExpediente,$departamento, $municipio, $colonia, $numeroBloque, $calle, $TipoDelito, $Descripcion){

        $this->ListaDenunciantes = $ListaDenunciantes;
        $this->ListaDenunciados = $ListaDenunciados;
        $this->ListaOfendidos = $ListaOfendidos;
        $this->NumExpediente = $NumExpediente;
        $this->objDelito = new Delito($departamento, $municipio, $colonia, $numeroBloque, $calle, $TipoDelito, $Descripcion);
    }

   //metodo para acceder a los objetos 
   public function getobjDelito(){
     return $this->objDelito;
   }
    public function getListaDenunciantes(){
        return $this->ListaDenunciantes;
    }
    public function getListaDenunciados(){
        return $this->ListaDenunciados;
    }
    public function getListaOfendidos(){
        return $this->ListaOfendidos;
    }
    public function getNumExpediente(){
        return $this->NumExpediente;
    }
    //setters
    public function setListaDenunciantes($ListaDenunciantes){
        $this->ListaDenunciantes = $ListaDenunciantes;
        return $this;
    }
    public function setListaDenunciados($ListaDenunciados){
        $this->ListaDenunciados = $ListaDenunciados;
        return $this;
    }
    public function setListaOfendidos($ListaOfendidos){
        $this->ListaOfendidos = $ListaOfendidos;
        return $this;
    }
    public function setNumExpediente($NumExpediente){
        $this->NumExpediente = $NumExpediente;
        return $this;
    }
    
   


}

?>
