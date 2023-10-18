package generics;

public class ClasseGenerica<T> { //Primeiro essa sintaxe aqui: usamos < > para especificar o tipo de par�metro
    //Um objeto do tipo T � declarado
    T objeto;

    public ClasseGenerica(T objeto) {  //construtor
        this.objeto = objeto;
    }
    public T getObjeto() {
        return this.objeto;
    }

    public static void main(String[] args) {
        //Inst�ncia de um tipo Inteiro
        ClasseGenerica<Integer> objetoInteiro = new ClasseGenerica<Integer>(10);
        System.out.println("Objeto Inteiro: " + objetoInteiro.getObjeto());

        //Inst�ncia de um tipo String
        ClasseGenerica<String> objetoString = new ClasseGenerica<String>("Estruturas de Dados");
        System.out.println("Objeto String: " + objetoString.getObjeto());

    }
}
/*
    Par�metros em Java Generics
    ============================
    As conven��es de nomenclatura dos par�metros de tipo s�o importantes para aprender
    completamente os gen�ricos. Os par�metros de tipo comuns s�o os seguintes:

        T � Tipo
        E � Elemento
        K � Chave
        N � N�mero
        V � Valor

*/
