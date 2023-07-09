package chestfactory;

import chests.Chest;
import chests.PearlChest;

/**
 * Фабрика сундучков с жемчугом
 */
public class PearlFactory implements iFactory{
    @Override
    public Chest generateChest() {
        return new PearlChest();
    }
}
