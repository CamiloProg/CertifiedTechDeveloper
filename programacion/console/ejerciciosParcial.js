function totalAPagar(vehiculo, litrosConsumidos) {
  let pagarExtra;

  if (litrosConsumidos < 25) {
    pagarExtra = 50;
  } else {
    pagarExtra = 25;
  }

  if (vehiculo == "moto") {
    return console.log(litrosConsumidos * 70 + pagarExtra);
  }
  if (vehiculo == "carro") {
    return console.log(litrosConsumidos * 86 + pagarExtra);
  }
  if (vehiculo == "autobus") {
    return console.log(litrosConsumidos * 55 + pagarExtra);
  }
  return console.log("ingrese un valor correcto");
}

let vehiculo = "carro";
let litrosConsumidos = 26;
totalAPagar(vehiculo, litrosConsumidos);
