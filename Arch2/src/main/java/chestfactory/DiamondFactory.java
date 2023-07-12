package chestfactory;

import chests.Chest;
import chests.DiamondChest;

/**
 * Фабрика сундучков с алмазами
 */
public class DiamondFactory implements iFactory {
    @Override
    public Chest generateChest() {
        return new DiamondChest();
    }
}
