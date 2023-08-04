const prompt = require("prompt-sync")({ sigint: true });

let nombre = "Camilo";
let apellido;
let mes = "15";

nombre = prompt("ingrese su nombre: ");
mes = prompt("ingrese el mes: ");
console.log("nombre" + nombre);
console.log(mes);
