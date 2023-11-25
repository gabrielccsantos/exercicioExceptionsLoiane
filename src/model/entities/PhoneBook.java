package model.entities;

import model.exception.ContactNotExistException;
import model.exception.PhoneBookFullException;

public class PhoneBook {
    private Contact[] listContacts;


    public PhoneBook(){
        listContacts = new Contact[3];
    }

    public void addContact(Contact contact){
        boolean fullList = true;
        for(int i = 0; i < listContacts.length; i++){
            if(listContacts[i] == null){
                listContacts[i] = contact;
                fullList = false;
                break;
            }
        }
        if(fullList){
            throw new PhoneBookFullException("Agenda cheia");
        }
    }

    public String showContact(String name){
         for(int i = 0; i < listContacts.length; i++){
             if(listContacts[i] != null){
                 if(listContacts[i].getName().equalsIgnoreCase(name)){
                     return listContacts[i].getName();
                 }
             }
         }
         throw new ContactNotExistException("Nome não encontrado");
    }
}