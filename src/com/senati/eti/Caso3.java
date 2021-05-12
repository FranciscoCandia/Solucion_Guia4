package com.senati.eti;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer[] num = new Integer[5];
		for (int x=0; x<num.length; x++) {
			System.out.print("Número "+(x+1)+": ");
			num[x] = sc.nextInt();
		}
		//Forma ascendente
		Arrays.sort(num);
		System.out.println("Números en orden ascendente");
		System.out.println("---------------------------");
		for (int x=0; x<num.length; x++) {
			System.out.println("Número "+(x+1)+": "+num[x]);
			
		}
		//Forma descendente
		Arrays.sort(num, Collections.reverseOrder());
		System.out.println("\nNúmeros en orden descendente");
		System.out.println("----------------------------");
		for (int x=0; x<num.length; x++) {
			System.out.println("Número "+(x+1)+": "+num[x]);
		}
		
		
	}

}
