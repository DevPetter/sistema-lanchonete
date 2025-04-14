package controller;

import exceptions.ProdutoNaoEncontradoException;
import model.Carrinho;
import model.Produto;

public class LanchoneteController {
    private Carrinho carrinho;

    public LanchoneteController(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public void adicionarProduto(Produto produto) {
        for (Produto p : carrinho.getCarrinho()) {
            if (p.getNome().equalsIgnoreCase(produto.getNome())) {
                p.setQuantidade(p.getQuantidade() + produto.getQuantidade());
                System.out.println("Produto já existente no carrinho, quantidade atualizada.");
            }
        }
        carrinho.getCarrinho().add(produto);
    }

    public void removerProduto(String nomeProduto) {
        try {
            for (Produto p : carrinho.getCarrinho()) {
                if (p.getNome().equalsIgnoreCase(nomeProduto)) {
                        carrinho.getCarrinho().remove(p);
                    System.out.println("Produto " + p.getNome() + " removido com sucesso.");
                }else{
                    throw new ProdutoNaoEncontradoException();
                }
            }
        }catch (ProdutoNaoEncontradoException e){
            System.out.println(e.getMessage());
        }
    }
}
