package com.company.name.basics.strm;

import com.company.name.basics.intrface.IShipping;
import com.company.name.dto.*;
import com.company.name.service.OnlineShippingService;
import com.company.name.service.StorePickupService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//new ArrayList<T>(Arrays.asList(arrayname));
        ArrayList<String> names = new ArrayList<>();
        names.add("Apple");
        names.add("Orange");
        names.add("Apple");
        names.add("Bananna");
          List<String> fruit= names.stream().filter(it-> it.equalsIgnoreCase("Apple")).collect(Collectors.toList());
        System.out.println(fruit.size());


        Person p1 = new Person("Vidya", "Dutta", 32);
        Person p2 = new Person("Ganesh", "Dutta", 35);
        Person p3 = new Person("Sathish", "Dutta", 37);

        ArrayList<Person> ps = new ArrayList<>();
        ps.add(p1);
        ps.add(p2);
        ps.add(p3);

        List<String> personList = ps.stream().filter(it-> it.getAge()>= 35).map(it-> it.getFirstName()).collect(Collectors.toList());
        System.out.println(personList);

            Boolean output = ps.stream().anyMatch(it-> it.getAge()>=35);
            Optional<Person> person1 = ps.stream().filter(it-> it.getAge()>=35).findAny();
         if(person1.isPresent()) {
           Person person =   person1.get();
         }

        IShipping onlineShippingService = new OnlineShippingService();
         onlineShippingService.getShippingInfo("76666");


        StorePickupService storePickupService = new StorePickupService();
        storePickupService.getShippingInfo("67777");


//        abstract
        AnimalAbstract animalAbstract = new Cat();
        System.out.println(animalAbstract.animalSound());
        System.out.println(animalAbstract.getClass().getSimpleName());


        TvAbstract tvAbstract = new LG();
        tvAbstract.tvDetails();
        Samsung samsung = new Samsung();
        samsung.tvDetails();

//        reverse a string and palindrome
        String str = "MOM";
        char newArray[] = str.toCharArray();
        String output22 = "";
        for(int i= newArray.length -1; i>=0; i--){
             output22 += newArray[i];
        }
        System.out.println(output22);
        if(output22.equalsIgnoreCase(str)){
            System.out.println(str + ":its a palindrome");
        }else{
            System.out.println(str +": not a palindrome");
        }

//      FIBONACCI
        int a1=0,a2=1, a3, count =10;
        System.out.println(a1+" "+a2);
        for(int i = 2; i<count; i++){
            a3 = a1 + a2;
            System.out.println(a3);
            a1= a2;
            a2 =a3;


        }


    }
}
