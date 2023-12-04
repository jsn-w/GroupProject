import java.util.Scanner;

public class PracticeProblems {

    private Scanner s;

    public PracticeProblems(int num) {
        s = new Scanner(System.in);
        practiceQuestions(num);
    }


    private void practiceQuestions(int numQuestions) {
        for (int i = 0; i < numQuestions; i++) {
            System.out.println("Question " + (i + 1) + " of " + (numQuestions));
            int randomNum = (int) (Math.random() * 6);
            if (randomNum == 0) {
                problemType1();
            } else if (randomNum == 1) {
                problemType2();
            } else if (randomNum == 2) {
                problemType3();
            } else if (randomNum == 3) {
                problemType4();
            } else if (randomNum == 4) {
                problemType5();
            } else if (randomNum == 5) {
                problemType6();
            }
        }
    }


    private void inputAnswer(double answer) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the correct answer (Attempt " + (i + 1) + "/3): ");
            double input = s.nextDouble();
            if (input < answer + 0.5 && input > answer - 0.5) {
                System.out.println("You entered the question correctly!");
                return;
            }
        }
    }


    private void problemType1() {
        double mass_bag = (int) (Math.random() * 10) + 5;
        double velocity_bag = (int) (Math.random() * 10) + 1;
        double velocity_cart = (int) (Math.random() * 10) + 5;
        double mass_cart = (int) (Math.random() * 50) + 20;
        double answer = (mass_bag * velocity_bag + velocity_cart * mass_cart) / (mass_bag + mass_cart);

        String question = "A bag, with a mass of " + mass_bag + " kg, is thrown onto a shopping cart at an initial velocity of " + velocity_bag + " m/s.";
        question += "\nThe shopping cart has a initial velocity of " + velocity_cart + " m/s with a mass of " + mass_cart + " kg.";
        question += "\nFind their combined final velocity. (Round to the hundredths place)";
        System.out.println(question);
        inputAnswer(answer);

        System.out.println("The correct answer is " + answer + " m/s");
        System.out.println("You can use the equations p = mv and pbefore = pafter to solve for the combined final velocity");
        System.out.println("");
    }


    private void problemType2() {
        double mass = (int) (Math.random() * 100) + 30;
        double velocity = (int) (Math.random() * 10) + 1;
        double answer = mass * velocity;

        String question = "A person weighs " + mass + " kg and is running at a velocity of " + velocity + " m/s. Find their momentum.";
        System.out.println(question);
        inputAnswer(answer);

        System.out.println("The correct answer is " + answer + " kg * m/s");
        System.out.println("You can use the equation p = mv to solve for momentum");
        System.out.println("m = " + mass + " kg");
        System.out.println("v = " + velocity + " m/s");
        System.out.println("p = " + mass + " kg * " + velocity + " m/s");
        System.out.println("p = " + answer + " kg * m/s");
    }


    private void problemType3() { // impulse
        double mass = (int) (Math.random() * 50);
        double initialVelocity = (int) (Math.random() * 50);
        double finalVelocity = (int) (Math.random() * 50) + 50;
        double answer = mass * (finalVelocity - initialVelocity);

        String question = "A " + mass + " kg cart is rolling down the street at " + initialVelocity + " m/s. ";
        question += "Identify the magnitude of impulse applied to change its velocity to " + finalVelocity + " m/s.";
        System.out.println(question);
        inputAnswer(answer);

        System.out.println("The correct answer is " + answer + " ");
        System.out.println("You can use the equation J = ∆p and p = mv");
        System.out.println("m = " + mass + " kg");
        System.out.println("∆v = " + (finalVelocity - initialVelocity) + " m/s");
        System.out.println("∆p = " + answer + " kg * m/s");
    }


    private void problemType4() {
        double mass = (int) ((Math.random() * 1200) + (Math.random() * 1500));
        double momentum = (int) (((Math.random() * 100) + 30) * mass);
        double answer = momentum / mass;

        String question = "The parking brake on a " + mass + " kg automobile has broken, and the vehicle has reached a momentum of " + momentum + " kg * m/s. ";
        question += "Find the velocity of the vehicle. What is the velocity of the vehicle?";
        System.out.println(question);
        inputAnswer(answer);

        System.out.println("The correct answer is " + answer);
        System.out.println("You can use the equation p = mv to solve for the velocity");
        System.out.println("p = " + momentum + " kg * m/s");
        System.out.println("m = " + mass + " kg");
        System.out.println("v = " + answer + " m/s");
    }


    private void problemType5() {
        double mass1 = (Math.random() * 1000) + 1000;  // mass of object 1
        double mass2 = (Math.random() * 1000) + 1000;  // mass of object 2
        double initialVelocity = (Math.random() * 50) + 10;      // starting velocity of object 1 
        double finalVelocity = (Math.random() * 50);           // end velocity of object 1
        double answer = ((mass1 * initialVelocity) - (mass1 * finalVelocity)) / mass2;

        String question = "A " + mass1 + " kg car travelling at " + initialVelocity + " collides with a " + mass2 + " kg car at rest.";
        question += "If the " + mass1 + " kg car has a velocity of " + finalVelocity + " m/s after the collision, find the velocity of the " + mass2 + " kg car after the collision.";
        System.out.println(question);
        inputAnswer(answer);

        System.out.println("The correct answer is: " + answer + " m/s");
        System.out.println("Since momentum is conserved, the end velocity of the " + mass2 + " kg car can be solved using the equation p(initial) = p(final).");
        System.out.println("p(initial) = sum of initial momentum of both cars");
        System.out.println("p(final) = sum of final momentum of both cars");
    }


    private void problemType6(){
        double value2 = (int) ((Math.random() * 1200) + (Math.random() * 1500));;
        double value3 = (int) (Math.random()*20) + 10;
        double value4 = (int) (Math.random()*10) + 10;
        double answer = value2 * value3;

        String question = "Kara Less was applying her makeup when she drove into South's busy parking lot last Friday morning.";
        question += "Kara's " + value2 + " kg car was moving at " + value3 + " m/s and stopped in " + value4 + " seconds:";
        question += " find the impulse of Kara's car.";
        System.out.println(question);
        inputAnswer(answer);

        System.out.println("The correct answer is: " + answer + " N * s");
        System.out.println("You can use the equations J = Fnet * t = ∆p and a = Fnet/m");
        System.out.println("a = ∆v / t");
        System.out.println("vf = 0 m/s");
        System.out.println("vi = " + value3 + " m/s");
        System.out.println("t = " + value4 + " s");
        System.out.println("a = (0 m/s - " + value3 + " m/s) / ()" + value4 + " s)");
        System.out.println("a = " + value3 / value4 + " m/s^2");
        System.out.println("Fnet = m * a");
        System.out.println("Fnet = " + value2 + " kg * "+ value3 / value4 + " m/s^2 = " + value2*value3/value4 + "N");
        System.out.println("J = Fnet * t");
        System.out.println("J = " + value2*value3/value4 + "N * " + value4 + " s");
        System.out.println("J = " + answer + " N * s");
    }

}