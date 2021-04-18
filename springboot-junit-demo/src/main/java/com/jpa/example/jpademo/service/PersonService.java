package com.jpa.example.jpademo.service;

import com.jpa.example.jpademo.dao.PersonDetailsRepository;
import com.jpa.example.jpademo.dto.PersonDTO;
import com.jpa.example.jpademo.dto.ResponseDTO;
import com.jpa.example.jpademo.entity.PersonDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class PersonService {

    @Autowired
    PersonDetailsRepository personDetailsRepository;

    @Autowired
    QuoteService quoteService;

    public List<PersonDTO> getPersonDetails() {
        PersonDetails personDetails = new PersonDetails();
        personDetails.setFirstName("RRRRRR");
        personDetails.setCareer("TEST");
        personDetails.setLastName("SGGGG");
        personDetailsRepository.save(personDetails);
        List<PersonDetails> personDetailsList = personDetailsRepository.findAll();
        List<PersonDTO> personDTOList = personDetailsList.stream().map(it -> {
            PersonDTO personDTO = new PersonDTO();
            personDTO.setCareer(it.getCareer());
            personDTO.setFname(it.getFirstName());
            return personDTO;
        }).collect(Collectors.toList());
        return personDTOList;


    }

    public PersonDTO singlePersonByID(Integer id) {
        Optional<PersonDetails> personDetails = personDetailsRepository.findById(id);
        if(personDetails.isPresent()) {
            PersonDetails personDetails1 = personDetails.get();
            PersonDTO personDTO = new PersonDTO();
            personDTO.setDatapresent(true);
            personDTO.setFname(personDetails1.getFirstName());
            personDTO.setCareer(personDetails1.getCareer());
            return personDTO;
        }else
        {
            PersonDTO personDTO = new PersonDTO();
            personDTO.setDatapresent(false);
            return personDTO;
        }

    }

    public void savePersonDetails(PersonDTO personDTO){
        PersonDetails personDetails = new PersonDetails();
        personDetails.setFirstName(personDTO.getFname());
        personDetails.setLastName("");
        personDetails.setCareer(personDTO.getCareer());
        personDetailsRepository.save(personDetails);


    }

}
