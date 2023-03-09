package com.example.Lombok.pojo;
import lombok.*;

@Data
public class Prod {
    /* attributs de classe encapsulés */
    @NonNull
    Long produitID;
    String marque;
    int prix;
}
