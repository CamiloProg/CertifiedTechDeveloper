// const { generateText, validateInput, arrayProvincias, } = require("./util")

// describe('Happy path', () => {
//   test('deberia retornar Ok', () => {
//     expect(generateText("pedro", 25, "medio")).toBe(`Registro OK de ${student.name} en: ${student.level}.`)
//   })
//   test('deberia retornar muy mayor', () => {
//     expect(generateText("daniel", 70, "alto")).toEqual(`No pudimos registrar a: ${student.name}. Por favor contactá a soporte@dh.com para más información.`)
//   })
//   test('deberia retornar true', () => {
//     expect(validateInput('abc')).toStrictEqual(true)
//   })

// })
const dias = ['Domingo', 'lunes']
it('verificar que contenga la palabra domingo', () => {
  expect(arrayProvincias()).toContain('Domingo')
});


it('verificar que contenga la palabra domingo', () => {
  expect(dias).toContain('Domingo')
});

// describe('Not Happy path', () => {
//   test('deberia retornar false', () => {
//     expect(validateInput(' ')).toBe(false)
//   })
//   test('deberia retornar false', () => {
//     expect(validateInput(undefined)).toEqual(false)
//   })
//   test('deberia retornar edad no valido', () => {
//     expect(generateText("pedro", 17, "medio")).toStrictEqual(`Edad ingresada no válida. Por favor intentá nuevamente.`)
//   })
//   test('deberia retornar edad no valido', () => {
//     expect(generateText("daniel", 'a', "alto")).toEqual(`Edad ingresada no válida. Por favor intentá nuevamente.`)
//   })
// })
/*
Equipo 03
Liliana Muñoz Duque
Lorena Palacios Rios
Anyela Ruiz
Daniel Sanabria Rivera
Juan Camilo Martinez
Diego Quintero
*/
