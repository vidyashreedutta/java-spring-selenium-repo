package com.jpa.example.jpademo.service;

import com.jpa.example.jpademo.dto.PersonDTO;
import com.jpa.example.jpademo.dto.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {

    @Autowired
    private  QuoteService quoteService;
    @Autowired
    private PersonService personService;


    public ResponseDTO createResponseDTO(){
        String quote = getQuoteString();
        List<PersonDTO> personDTOList1 = getPersonDTOS();
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setPersonDTOList1(personDTOList1);
        responseDTO.setQuote(quote);
        return responseDTO;
    }

    private List<PersonDTO> getPersonDTOS() {
        List<PersonDTO> personDTOList1 = personService.getPersonDetails();
        return personDTOList1;
    }

    private String getQuoteString() {
        String quote =quoteService.getAQuote();
        return quote;
    }
}
