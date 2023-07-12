package chestfactory;

import chests.Chest;
import chests.RubyChest;

/**
 * Фабрика сундучков с рубинами
 */
public class RubyFactory implements  iFactory{
    @Override
    public Chest generateChest() {
        return new RubyChest();
    }
}
