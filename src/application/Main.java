package application;

import model.contactException.ContactException;
import model.entities.Contact;
import model.entities.PhoneBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        PhoneBook phoneBook = new PhoneBook();

        try {
            int choice;
            do {
                System.out.println("Escolha as opções abaixo: ");
                System.out.println("1 - Procurar Contato");
                System.out.println("2 - Adicionar Contato (5 contatos)");
                System.out.println("0 - Sair do programa");
                System.out.print("Escolha: ");
                choice = read.nextInt();
                read.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Nome para pesquisar: ");
                        String nameForSearch = read.nextLine();

                        System.out.println(phoneBook.showContact(nameForSearch));
                        break;
                    case 2:
                        System.out.print("Nome: ");
                        String name = read.nextLine();
                        System.out.print("Phone: ");
                        String phone = read.nextLine();

                        phoneBook.addContact(new Contact(name, phone));
                        break;
                    default:
                        System.out.println("Entrada invalida");
                }
            } while (choice != 0);
        }catch (ContactException ce){
            ce.getMessage();
        }catch (RuntimeException re){
            System.out.println("Erro inesperado");
            re.printStackTrace();
        }finally {
            System.out.println("Programa encerrado com sucesso");
            read.close();
        }


    }
}