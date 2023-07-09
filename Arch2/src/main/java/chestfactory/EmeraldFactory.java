package chestfactory;

import chests.Chest;
import chests.EmeraldChest;

/**
 * Фабрика сундучков с изумрудами
 */
public class EmeraldFactory implements iFactory{
    @Override
    public Chest generateChest(){
        return new EmeraldChest();
    }
}
