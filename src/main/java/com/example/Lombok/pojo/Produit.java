package com.example.Lombok.pojo;

import lombok.*;
import lombok.experimental.FieldDefaults;
@FieldDefaults(level = AccessLevel.PRIVATE) /* attributs de classe encapsulés */
@AllArgsConstructor /* Constructeurs avec paramètres */
@NoArgsConstructor /* Constructeur sans paramètre */
@Getter /* Getter pour fournir l'accès aux attibuts encapsulés */
@Setter /* Setter pour instancier les attributs encapsulés */
/*
  Méthode utilisée pour comparer sémantiquement des objets de type Produit
  Méthode utilisée pour renvoyer la valeur de hachage d'un objet Produit
 */
@EqualsAndHashCode(of = {"produitID", "marque", "prix"})
@ToString(of = {"produitID", "marque", "prix"}) /* Méthode pour afficher l'objet sous forme de chaine de caractère */
public class Produit {
    /* attributs de classe encapsulés */
    @NonNull
    Long produitID;
    String marque;
    int prix;
}