package com.company.name.basics.strngbasics;

public class Main {

    public static void main(String[] args) {
        String a = "Vidya";
        String b = "Dutta";

        String c = a +" "+b;
        System.out.println(c);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("vidya");
        stringBuffer.append(" ");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ganesh");
        stringBuilder.append(" ");
        stringBuilder.append("ABC");
        System.out.println(stringBuilder);

    }
}
