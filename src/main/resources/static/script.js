
const boton = document.getElementById("boton");
const reiniciar = document.getElementById("reiniciar");
const contador = document.getElementById("contador");

function actualizarContador() {
    fetch("/api/contador")
        .then(response => response.json())
        .then(data => {
            contador.textContent = data.valor;
        });
}

boton.addEventListener("click", function() {

    fetch("/api/contador/incrementar", {
        method: "POST"
    })
    .then(response => response.json())
    .then(data => {
        contador.textContent = data.valor;
    });

});

reiniciar.addEventListener("click", function() {

    fetch("/api/contador/reiniciar", {
        method: "POST"
    })
    .then(response => response.json())
    .then(data => {
        contador.textContent = data.valor;
    });

});

actualizarContador();

