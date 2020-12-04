package com.company;
/* Classe qui hérite de la classe Personne
 *  doit donc définir la méthode abstraite travailler()
 * */
public class BenevoleAsso extends Personne {
    /*****************
 **** CONSTRUCTEUR(S) ****
     ****************/
    public BenevoleAsso() {
    }
    public BenevoleAsso(String name, int age) {
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
        return "je travaille mais l'argent ne m'intéresse pas";
    }
}
