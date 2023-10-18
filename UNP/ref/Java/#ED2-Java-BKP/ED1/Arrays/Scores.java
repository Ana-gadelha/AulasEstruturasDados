package ED1.Arrays;

public class Scores {

    public static final int maximoEntradas = 10;    //quantidade de escores que ser�o armazenados
    protected int numEntradas;                      //n�mero real de registros
    protected EntradaJogo[] placares;

    public Scores() {
        placares = new EntradaJogo[maximoEntradas];
        numEntradas = 0;
    }
    public String toString(){
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < numEntradas; i++) {
            if(i>0) s.append(", ");
            s.append(placares[i]);
        }
        return s + "]";
    }


}
