document.getElementById("loginForm").addEventListener("submit", function(event) {
    // Previene el envío del formulario por defecto
    event.preventDefault();
    // Redirige a la página deseada
    window.location.href = "desplega.html";
});