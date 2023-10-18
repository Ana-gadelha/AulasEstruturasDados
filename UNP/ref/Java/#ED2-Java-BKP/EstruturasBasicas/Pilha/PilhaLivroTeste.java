package EstruturasBasicas.Pilha;

import java.util.EmptyStackException;

// Defini��o do TAD Pilha
public class PilhaLivroTeste<T> {
    private Celula<T> top;

    // Defini��o da estrutura do n� da pilha
    private static class Celula<T> {
        private T info;
        private Celula<T> proximo;

        public Celula(T info) {
            this.info = info;
        }
    }

    // Opera��o para verificar se a pilha est� vazia
    public boolean estaVazia() {
        return top == null;
    }

    // Opera��o para adicionar um elemento no topo da pilha
    public void push(T info) {
        Celula<T> novaCelula = new Celula<T>(info);
        novaCelula.proximo = top;
        top = novaCelula;
    }

    // Opera��o para remover e retornar o elemento no topo da pilha
    public T pop() {
        if (estaVazia()) {
            throw new EmptyStackException();
        }
        T info = top.info;
        top = top.proximo;
        return info;
    }

    // Opera��o para consultar o elemento no topo da pilha
    public T peek() {
        if (estaVazia()) {
            throw new EmptyStackException();
        }
        return top.info;
    }

    public static void main(String[] args) {
        PilhaLivroTeste<Integer> Pilha = new PilhaLivroTeste<Integer>();

        Pilha.push(3);
        Pilha.push(5);
        Pilha.push(7);

        System.out.println("Pilha: ");
        while (!Pilha.estaVazia()) {
            System.out.println(Pilha.pop());
        }
    }
}

