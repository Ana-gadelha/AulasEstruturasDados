#include <stdio.h>
#include <stdlib.h>
/*  Fun��o : Usando os operadores & e *
    Autor : Edkallenn  -  Data : 06/04/2012
    Observa��es: Exemplos de utiliza��o dos operadores de ponteiro
*/
main(){
    int a;      //a � um inteiro
    int *aPtr;  //aPtr � um ponteiro para um inteiro

    a = 7;
    aPtr=&a;    //aPtr recebe o endereco de a

    printf("\nO endereco de a eh: %p\n", &a);
    printf("O valor de aPtr eh: %p\n\n",aPtr );

    printf("O valor de a eh: %d\n", a);
    printf("O valor de *aPtr eh: %d\n\n", *aPtr);

    printf("Sabendo que * e & complementam-se mutuamente");
    printf(".\n&*aPtr= %p\n*&aPtr= %p\n", &*aPtr, *&aPtr);

	return 0;
}
