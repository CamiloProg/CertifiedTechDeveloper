/* --------------------------- NO TOCAR DESDE ACÁ --------------------------- */
let datosPersona = {
  nombre: "",
  edad: 0,
  ciudad: "",
  interesPorJs: "",
};

const listado = [{
  imgUrl: "https://huguidugui.files.wordpress.com/2015/03/html1.png",
  lenguajes: "HTML y CSS",
  bimestre: "1er bimestre",
},
{
  imgUrl: "https://jherax.files.wordpress.com/2018/08/javascript_logo.png",
  lenguajes: "Javascript",
  bimestre: "2do bimestre",
},
{
  imgUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/React.svg/1200px-React.svg.png",
  lenguajes: "React JS",
  bimestre: "3er bimestre",
},
];

const profileBtn = document.querySelector("#completar-perfil");
const materiasBtn = document.querySelector("#obtener-materias");
const verMasBtn = document.querySelector("#ver-mas");
const cambiarTema = document.querySelector('#cambiar-tema');

profileBtn.addEventListener("click", renderizarDatosUsuario);
materiasBtn.addEventListener("click", recorrerListadoYRenderizarTarjetas);
cambiarTema.addEventListener("click", alternarColorTema);
/* --------------------------- NO TOCAR HASTA ACÁ --------------------------- */

function obtenerDatosDelUsuario() {
  /* --------------- PUNTO 1: Escribe tu codigo a partir de aqui --------------- */
  datosPersona.nombre = prompt("Ingrese su nombre:");
  datosPersona.anioNacimiento = parseInt(prompt("Ingrese su año de nacimiento:"));
  datosPersona.ciudad = prompt("Ingrese su ciudad:");
  datosPersona.interesPorJs = prompt("¿Le interesa Javascript? (Sí/No)").toLowerCase();


  let fechaActual = new Date();
  datosPersona.edad = fechaActual.getFullYear() - datosPersona.anioNacimiento;

  console.log(datosPersona); 
}

function renderizarDatosUsuario() {
  /* ------------------- NO TOCAR NI ELIMINAR ESTA FUNCION. ------------------- */
  obtenerDatosDelUsuario();
  /* --------------- PUNTO 2: Escribe tu codigo a partir de aqui --------------- */
  const nombreSpan = document.querySelector("#nombre");
  const edadSpan = document.querySelector("#edad");
  const ciudadSpan = document.querySelector("#ciudad");
  const javascriptSpan = document.querySelector("#javascript");

  nombreSpan.textContent = datosPersona.nombre;
  edadSpan.textContent = datosPersona.edad;
  ciudadSpan.textContent = datosPersona.ciudad;
  javascriptSpan.textContent = datosPersona.interesPorJs;
}

function recorrerListadoYRenderizarTarjetas() {
  /* ------------------ PUNTO 3: Escribe tu codigo desde aqui ------------------ */
  const fila = document.querySelector("#fila");

  listado.forEach((materia) => {
    const caja = document.createElement("div");
    caja.classList.add("caja");

    const img = document.createElement("img");
    img.src = materia.imgUrl;
    img.alt = "Logo de " + materia.lenguajes;
    caja.appendChild(img);

    const lenguajes = document.createElement("p");
    lenguajes.classList.add("lenguajes");
    lenguajes.textContent = materia.lenguajes;
    caja.appendChild(lenguajes);

    const bimestre = document.createElement("p");
    bimestre.classList.add("bimestre");
    bimestre.textContent = materia.bimestre;
    caja.appendChild(bimestre);

    fila.appendChild(caja);
  });


  const materiasBtn = document.querySelector("#obtener-materias");
  materiasBtn.disabled = true;
}

function alternarColorTema() {
  /* --------------------- PUNTO 4: Escribe tu codigo aqui --------------------- */
  const sitio = document.querySelector("#sitio");
  sitio.classList.toggle("dark");
}

/* --------------------- PUNTO 5: Escribe tu codigo aqui --------------------- */
const sobreMi = document.querySelector("#sobre-mi");

document.addEventListener("keydown", function (event) {
  if (event.key === "f" || event.key === "F") {
    sobreMi.classList.remove("oculto");
  }
});
