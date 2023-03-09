package com.example.Lombok;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Lombok.pojo.Produit;

@SpringBootApplication
public class LombokApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LombokApplication.class, args);
	}

	@Override
    public void run(String... args) throws Exception {
        System.out.println("\nMéthodes standards sur Produit Samsung");
        Produit samsung = new Produit(1L, "Samsung S21 Ultra", 700);
        System.out.println(samsung.getMarque());
        System.out.println(samsung.hashCode());
        System.out.println("\nMéthodes standard sur Produit IPhone");
        Produit iphone = new Produit();
        iphone.setProduitID(2L);
        iphone.setMarque("IPhone 12 Pro Max");
        iphone.setPrix(900);
        System.out.println(iphone.getPrix());
        System.out.println(iphone.hashCode());
        System.out.println("\nMéthodes standards sur Produit pour tester toString et equals");
        System.out.println(samsung.toString());
        System.out.println(iphone.toString());
        System.out.println("Samsung et IPhone égaux ? " + samsung.equals(iphone));
    }

}
