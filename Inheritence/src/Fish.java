import com.company.Animal;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins){
        super(name, 1,1, size, weight);
    }
    private void rest(){

    };
    private  void moveMuscles(){

    }
    private void  moveFins(){

    }
    private void swim(int speed){
        moveMuscles();
        moveFins();
        super.move(speed );
    }



}
