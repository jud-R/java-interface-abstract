package com.company;

/* Classe abstraite car :
 *       - on a défini une méthode abstraite travailler() ==> si une classe possède une méthode abstract alors
 *          la classe doit être abstract
 *       - dans tous les cas cette classe aurait été abstract car on ne souhaite pas que soit instancié
 *           un objet "Personne"
 *          (Personne myPerson = new Personne() => pas de sens, trop abstrait / vague comme représentation
*/
public abstract class Personne {

    /*****************
     **** ATTRIBUT(S) ****
     ****************/
    protected String name;
    protected int age;

    /*****************
 **** CONSTRUCTEUR(S) ****
     ****************/
    public Personne() { }

    public Personne(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*****************
 **** GETTER(S) and SETTER(S) ****
     ****************/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*****************
     **** METHODS ****
     ****************/
    protected String hi() {
        return "Salut, je m'appelle " + this.name + " ,j'ai " + this.age + " ans et je suis un "
                + this.getClass().getSimpleName().toLowerCase();
    }

    /*****************
 **** METHODS abstract ****
     ****************/
    abstract String travailler();

}
