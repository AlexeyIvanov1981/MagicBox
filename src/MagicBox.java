import RuntimeExceptionForMagicBox.IsFull;
import RuntimeExceptionForMagicBox.IsNotFull;

public class MagicBox<T> {

    T[] items;

    public MagicBox(int countItem ){
        T[] items = (T[]) new Object[countItem];
    }

    boolean add(T item){
        for (int i = 0; i < items.length; i++) {
            if(items[i] != null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("Magic box is full");
        return false;
    }

    //todo
    public <T> T pick(T[] items, T answer1, T answer2){
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new IsNotFull();
            }
        } throw new IsFull();
    }
}
