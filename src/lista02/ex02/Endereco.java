package lista02.ex02;

/*

2. Dando prosseguimento ao sistema de Clínica Médica, crie uma classe “Medico” e uma classe “Endereco”
com os atributos e métodos descritos abaixo e depois realize os passos definidos a seguir:

ATRIBUTOS DA CLASSE ENDERECO:
● rua, numero, complemento, bairro, cidade, uf, cep.
CONSTRUTOR DA CLASSE ENDERECO:
● Deve receber os parâmetros para iniciar os atributos: rua, numero, complemento, bairro, cidade,
uf, cep.

ATRIBUTOS DA CLASSE MÉDICO:
● codigo, nome, sexo, especialidade, endereco.
CONSTRUTOR DA CLASSE MÉDICO:
● Deve receber os parâmetros para iniciar os atributos: codigo, nome, sexo, especialidade,
endereco.

PASSOS:
1. Instanciar um objeto endereço com os dados de rua, número, complemento, bairro, cidade, uf
(invente essas informações).
2. Instanciar um objeto médico com os dados de código, nome, sexo e especialidade (invente essas
informações). O atributo endereco deve receber o objeto endereço que você criou no primeiro
passo 1.
3. Imprimir os dados dos dois objetos (acessando os atributos).
4. Modificar os dados do objeto médico e do objeto endereco (modificando os atributos).
5. Imprimir novamente os dados dos objetos (acessando os atributos).

*/

public class Endereco {
	String rua, complemento, bairro, cidade, uf, cep;
	int numero;

	public Endereco(String rua, int numero, String complemento, String bairro, String cidade, String uf, String cep) {
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}
	
	public String toString() {
		return  "\nDados do Endereço: " + 
				"\nRua: " + rua + 
				"\nNúmero: " + numero + 
				"\nComplemento: " + complemento + 
				"\nBairro: " + bairro + 
				"\nCidade: " + cidade + 
				"\nUF: " + uf + 
				"\nCEP: " + cep;
	}
}
