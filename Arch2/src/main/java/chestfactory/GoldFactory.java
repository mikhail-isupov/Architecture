package chestfactory;

import chests.Chest;
import chests.GoldChest;

/**
 * Фабрика сундучков с золотом
 */
public class GoldFactory implements iFactory {
    @Override
    public Chest generateChest(){
        return new GoldChest();
    }
}
