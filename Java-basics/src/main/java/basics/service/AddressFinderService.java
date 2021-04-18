package com.company.name.service;

import com.alibaba.fastjson.JSON;
import com.company.name.dto.Address;
import com.company.name.dto.Person;
import com.company.name.dto.Root;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AddressFinderService {

    public final String name = "USD";

    public Person getPersonDetails(int empid) {
        Person person1 = new Person();
        person1.setfName("ganesh");
        person1.setlName("RSG");

        Address address = new Address();

        address.setCity("Waukee");
        address.setZip("50263");
        person1.setAddress(address);

        Person person2 = new Person();
        person2.setfName("Test");
        person2.setlName("TEST22");

        Address address1 = new Address();
        address1.setCity("Clive");
        address1.setZip("50235");
        person2.setAddress(address1);

        Person person3 = new Person();
        person3.setfName("Rahil");
        person3.setlName("Shetty");

        Address address2 = new Address();
        address2.setCity("Waukee");
        address2.setZip("50335");
        person3.setAddress(address2);

        if (empid == 1) {
            return person1;

        } else if (empid == 2) {
            return person2;

        }else if (empid == 3){
            return person3;
        }

        return null;
    }


    public ArrayList<Person> getAllPersonsDetails(){
        Person person1 = new Person();
        person1.setfName("ganesh");
        person1.setlName("RSG");

        Address address = new Address();
        address.setCity("Waukee");
        address.setZip("50263");
        person1.setAddress(address);

        Person person2 = new Person();
        person2.setfName("Test");
        person2.setlName("TEST22");

        Address address1 = new Address();
        address1.setCity("Clive");
        address1.setZip("50235");
        person2.setAddress(address1);

        Person person3 = new Person();
        person3.setfName("Rahil");
        person3.setlName("Shetty");

        Address address2 = new Address();
        address2.setCity("Waukee");
        address2.setZip("50335");
        person3.setAddress(address2);

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);

        return personArrayList;

    }

    public ArrayList<Person> cityDetails(ArrayList<Person> personArrayList1){
        List<Person> personArrayList = personArrayList1.stream()
                .filter(it -> it.getAddress().getCity().equalsIgnoreCase("Waukee") )
                .collect(Collectors.toList());
            return (ArrayList<Person>) personArrayList;
    }

    public ArrayList<String> specificPersonDetails(ArrayList<Person> personArrayList){
        List<String> personnames = personArrayList.stream().map(it -> it.getfName()).collect(Collectors.toList());
       return (ArrayList<String>) personnames;
    }


    public String apisCall(String coinname){
        RestTemplate restTemplate = new RestTemplate();
//        String fooResourceUrl
//                = "https://api.coingecko.com/api/v3/simple/price?ids=Swipe&vs_currencies=USD";

        String baseUrl = "https://api.coingecko.com/api/v3/simple/price?ids=" + coinname + "&vs_currencies=USD";

        ResponseEntity<String> response
                = restTemplate.getForEntity(baseUrl , String.class);
        System.out.println(response.getStatusCode());
       return response.getBody();
    }

//    public Root restApiExample() {
//        RestTemplate restTemplate = new RestTemplate();
//        String baseUrl = "http://dummy.restapiexample.com/api/v1/employee/1";
//        ResponseEntity<Root> responseEntity = restTemplate.getForEntity(baseUrl, Root.class);
//        System.out.println(responseEntity.getStatusCode());
//        return responseEntity.getBody();
//}


    public Root restApiExample1() {
        RestTemplate restTemplate = new RestTemplate();
        String baseUrl = "http://dummy.restapiexample.com/api/v1/employee/1";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(baseUrl, String.class);
        Root root = JSON.parseObject(responseEntity.getBody(), Root.class);
        System.out.println(responseEntity.getStatusCode());
        root.getData().getEmployee_name();
        return root;

    }

}
