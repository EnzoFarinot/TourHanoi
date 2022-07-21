package fr.m2i;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) {
		
		Tour tour1 = new Tour(1);
		Tour tour2 = new Tour(2);
		Tour tour3 = new Tour(3);
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in)); 
		int n = 0;
		try { 
			System.out.println("Nombre de disques ? "); 
			n=Integer.parseInt(buff.readLine());	
		}catch(Exception err) {}
		
		initializeGame(tour1,n);
		
	}
	
	public static void initializeGame(Tour tour,int n) {
		/* 
		 * On remplit la tour 1 en rentrant les plus gros
		 *  disque en premier. 0 = la base de la pyramide et n son sommet
		 */
		for(int i = n; i >= 0 ; i--) {			
			tour.add(new Disque(i+1,tour.getId(),n-i));
		}
	}
}
