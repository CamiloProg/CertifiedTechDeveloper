
/* 1. Crear una función que reciba el array por parámetro 
y retorne un nuevo array con los autos cuyo modelo
 sea mayor o igual a 2020.
*/

let autos = [{
  marca: 'Toyota',
  anio: 2022,
  color: 'rojo'
},
{
  marca: 'Renault',
  anio: 2015,
  color: 'gris'
},
{
  marca: 'Peugeot',
  anio: 2017,
  color: 'rojo'
},
{
  marca: 'Fiat',
  anio: 2020,
  color: 'negro'
}]

let autosNuevos = []

for (let i = 0; i < autos.length; i++) {
  if (autos[i].anio >= 2020) {
    autosNuevos.push(autos[i])
  }
}
console.log(autosNuevos, 'Autos con anio mayor a...');

// ----------------------------------------------------------------------------------------

/* 2. 
●	Crear una función llamada bubbleSort que reciba como parámetros el array y
un string que represente el sentido de ordenamiento, la función 
deberá realizar un ordenamiento interno del array según el orden indicado 
●	“ASC” lo ordenará ascendente
●	“DESC” lo ordenará descendente
 */

function bubbleSort(array, sentido) {
  const n = array.length;

  for (let i = 0; i < n - 1; i++) {
    for (let j = 0; j < n - i - 1; j++) {
      if ((sentido === "ASC" && array[j] > array[j + 1]) ||
        (sentido === "DESC" && array[j] < array[j + 1])) {
        let temporal = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temporal;
      }
    }
  }
}

let arrayDeNumeros = [10, 22, 3, 8, 9, 104, 5, 6, 7, 15];

console.log(arrayDeNumeros, 'Array original');
bubbleSort(arrayDeNumeros, "ASC");
console.log(arrayDeNumeros, 'Array ascendiente');

bubbleSort(arrayDeNumeros, "DESC");
console.log(arrayDeNumeros, 'Array descendiente');

// ----------------------------------------------------------------------------------------

/* 3.a)	Crear una función que reciba por parámetros la
 matriz y la posición de una columna determinada.
La función debe retornar un arreglo con todos los 
elementos de esa columna.
*/

let matrix = [
  [1, 4, 7, 4],
  [5, 7, 6, 2],
  [6, 2, 3, 3],
  [2, 6, 8, 1],
];

function elementosColumnaObtenidos(matriz, columna) {
  let elementosColumna = [];
  for (let i = 0; i < matriz.length; i++) {
    elementosColumna.push(matriz[i][columna]);
  }
  return elementosColumna;
}


/* 3.b)Crear una función que reciba por parámetro la
 matriz y cambie todos los elementos impares de la
  matriz por un número 0 (cero) 
*/

function cambiarImparesPorCeros(matriz) {
  for (let i = 0; i < matriz.length; i++) {
    for (let j = 0; j < matriz[i].length; j++) {
      if (matriz[i][j] % 2 !== 0) {
        matriz[i][j] = 0;
      }
    }
  }
}


let elementosColumna = elementosColumnaObtenidos(matrix, 3);
console.log(elementosColumna, 'Numeros de la columna escogida');

cambiarImparesPorCeros(matrix);
console.log(matrix, 'Matrix con numeros impares como 0');
