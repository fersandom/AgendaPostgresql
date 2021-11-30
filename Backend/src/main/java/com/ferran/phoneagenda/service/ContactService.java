package com.ferran.phoneagenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferran.phoneagenda.entity.Contact;
import com.ferran.phoneagenda.repository.ContactRepo;

@Service
public class ContactService {

	@Autowired
	private ContactRepo contactRepo;
	
	public List<Contact> getContacts(){
		return contactRepo.findAll();
	}
	
	public Contact addContact(Contact contact) {
		contactRepo.save(contact);
		return contact;
	}
	
	public String deleteContact(long id) {
		contactRepo.deleteById(id);
		return "Contact with id: " + id + " has been deleted.";
	}
}
