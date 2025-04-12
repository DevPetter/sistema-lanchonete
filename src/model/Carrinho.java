package model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> carrinho;
    private double totalCarrinho = 0;

    public Carrinho(){
        this.carrinho = new ArrayList<>();
    }

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
