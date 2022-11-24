public class MagicBox {

    public int[] item;

    public MagicBox(int countItem ){
        this.item = new int[countItem];
    }

    boolean add(int item){
        for (int i = 0; i < this.item.length; i++) {
            if(this.item[i] != 0){
                this.item[i] = item;
                return true;
            }
        }
        return false;
    }
}
