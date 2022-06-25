package reverteTexto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o texto a ser invertido: ");
		String texto = read.next();
		
		byte[] textoEmArray = texto.getBytes();
		byte[] textoInvertido = new byte[textoEmArray.length];
		
		for (int i = 0; i < textoInvertido.length; i++) {
			textoInvertido[i] = textoEmArray[textoEmArray.length-i-1];
		}
		
		System.out.println("Texto invertido: " + new String(textoInvertido));
	}

}
