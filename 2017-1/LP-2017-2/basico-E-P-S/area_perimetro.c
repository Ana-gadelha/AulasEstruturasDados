#include <stdio.h>>

int main(){
	
	float base, altura, perimetro, area;   //declara��o de vari�veis
	
	//Entrada
	printf("Digite a base do ret�ngulo: ");   
	scanf(" %f", &base);
	printf("Digite a altura do ret�ngulo: ");   
	scanf(" %f", &altura);
	//Processamento
	perimetro = (2*base) + (2*altura);
	area = base * altura;	
	//Sa�da
	printf("A area do retangulo = %f\n", area);  
	printf("O perimetro do retangulo = %f\n", perimetro);
	
	getchar();
	return 0;
}
