import RuntimeExceptionForMagicBox.IsFull;
import RuntimeExceptionForMagicBox.IsNotFull;

import java.util.Arrays;

public class MagicBox<T> {

    T[] items;

    public MagicBox(int countItem ){
        T[] items = (T[]) new Object[countItem];
        System.out.println("Array is: " + Arrays.deepToString(items));
    }

    public boolean add(T item){
        for (int i = 0; i < items.length ; i++) {
            if(this.items[i].equals(null)) {
                this.items[i] = item;
                return true;
            }
        }
        return false;
    }

    //todo ((((
    public <T> T pick(T[] items){
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new IsNotFull();
            }
        } throw new IsFull();
    }
}
