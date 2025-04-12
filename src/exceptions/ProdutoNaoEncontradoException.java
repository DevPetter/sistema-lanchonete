package exceptions;

public class ProdutoNaoEncontradoException extends Exception{
    public ProdutoNaoEncontradoException(){
        super("[ERRO] - Produto não encontrado.");
    }
}
