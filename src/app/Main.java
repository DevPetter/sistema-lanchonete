package app;

import controller.LanchoneteController;
import model.Carrinho;
import view.Menu;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();
        LanchoneteController controller = new LanchoneteController(carrinho);

        Menu menu = new Menu(sc, controller);

        menu.exibirMenu();
    }
}
