#include <stdio.h>
#include <stdlib.h>
//#include <math.h>    // necess�rio para sin()

int main()
{
  float y;  /*Declarando a vari�vel y   */
  y = sin(1.5);
  printf("Programa Besta do SENO\n");
  printf("y = %f\n\n",y);
  printf("");   //coment�rios de uma linha sao permitidos
  system("pause");
  return 0;
}
/*  O coment�rio pode conter mais de uma linha
    como neste exemplo. Coment�rios n�o tem a��o
    ou n�o geram nenhuma a��o por parte do compu-
    tador. Eles s�o ignorados pelo compilador.
    Servem para melhorar a legibilidade de programas
*/
