# exemplo de uma classe pessoa em python
class Pessoa:

    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def get_nome(self):
        return self.nome

    def get_idade(self):
        return self.idade

    def set_nome(self, nome):
        self.nome = nome

    def set_idade(self, idade):
        self.idade = idade

    def __str__(self):
        return 'Nome: ' + self.nome + ' Idade: ' + str(self.idade)


# uso da classe pessoa
pessoa = Pessoa('João', 20)
print(pessoa)
print(pessoa.get_nome())
print(pessoa.get_idade())
pessoa.set_nome('Maria')
pessoa.set_idade(30)
