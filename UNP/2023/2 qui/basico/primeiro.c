// ler um numero e exibir o quadrado desse numero

// tipos de dados básicos da ling. C
//  int, float, double, char
#include <stdio.h>

int main()
{
    // declara�?o de variaveis
    int numero, quadrado;
    // entrada
    printf("Digite um n�mero: ");
    scanf("%d", &numero);
    // processamento
    quadrado = numero * numero;
    // sa�da
    printf("O quadrado do n�mero �: %d", quadrado);
    return 0;
}