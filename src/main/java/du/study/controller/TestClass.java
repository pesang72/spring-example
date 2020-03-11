package du.study.controller;

import java.util.*;

public class TestClass {
    public static void main(String[] args){

        Map<String,String> map = new HashMap<>();


        //map.put("key1","비오는 일요일");
        //map.put("key2","hi");
        //map.put("key3","내일이 월요일이라니 ㅠㅠ");

        map.computeIfAbsent("key1",(key) -> computeTest(key));
        map.computeIfAbsent("key1",(key) -> computeTest(key));
        map.computeIfAbsent("key3",(key) -> computeTest(key));
        map.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        map.computeIfAbsent("key4",(key) -> computeTest(key));
        map.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));
    }

    private static String computeTest(String key){
        return key +" compute Test";
    }
    private static String nullFun(){
        return null;
    }
}
