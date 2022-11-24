package RuntimeExceptionForMagicBox;

public class IsNotFull extends RuntimeException {
    public IsNotFull() {
        super("Magic box is not full");
    }
}
