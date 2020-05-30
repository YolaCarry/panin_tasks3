package task_5;

public abstract class figura {
    String color;
    double height;
    double weight;
    public void square(){
        System.out.println("Её площадь равна: ");
        System.out.println(weight * height);
    }
    public void perimetr(){
        System.out.println("Её аериметр равен: ");
        System.out.println((weight + height) * 2);
    }
}
