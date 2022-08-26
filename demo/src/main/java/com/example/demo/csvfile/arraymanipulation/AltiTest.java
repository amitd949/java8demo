package com.example.demo.csvfile.arraymanipulation;

public class AltiTest {
    public static void main(String[] args) {
String str= "Hello this is the ADMIN user";

        swapStr("Hello Hi test");
    }
    // hello bye
    // bye olleh
    static  void swapStr(String str){
        String[] data= str.split("\\ ");
        StringBuffer sb= new StringBuffer();

        if(data.length==2) {
            sb.append(data[data.length - 1]);
            sb.append( " "+ data[0]);
        }else {
            for (int i = data.length - 2; i >= 1; i--) {
                StringBuffer reverseData = new StringBuffer(data[i]);

                sb.append(" ").append(reverseData.reverse());

            }
            sb.append(" " + data[0]);
        }
        System.out.println("finl o/p is : "+ sb);

    }
}
