package gg.furia.knowyourfan.model

data class Usuario (
    val nome: String,
    val idade: Int,
    val email: String,
    val senha: String,
    val genero: String,
    val telefone: String,
    val dataNascimento: String,
    val cep: String,
    val endereco: String
)

val usuarioMock = Usuario(
    nome = "Renzo Luigi Cutrim de Lima Peluso",
    idade = 25,
    email = "william.henry.harrison@example-pet-store.com",
    senha = "123456",
    genero = "Masculino",
    telefone = "123456789",
    dataNascimento = "01/01/2000",
    cep = "12345678",
    endereco = "Rua dos Bobos, 0aaaaaaaaaaaaaaaaaaaa"
)