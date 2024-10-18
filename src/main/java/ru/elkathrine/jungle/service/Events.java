package ru.elkathrine.jungle.service;

import ru.elkathrine.jungle.entity.Tiger;

public class Events {

    //to sleep +20 ep // + 10 hp
    //to run from a hunter -5 ep
    //to swim -10 ep
    //to jump - 3 ep
    //to fight a hunter - 20 hp
    //to eat a fish - 15 ep // + 10 hp
    //to eat a deer - 25 ep // + 20 hp
    //to hunt - 20 ep
    //to fight a leon - 20 hp
    //being shot - 30 hp


    public void activateEvent(Tiger tiger) {
        Math.random();
        while (checkStatus(tiger)) {
            int eventNumber = (int) (Math.random() * 100);
            if (eventNumber >= 0 && eventNumber < 10) {
                runFromHunterEvent(tiger);
            } else if (eventNumber >= 10 && eventNumber < 20) {
                jumpEvent(tiger);
            } else if (eventNumber >= 20 && eventNumber < 30) {
                shotEvent(tiger);
            } else if (eventNumber >= 30 && eventNumber < 40) {
                sleepEvent(tiger);
            } else if (eventNumber >= 40 && eventNumber < 50) {
                swimEvent(tiger);
            } else if (eventNumber >= 50 && eventNumber < 60) {
                eatFishEvent(tiger);
            } else if (eventNumber >= 60 && eventNumber < 70) {
                eatDearEvent(tiger);
            } else if (eventNumber >= 70 && eventNumber < 80) {
                fightLionEvent(tiger);
            } else if (eventNumber >= 80 && eventNumber < 90) {
                huntEvent(tiger);
            } else if (eventNumber >= 90 && eventNumber < 100) {
                fightHunterEvent(tiger);
            }
        }

        System.out.println(" ");
        System.out.println("К сожалению, тигр этого не пережил и его жизнь оборвалась ");
    }


    public static void runFromHunterEvent(Tiger tiger) {
        int energy = tiger.getEnergy();
        energy = energy - 5;
        tiger.setEnergy(energy);
        checkEnergy(tiger);
        System.out.println("Тигру пришлось убегать от охотника (-5 энергии) " + '\u2764' + tiger.getHealth() + '\u21AF' + tiger.getEnergy());
    }

    public static void jumpEvent(Tiger tiger) {
        int energy = tiger.getEnergy();
        energy = energy - 3;
        tiger.setEnergy(energy);
        checkEnergy(tiger);
        System.out.println("Тигр прыгал через препятствия (-3 энергии) " + '\u2764' + tiger.getHealth() + '\u21AF' + tiger.getEnergy());
    }

    public static void shotEvent(Tiger tiger) {
        int health = tiger.getHealth();
        health = health - 30;
        tiger.setHealth(health);
        checkEnergy(tiger);
        System.out.println("К сожалению, тигр был подстрелен (-30 здоровья) " + '\u2764' + tiger.getHealth() + '\u21AF' + tiger.getEnergy());
    }

    public static void sleepEvent(Tiger tiger) {
        int energy = tiger.getEnergy();
        energy = energy + 20;
        tiger.setEnergy(energy);
        int health = tiger.getHealth();
        health = health + 10;
        tiger.setHealth(health);
        checkEnergy(tiger);
        System.out.println("Восстановить силы тигру помог сон: он поспал (+20 энергии, +10 здоровья) " + '\u2764' + tiger.getHealth() + '\u21AF' + tiger.getEnergy());
    }

    public static void swimEvent(Tiger tiger) {
        int energy = tiger.getEnergy();
        energy = energy - 10;
        tiger.setEnergy(energy);
        checkEnergy(tiger);
        System.out.println("Тигр поплыл на охоту за рыбой (-10 энергии) " + '\u2764' + tiger.getHealth() + '\u21AF' + tiger.getEnergy());
    }

    public static void eatFishEvent(Tiger tiger) {
        int energy = tiger.getEnergy();
        energy = energy - 15;
        tiger.setEnergy(energy);
        int health = tiger.getHealth();
        health = health + 10;
        tiger.setHealth(health);
        checkEnergy(tiger);
        System.out.println("Тигр подкрепился свежей рыбой (-15 энергии, +10 здоровья) " + '\u2764' + tiger.getHealth() + '\u21AF' + tiger.getEnergy());
    }

    public static void fightLionEvent(Tiger tiger) {
        int health = tiger.getHealth();
        health = health - 20;
        tiger.setHealth(health);
        checkEnergy(tiger);
        System.out.println("На тигра напал лев и ему пришлось отбиваться (-20 здоровья) " + '\u2764' + tiger.getHealth() + '\u21AF' + tiger.getEnergy());
    }

    public static void huntEvent(Tiger tiger) {
        int energy = tiger.getEnergy();
        energy = energy - 10;
        tiger.setEnergy(energy);
        checkEnergy(tiger);
        System.out.println("Тигр отправился на охоту (-10 энергии) " + '\u2764' + tiger.getHealth() + '\u21AF' + tiger.getEnergy());
    }

    public static void eatDearEvent(Tiger tiger) {
        int energy = tiger.getEnergy();
        energy = energy - 25;
        tiger.setEnergy(energy);
        int health = tiger.getHealth();
        health = health + 20;
        tiger.setHealth(health);
        checkEnergy(tiger);
        System.out.println("Тигр вдоволь пообедал оленем, это улучшило его состояние (-25 энергии, +20 здоровья) " + '\u2764' + tiger.getHealth() + '\u21AF' + tiger.getEnergy());
    }

    public static void fightHunterEvent(Tiger tiger) {
        int health = tiger.getHealth();
        health = health - 20;
        tiger.setHealth(health);
        checkEnergy(tiger);
        System.out.println("Вдруг из-за кустов на тигра напал охотник, пришлось с ним драться (-20 здоровья) " + '\u2764' + tiger.getHealth() + '\u21AF' + tiger.getEnergy());
    }

    private static boolean checkStatus(Tiger tiger) {
        if (tiger.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    private static void checkEnergy(Tiger tiger) {
        if (tiger.getEnergy() <= 0) {
            int health = tiger.getHealth();
            health = health;
            if (health < 0) {
                health = 0;
            }
            tiger.setHealth(health);
        }
    }

}
