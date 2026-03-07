class TV{
    private int volumeon;   //data member or object property
    private int volumeoff;

    public void setVolumeon(){   //member function or object behaviour
        System.out.println("This is volume on function");
    }

    public void setVolumeoff(){
        System.out.println("This is volume off function");
    }
}

public class classcreation1 {
    public static void main(String[] args) {
        TV T1 = new TV();  //create an object of class TV
        TV T2 = new TV();
        T1.setVolumeon(); // call the function of class TV
        T1.setVolumeoff();
        T2.setVolumeoff();
    }
}
