package RuntimeExceptionForMagicBox;

public class IsFull extends RuntimeException {
    IsFull(boolean isTrue){
        super("Magic box is full");
    }
}
