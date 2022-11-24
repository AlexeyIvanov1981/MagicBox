package RuntimeExceptionForMagicBox;

public class IsNotFull extends RuntimeException{
    IsNotFull(boolean isFalse){
        super("Magic box is not full");
    }
}
