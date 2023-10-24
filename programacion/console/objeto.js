const arrayCuentas =
    [
        {
            titular: "Arlene Barr",
            estaHabilitada: false,
            saldo: 3253.40,
            edadTitular: 33,
            tipoCuenta: "sueldo"
        },
        {
            titular: "Roslyn Torres",
            estaHabilitada: false,
            saldo: 3229.45,
            edadTitular: 27,
            tipoCuenta: "sueldo"
        },
        {
            titular: "Cleo Lopez",
            estaHabilitada: true,
            saldo: 1360.19,
            edadTitular: 34,
            tipoCuenta: "corriente"
        },
        {
            titular: "Daniel Malone",
            estaHabilitada: true,
            saldo: 3627.12,
            edadTitular: 30,
            tipoCuenta: "sueldo"
        },
        {
            titular: "Ethel Leon",
            estaHabilitada: true,
            saldo: 1616.52,
            edadTitular: 34,
            tipoCuenta: "sueldo"
        },
        {
            titular: "Harding Mitchell",
            estaHabilitada: true,
            saldo: 1408.68,
            edadTitular: 25,
            tipoCuenta: "corriente"
        }
    ]


function menoresDe30() {
    let respuesta = [];
    for (let i = 0; i < arrayCuentas.length; i++) {
        if (arrayCuentas[i].edadTitular < 30) {
            respuesta.push(arrayCuentas[i]);
        }
    }
    console.log(respuesta);
}

function mayoresDe30() {
    let respuesta = [];
    for (let i = 0; i < arrayCuentas.length; i++) {
        if (arrayCuentas[i].edadTitular >= 30) {
            respuesta.push(arrayCuentas[i]);
        }
    }
    console.log(respuesta);
}

function titularMasJoven() {
    let respuesta = arrayCuentas[0];
    let menorEdad = arrayCuentas[0].edadTitular;
    for (let i = 0; i < arrayCuentas.length; i++) {
        if (arrayCuentas[i].edadTitular < menorEdad) {
            respuesta = arrayCuentas[i];
            menorEdad = arrayCuentas[i].edadTitular;
        }
    }
    console.log(respuesta);
}

function cuentasHabilitadas() {
    let respuesta = [];
    for (let i = 0; i < arrayCuentas.length; i++) {
        if (arrayCuentas[i].estaHabilitada === true) {
            respuesta.push(arrayCuentas[i]);
        }
    }
    console.log(respuesta);
}

function menorSaldo() {
    let respuesta = arrayCuentas[0];
    let saldo = arrayCuentas[0].saldo;
    for (let i = 0; i < arrayCuentas.length; i++) {
        if (arrayCuentas[i].saldo < saldo) {
            respuesta = arrayCuentas[i];
            saldo = arrayCuentas[i].saldo;
        }
    }
    console.log(respuesta);
}

function generarID() {
    let id = 1;
    for (let i = 0; i < arrayCuentas.length; i++) {
        arrayCuentas[i].id = id++;
    }
    //console.log(arrayCuentas);
}

function buscarPorId(buscarId) {
    generarID();
    for (let i = 0; i < arrayCuentas.length; i++) {
        if (arrayCuentas[i].id === buscarId) {
            return arrayCuentas[i];
        }
    }
    return undefined;
}

function filtrarPorSaldos(saldo) {
    let respuesta = [];
    for (let i = 0; i < arrayCuentas.length; i++) {
        if (arrayCuentas[i].saldo < saldo) {
            respuesta.push(arrayCuentas[i]);
        }
    }
    console.log(respuesta);
}

function incrementarSaldo(id, saldo) {
    let cuenta = buscarPorId(id);
    if (cuenta === undefined) {
        console.log("CUENTA undefined");
        return;
    }
    cuenta.saldo += saldo
    console.log(cuenta);
}

