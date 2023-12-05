import java.util.Scanner;

public class PracticeProblems {

    private Scanner s;
    private boolean quit;

    public PracticeProblems(int num) {
        s = new Scanner(System.in);
        practiceQuestions(num);
        quit = false;
    }

    // generate questions using random number generator
    // if the user isn't quitting, the program gives more practice sets
    private void practiceQuestions(int numQuestions) {
        while (!quit){
            for (int i = 0; i < numQuestions; i++) {
                System.out.println("\u001B[33mQuestion " + (i + 1) + " of " + (numQuestions));
                RESET_COLOR();
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
            s.nextLine();
            System.out.println("\u001B[30m-------------------------------------------------------");
            RESET_COLOR();
            System.out.print("Would you like to do another practice set of " + numQuestions + " questions? (y/n): \u001B[34m");
            String option = s.nextLine().toLowerCase();
            RESET_COLOR();
            if (!option.equals("y")) {
                quit = true;
            }
        }
    }

    // the parameter is the correct answer
    // the user is given 3 tries before the final answer is revealed.
    private void inputAnswer(double answer) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the correct answer (Attempt " + (i + 1) + "/3): \u001B[34m");
            double input = s.nextDouble();
            RESET_COLOR();
            if (input < answer + 0.5 && input > answer - 0.5) {
                System.out.println("\u001B[32mYou entered the question correctly!");
                RESET_COLOR();
                return;
            }
        }
        RESET_COLOR();
    }

    // below are all the problems
    // the values of the questions are randomly generated
    // then, the user inputs the answer
    // the explanation is printed afterward
    private void problemType1() {
        double mass_bag = (int) (Math.random() * 10) + 5;
        double velocity_bag = (int) (Math.random() * 10) + 1;
        double velocity_cart = (int) (Math.random() * 10) + 5;
        double mass_cart = (int) (Math.random() * 50) + 20;
        double answer = Math.round((mass_bag * velocity_bag + velocity_cart * mass_cart) / (mass_bag + mass_cart) * 100) / 100.;

        String question = "A bag, with a mass of " + mass_bag + " kg, is thrown onto a shopping cart at an initial velocity of " + velocity_bag + " m/s. ";
        question += "The shopping cart has a initial velocity of " + velocity_cart + " m/s with a mass of " + mass_cart + " kg. ";
        question += "Find their combined final velocity. (Round to the hundredths place)";
        System.out.println(question);
        inputAnswer(answer);

        System.out.println("\u001B[32mThe correct answer is " + answer + " m/s");
        RESET_COLOR();
        System.out.println("\tYou can use the equations p = mv and pbefore = pafter to solve for the combined final velocity");
    }


    private void problemType2() { // momentum with p = mv
        double mass = (int) (Math.random() * 100) + 30;
        double velocity = (int) (Math.random() * 10) + 1;
        double answer = mass * velocity;

        String question = "A person weighs " + mass + " kg and is running at a velocity of " + velocity + " m/s. Find their momentum.";
        System.out.println(question);
        inputAnswer(answer);

        System.out.println("\u001B[32mThe correct answer is " + answer + " kg * m/s");
        RESET_COLOR();
        System.out.println("You can use the equation p = mv to solve for momentum");
        System.out.println("\tm = " + mass + " kg");
        System.out.println("\tv = " + velocity + " m/s");
        System.out.println("\tp = " + mass + " kg * " + velocity + " m/s");
        System.out.println("\tp = " + answer + " kg * m/s");
    }


    private void problemType3() { // impulse
        double mass = (int) (Math.random() * 40) + 10;
        double initialVelocity = (int) (Math.random() * 50);
        double finalVelocity = (int) (Math.random() * 50) + 50;
        double answer = Math.round(mass * (finalVelocity - initialVelocity) * 100) / 100.;

        String question = "A " + mass + " kg cart is rolling down the street at " + initialVelocity + " m/s. ";
        question += "Identify the magnitude of impulse applied to change its velocity to " + finalVelocity + " m/s.";
        System.out.println(question);
        inputAnswer(answer);

        System.out.println("\u001B[32mThe correct answer is " + answer + " kg * m/s");
        RESET_COLOR();
        System.out.println("You can use the equation J = ∆p and p = mv");
        System.out.println("\tm = " + mass + " kg");
        System.out.println("\t∆v = " + (finalVelocity - initialVelocity) + " m/s");
        System.out.println("\t∆p = " + answer + " kg * m/s");
    }


    private void problemType4() { // velocity
        double mass = (int) ((Math.random() * 1200) + (Math.random() * 1500));
        double momentum = (int) (((Math.random() * 100) + 30) * mass);
        double answer = Math.round(momentum / mass * 100) / 100.;

        String question = "The parking brake on a " + mass + " kg automobile has broken, and the vehicle has reached a momentum of " + momentum + " kg * m/s. ";
        question += "Find the velocity of the vehicle. What is the velocity of the vehicle?";
        System.out.println(question);
        inputAnswer(answer);

        System.out.println("\u001B[32mThe correct answer is " + answer + " m/s");
        RESET_COLOR();
        System.out.println("You can use the equation p = mv to solve for the velocity");
        System.out.println("\tp = " + momentum + " kg * m/s");
        System.out.println("\tm = " + mass + " kg");
        System.out.println("\tv = " + answer + " m/s");
    }


    private void problemType5() { // momentum
        double mass1 = (int) (Math.random() * 1000) + 1000;
        double mass2 = (int) (Math.random() * 1000) + 1000;
        double initialVelocity = (int) (Math.random() * 50) + 10;
        double finalVelocity = (int) (Math.random() * 50);
        double answer = Math.round(((mass1 * initialVelocity) - (mass1 * finalVelocity)) / mass2 * 100) / 100.;

        String question = "A " + mass1 + " kg car travelling at " + initialVelocity + " collides with a " + mass2 + " kg car at rest. ";
        question += "If the " + mass1 + " kg car has a velocity of " + finalVelocity + " m/s after the collision, find the velocity of the " + mass2 + " kg car after the collision.";
        System.out.println(question);
        inputAnswer(answer);

        System.out.println("\u001B[32mThe correct answer is: " + answer + " m/s");
        RESET_COLOR();
        System.out.println("\tSince momentum is conserved, the end velocity of the " + mass2 + " kg car can be solved using the equation p(initial) = p(final).");
        System.out.println("\tp(initial) = sum of initial momentum of both cars");
        System.out.println("\tp(final) = sum of final momentum of both cars");
    }


    private void problemType6(){ // momentum/impulse
        double value2 = (int) ((Math.random() * 1200) + (Math.random() * 1500));;
        double value3 = (int) (Math.random()*20) + 10;
        double value4 = (int) (Math.random()*10) + 10;
        double answer = value2 * value3;

        String question = "Kara Less was applying her makeup when she drove into South's busy parking lot last Friday morning.";
        question += "Kara's " + value2 + " kg car was moving at " + value3 + " m/s and stopped in " + value4 + " seconds:";
        question += " find the impulse of Kara's car.";
        System.out.println(question);
        inputAnswer(answer);

        System.out.println("\u001B[32mThe correct answer is: " + answer + " N * s");
        RESET_COLOR();
        System.out.println("You can use the equations J = Fnet * t = ∆p and a = Fnet/m");
        System.out.println("\ta = ∆v / t");
        System.out.println("\tvf = 0 m/s");
        System.out.println("\tvi = " + value3 + " m/s");
        System.out.println("\tt = " + value4 + " s");
        System.out.println("\ta = (0 m/s - " + value3 + " m/s) / ()" + value4 + " s)");
        System.out.println("\ta = " + value3 / value4 + " m/s^2");
        System.out.println("\tFnet = m * a");
        System.out.println("\tFnet = " + value2 + " kg * "+ value3 / value4 + " m/s^2 = " + value2*value3/value4 + "N");
        System.out.println("\tJ = Fnet * t");
        System.out.println("\tJ = " + value2*value3/value4 + " N * " + value4 + " s");
        System.out.println("\tJ = " + answer + " N * s");
    }

    // resets colored text to default text color
    public static void RESET_COLOR () {
        System.out.print("\u001B[0m");
    }

}