package com.example.Lombok.pojo;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE) /* attributs de classe encapsulés */
@AllArgsConstructor /* Constructeurs avec paramètres */
@NoArgsConstructor /* Constructeur sans paramètre */
@Data
@Builder
public class Product {
    /* attributs de classe encapsulés */
    @NonNull
    Long produitID;
    String marque;
    int prix;
}
