package com.ferran.phoneagenda.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataNotFoundAction;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ferran.phoneagenda.entity.Contact;
import com.ferran.phoneagenda.service.ContactService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MainController {

	@Autowired
	private ContactService contactService;
	
	@GetMapping("/")
	public List<Contact> findAllContacts(){
		return contactService.getContacts();
	}
	
	@PostMapping("/addContact")
	public Contact addContact(@RequestBody Contact contact) {
		return contactService.addContact(contact);
	}
	
	@DeleteMapping("/deleteContact/{id}")
	public String deleteContact(@PathVariable long id) {
		return contactService.deleteContact(id);
	}
	
}
