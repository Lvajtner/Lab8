package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomListTest {
    private ArrayList<City> citylist = new ArrayList<>();;

    @Test
    public void addCityTest(){
        CustomList list = new CustomList(null, citylist);
        int listSize = list.getCount();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(list.getCount(), listSize +1);
    }

}
