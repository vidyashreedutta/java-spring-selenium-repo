package com.jpa.example.jpademo.service;

import com.jpa.example.jpademo.dto.PersonDTO;
import com.jpa.example.jpademo.dto.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseCompositeService {

    @Autowired
    private  QuoteService quoteService;
    @Autowired
    private PersonService personService;


    public ResponseDTO createResponseDTO(){
        String quote =quoteService.getAQuote();
        List<PersonDTO> personDTOList1 = personService.getPersonDetails();
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setPersonDTOList1(personDTOList1);
        responseDTO.setQuote(quote);
        return responseDTO;
    }
}
