class Shape {}
class Quadrilateral extends Shape {}
class Triangle extends Shape{}

public class Account{
    public static void main(String[] args){
        Shape shape = new Quadrilateral();
        Quadrilateral quadrilateral = new Quadrilateral();

        //Triangle tri = (Triangle)quadrilateral;

        System.out.println(Math.round(Math.random() * 10));
    }
}