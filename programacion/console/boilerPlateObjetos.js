//la lista de clientes.
let arrayCuentas = [
  {
    nroCuenta: 5486273622,
    tipoDeCuenta: "Cuenta Corriente",
    saldoEnPesos: 27771,
    titularCuenta: "Abigael Natte",
  },
  {
    nroCuenta: 1183971869,
    tipoDeCuenta: "Caja de Ahorro",
    saldoEnPesos: 8675,
    titularCuenta: "Ramon Connell",
  },
  {
    nroCuenta: 9582019689,
    tipoDeCuenta: "Caja de Ahorro",
    saldoEnPesos: 27363,
    titularCuenta: "Jarret Lafuente",
  },
  {
    nroCuenta: 1761924656,
    tipoDeCuenta: "Cuenta Corriente",
    saldoEnPesos: 32415,
    titularCuenta: "Ansel Ardley",
  },
  {
    nroCuenta: 7401971607,
    tipoDeCuenta: "Cuenta Unica",
    saldoEnPesos: 18789,
    titularCuenta: "Jacki Shurmer",
  },
];

let banco = {
  clientes: arrayCuentas,

  consultarClientes: function (titular) {
    let cuenta = this.clientes.find(c => c.titularCuenta === titular);
    if (cuenta) {
      console.log(cuenta);
    } else {
      console.log("No se encontró el cliente");
    }
  },

  deposito: function (titular, cantDinero) {
    let cuenta = this.clientes.find(c => c.titularCuenta === titular);
    if (cuenta) {
      cuenta.saldoEnPesos = cuenta.saldoEnPesos + cantDinero
      console.log(cuenta);
    } else {
      console.log("No se encontró el cliente");
    }
  },
  extraccion: function (titular, cantDinero) {
    let cuenta = this.clientes.find(c => c.titularCuenta === titular);
    if (cuenta) {
      cuenta.saldoEnPesos = cuenta.saldoEnPesos - cantDinero

      if (cuenta.saldoEnPesos > 0) {
        console.log(cuenta);
      } else {
        console.log("saldo insuficiente");

      }

    } else {
      console.log("No se encontró el cliente");
    }
  }

}

// console.log(banco.consultarClientes('Ansel Ardley'))
console.log(banco.extraccion('Ansel Ardley', 850));
