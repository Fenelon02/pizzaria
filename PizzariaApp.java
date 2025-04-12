package pizzaria;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;


public class PizzariaApp {
    public static void main(String[] args){
        int userOption = 0;
        Cardapio cardapio = new Cardapio();
        ClientDatabase clientDatabase = new ClientDatabase();
        while (userOption != 5){
            Scanner getUserOption = new Scanner(System.in);
            System.out.println("""
                    Digite sua escolha:\s
                    1 - Cadastrar pizza
                    2 - Cadastrar cliente
                    3 - Fazer pedido
                    4 - Listar pedidos
                    5 - Sair
                    """);
            do {
                userOption = getUserOption.nextInt();
            } while (userOption > 5 || userOption < 1);

            if(userOption == 1){
                cardapio.addNewPizzaFlavor();
            } else if(userOption == 2){
                clientDatabase.registerCustomer();
            } else if (userOption == 3) {
                System.out.println("Possui cadastro? [S/N]");
                Scanner scanner = new Scanner(System.in);
                String getUserRespond;
                do {
                    getUserRespond = scanner.nextLine().trim().toUpperCase();
                } while (getUserRespond != "S" || getUserRespond != "N");
                if(Objects.equals(getUserRespond, "S")){
                    String name = scanner.nextLine().trim().toLowerCase();
                    if(clientDatabase.findCostumerByName(name)){

                    }

                }
            }
        }
    }
}
