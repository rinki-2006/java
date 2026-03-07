class coffeemachine{
    private float coffeeqty;
    private float milkqty;
    private float waterqty;
    private float sugarqty;

    static private coffeemachine our = null;
    private coffeemachine(){
        coffeeqty = 1;
        milkqty = 1;
        waterqty = 1;
        sugarqty = 1;
    }
    static coffeemachine getInstance(){
        if(our==null){
            our = new coffeemachine();
        }
        return our;
    }
}
public class singleton {
    public static void main(String[] args) {
        coffeemachine m1 = coffeemachine.getInstance();
        coffeemachine m2 = coffeemachine.getInstance();
        coffeemachine m3 = coffeemachine.getInstance();

        System.out.println(m1 + " " + m2 + " " + m3);
        if(m1==m2 && m1==m3){
            System.out.println("same");
        }
    }
}
