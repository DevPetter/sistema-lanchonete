package exceptions;

public class CarrinhoVazioException extends Exception{
    public CarrinhoVazioException(){
        super("O carrinho está vazio.");
    }

}
