package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*
        * Création des objets
        */
        Employe employe1        = new Employe("Robert", 59);
        Boss boss1              = new Boss("Jean-Jacques", 51);
        BenevoleAsso benevole1  = new BenevoleAsso("Marcel", 68);

        /*
         *  Création d'une liste "ArrayList" de type "Personne" dans laquelle nous pouvons ajouter tous les
         *  objets que nous avons instanciés plus haut.
         *  On peut en effet ajouter un "Employe", un "Boss" ou un "BenevoleAsso" dans un liste de type "Personne" car
         *  du fait de l'héritage, "Employe", "Boss" et "BenevoleAsso" sont aussi des "Personne"
         * (la classe "Personne" est la classe parente de ces 3 classes)
         */
        ArrayList<Personne> listPerson = new ArrayList<>();
        listPerson.add(employe1);
        listPerson.add(boss1);
        listPerson.add(benevole1);

        /*
         * On crée une boucle foreach pour parcourir notre liste "listPersonne"
         * Notre variable "personneDansArrayList" prendra à tour de rôle les différentes valeurs de la liste
         * ce qui veut dire pour notre exemple :
         * 1ère tour de boucle for : "personneDansArrayList" sera un "Employe employe1"
         * 2eme tour de boucle for : "personneDansArrayList" sera un "Boss boss1"
         * 3eme tour de boucle for : "personneDansArrayList" sera un "BenevoleAsso benevole1"
         *
         * Lorsque la méthode "travailler()" sera appelée depuis l'objet "personneDansArrayList" c'est la méthode
         * définie dans "Employe" pour le 1er tour de boucle puis dans "Boss" pour le 2eme et enfin dans "Bénevole"
         *  pour le 3eme qui sera utilisée
         */

        for(Personne personneDansArrayList : listPerson) {
            System.out.println("-----------------------");
            System.out.println(personneDansArrayList.hi());
            System.out.println(personneDansArrayList.travailler());
            System.out.println("-----------------------");


            /*
            *  Si on souhaite vérifier qu'un objet est d'un certain type de classe ou que la classe dont il est
            * une instance implémente une certaine interface, on peut effectuer un test grâce au mot clé "instanceof"
            *
            * L'exemple ci-dessous vérifie que "personneDansArrayList" est bien un instance de "Payable" c'est-à-dire
            * que la classe qui sert de référence à "personneDansArrayList" implémente bien "Payable".
            * Dans notre cas, les 2 premiers tours de boucle rentreront bien dans cette condition.
            *
            * En effet :
            *  1ère tour de boucle for : "personneDansArrayList" sera un "Employe employe1"
             * 2eme tour de boucle for : "personneDansArrayList" sera un "Boss boss1"
             * ==> ces 2 classes implémentent l'interface "Payable"
             *
             * En revanche, 3eme tour de boucle for : "personneDansArrayList" sera un "BenevoleAsso benevole1"
             * "BenevoleAsso" n'implémente pas l'interface, la condition est fausse, le code contenu dans la condtion
             * ne sera donc pas executé.
            */
            if (personneDansArrayList instanceof Payable) {
                System.out.println(((Payable) personneDansArrayList).toucherArgent());
            }
        }

            /*
            * Exemple de test pour vérifier que l'objet "boss1" est de type "Personne" c'est à dire qu'il est issu
            * d'une classe "Personne"
            * Comme "Personne" est la classe mère de la classe "Boss" dont "boss1" est un objet(une instance)
            * alors la conditione est vraie.
            *
            */
        if(boss1 instanceof Personne) {
            System.out.println("oui l'objet est du bon type");
        }
    }
}
