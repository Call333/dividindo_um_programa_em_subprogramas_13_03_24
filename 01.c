#include <stdio.h>

void somar(float a, float b) {
    float resultado = a + b;
    printf("Resultado: %.2f\n", resultado);
}

void subtrair(float a, float b) {
    float resultado = a - b;
    printf("Resultado: %.2f\n", resultado);
}

void multiplicar(float a, float b) {
    float resultado = a * b;
    printf("Resultado: %.2f\n", resultado);
}

void dividir(float a, float b){
    if (b != 0) {
    	float resultado = a / b;
    	printf("Resultado: %.2f\n", resultado);
    } else {
    	printf("Erro! Divisão por zero.\n");
	}
}

int main() {
	char operador;
	float num1, num2;
	printf("Digite a operação (+, -, *, /): ");
	scanf("%c", &operador);
	printf("Digite o primeiro número: ");
	scanf("%f", &num1);
	printf("Digite o segundo número: ");
	scanf("%f", &num2);
	switch (operador) {
    	case '+':
        	somar(num1, num2);
        	break;
    	case '-':
        	subtrair(num1, num2);
        	break;
    	case '*':
        	multiplicar(num1, num2);
        	break;
    	case '/':
        	dividir(num1, num2);
        	break;
    	default:
        	printf("Operador inválido.\n");
	}
	return 0;
}