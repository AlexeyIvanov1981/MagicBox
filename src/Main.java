public class Main {
    public static void main(String[] args) {

        MagicBox<Integer> magicBox = new MagicBox<Integer>(3);
        magicBox.add(1);
        magicBox.add(22);
        //magicBox.pick();
        magicBox.add(333);
        magicBox.add(4444);
        magicBox.pick();

        MagicBox<String> magicBox2 = new MagicBox<String>(3);
        magicBox2.add("test1");
        magicBox2.add("test22");
        //magicBox2.pick();
        magicBox2.add("test333");
        magicBox2.add("test4444");
        magicBox2.pick();

    }
}