package org.example.task1;

import java.util.HashMap;

public interface ManagingHouse {

    public HashMap<String,House> addNewHouse(HashMap<String,House> store, String homeName, String sigil);

    public HashMap<String,House> removeHouse(HashMap<String,House> store, String house);

    public void houseSearch(HashMap<String,House> store, String house);

    public void outAllHouse(HashMap<String,House> store);

}
