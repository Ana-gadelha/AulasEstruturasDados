#include <stdio.h>
#include <stdlib.h>
/*  Fun��o : Usando os operadores & e *
    Autor : Edkallenn  -  Data : 06/04/2012
    Observa��es: Exemplos de utiliza��o dos operadores de ponteiro
*/
main(){
    int a,b,c,*p;
    a = 2;
    p = &c;
    *p = 3;
    b = a + (*p);
    printf("\n %d \n", b);
    system("pause");

	return 0;
}
