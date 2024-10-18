package ru.elkathrine.jungle.main;

import ru.elkathrine.jungle.entity.Tiger;
import ru.elkathrine.jungle.service.Events;

public class Main {

    public static void main (String [] args) {
        Tiger tiger = new Tiger();
        Events event = new Events();
        event.activateEvent(tiger);
    }
}
