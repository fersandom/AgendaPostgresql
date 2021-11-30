package com.ferran.phoneagenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferran.phoneagenda.entity.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Long>{

}
