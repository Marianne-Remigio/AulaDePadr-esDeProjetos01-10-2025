package org.example.exercicio1;

public class PedidoDAO {

    public void salvarPedido(Pedido pedido){
        System.out.println("Salvando pedido no banco de dados: " + pedido.getId());
    }
}