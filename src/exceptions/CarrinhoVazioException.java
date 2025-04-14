package exceptions;

public class CarrinhoVazioException extends Exception{
    public CarrinhoVazioException(){
        super("[ERRO] - O carrinho está vazio.");
    }

}
