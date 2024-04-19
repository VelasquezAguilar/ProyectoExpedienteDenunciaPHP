/*const expand_btn = document.querySelector(".expand-btn");

let activeIndex;

expand_btn.addEventListener("click", () => {
  //document.body.classList.toggle("collapsed");
  document.getElementById.toggle("collapsed");
});*/

//partede de controlador de l menu lateral izquierdo
const expand_btn = document.querySelector(".expand-btn");
const sidebar = document.querySelector(".sidebar");

expand_btn.addEventListener("click", () => {
  sidebar.classList.toggle("collapsed");
});

const current = window.location.href;

const allLinks = document.querySelectorAll(".sidebar-links a");

allLinks.forEach((elem) => {
  elem.addEventListener("click", function () {
    const hrefLinkClick = elem.href;

    allLinks.forEach((link) => {
      if (link.href == hrefLinkClick) {
        link.classList.add("active");
      } else {
        link.classList.remove("active");
      }
    });
  });
});

const searchInput = document.querySelector(".search__wrapper input");

searchInput.addEventListener("focus", (e) => {
  document.body.classList.remove("collapsed");
});




//contrlador para pantalla emergente cuando se dectecte un evento onclick sibre nuevo expediente, en le menu despelgable laterla izquierdo

  const linkContainer = document.querySelector(".tooltip.nuevoexpediente");
  var ventanaDenuncias = document.querySelector(".VentanaDenuncias");
  var contador =0;
  console.log("Inserta el HTML dentro del contenedor VentanaDenunciantes3");

  linkContainer.addEventListener("click", function() {
    
  if(contador== 0){
    ventanaDenuncias.classList.add('active');
    contador = 1;

    /*ventanaDenuncias.classList.add("active");*/

    const htmlToInsert = `
    
      <div class="navSuperiorObjetos">
  
        <div class="contenedorObjetos">
          Denuncainte
        </div>
  
        <div class="contenedorObjetos">
          Denunciado
        </div>
        <div class="contenedorObjetos">
          Ofendido
        </div>
        <div class="contenedorObjetos">
          Descripcion
        </div>
      </div>
  
  
      <div class="texOrientativo">
  
        Ingrese los datos de la persona quien realiza la denuncia
      </div>
  
      <div class="Id">
  
        ID:</div>
      <div class="intID">
        <input type="text" placeholder="Ingresar ID" class="full-width-input">
      </div>
  
  
      <div class="NombreCompleto">
        Nombre Completo:
      </div>
  
      <div class="molde PrimerNombre">
        <input type="text" placeholder="Ingresar primer nombre" class="full-width-input">
      </div>
      <div class="molde PrimerApellido">
        <input type="text" placeholder="Ingresar primer apellido" class="full-width-input">
      </div>
      <div class="moldeshort   genero">
        <input type="text" placeholder="Ingresar genero" class="full-width-input2">
        <div class="triangle-right"></div>
      </div>
  
      <div class="molde SegundoNombre">
        <input type="text" placeholder="Ingresar segundo nombre" class="full-width-input">
      </div>
      <div class="molde SegundoApellido">
        <input type="text" placeholder="Ingresar segundo apellido" class="full-width-input">
      </div>
      <div class="moldeshort   edad">
        <input type="text" placeholder="Ingresar genero" class="full-width-input">
      </div>
  
  
      <div class="Direccion">
        Direccion:
      </div>
  
      <div class="moldemidel Departamento">
        <input type="text" placeholder="Seleccione depto." class="full-width-input2">
        <div class="triangle-right"></div>
      </div>
      <div class="moldemidel Municipio">
        <input type="text" placeholder="seleccione mun." class="full-width-input2">
        <div class="triangle-right"></div>
      </div>
      <div class="moldeshort   Codigo">
        <input type="text" placeholder="Ingresar codigopostal" class="full-width-input">
      </div>
  
      <div class="moldemidel Aldea">
        <input type="text" placeholder="ingrese Aldea/Colonia" class="full-width-input2">
      </div>
      <div class="moldemidel Bloque">
        <input type="text" placeholder="ingrese numero bloque" class="full-width-input2">
      </div>
      <div class="moldeshort  NumCasa">
        <input type="text" placeholder="Ingresar numero de casa" class="full-width-input">
      </div>
  
  
  
      <div class="eventosbotones Siguiente">
        SIGUIENTE
      </div>
  
      <div class="eventosbotones Guardar activo">
        GUARDAR
      </div>
  
  
      <!--este boton solo aparecera cuando se preccione guardar-->
      <div class="eventosbotones Nuevo ">
        NUEVO
        <svg width="20" height="20" viewBox="0 0 50 50" xmlns="http://www.w3.org/2000/svg">
          <line x1="10" y1="25" x2="40" y2="25" stroke="white" stroke-width="2"/>
          <line x1="25" y1="10" x2="25" y2="40" stroke="white" stroke-width="2"/>
        </svg>
      </div>
  
    
  
    `;

    // Inserta el HTML dentro del contenedor VentanaDenuncias
    ventanaDenuncias.innerHTML = htmlToInsert;
    console.console.log("Inserta el HTML dentro del contenedor VentanaDenunciantes");
  } else {
    ventanaDenuncias.classList.remove('active');
    contador = 0;
  }


  });


