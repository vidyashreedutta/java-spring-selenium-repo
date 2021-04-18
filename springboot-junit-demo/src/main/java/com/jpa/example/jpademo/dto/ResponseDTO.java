package com.jpa.example.jpademo.dto;

import java.util.List;

public class ResponseDTO {

    private List<PersonDTO> personDTOList1;
    String quote;



//    getter setter
    public List<PersonDTO> getPersonDTOList1() {
        return personDTOList1;
    }

    public void setPersonDTOList1(List<PersonDTO> personDTOList1) {
        this.personDTOList1 = personDTOList1;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
