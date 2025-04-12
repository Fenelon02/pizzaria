package pizzaria;
import java.util.ArrayList;

public class Cliente {
    private String name;
    private String cellphoneNumber; // fazer pedido especifico botar por cpf
    private final ArrayList<Pizza> orders = new ArrayList<>();

    public ArrayList<Pizza> getOrders() {
        return orders;
    }

    public void addOrder(Pizza pizza) {
        orders.add(pizza);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public Cliente(String name, String cellphoneNumber) {
        this.name = name;
        this.cellphoneNumber = cellphoneNumber;
    }
}
