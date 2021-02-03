// Note de programmme java 

//pour windows
// Chemin Path Java
// C:\Program Files\Java\jdk1.8.0_102\bin 
// Toutes Plateformes
// Compiler : javac AlgorithimiqueEtProgrammationEnJava2021B.java
// Executer : java Sinus

// Java sous Mac

/** La classe Sinus calcule et affiche sur la sortie standard
	le sinus d'un entier lu sur l'entrée standard */

/** Importation des bibliothèque - Import library */
// bibliotheques de méthodes d'entrée sortie
import java.io.*;
import java.lang.Object;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataInputStream;

class Sinus {
	public static void main(String[] args) throws IOException
	{
		// Déclarartion des variables objet de la méthodes principale - Declaration
		int x;
		Scanner scan = new Scanner(System.in);


		// Corps de la fonction- méthode pricipale de la classe principale - body function
		// Il existe un entier à lire sur l'entrée standard
		x = 3;
		x =  scan.nextInt();
		// un entier a été lu sur l'entrée standard,
		// placé en mémoire centrale et
		// l'identificateur de variable x permet de le désigner 
		System.out.println(Math.sin(x));
		// la valeur de sinus de x est écrite sur la sortie standard
	}
}	// Fin de classe Sinus pour mac

