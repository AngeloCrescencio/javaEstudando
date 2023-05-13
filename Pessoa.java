public class Pessoa {

  // teste para ver se salva no git
  
  String nome;
  int idade;

  public Pessoa() {
  }

  public Pessoa(String nome, int idade) {
    super();
    this.nome = nome;
    this.idade = idade;
  }

  @Override
  public String toString() {
    return String.format("Meu nome é %s e eu tenho %s anos.", this.nome, this.idade);
  }
}
