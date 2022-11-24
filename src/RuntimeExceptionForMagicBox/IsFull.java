package RuntimeExceptionForMagicBox;

public class IsFull extends RuntimeException {
    public IsFull() {
        super("Magic box is full");
    }
}
