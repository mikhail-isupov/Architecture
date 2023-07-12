package chestfactory;

import chests.BitcoinChest;
import chests.Chest;

/**
 * Фабрика сундучков с биткоинами
 */
public class BitcoinFactory implements iFactory{
    @Override
    public Chest generateChest() {
        return new BitcoinChest();
    }
}
