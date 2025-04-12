package view;

import controller.LanchoneteController;
import exceptions.OpcaoInvalidaException;

import java.util.Scanner;

public class Menu {
    private Scanner sc;
    private LanchoneteController controller;

    public Menu(Scanner sc, LanchoneteController controller){
        this.sc = sc;
        this.controller = controller;
    }

    public void exibirMenu(){
    }
}
