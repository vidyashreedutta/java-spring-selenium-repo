package com.jpa.example.jpademo.service;

import com.jpa.example.jpademo.dto.PersonDTO;
import com.jpa.example.jpademo.dto.ResponseDTO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ResponseCompositeServiceTest {

    @InjectMocks
    ResponseCompositeService responseCompositeService;


    @Mock
    private QuoteService quoteService;
    @Mock
    private PersonService personService;


    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_createResponseDTO() {
        List<PersonDTO> personDTOList = new ArrayList<>();
        PersonDTO p1 = new PersonDTO();
        PersonDTO p2 = new PersonDTO();
        personDTOList.add(p1);
        personDTOList.add(p2);

        String quote = "Test Quote";

//        ResponseDTO responseDTO = responseCompositeService.createResponseDTO();
        when(quoteService.getAQuote()).thenReturn(quote);
        when(personService.getPersonDetails()).thenReturn(personDTOList);


        //test
        ResponseDTO responseDTO1 = responseCompositeService.createResponseDTO();

        assertEquals(2, responseDTO1.getPersonDTOList1().size());
//responseDTO1.getPersonDTOList1().size()
    }

}