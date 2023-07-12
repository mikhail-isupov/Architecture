package chestfactory;

import chests.Chest;
import chests.SilverChest;

/**
 * Фабрика сундучков с серебром
 */
public class SilverFactory implements iFactory {
    @Override
    public Chest generateChest(){
        return new SilverChest();
    }
}
