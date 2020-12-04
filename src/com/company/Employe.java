package com.company;

/* Classe qui hérite de la classe Personne
*  doit donc définir la méthode abstraite travailler()
*
* Classe qui implémente l'interface Payable (mot clé implements)
* doit donc implémeter la méthode toucherArgent()
* */
public class Employe extends Personne implements Payable{
    /*****************
 **** CONSTRUCTEUR(S) ****
     ****************/
    public Employe() { }

    public Employe(String name, int age) {
        super(name, age);
    }

    /*****************
     **** METHODS ****
     ****************/

/* Réécriture (Override) de la méthode travailler() définie comme abstract dans la classe parente et pour laquelle
 * on doit donner une définition, on doit expliquer ce que fait la méthode
 */
    @Override
    String travailler() {
        return "je suis un employé qui bosse";
    }

/* Réécriture(Override) de la méthode toucherArgent() présente dans l'interface Payable, méthode pour laquelle on doit
 * donner une définition, on doit expliquer ce que fait la méthode.
 * Il est obligatoire de donner une implémentation de toutes les méthodes contenues dans une interface qu'on souhaite
 * utiliser ( mot clé "implements")
 */
    @Override
    public String toucherArgent() {
        return "je veux mon salaire";
    }
}
