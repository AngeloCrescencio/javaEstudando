public class javaArrays {
  public static void main(final String[] args) {

    System.out.println("Arrays");

    // teste para ver se salva no git

    int[] notas;
    notas = new int[2];
    notas[0] = 9;
    notas[1] = 10;
    System.out.printf("Nota 1: %s, Nota2: %s\n", notas[0], notas[1]);

    final int[] valores = new int[5];
    valores[0] = 90;
    valores[1] = 100;
    valores[2] = 110;
    valores[3] = 120;
    for (int i = 0; i < valores.length; i++) {
      System.out.printf("Valor %s: %s\n", i, valores[i]);
    }

    final Pessoa[] arrayPessoas = new Pessoa[2];
    arrayPessoas[0] = new Pessoa();
    arrayPessoas[0].nome = "Angelo";
    arrayPessoas[0].idade = 53;
    arrayPessoas[1] = new Pessoa("Luiz", 51);
    for (final Pessoa pessoa : arrayPessoas) {
      System.out.println(pessoa.toString());
    }

  }
}
