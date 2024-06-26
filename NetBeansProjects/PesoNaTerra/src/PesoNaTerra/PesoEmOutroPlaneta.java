package Treino;
import java.util.Scanner;

public class PesoEmOutroPlaneta {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite seu peso na terra:");
	double pesoTerra = scanner.nextDouble();
		
	System.out.println("Escolha um planeta para saber seu peso:");
	System.out.println("1. Mercurio\n2. Vênus\n3. Marte\n4. Jupiter\n5. Saturno\n6. Urano\n7. Netuno");
	System.out.println("Digite o número correspondente ao planeta desejado:");
	
	int escolha = scanner.nextInt();
	
	double fatorConversao = 0;
		
	switch(escolha) {
	case 1:
		fatorConversao = 0.38;
		System.out.println("Seu peso em Mercurio é " + (pesoTerra * fatorConversao) + "kg.");
		break;
	case 2:
		fatorConversao = 0.91;
		System.out.println("Seu peso em Vênus é " + (pesoTerra * fatorConversao) + "kg.");
		break;
	case 3:
		fatorConversao = 0.38;
		System.out.println("Seu peso em Marte é " + (pesoTerra * fatorConversao) + "kg.");
		break;
	case 4:
		fatorConversao = 2.36;
		System.out.println("Seu peso em Jupiter é " + (pesoTerra * fatorConversao) + "kg.");
		break;
	case 5:
		fatorConversao = 0.92;
		System.out.println("Seu peso em Saturno é " + (pesoTerra * fatorConversao) + "kg.");
		break;
	case 6:
		fatorConversao = 0.89;
		System.out.println("Seu peso em Urano é " + (pesoTerra * fatorConversao) + "kg.");
		break;
	case 7:
		fatorConversao = 1.13;
		System.out.println("Seu peso em Netuno é " + (pesoTerra * fatorConversao) + "kg.");
		break;}
	
	}
}
