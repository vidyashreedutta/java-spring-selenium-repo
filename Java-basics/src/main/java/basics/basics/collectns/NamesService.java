package com.company.name.basics.collectns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NamesService {

    public List<NamesDTO> getNamesList(){
        NamesDTO namesDTO = new NamesDTO("vidya", "dutta");
        NamesDTO namesDTO1 = new NamesDTO("ganesh", "rsg");

        ArrayList<NamesDTO>  namesDTOS = new ArrayList<>();
        namesDTOS.add(namesDTO);
        namesDTOS.add(namesDTO1);
        return namesDTOS;

    }

    public Map<String, String> getFamilyDetails(){
        HashMap<String, String> families = new HashMap<>();
        families.put("ganesh", "vidya");
        families.put("abc", "xyz");
        return families;
    }

    public Map<String, NamesDTO> getNamesDetails(){
        HashMap<String, NamesDTO> namesDTOHashMap = new HashMap<>();
//        below geNamesList method gets executed and is stored in namesDTOS-
//        so namesDTOS will have the List of names we got in the first method of the class
        List<NamesDTO> namesDTOS =   getNamesList();
        namesDTOHashMap.put("ganesh", namesDTOS.get(1));
        namesDTOHashMap.put("vidya", namesDTOS.get(0));
        return  namesDTOHashMap;
    }

}
