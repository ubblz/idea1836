package test;

import java.util.ArrayList;
import java.util.List;


public class Test implements ICustom {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args){
        System.out.println("test");
        List<String> list = new ArrayList<>();
        list.add("dfdf");
        for(String s : list){
            System.out.println(s);
        }
        myMethod();
        
    }


    public static void myMethod(){
        System.out.println("myMethod");
    }

    @Override
    public void custom() {

    }
}
