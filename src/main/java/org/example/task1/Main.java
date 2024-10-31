package org.example.task1;

import org.example.additional.SeparatorOut;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,House> storageInfo = new HashMap<>();
        storageInfo.put("Старк",new House("Старк","Волк"));
        storageInfo.put("Ланнистер",new House("Ланнистер","Лев"));
        storageInfo.put("Баратеон",new House("Баратеон","Олень"));

        ManagingHouse managingHouse = new ManagingHouseImpl();

        // Выводим все дома
        managingHouse.outAllHouse(storageInfo);

        SeparatorOut.separatorOut();

        // Добавляем новый дом
        managingHouse.addNewHouse(storageInfo,"Таргариен","трёхголовый красный дракон на чёрном поле");
        managingHouse.outAllHouse(storageInfo);

        SeparatorOut.separatorOut();

        // Удаляем дом Старк
        managingHouse.removeHouse(storageInfo,"Старк");
        managingHouse.outAllHouse(storageInfo);

        SeparatorOut.separatorOut();

        // Находим и выводим герб дома Ланнистер
        managingHouse.houseSearch(storageInfo,"Ланнистер");


    }
}
