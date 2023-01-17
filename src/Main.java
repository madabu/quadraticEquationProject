import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, I can solve a quadratic equation for you. Are you ready?");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Before we start, let me explain what a QUADRATIC equation means: ");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("The name Quadratic comes from \"quad\" meaning square, because the variable (x) gets squared.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Its form is: ax squared + bx + c = 0.");


        System.out.println("Now, please give me the value of a: ");
        double a = sc.nextDouble();

        System.out.println("Next, please give me the value of b: ");
        double b = sc.nextDouble();

        System.out.println("Lastly, give me the value of c: ");
        double c = sc.nextDouble();

        double d = b * b - 4.0 * a * c;
        double r = -b/(2 * a);

        if (d > 0.0){
            double r1 = (-b + Math.pow(d,0.5))/ (2.0 * a);
            double r2 = (- b - Math.pow(d, 0.5))/ (2.0 * a);
            System.out.println("The roots are: " + r1 + " and " + r2);
        } else if (d == 0.0) {
            double r1 = -b/(2.0 * a);
            System.out.println("The root is: " + r1);
        }
        else {
            System.out.println("The roots are not real.");
        }

    }
}