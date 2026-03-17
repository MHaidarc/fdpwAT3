package com.ifsp.mateus;
public class Product {
    private String name;
    private String description;
    private double price;

    public Product() {} // Construtor vazio (obrigatório para o Spring)

    // Construtor com parâmetros
    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // Getters e Setters (métodos de acesso)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}