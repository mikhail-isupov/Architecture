package chestapp;


import chestfactory.*;
import chests.Chest;
import chests.RubyChest;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        List<Chest> chests = new ArrayList<>(); // Список сундучков
        List<iFactory> factories = new ArrayList<>(); //Список фабрик
        //Составляем список фабрик
        factories.add(new GoldFactory());
        factories.add(new SilverFactory());
        factories.add(new DiamondFactory());
        factories.add(new EmeraldFactory());
        factories.add(new RubyFactory());
        factories.add(new PearlFactory());
        factories.add(new BitcoinFactory());



        for (iFactory factory : factories) {
            chests.add(factory.generateChest()); //Перебираем все фабрики и каждая делает по сундучку
        }

        for(Chest chest : chests){
            System.out.println(chest.open());//Открыли сундучок, достали сокровище
            System.out.println(chest.open());//Открыли сундучок повторно, достали пустоту
        }
    }
}
