package pizzaria;
import java.util.ArrayList;
import java.util.Scanner;

public class Cardapio {
    private final ArrayList<Pizza> pizzas = new ArrayList<>();

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzaFlavor(Pizza pizza){
        pizzas.add(pizza);
    }

    public void showAvaliableFlavors(){
        System.out.println("=====Cardápio=====");

        for(Pizza pizza: pizzas){
            System.out.print("Pizza sabor " + pizza.getFlavor() + " feita com os seguintes ingredientes: ");
            for(String ingredient : pizza.getIngredients()){
                System.out.printf("%s, ", ingredient);
            }
            System.out.println();
        }

    }

    public void addNewPizzaFlavor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do novo sabor: ");
        String Flavor = scanner.nextLine();

        boolean isPizzaRegistered = false;
        if(!this.getPizzas().isEmpty()) {
            for (Pizza pizza : this.getPizzas()) {
                if (pizza.getFlavor().equals(Flavor.toLowerCase())) {
                    isPizzaRegistered = true;
                    break;
                }
            }
        }

        if (!isPizzaRegistered) {

            System.out.println("A pizza terá borda? (true/false):");
            boolean border = Boolean.parseBoolean(scanner.nextLine().trim());

            ArrayList<String> ingredients = new ArrayList<>(); // garbage colectort
            String stopInput = "1";

            while (!stopInput.equals("0")) {
                System.out.println("Digite um ingrediente para adicionar:");
                String ingredient = scanner.nextLine().trim();

                if (!ingredient.isEmpty()) {
                    ingredients.add(ingredient);
                } else {
                    System.out.println("Ingrediente vazio ignorado.");
                }

                System.out.println("Para adicionar mais ingredientes, aperte qualquer tecla. Para parar, digite 0:");
                stopInput = scanner.nextLine().trim();
            }


            Pizza pizza = new Pizza(Flavor.toLowerCase(), border, ingredients);
            this.setPizzaFlavor(pizza);
            this.showAvaliableFlavors();
            System.out.println("Novo sabor adicionado com sucesso!");
        } else {
            System.out.println("Esse sabor já existe no cardápio.");
        }
    }

}
