const prompt = require("prompt-sync")({ sigint: true });


let numeroUno = parseInt(prompt("Ingresa el número 1: "));
let numeroDos = parseInt(prompt("Ingresa el número 2: "));


console.log("1.Suma. 2. Resta 3. Multiplicación 4. División")
let operacionRealizar = prompt("Ingrese el número de Operación que desea realizar: ")
console.log(calcular(numeroUno, numeroDos, operacionRealizar));

function operacionSuma(numeroUno, numeroDos) {
  return numeroUno + numeroDos;
}

function calcular(a, b, operacionRealizar) {
  if (isNaN(a) || isNaN(b)) {
    return 'Error: Ambos operandos deben ser números';
  } else {


    if (operacionRealizar === 1) {
      console.log(operacionSuma(a, b));
    }

    if (operacionRealizar === 2) {
      function operacionResta(numeroUno, numeroDos) {
        return numeroUno - numeroDos;
      }
    }

    if (operacionRealizar === 3) {
      function operacionMultiplicacion(numeroUno, numeroDos) {
        return numeroUno * numeroDos;
      }
    }

    if (operacionRealizar === 4) {
      function operacionDivision(numeroUno, numeroDos) {
        return numeroUno / numeroDos;
      }
    }


  }
}


