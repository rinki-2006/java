class circle{
    private int radius;

    public void setRadius(int r){
        radius = r;
        }
        public void getarea(){
            System.out.println("Area = "+ Math.PI*radius*radius);
        }
    }
    public class datahidingpractise{
        public static void main(String[] args) {
            circle c1 = new circle();
            c1.setRadius(10);
            c1.getarea();
        }
    }


