package com.company.name.service;

import com.company.name.dto.Person;
import com.company.name.dto.PersonFullName;
import com.company.name.dto.PersonNew;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PersonNewService {


    public ArrayList<PersonNew> getListofPerson(){
        PersonNew p1 = new PersonNew("vidya", "waukee");
        PersonNew p2 = new PersonNew("Ganesh", "clive");
        PersonNew p3 = new PersonNew("ishaan", "urbandale");

        ArrayList<PersonNew> personNews = new ArrayList<>();
        personNews.add(p1);
        personNews.add(p2);
        personNews.add(p3);

        return personNews;
    }

    public ArrayList<PersonFullName> personFullNames(ArrayList<PersonNew> personNews){
      ArrayList<PersonFullName> personFullNames = (ArrayList<PersonFullName>) personNews.stream().map(it -> {
            String fullName = it.getName()+" "+it.getStreet();
           PersonFullName personFullName = new PersonFullName(fullName);
           return personFullName;
        }).collect(Collectors.toList());

        return personFullNames;

    }
//    OR
//     PersonFullName personFullName = new PersonFullName(it.getName()+" "+it.getStreet());
//    return personFullNames;
//          OR OR

//    return new PersonFullName(it.getName()+" "+it.getStreet());

}
