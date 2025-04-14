package util;

import exceptions.ValorInvalidoException;

public class VerificarQuantidade {
    private boolean quantidadeValida;

    public VerificarQuantidade() {
    }

    public boolean isQuantidadeValida() {
        return quantidadeValida;
    }

    public void setQuantidadeValida(boolean quantidadeValida) {
        this.quantidadeValida = quantidadeValida;
    }

    public void verificarQuantidade(int quantidade){
        try{
            if (quantidade != 0){
                this.quantidadeValida = true;
            }else{
                this.quantidadeValida = false;
                throw new ValorInvalidoException();
            }
        }catch (ValorInvalidoException e){
            System.out.println();
            System.out.println(e.getMessage());
            System.out.println();
        }
    }
}
