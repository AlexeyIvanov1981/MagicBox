public class Main {
    public static void main(String[] args) {

        MagicBox<Integer> magicBox = new MagicBox<Integer>(3);
        magicBox.add(1);
        magicBox.add(22);
        magicBox.pick();
        magicBox.add(333);
        magicBox.add(4444);
        magicBox.pick();


    }
}