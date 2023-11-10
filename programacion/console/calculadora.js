calcular(2, null, "suma")
calcular("a", 3, "resta")
calcular(5, 2.3, "multiplicacion")
calcular(20, 0, "division")
calcular()

function operacionSuma(num1, num2) {
    return num1 + num2;
}
function operacionResta(num1, num2) {
    return num1 - num2;
}
function operacionMultiplicacion(num1, num2) {
    return num1 * num2;
}
function operacionDivision(num1, num2) {
    return num1 / num2;
}

function calcular(num1, num2, operacion) {
    if (typeof num1 !== 'number' && num1 !== undefined || typeof num2 !== 'number' && num2 !== undefined) {
        console.log('Error: Ambos operandos deben ser números');
    } else {
        switch (operacion) {
            case "suma":
                console.log(operacionSuma(num1, num2));
                break;
            case "resta":
                console.log(operacionResta(num1, num2));
                break;
            case "multiplicacion":
                console.log(operacionMultiplicacion(num1, num2));
                break;
            case "division":
                if (num2 != 0) {
                    resultado = operacionDivision(num1, num2)
                } else {
                    console.log("División por cero no está permitida")
                    break;
                }
                break;
            default:
                console.log("No ingresaste ningun numero");
        }
    }
}

