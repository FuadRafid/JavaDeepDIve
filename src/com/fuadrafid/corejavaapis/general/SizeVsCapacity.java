package com.fuadrafid.corejavaapis.general;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class SizeVsCapacity {
    public static void main(String[] args) throws Exception {
        //In Java - Size: number of elements present. Capacity: No of elements that a data structure can hold.
        ArrayList someList = new ArrayList();
        someList.add("some data");
        System.out.println("Size of arrayList: "+ someList.size());
        System.out.println("Capacity of arrayList: "+ getCapacity(someList));

        //To save memory, list capacity can be trimmed to size
        someList.trimToSize();
        System.out.println("Size of arrayList: "+ someList.size());
        System.out.println("Capacity of arrayList: "+ getCapacity(someList));
    }

    private static int getCapacity(List al) throws Exception {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
    }
}
