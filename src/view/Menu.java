package view;

import controller.LanchoneteController;
import exceptions.CarrinhoVazioException;
import exceptions.OpcaoInvalidaException;
import model.Bebida;
import model.Doce;
import model.Lanche;

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
                switch (opcaoMenuPrincipal) {
                    case 1:
                        menuAdicionarProduto(sc, controller);
                        break;

                    case 2:
                        controller.removerProduto(sc, controller);
                        break;

                    case 3:
                        controller.visualizarCarrinho();
                        break;

                    case 4:
                        controller.limparCarrinho(sc);
                        break;

                    case 5:
                        controller.finalizarCompra(sc);
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        System.exit(0);

                    default:
                        throw new OpcaoInvalidaException();
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

        try {
            int opcaoAdicionarProduto = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcaoAdicionarProduto) {
                case 1:
                    menuLanches();
                    try {
                        int opcaoSaborLanche = sc.nextInt();
                        sc.nextLine();
                        System.out.println();

                        switch (opcaoSaborLanche) {
                            case 1:
                                System.out.print("Qual a quantidade desejada?: ");
                                int quantidade = sc.nextInt();

                                if (quantidade <= 0) {
                                    System.out.println();
                                    System.out.println("[ERRO] - Quantidade inválida.");
                                    System.out.println();
                                    exibirMenu();
                                }
                                System.out.println();
                                Lanche lanche1 = new Lanche("X-Burguer", 10.00, quantidade);
                                controller.adicionarProduto(lanche1);
                                System.out.println("Lanche " + lanche1.getNome() + "(" + lanche1.getQuantidade() + ") adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 2:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                if (quantidade <= 0) {
                                    System.out.println();
                                    System.out.println("[ERRO] - Quantidade inválida.");
                                    System.out.println();
                                    exibirMenu();
                                }
                                System.out.println();
                                Lanche lanche2 = new Lanche("X-Salada", 13.00, quantidade);
                                controller.adicionarProduto(lanche2);
                                System.out.println("Lanche " + lanche2.getNome() + "(" + lanche2.getQuantidade() + ") adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 3:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                if (quantidade <= 0) {
                                    System.out.println();
                                    System.out.println("[ERRO] - Quantidade inválida.");
                                    System.out.println();
                                    exibirMenu();
                                }
                                System.out.println();
                                Lanche lanche3 = new Lanche("X-Churrasquinho", 18.00, quantidade);
                                controller.adicionarProduto(lanche3);
                                System.out.println("Lanche " + lanche3.getNome() + "(" + lanche3.getQuantidade() + ") adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 4:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                if (quantidade <= 0) {
                                    System.out.println();
                                    System.out.println("[ERRO] - Quantidade inválida.");
                                    System.out.println();
                                    exibirMenu();
                                }
                                System.out.println();
                                Lanche lanche4 = new Lanche("X-Bacon", 22.00, quantidade);
                                controller.adicionarProduto(lanche4);
                                System.out.println("Lanche " + lanche4.getNome() + "(" + lanche4.getQuantidade() + ") adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 5:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                if (quantidade <= 0) {
                                    System.out.println();
                                    System.out.println("[ERRO] - Quantidade inválida.");
                                    System.out.println();
                                    exibirMenu();
                                }
                                System.out.println();
                                Lanche lanche5 = new Lanche("X-Tudao", 28.00, quantidade);
                                controller.adicionarProduto(lanche5);
                                System.out.println("Lanche " + lanche5.getNome() + "(" + lanche5.getQuantidade() + ") adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 0:
                                exibirMenu();
                                break;

                            default:
                                throw new OpcaoInvalidaException();
                        }
                    } catch (OpcaoInvalidaException e) {
                        System.out.println(e.getMessage());
                        System.out.println();
                    }
                    break;

                case 2:
                    menuBebidas();
                    try {
                        int opcaoBebida = sc.nextInt();
                        sc.nextLine();
                        System.out.println();

                        switch (opcaoBebida) {
                            case 1:
                                System.out.print("Qual a quantidade desejada?: ");
                                int quantidade = sc.nextInt();
                                if (quantidade <= 0) {
                                    System.out.println();
                                    System.out.println("[ERRO] - Quantidade inválida.");
                                    System.out.println();
                                    exibirMenu();
                                }
                                System.out.println();
                                Bebida bebida1 = new Bebida("Coca Cola", 5.00, quantidade);
                                controller.adicionarProduto(bebida1);
                                System.out.println("Bebida " + bebida1.getNome() + "(" + bebida1.getQuantidade() + ") adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 2:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                if (quantidade <= 0) {
                                    System.out.println();
                                    System.out.println("[ERRO] - Quantidade inválida.");
                                    System.out.println();
                                    exibirMenu();
                                }
                                System.out.println();
                                Bebida bebida2 = new Bebida("Coca Cola ZERO", 5.00, quantidade);
                                controller.adicionarProduto(bebida2);
                                System.out.println("Bebida " + bebida2.getNome() + "(" + bebida2.getQuantidade() + ") adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 3:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                if (quantidade <= 0) {
                                    System.out.println();
                                    System.out.println("[ERRO] - Quantidade inválida.");
                                    System.out.println();
                                    exibirMenu();
                                }
                                System.out.println();
                                Bebida bebida3 = new Bebida("Fanta Laranja", 4.49, quantidade);
                                controller.adicionarProduto(bebida3);
                                System.out.println("Bebida " + bebida3.getNome() + "(" + bebida3.getQuantidade() + ") adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 4:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                if (quantidade <= 0) {
                                    System.out.println();
                                    System.out.println("[ERRO] - Quantidade inválida.");
                                    System.out.println();
                                    exibirMenu();
                                }
                                System.out.println();
                                Bebida bebida4 = new Bebida("Fanta Uva", 4.49, quantidade);
                                controller.adicionarProduto(bebida4);
                                System.out.println("Bebida " + bebida4.getNome() + "(" + bebida4.getQuantidade() + ") adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 5:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                if (quantidade <= 0) {
                                    System.out.println();
                                    System.out.println("[ERRO] - Quantidade inválida.");
                                    System.out.println();
                                    exibirMenu();
                                }
                                System.out.println();
                                Bebida bebida5 = new Bebida("Guaraná Antartica", 5.79, quantidade);
                                controller.adicionarProduto(bebida5);
                                System.out.println("Bebida " + bebida5.getNome() + "(" + bebida5.getQuantidade() + ") adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 0:
                                exibirMenu();
                                break;

                            default:
                                throw new OpcaoInvalidaException();
                        }
                    } catch (OpcaoInvalidaException e) {
                        System.out.println(e.getMessage());
                        System.out.println();
                    }
                    break;

                case 3:
                    menuDoces();
                    try {
                        int opcaoDoce = sc.nextInt();
                        sc.nextLine();
                        System.out.println();

                        switch (opcaoDoce) {
                            case 1:
                                System.out.print("Qual a quantidade desejada?: ");
                                int quantidade = sc.nextInt();
                                if (quantidade <= 0) {
                                    System.out.println();
                                    System.out.println("[ERRO] - Quantidade inválida.");
                                    System.out.println();
                                    exibirMenu();
                                }
                                System.out.println();
                                Doce doce1 = new Doce("Snickers", 3.49, quantidade);
                                controller.adicionarProduto(doce1);
                                System.out.println("Doce " + doce1.getNome() + "(" + doce1.getQuantidade() + ") adicionado ao carrinho.");

                                System.out.println();
                                break;

                            case 2:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                if (quantidade <= 0) {
                                    System.out.println();
                                    System.out.println("[ERRO] - Quantidade inválida.");
                                    System.out.println();
                                    exibirMenu();
                                }
                                System.out.println();
                                Doce doce2 = new Doce("Suflair", 2.49, quantidade);
                                controller.adicionarProduto(doce2);
                                System.out.println("Doce " + doce2.getNome() + "(" + doce2.getQuantidade() + ") adicionado ao carrinho.");

                                System.out.println();
                                break;

                            case 3:
                                System.out.print("Qual a quantidade desejada?: ");
                                quantidade = sc.nextInt();
                                if (quantidade <= 0) {
                                    System.out.println();
                                    System.out.println("[ERRO] - Quantidade inválida.");
                                    System.out.println();
                                    exibirMenu();
                                }
                                System.out.println();
                                Doce doce3 = new Doce("Fini", 5.79, quantidade);
                                controller.adicionarProduto(doce3);
                                System.out.println("Doce " + doce3.getNome() + "(" + doce3.getQuantidade() + ") adicionado ao carrinho.");
                                System.out.println();
                                break;

                            case 0:
                                exibirMenu();
                                break;

                            default:
                                throw new OpcaoInvalidaException();
                        }
                    } catch (OpcaoInvalidaException e) {
                        System.out.println(e.getMessage());
                        System.out.println();
                    }
                    break;

                case 0:
                    exibirMenu();

                default:
                    throw new OpcaoInvalidaException();
            }
        } catch (OpcaoInvalidaException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
    }

    private void menuLanches() {
        System.out.println("============== Escolha o lanche que deseja ==============");
        System.out.println("[1] - X-Burguer | R$10,00");
        System.out.println("[2] - X-Salada | R$13,00");
        System.out.println("[3] - X-Churrasquinho | R$18,00");
        System.out.println("[4] - X-Bacon | R$22,00");
        System.out.println("[5] - X-Tudao | R$28,00");
        System.out.println("[0] - Voltar ao menu principal");
        System.out.println();
        System.out.print("Opção: ");
    }

    private void menuBebidas() {
        System.out.println("============== Escolha a bebida que deseja ==============");
        System.out.println("[1] - Coca-Cola 350ml | R$5,00");
        System.out.println("[2] - Coca-Cola ZERO 350ml | R$5,00");
        System.out.println("[3] - Fanta Laranja 350ml | R$4,49");
        System.out.println("[4] - Fanta Uva 350ml | R$4,49");
        System.out.println("[5] - Guaraná Antartica 350ml | R$5.79");
        System.out.println("[0] - Voltar ao menu principal");
        System.out.println();
        System.out.print("Opção: ");
    }

    private void menuDoces() {
        System.out.println("============== Escolha o doce que deseja ==============");
        System.out.println("[1] - Snickers | R$3,49");
        System.out.println("[2] - Suflair | R$2,49");
        System.out.println("[3] - Fini | R$5,79");
        System.out.println("[0] - Voltar ao menu principal");
        System.out.println();
        System.out.print("Opção: ");
    }

}
