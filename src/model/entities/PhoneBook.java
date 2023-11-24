package model.entities;

import model.exception.ContactException;

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
            throw new ContactException("Agenda cheia");
        }
    }

    public String showContact(String name){
         for (int i = 0; i < listContacts.length; i++){
             if(listContacts[i] != null){
                 if (listContacts[i].getName().equals(name)){
                     return listContacts[i].getPhone();
                 }
             }
         }
         throw new ContactException("Nome não encontrado");
    }
}