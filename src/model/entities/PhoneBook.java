package entities;

public class PhoneBook {
    private static int contador;
    private Contact[] listContact = new Contact[3];

    public void addContact(Contact contact){
        listContact[contador] = contact;
        contador++;
    }

    public Contact listContacts(){
       for(int i = 0; i < listContact.length; i++){
           return listContact[i];
       }
    }
}
