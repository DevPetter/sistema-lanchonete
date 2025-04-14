package controller;

import exceptions.CarrinhoVazioException;
import exceptions.OpcaoInvalidaException;
import exceptions.ProdutoNaoEncontradoException;
import exceptions.QuantidadeInvalidaException;
import model.Carrinho;
import model.Produto;

import java.util.Scanner;

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

    public void removerProduto(Scanner sc, LanchoneteController controller) {
        Produto encontrado = null;

        System.out.println("============== Remover produto ==============");
        System.out.println();
        try {
            if (carrinho.getCarrinho().isEmpty()) {
                throw new CarrinhoVazioException();
            } else {
                try {
                    System.out.print("Digite o nome do produto que deseja remover: ");
                    String nomeProdutoRemovido = sc.nextLine();

                    System.out.println();

                    System.out.print("Digite a quantidade que deseja remover: ");
                    int quantidadeRemovida = sc.nextInt();

                    for (Produto p : carrinho.getCarrinho()) {
                        if (p.getNome().equalsIgnoreCase(nomeProdutoRemovido)) {
                            encontrado = p;
                            break;
                        } else {
                            throw new ProdutoNaoEncontradoException();
                        }
                    }

                    try {
                        if (quantidadeRemovida == encontrado.getQuantidade()) {
                            carrinho.getCarrinho().remove(encontrado);
                            System.out.println();
                            System.out.println("Item " + encontrado.getNome() + " removido com sucesso.");
                            System.out.println();
                        } else if (quantidadeRemovida < encontrado.getQuantidade()) {
                            encontrado.setQuantidade(encontrado.getQuantidade() - quantidadeRemovida);
                            System.out.println();
                            System.out.println("Quantidade atualizada.");
                            System.out.println();
                        } else {
                            throw new QuantidadeInvalidaException();
                        }
                    } catch (QuantidadeInvalidaException e) {
                        System.out.println();
                        System.out.println(e.getMessage());
                        System.out.println();
                    }

                } catch (ProdutoNaoEncontradoException e) {
                    System.out.println();
                    System.out.println(e.getMessage());
                    System.out.println();
                }
            }
        } catch (CarrinhoVazioException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
    }

    public void visualizarCarrinho() {
        try {
            if (carrinho.getCarrinho().isEmpty()) {
                throw new CarrinhoVazioException();
            } else {
                System.out.println("============== Carrinho ==============");
                for (Produto p : carrinho.getCarrinho()) {
                    double total = p.getPreco() * p.getQuantidade();
                    System.out.print(p.getNome() + " | " + p.getQuantidade() + "x | ");
                    System.out.printf("R$%.2f\n", total);
                    System.out.println();
                }
                totalCarrinho();
                System.out.println();
            }
        } catch (CarrinhoVazioException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
    }

    public void limparCarrinho(Scanner sc) {
        try {
            if (carrinho.getCarrinho().isEmpty() == false) {
                try {
                    System.out.print("Tem certeza que deseja LIMPAR o carrinho? (S/N): ");
                    String confirmacao = sc.nextLine();

                    if (confirmacao.equalsIgnoreCase("S")) {
                        carrinho.getCarrinho().clear();
                        System.out.println();
                        System.out.println("Carrinho limpo com sucesso.");
                        System.out.println();
                    } else if (confirmacao.equalsIgnoreCase("N")) {
                        System.out.println();
                        return;
                    } else {
                        throw new OpcaoInvalidaException();
                    }
                } catch (OpcaoInvalidaException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                throw new CarrinhoVazioException();
            }
        } catch (CarrinhoVazioException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
    }

    public void totalCarrinho() {
        double totalCarrinho = 0;

        for (Produto p : carrinho.getCarrinho()) {
            totalCarrinho += p.getPreco() * p.getQuantidade();
            carrinho.setTotalCarrinho(totalCarrinho);
        }

        System.out.printf("Total no carrinho: R$%.2f", totalCarrinho);
        System.out.println();
    }
}
