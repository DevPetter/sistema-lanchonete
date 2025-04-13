package controller;

import model.Carrinho;
import model.Produto;

public class LanchoneteController {
    private Carrinho carrinho;

    public LanchoneteController(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public void adicionarProduto(Produto produto){
        for(Produto p : carrinho.getCarrinho()){
            if(p.getNome().equalsIgnoreCase(produto.getNome())){
                p.setQuantidade(p.getQuantidade() + produto.getQuantidade());
                System.out.println("Produto já existente no carrinho, quantidade atualizada.");
            }
        }
        carrinho.getCarrinho().add(produto);
        System.out.println("Produto " + produto.getNome() + " adicionado ao carrinho.");
    }
}
