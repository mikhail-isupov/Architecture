package chests;

import treasures.Treasures;

/**
 * Абстрактный сундучок
 */
public abstract class Chest {
    private Treasures treasure; //Какое сокровище в судучке

    public Chest(Treasures treasure) {
        this.treasure = treasure; // Положили в сундучок сокровище
    }

    public final Treasures open() {
        Treasures chestItem = this.treasure; //Извлекли из сундучка содержимое
        this.treasure = Treasures.EMPTY; //Положили пустоту в сундучок
        return chestItem;
    }


}
