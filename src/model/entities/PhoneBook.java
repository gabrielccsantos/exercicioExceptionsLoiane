package model.entities;

import model.contactException.ContactException;

public class PhoneBook {
    private Contact[] listContacts;


    public PhoneBook(){
        listContacts = new Contact[5];
    }

    public void addContact(Contact contact){
        boolean emptyList = true;

        for(int i = 0; i < listContacts.length; i++){
            if(listContacts[i] != null){
                listContacts[i] = contact;
                emptyList = false;
            }
        }
        emptyList = true;

        if(emptyList){
            throw new ContactException("Lista está cheia");
        }
    }

    public String showContact(String name){
        for(int i = 0; i < listContacts.length; i++){
            if(listContacts[i] != null){
                if(listContacts[i].getName().equals(name)){
                    String contactName = listContacts[i].getName();
                    return contactName;
                }
            }
        }
        throw new ContactException("Não existe esse contato");
    }
}