// Note de programmme java pour windows
// Chemin Path Java
// C:\Program Files\Java\jdk1.8.0_102\bin 
// 

/** La classe Sinus calcule et affiche sur la sortie standard
	le sinus d'un entier lu sur l'entrée standard */

/** Importation des bibliothèque - Import library */
import java.io.*;
class AlgorithmiqueEtProgrammationEnJava2021A {
	public static void main(String[] args) throws IOException
	{
		// Déclarartion des variables - Declaration
		int x;

		// Corps de la fonction- méthode pricipale de la classe principale - body function
		// Il existe un entier à lire sur l'entrée standard
		x = StdInput.readInInt();
		// un entier a été lu sur l'entrée standard,
		// placé en mémoire centrale et
		// l'identificateur de variable x permet de le désigner 
		System.out.println(Math.sin(x));
		// la valeur de sinus de x est écrite sur la sortie standard
	}
}	// Fin de classe Sinus