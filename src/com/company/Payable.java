package com.company;

/**
 * Une interface est une sorte de """""classe"""""" 100% abstraite :
 *          - L'interface est abstraite
 *
 *          - les méthodes de l'interface sont abstraites
 *
 *  il n'est pas donc pas utile de préciser le mot clé abstract car c'est obligatoirement le cas.
 *
 *
 * On déclare ici une interface qui obligera toutes les classes qui souhaitent l'utiliser, en utilisant
 * le mot clé implements, à redéfinir les fonctions listées dans cette interface.
 *
 *  On peut parler de contrat: la classe qui implémente l'interface s'engage à respecter le contrat de l'interface
 *  et donc à donner une définition, une explication de la façon dont fonctionne la ou les méthodes issues
 *  de l'interface.
 *
 *  Dans notre exemple ci-dessous, toutes les classes qui implémentent l'interface Payable doivent impérativement
 *  redéfinir, expliquer le fonctionnement de la méthode toucherArgent().
 *
 */

public interface Payable {

    String toucherArgent();
}
