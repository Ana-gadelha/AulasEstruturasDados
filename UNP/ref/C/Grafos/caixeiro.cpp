/*
*	Problema do Caixeiro Viajante em C
*	Utilizando uma matriz de dist�ncia para representar um grafo n�o direcionado.
*	Objetivo: Encontrar o menor caminho que passe por todos os v�rtices sem repetir nenhum, e chegar novamente ao v�rtice de in�cio
*
*                      6
*                 (4)-----(0)
*                 |  \    / \ 
*                 |   \ 3/   \2 
*                 |    \/     \ 
*                3|    /\     (1)
*                 |   / 3\   4/ |
*                 |  /    \  /  |
*                 (3)-----(2)   |
*                  |   7        | 
*                  |            | 3
*                  --------------
*
*
*   Matriz de Dist�ncia
*       0  1  2  3  4 
*    0  0  2  -  3  6
*    1  2  0  4  3  -
*    2  -  4  0  7  3
*    3  3  3  7  0  3
*    4  6  -  3  3  0
*
*
*/

#include <stdio.h>

#define VERTICES 5
#define INFINITO 429496729

int tempSolucao[VERTICES];
int melhorSolucao[VERTICES];
bool visitados[VERTICES];
int valorMelhorSolucao = INFINITO;
int valorSolucaoAtual = 0;

int matriz[VERTICES][VERTICES]  = {{         0,          2,   INFINITO, 3,          6 },
								  {          2,          0,          4, 3,   INFINITO },
								  {   INFINITO,          4,          0, 7,          3 },
								  {          3,          3,          7, 0,          3 },
								  {          6,   INFINITO,          3, 3,          0 }};

void caixeiroViajanteAux(int x){
	// Se o valor da solu��o atual j� estiver maior que o valor da melhor solu��o j� para, pois j� n�o pode mais ser a melhor solu��o
	if( valorSolucaoAtual > valorMelhorSolucao )
		return;

	if( x == VERTICES ){ // Se x == VERTICES significa que o vetor da solu��o tempor�ria est� completo
		int distancia = matriz[tempSolucao[x-1]][tempSolucao[0]];
		// Se encontrou uma solu��o melhor/menor
		if( distancia < INFINITO && valorSolucaoAtual + distancia < valorMelhorSolucao ){
			valorMelhorSolucao = valorSolucaoAtual + distancia; // Substitui a melhor solu��o pela melhor encontrada agora
			// Copia todo o vetor de solu��o tempor�ria para o vetor de melhor solu��o encontrada
			for (int i = 0; i < VERTICES; ++i){
				melhorSolucao[i] = tempSolucao[i];
			}
		}
		return;
	}

	int ultimo = tempSolucao[x-1]; // Ultimo recebe o n�mero do �ltimo v�rtice que se encontra na solu��o tempor�ria
	// For que percorre todas as colunas da matriz na linha do �ltimo v�rtice do vetor solu��o tempor�ria
	for (int i = 0; i < VERTICES; i++){
		// Se a posi��o i do vetor ainda n�o foi visitada, e se o valor da matriz na posi��o � menor que INFINITO
		if( visitados[i] == false && matriz[ultimo][i] < INFINITO ){
			visitados[i] = true; // Marca como visitado
			tempSolucao[x] = i; // Carrega o v�rtice que est� passando no vetor de solu��o tempor�ria
			valorSolucaoAtual += matriz[ultimo][i]; // Incrementa o valor da matriz na vari�vel que guarda o total do caminho percorrido
			caixeiroViajanteAux(x+1); // Chama recursivamente para o pr�ximo v�rtice
			valorSolucaoAtual -= matriz[ultimo][i]; // Se ainda n�o terminou, diminu� o valor da v�riavel que guarda o total da solu��o atual
			visitados[i] = false; // Seta como false a posi��o para poder ser utilizado por outro v�rtice
		}

	}

}

void caixeiroViajante(int inicial){
	visitados[inicial] = true; // Marca o primeiro v�rtice como visitado (0)
	tempSolucao[0] = inicial; // Coloca o v�rtice 0 na primeira posi��o do vetor de solu��o tempor�ria
	caixeiroViajanteAux(1); // Chama o m�todo auxiliar do caixeiro viajante
}

void iniciaVetores(){
	for (int i = 0; i < VERTICES; i++){
		visitados[i] = false;
		tempSolucao[i] = -1;
		melhorSolucao[i] = -1;
	}
}

int main(){

	iniciaVetores();
	caixeiroViajante(0);

	printf("Caminho m�nimo: %d\n", valorMelhorSolucao);
	for (int i = 0; i < VERTICES; i++){
		printf("%d, ", melhorSolucao[i]);
	}
	printf("\n\n");
}
