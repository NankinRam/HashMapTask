package org.example.task1;

import javax.net.ssl.HostnameVerifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ManagingHouseImpl implements ManagingHouse {

    @Override
    public HashMap<String, House> addNewHouse(HashMap<String,House> store, String homeName, String sigil) {
        House houseAdd = new House(homeName,sigil);
        HashMap<String,House> newStore = store;
        newStore.put(homeName,houseAdd);
        return newStore;
    }

    @Override
    public HashMap<String, House> removeHouse(HashMap<String,House> store, String house) {
        HashMap<String,House> newStore = store;
        newStore.remove(house);
        return newStore;
    }

    @Override
    public void houseSearch(HashMap<String,House> store, String house) {
        HashMap<String,House> newStore = new HashMap<>();
        newStore.put(house,store.get(house));
        printHouse(newStore);
    }

    @Override
    public void outAllHouse(HashMap<String,House> store) {
        printHouse(store);
    }

    private void printHouse(HashMap<String,House> store){
        HashMap<String,House> newStore = store;
        for(Map.Entry<String,House> entry : newStore.entrySet()){
            System.out.println("Дом: " + entry.getValue().home + ", Греб: " + entry.getValue().sigil);
        }
    }
}
