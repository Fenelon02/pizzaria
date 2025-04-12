package pizzaria;

import java.util.List;
import java.util.Scanner;

public class Pedido {
    private Cliente customer;
    List<Pizza> Pizzas;
    Double totalValue;

    public Pedido(Cliente customer, List<Pizza> pizzas, Double totalValue) {
        this.customer = customer;
        Pizzas = pizzas;
        this.totalValue = totalValue;
    }

    //
}
