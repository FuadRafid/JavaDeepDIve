package com.fuadrafid.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Creation {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(); //default
        ArrayList list2 = new ArrayList(10); //set capacity
        ArrayList list3 = new ArrayList(list2); // with another list

        //From Java5,
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();




    }
}
