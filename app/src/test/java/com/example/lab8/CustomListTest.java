package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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

    @Test
    public void hasCityTest(){
        CustomList list = new CustomList(null, citylist);
        City city = new City("Edmonton", "AB");
        assertFalse(list.hasCity(city));
        list.addCity(city);
        assertTrue(list.hasCity(city));

    }


    @Test
    void testDelete() {
        CustomList list = new CustomList(null, citylist);
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    void testCountCities() {
        CustomList list = new CustomList(null, citylist);
        assertEquals(0, list.countCities());
        City city = new City("Regina", "Saskatchewan");
        list.addCity(city);
        assertEquals(1, list.countCities());
        list.deleteCity(city);
        assertEquals(0, list.countCities());
    }


}
