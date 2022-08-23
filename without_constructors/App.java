public class App {
    public static void main(String[] args) {

        Character  knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        Character assasin = new Character();
        assasin.strength = 5;
        assasin.agility = 10;
        assasin.intelligence = 10;
        assasin.name = "Ekko";
        assasin.sayMyName();
        assasin.sayMyStrength();
        assasin.sayMyAgility();
        assasin.sayMyIntelligence();

        Character marksman = new Character();
        marksman.strength = 3;
        marksman.agility = 6;
        marksman.intelligence = 5;
        marksman.name = "Lucian";
        marksman.sayMyName();
        marksman.sayMyStrength();
        marksman.sayMyAgility();
        marksman.sayMyIntelligence();


        Character tank = new Character();
        tank.strength = 10;
        tank.agility = 4;
        tank.intelligence = 3;
        tank.name = "Garen";
        tank.sayMyName();
        tank.sayMyStrength();
        tank.sayMyAgility();
        tank.sayMyIntelligence();

        Character support = new Character();
        support.strength = 8;
        support.agility = 9;
        support.intelligence = 7;
        support.name = "Nautilus";
        support.sayMyName();
        support.sayMyStrength();
        support.sayMyAgility();
        support.sayMyIntelligence();

    }
}
