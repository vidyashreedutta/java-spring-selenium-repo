package com.jpa.example.jpademo.Controller;

import com.jpa.example.jpademo.dto.PersonDTO;
import com.jpa.example.jpademo.dto.ResponseDTO;
import com.jpa.example.jpademo.service.PersonService;
import com.jpa.example.jpademo.service.ResponseCompositeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @Autowired
    ResponseCompositeService responseCompositeService;

    //    Action
    @GetMapping("/")
    public ResponseEntity<ResponseDTO> getPersonDetails() {
        ResponseDTO responseDTO = responseCompositeService.createResponseDTO();
        ResponseEntity<ResponseDTO> responseEntity = new ResponseEntity<>(responseDTO, HttpStatus.OK);
        System.out.println(responseDTO.getPersonDTOList1());
        return responseEntity;
    }

    @GetMapping("/person/{id}")
    public ResponseEntity<PersonDTO> getPersonDetailByID(@PathVariable Integer id) {
        PersonDTO personDTO = personService.singlePersonByID(id);
        ResponseEntity<PersonDTO> responseEntity = new ResponseEntity<PersonDTO>(personDTO, HttpStatus.OK);
        return responseEntity;
    }

    @PostMapping("/person")
    public void savePersonDetails(@RequestBody PersonDTO personDTO) {
        personService.savePersonDetails(personDTO);

    }


}
