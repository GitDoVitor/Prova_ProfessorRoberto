# Prova_ProfessorRoberto
Prova Aplicada dia 24/mar

# EndPoints pra facilitar
  1. POST de Marca (http://localhost:8080/marcas)
    `{
  "marca": "FORD"
}`
  1. POST de Modelo (http://localhost:8080/modelos)
    `{
      "modelo": "KA"
    }`
  1. POST de Carro (http://localhost:8080/carros)
    `{
  "placa": "BDB6C56",
  "cor": 0,
  "status": 0,
  "diaria": 145.0,
  "marca": {
    "id": 2,
    "marca": "FORD"
  },
  "modelo": {
    "id": 2,
    "modelo": "KA"
  }
}`
  1. GET por Modelo(http://localhost:8080/carros/modelo/{modelo})
  1. GET por Marca(http://localhost:8080/carros/marca/{marca})
  1. GET por Placa(http://localhost:8080/carros/placa/{placa})
