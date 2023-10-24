
// PRIMER EJERCICIO

let primera = 2
let segunda = 10
let tercera = 8

function tresParametros(valor1, valor2, valor3) {
  if (valor1 > valor2) {
    return valor2 * valor3
  } else if (valor2 % 2 === 0) {
    return valor2 + ' es par.'
  } else if ((valor1 + valor2 + valor3) % 3 === 0) {
    return 'la suma de ests tres numeros es multiplo de 3'
  }
}

tresParametros(primera, segunda, tercera)

// let resultado = tresParametros(primera, segunda, tercera);
// console.log(resultado);

//SEGUNDO EJERCICIO

const persona = {
  nombre: 'Juan',
  apellido: 'Martinez',
  edad: 21,
  esEmpleado: false
}

function evaluarEmpleado(persona) {
  if (persona.edad > 18 && persona.esEmpleado == true) {
    return persona.nombre + ' ' + persona.apellido + ' esta empleado y es mayor de edad.'
  } else if (persona.edad > 18 && persona.esEmpleado == false) {
    return persona.nombre + ' ' + persona.apellido + ' NO esta empleado y es mayor de edad.'
  }
  else if (persona.edad <= 18 && persona.esEmpleado == false) {
    return persona.nombre + ' ' + persona.apellido + ' NO esta empleado y NO es mayor de edad.'
  }

}
// const resultado = evaluarEmpleado(persona);

// console.log(resultado);

//TERCER EJERCICIO

let autos = [{
  marca: 'Toyota',
  anio: 2022,
  color: 'rojo'
},
{
  marca: 'Renault',
  anio: 2020,
  color: 'gris'
},
{
  marca: 'Peugeot',
  anio: 2021,
  color: 'rojo'
},
{
  marca: 'Fiat',

  anio: 2019,
  color: 'negro'
}]

let autosNuevos = []

autos.pop()

for (let i = 0; i < autos.length; i++) {
  if (autos[i].anio > 2019) {
    autosNuevos.push(autos[i])
  }
}

// console.log(autos, autosNuevos);
