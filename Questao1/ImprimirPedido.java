package org.example.exercicio1;

public class ImprimirPedido {

    public void imprimirPedido(Pedido pedido){
        System.out.println("Pedido ID: " + pedido.getId());
        System.out.println("Descrição: " + pedido.getDescricao());
        System.out.println("Valor total: " + pedido.calculaTotal());
    }
}
