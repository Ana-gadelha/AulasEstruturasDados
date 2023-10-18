package EstruturasBasicas.EncadeadaPrimeiro;

public class Lista {
  No primeiro;
  No ultimo;
  int tamanho;

  public Lista() {
    this.tamanho = 0;
  }

  // M�todo para adicionar um elemento na lista
  public void adicionar(String info) {
    No novoNo = new No();
    novoNo.info = info;
    novoNo.proximo = null;

    if (primeiro == null) {
      primeiro = novoNo;
      ultimo = novoNo;
    } else {
      ultimo.proximo = novoNo;
      ultimo = novoNo;
    }

    tamanho++;
  }

  // M�todo para imprimir a lista
  public void imprimir() {
    No atual = primeiro;

    while (atual != null) {
      System.out.println(atual.info);
      atual = atual.proximo;
    }
  }
}
