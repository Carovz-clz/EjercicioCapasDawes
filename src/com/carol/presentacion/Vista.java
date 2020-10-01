package com.carol.presentacion;

import java.io.IOException;
import java.util.Scanner;

import com.carol.negocio.LogicaNegocio;

public class Vista {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un nombre: ");
		String nombre = scan.next();
		
		//Llamar a la clase negocio
		LogicaNegocio logica = new LogicaNegocio();
		
		System.out.println("La persona "+nombre+" tiene "+logica.cuantosCoches(nombre)+" coches.");
	}

}
