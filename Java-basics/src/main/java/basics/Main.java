package com.company.name;

import com.company.name.dto.Person;
import com.company.name.dto.Root;
import com.company.name.service.AddressFinderService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        AddressFinderService addressFinderService = new AddressFinderService();
        Person person = addressFinderService.getPersonDetails(3);

        if(person  != null && person.getAddress() != null){
            System.out.println(person.getAddress().getCity());
        }else {
            System.out.println("person not found");
        }

        ArrayList<Person> person1 = addressFinderService.getAllPersonsDetails();
        System.out.println(person1.size());

        ArrayList<Person> personArrayList = addressFinderService.cityDetails(person1);
        System.out.println(personArrayList.size());

        ArrayList<String> personDetails = addressFinderService.specificPersonDetails(personArrayList);
        personDetails.forEach(it -> System.out.println(it));


        String output = addressFinderService.apisCall("Swipe");
        System.out.println(output);

//        Root root = addressFinderService.restApiExample();
//        System.out.println(root.getData().getEmployee_name());

        Root output2 = addressFinderService.restApiExample1();
        System.out.println(output2.getData().getEmployee_name());

    }
}
