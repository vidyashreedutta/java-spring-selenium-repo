package com.company.name.basics.collectns;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainNames {

    public static void main(String[] args) {

        NamesService namesService = new NamesService();
        List<NamesDTO> namesDTOList = namesService.getNamesList();
//        System.out.println(namesDTOList.get(0));

      Map<String, NamesDTO> namesDTOMap =  namesService.getNamesDetails();
      NamesDTO namesDTO1 = namesDTOMap.get("ganesh");
      namesDTO1.getlName();
      List<String> getKeys1 = new ArrayList<>(namesDTOMap.keySet());
        System.out.println(getKeys1.stream().collect(Collectors.toList()).get(0));
//                        OR

//       List<String> getOnlyKeys = namesDTOMap.keySet().stream().collect(Collectors.toList());
//        System.out.println(getOnlyKeys.get(1));
    }
}
