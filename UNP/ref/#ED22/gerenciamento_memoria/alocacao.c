#include <stdio.h>
#include <stdlib.h>

int main() {
    int *ptr;
    ptr = (int *)malloc(5 * sizeof(int)); // Aloca��o de 5 inteiros (20 bytes)

    if (ptr == NULL) {
        printf("Falha na aloca��o de mem�ria.\\n");
        return 1;
    }
    //preencher ptr com valores
    for (int i = 0; i < 5; i++) {
        ptr[i] = i + 1;
    }

    //exibe
    for (int i = 0; i < 5; i++) {
        printf("%d ", ptr[i]);
    } printf("\n\n");


    // Realocar para 10 inteiros (40 bytes)
    ptr = (int *)realloc(ptr, 10 * sizeof(int));

    if (ptr == NULL) {
        printf("Falha na realoca��o de mem�ria.\\n");
        return 1;
    }

    // Uso do bloco de mem�ria realocado
    for (int i = 5; i < 10; i++) {
        ptr[i] = i + 1;
    }

    //exibe
    for (int i = 0; i < 10; i++) {
        printf("%d ", ptr[i]);
    }printf("\n\n");

    free(ptr); // Liberar a mem�ria quando n�o for mais necess�ria

    return 0;
}
