package com.senati.eti;

import java.util.Arrays;

public class Caso1 {

	public static void main(String[] args) {
		String[] nombre= new String[4];
		
		nombre[0]="Joe Castillo";
		nombre[1]="Carol Mora";
		nombre[2]="Ricardo Vásquez";
		nombre[3]="Rosa Martinez";
		//Forma 1
		System.out.println("FORMA 1");
		System.out.println("-------");
		System.out.println(Arrays.toString(nombre));
		
		//Forma 2
		System.out.println("\nFORMA 2");
		System.out.println("-------");
		for (int i=0; i<=3; i++)
			System.out.println("Nombre "+(i+1)+": "+nombre[i]);
		
		//Forma 3
		System.out.println("\nFORMA 3");
		System.out.println("-------");
		int n=1;
		for (String v: nombre) {
			System.out.println("Nombre "+ n +": "+ v);
			n++;
		}
	}

}
