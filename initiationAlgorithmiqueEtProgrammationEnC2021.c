// Note de compilation
// gcc initiationAlgorithmiqueEtProgrammationEnC2021.c -o initiationAlgorithmiqueEtProgrammationEnC2021
// Annexe A
// A.2.3
// $ gcc exercice1.c -o exercice1
// $ ./exercice1 



// Importation des bibliotheques
#include <stdio.h>

//Déclaration des constantes
//
// Déclaration des fonctions


// Fonction principale
int main(void)			/*	programme principal	*/
{
	// Déclaration des variables de la fonction - declaration computer variable of main function
	float x;				/*	déclaration d'une variable x (nombre réel) */

	// Initialisation des variables - initialization computer variable
	x = 1.1;

	// Corps de la fonction principale - body main function
	
	/* code */
	// Exemple 2.2
	printf("Bonjour !\n");	/*	écriture à l'écran	*/
	
	// Exemple 2.3
	printf("Veuillez entrer un nombre réel au clavier \n");
	scanf("%f", &x);	/* lecture au clavier de la valeur de x */
	/* affichage de x : */
	printf("Vous avez tapé %f, félicitations !\n", x);

	// Retour de la fonction principale programme - return main fonction
	printf("Retour de la fonction principale - fin du programme initiationAlgorithmiqueEtProgrammationEnC2021 \n");

	
	return 0;
}
