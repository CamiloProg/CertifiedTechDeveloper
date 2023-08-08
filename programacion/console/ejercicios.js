const prompt = require("prompt-sync")({ sigint: true });

function pulgadasCentimetros(pulgadas) {
  console.log(pulgadas * 2.56);
}

pulgadasCentimetros(parseInt(prompt("ingrese una medida en pulgadas: ")));

function stringUrl(nombre) {
  console.log(`http://www.${nombre}.com`);
}
stringUrl(prompt("Ingrese un nombre para su pagina web: "));

function admiracion(frase) {
  console.log(`¡${frase}!`);
}
admiracion(prompt("Ingrese una frase: "));

function edadPerro(edad) {
  console.log(`La edad del perro es: ${edad * 7}`);
}
edadPerro(parseInt(prompt("Ingresa tu edad: ")));

function horaTrabajo(sueldo) {
  console.log(sueldo / 40);
}
horaTrabajo(parseInt(prompt("Ingrese su sueldo mensual: ")));

function imc(a, b) {
  let res = a / (b * b);
  console.log("tu imc es de " + res);
}
let peso = parseFloat(prompt("dime tu peso en kilos: "));
let altura = parseFloat(prompt("dime tu altura en metros: "));
imc(peso, altura);

function mayusculas(frase) {
  console.log(frase.toUpperCase());
}
mayusculas(prompt("escribe una frase en minusculas: "));

function tipoDe(nombre) {
  console.log(typeof nombre);
}
tipoDe(true);

function circunferencia(radio) {
  console.log(2 * Math.PI * radio);
}
circunferencia(parseInt(prompt("Ingrese radio: ")));
