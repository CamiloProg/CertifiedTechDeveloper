
/* Ejercicio 1
Crear una función que reciba como parámetro él array de países, un continente, y un número de población.
La misma debe retornar un nuevo array solo con los países que sean del continente pasado por parámetro, y además, que su población sea menor o igual a la del parámetro.
Si no encuentra coincidencias deberá retornar un array vacío

*/

let paises = [
  {
    nombre: "Argentina",
    continente: "Sudamérica",
    poblacion: 40000
  },
  {
    nombre: "Colombia",
    continente: "Sudamérica",
    poblacion: 50372
  },

  {
    nombre: "Brasil",
    continente: "Sudamérica",
    poblacion: 300000
  },
  {
    nombre: "Etiopía",
    continente: "África",
    poblacion: 15000
  },
  {
    nombre: "Chile",
    continente: "Sudamérica",
    poblacion: 10000
  }
];

function filtrarPaisesPorPoblacion(paises, continente, poblacionMaxima) {

  const paisesFiltrados = paises.filter(pais => {
    return pais.continente === continente && pais.poblacion <= poblacionMaxima;
  });

  return paisesFiltrados;
}

const resultadoFiltrado = filtrarPaisesPorPoblacion(paises, "Sudamérica", 50000);
console.log(resultadoFiltrado);

// ----------------------------------------------------------------------------------------

/* Ejercicio 2

Crear una función llamada bubbleSort que reciba como parámetros el array deberá realizar un ordenamiento ascendente, es decir, de menor a mayor	
Para analizar el correcto funcionamiento imprimir por consola el array antes y después de ejecutar la función. 

 */
function bubbleSort(array) {
  const n = array.length;


  for (let i = 0; i < n - 1; i++) {

    for (let j = 0; j < n - i - 1; j++) {
      if (array[j] > array[j + 1]) {

        const temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
      }
    }
  }
}

let arrayDeNumeros = [1, 2, 3, 8, 9, 104, 5, 6, 7, 15];

console.log("Array antes de ordenar:", arrayDeNumeros);
bubbleSort(arrayDeNumeros);
console.log("Array después de ordenar:", arrayDeNumeros);

// ----------------------------------------------------------------------------------------

/* 3.a)	Crear una función que reciba la matriz por parámetro,
 sume todos los valores de diagonal principal  y retorne la suma.

*/

let matriz = [
  [5, 2, 2], // 0
  [2, 5, 2], // 1
  [4, 4, 5]  // 2
];


function sumaDiagonalPrincipal(matriz) {
  let suma = 0;
  for (let i = 0; i < matriz.length; i++) {
    suma += matriz[i][i];
  }
  return suma;
}

console.log("Suma de la diagonal principal:", sumaDiagonalPrincipal(matriz));



/* 3.b)Crear una función que reciba la matriz  por parámetro 
y retorne un nuevo array con todos los valores pares de la matriz.

*/

function valoresPares(matriz) {
  const pares = [];
  for (let i = 0; i < matriz.length; i++) {
    for (let j = 0; j < matriz[i].length; j++) {
      if (matriz[i][j] % 2 === 0) {
        pares.push(matriz[i][j]);
      }
    }
  }
  return pares;
}
console.log("Valores pares de la matriz:", valoresPares(matriz));
