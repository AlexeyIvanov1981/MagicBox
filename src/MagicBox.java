import RuntimeExceptionForMagicBox.IsNotFull;

import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    T[] items;

    public MagicBox(int countItem) {
        T[] items = (T[]) new Object[countItem];
        this.items = items;
        System.out.println("Array is: " + Arrays.deepToString(items));
    }

    public boolean add(T item) {
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] == null) {
                this.items[i] = item;
                System.out.println("item added");
                System.out.println("Array is: " + Arrays.deepToString(items));
                return true;
            }
        }
        System.out.println("item '" + item + "' not added");
        return false;
    }

    public <T> T pick() {
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] == null) {
                throw new IsNotFull();
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return (T) ("Random item is: " + this.items[randomInt]);
    }
}
