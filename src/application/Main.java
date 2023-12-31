package application;

import model.exception.ContactNotExistException;
import model.entities.Contact;
import model.entities.PhoneBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int choice;

        PhoneBook phoneBook = new PhoneBook();

        try {
            do {
                System.out.println("Escolha entre as opções abaixo: ");
                System.out.println("1 - Procurar contato");
                System.out.println("2 - Cadastrar contato");
                System.out.println("0 - Sair do programa");
                System.out.print("Digite uma opção: ");
                choice = read.nextInt();
                read.nextLine();

                try {
                    switch (choice){
                        case 1:
                            System.out.print("Digite o nome que deseja procurar: ");
                            String nameToSearch = read.nextLine();

                            System.out.println(phoneBook.showContact(nameToSearch));
                            break;
                        case 2:
                            System.out.print("Nome: ");
                            String nameContact = read.nextLine();
                            System.out.print("Phone: ");
                            String phoneContact = read.nextLine();

                            phoneBook.addContact(new Contact(nameContact, phoneContact));

                            System.out.println("Cadastro feito com sucesso");
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Entrada inválida");
                    }
                } catch (ContactNotExistException ce) {
                    System.out.println(ce.getMessage());
                }
            } while (choice != 0);
        }catch (RuntimeException re){
            System.out.println(re.getMessage());
        }
        System.out.println("Programa finalizado com sucesso");
        read.close();
    }
}