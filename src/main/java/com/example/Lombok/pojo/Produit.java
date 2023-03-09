package com.example.Lombok.pojo;

import java.util.Objects;

public class Produit {
    /* attributs de classe encapsulés */
    private Long produitID;
    private String marque;
    private int prix;
    /* Constructeurs avec paramètres */
    public Produit(Long produitID, String marque, int prix) {
        this.produitID = produitID;
        this.marque = marque;
        this.prix = prix;
    }
    /* Constructeur sans paramètre */
    public Produit() {
    }
    /* Getter pour fournir l'accès aux attibuts encapsulés */
    public Long getProduitID() {
        return produitID;
    }
    public String getMarque() {
        return marque;
    }
    public int getPrix() {
        return prix;
    }
    /* Setter pour instancier les attributs encapsulés */
    public void setProduitID(Long produitID) {
        this.produitID = produitID;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public void setPrix(int prix) {
        this.prix = prix;
    }
    /* Méthode utilisée pour comparer sémantiquement des objets de type Produit */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produit produit)) return false;
        return getPrix() == produit.getPrix()
                && getProduitID().equals(produit.getProduitID())
                && getMarque().equals(produit.getMarque());
    }
/* Méthode utilisée pour renvoyer la valeur de hachage d'un objet Produit */
    @Override
    public int hashCode() {
        return Objects.hash(getProduitID(), getMarque(), getPrix());
    }
    /* Méthode pour afficher l'objet sous forme de chaine de caractère */
    @Override
    public String toString() {
        return "Produit{" +
                "produitID=" + produitID +
                ", marque='" + marque + '\'' +
                ", prix=" + prix + " euros" +
                '}';
    }
}

