package view;

import controller.LanchoneteController;
import exceptions.OpcaoInvalidaException;
import model.Bebida;
import model.Lanche;
import model.Produto;

import java.util.Scanner;

public class Menu {
    private Scanner sc;
    private LanchoneteController controller;

    public Menu(Scanner sc, LanchoneteController controller) {
        this.sc = sc;
        this.controller = controller;
    }

    public void exibirMenu() {
        while (true) {
            System.out.println("============== Lanchonete Java ==============");
            System.out.println("[1] - Escolher produto");
            System.out.println("[2] - Remover um produto do carrinho");
            System.out.println("[3] - Visualizar carrinho");
            System.out.println("[4] - Limpar carrinho");
            System.out.println("[5] - Finalizar compra");
            System.out.println("[0] - Sair");
            System.out.println();
            System.out.print("Opção: ");

            try {
                int opcaoMenuPrincipal = sc.nextInt();
                sc.nextLine();
                System.out.println();

                if (opcaoMenuPrincipal < 0 || opcaoMenuPrincipal > 5) {
                    throw new OpcaoInvalidaException();
                } else {
                    switch (opcaoMenuPrincipal) {
                        case 1:
                            menuAdicionarProduto(sc, controller);
                            break;

                    }
                }
            } catch (OpcaoInvalidaException e) {
                System.out.println(e.getMessage());
                System.out.println();
            }

        }
    }

    private void menuAdicionarProduto(Scanner sc, LanchoneteController controller) {
        System.out.println("============== Escolha o que deseja comprar ==============");
        System.out.println("[1] - Lanches");
        System.out.println("[2] - Bebidas");
        System.out.println("[3] - Doces");
        System.out.println("[0] - Voltar ao menu principal");
        System.out.println();
        System.out.print("Opção: ");

        try{
            int opcaoAdicionarProduto = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcaoAdicionarProduto){
                case 1:
                    menuLanches();
                    try{
                        int opcaoSaborLanche = sc.nextInt();
                        sc.nextLine();
                        System.out.println();

                        switch (opcaoSaborLanche){
                            case 1:
                                System.out.print("Qual a quantidade desejada?: ");
                                int quantidade = sc.nextInt();
                                System.out.println();
                                Lanche lanche1 = new Lanche("X-Burguer", 10.00, quantidade);
                                controller.adicionarProduto(lanche1);
                                System.out.println("Lanche " + lanche1.getNome() + " adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 2:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                System.out.println();
                                Lanche lanche2 = new Lanche("X-Salada", 13.00, quantidade);
                                controller.adicionarProduto(lanche2);
                                System.out.println("Lanche " + lanche2.getNome() + " adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 3:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                System.out.println();
                                Lanche lanche3 = new Lanche("X-Churrasquinho", 18.00, quantidade);
                                controller.adicionarProduto(lanche3);
                                System.out.println("Lanche " + lanche3.getNome() + " adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 4:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                System.out.println();
                                Lanche lanche4 = new Lanche("X-Bacon", 22.00, quantidade);
                                controller.adicionarProduto(lanche4);
                                System.out.println("Lanche " + lanche4.getNome() + " adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 5:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                System.out.println();
                                Lanche lanche5 = new Lanche("X-Tudâo", 28.00, quantidade);
                                controller.adicionarProduto(lanche5);
                                System.out.println("Lanche " + lanche5.getNome() + " adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 0:
                                exibirMenu();
                                break;

                            default:
                                throw new OpcaoInvalidaException();
                        }
                    }catch (OpcaoInvalidaException e){
                        System.out.println(e.getMessage());
                        System.out.println();
                    }
                    break;

                case 2:
                    menuBebidas();
                    try{
                        int opcaoBebida = sc.nextInt();
                        sc.nextLine();
                        System.out.println();

                        switch (opcaoBebida){
                            case 1:
                                System.out.print("Qual a quantidade desejada?: ");
                                int quantidade = sc.nextInt();
                                System.out.println();
                                Bebida bebida1 = new Bebida("Coca Cola", 5.00, quantidade);
                                controller.adicionarProduto(bebida1);
                                System.out.println("Bebida " + bebida1.getNome() + " adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 2:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                System.out.println();
                                Bebida bebida2 = new Bebida("Coca Cola ZERO", 5.00, quantidade);
                                controller.adicionarProduto(bebida2);
                                System.out.println("Bebida " + bebida2.getNome() + " adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 3:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                System.out.println();
                                Bebida bebida3 = new Bebida("Fanta Laranja", 4.49, quantidade);
                                controller.adicionarProduto(bebida3);
                                System.out.println("Bebida " + bebida3.getNome() + " adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 4:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                System.out.println();
                                Bebida bebida4 = new Bebida("Fanta Uva", 4.49, quantidade);
                                controller.adicionarProduto(bebida4);
                                System.out.println("Bebida " + bebida4.getNome() + " adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 5:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                System.out.println();
                                Bebida bebida5 = new Bebida("Guaraná Antartica", 5.79, quantidade);
                                controller.adicionarProduto(bebida5);
                                System.out.println("Bebida " + bebida5.getNome() + " adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 0:
                                exibirMenu();
                                break;

                            default:
                                throw new OpcaoInvalidaException();
                        }
                    }catch (OpcaoInvalidaException e){
                        System.out.println(e.getMessage());
                        System.out.println();
                    }
                    break;

                case 3:


                default:
                    throw new OpcaoInvalidaException();
            }
        }catch (OpcaoInvalidaException e){
            System.out.println(e.getMessage());
            System.out.println();
        }
    }

    private void menuLanches(){
        System.out.println("============== Escolha o sabor do lanche que deseja ==============");
        System.out.println("[1] - X-Burguer | R$10,00");
        System.out.println("[2] - X-Salada | R$13,00");
        System.out.println("[3] - X-Churrasquinho | R$18,00");
        System.out.println("[4] - X-Bacon | R$22,00");
        System.out.println("[5] - X-Tudão | R$28,00");
        System.out.println("[0] - Voltar ao menu principal");
        System.out.println();
        System.out.print("Opção: ");
    }

    private void menuBebidas(){
        System.out.println("============== Escolha o a bebida que deseja ==============");
        System.out.println("[1] - Coca-Cola 350ml | R$5,00");
        System.out.println("[2] - Coca-Cola ZERO 350ml | R$5,00");
        System.out.println("[3] - Fanta Laranja 350ml | R$4,49");
        System.out.println("[4] - Fanta Uva 350ml | R$4,49");
        System.out.println("[5] - Guaraná Antartica 350ml | R$5.79");
        System.out.println("[0] - Voltar ao menu principal");
        System.out.println();
        System.out.print("Opção: ");
    }
}
