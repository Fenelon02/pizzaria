package pizzaria;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientDatabase {
    ArrayList<Cliente> clientDB = new ArrayList<>();

    public ArrayList<Cliente> getClientDB() {
        return clientDB;
    }

    public boolean findCostumerByName(String name){
        if(this.clientDB.isEmpty()){
            return false;
        } else{
            for(Cliente costumer : this.getClientDB()){
                if(costumer.getName().equals(name)){
                    return true;
                }
            }
        }
        return false;
    }

    public void registerCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String clientName = scanner.nextLine().trim().toLowerCase();

        String clientCellphoneNumber;
        do {
            System.out.println("Digite seu numero de celular (formato: (ddd)yyyyy-yyyy: ");
            clientCellphoneNumber = scanner.nextLine().trim();
        } while (clientCellphoneNumber.length() != 14);

        boolean isCelphoneNumberRegistred = false;
        if(!this.getClientDB().isEmpty()){
            for(Cliente client : this.getClientDB()){
                if(client.getCellphoneNumber().equals(clientCellphoneNumber)){
                    isCelphoneNumberRegistred = true;
                    break;
                }
            }
        }
        if(isCelphoneNumberRegistred) {
            System.out.println("Numero de celular já registrado.");
        } else {
            Cliente client = new Cliente(clientName,clientCellphoneNumber);
            this.setNewClient(client);
        }
    }

    public void setNewClient(Cliente client) {
        clientDB.add(client);
    }
}
