package model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    //Atributos
    private List<Produto> carrinho;
    private double totalCarrinho = 0;

    //Construtor
    public Carrinho(){
        //Cria um novo ArrayList quando um Carrinho é instânciado
        this.carrinho = new ArrayList<>();
    }

    //Getters e Setters

    public List<Produto> getCarrinho() {
        return carrinho;
    }

    public double getTotalCarrinho() {
        return totalCarrinho;
    }

    public void setTotalCarrinho(double totalCarrinho) {
        this.totalCarrinho = totalCarrinho;
    }
}
