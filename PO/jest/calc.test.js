const { suma, division, multiplicacion, resta } = require("./calc")

const a = undefined;
test('Deberia sumar', () => {
  expect(suma(1, 2)).toStrictEqual(3)
})
test('Deberia restar', () => {
  expect(resta(2, 1)).toEqual(1)
})
test('Deberia dividir', () => {
  expect(division(6, 2)).toBe(3)
})
test('Deberia multiplicar', () => {
  expect(multiplicacion(2, 1)).toEqual(2)
})

test('Deberia dar 0 si no es numero', () => {
  expect(suma(a, 2)).toBe(0)
})
test('Deberia dar 0 si no es numeror', () => {
  expect(resta(2, 'b')).toStrictEqual(0)
})
test('Deberia dar 0 si no es numero', () => {
  expect(division('c', 2)).toEqual(0)
})
test('Deberia dar 0 si no es numero', () => {
  expect(multiplicacion(2, 'd')).toBe(0)
})
