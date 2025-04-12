package view;

import controller.LanchoneteController;
import exceptions.OpcaoInvalidaException;

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
            System.out.println("========== Lanchonete Java ==========");
            System.out.println("[1] - Adicionar um produto ao carrinho");
            System.out.println("[2] - Remover um produto do carrinho");
            System.out.println("[3] - Visualizar carrinho");
            System.out.println("[4] - Limpar carrinho");
            System.out.println("[0] - Sair");
            System.out.println();
            System.out.print("Opção: ");

            try {
                int opcaoMenuPrincipal = sc.nextInt();
                sc.nextLine();

                if (opcaoMenuPrincipal < 0 || opcaoMenuPrincipal > 4) {
                    throw new OpcaoInvalidaException();
                }else{
                    switch (opcaoMenuPrincipal){
                        
                    }
                }
            } catch (OpcaoInvalidaException e) {
                System.out.println();
                System.out.println(e.getMessage());
                System.out.println();
            }

        }
    }
}
