import java.util.Scanner;
public class bmi{
    public static void main(String[] agrs){
        Scanner imput=new Scanner(System.in);
        double bmi,w,h;
        System.out.print("hello this program calculate the bmi\n please enter you weigth and heigth");
        w=imput.nextDouble();
        h=imput.nextDouble();
        bmi = w/(h*h);
            if(bmi<18.5)
                System.out.print("underweight");
            else if (18.5 < bmi && bmi< 24.9)
                System.out.print("normal");
            else if(25 < bmi && bmi <29.9)
                System.out.print("overweight");
            else if (30 < bmi)
                System.out.print("obese");
        
    }
}