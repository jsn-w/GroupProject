import java.util.Scanner;

public class Logic {

    private final double defVal;
    private VariableStorage storage;
    private Print p;
    final private Scanner s;

    // class constructor
    public Logic(double defVal) {
        this.defVal = defVal;
        s = new Scanner(System.in);
        storage = new VariableStorage();
        p = new Print(storage);

        int value = 0;
        while (value != 5) {
            Print.mainMenu();
            value = input(5);
            checkOption(value);
        }
    }

    // input checks for all integer inputs
    public int input (int numValues) {
        int input;
        do {
            System.out.print("Enter a valid option: \u001B[34m");
            input = s.nextInt();
            RESET_COLOR();
            s.nextLine();
        } while (input < 1 || input > numValues + 1);
        return input;
    }


    public void checkOption(int choice) { // displays corresponding options depending on input()
        if (choice == 1) {
            System.out.print("Would you like all values to be printed? (y/n): \u001B[34m");
            String filler = s.nextLine();
            RESET_COLOR();
            if (filler.equals("y")) {
                printValues(true);
            } else {
                printValues();
            }
        } else if (choice == 2) {
            enterValues();
        } else if (choice == 3) {
            System.out.print("How many questions per practice set?: \u001B[34m");
            int numQuestions = s.nextInt();
            RESET_COLOR();
            s.nextLine();
            new PracticeProblems(numQuestions);
        } else if (choice == 4) {
            clearValues();
        }
    }


    // print values for momentum
    public void printValues () {
        p.momentumValues();
    }

    // print all values
    public void printValues (boolean allValues) {
        p.momentumValues();
        p.elasticValues();
        p.inelasticValues();
    }


    public void enterValues () {
        System.out.println("1) Momentum");
        System.out.println("\u001B[30mX) Elastic Collisions    (to be done in the future)");
        System.out.println("X) Inelastic Collisions  (to be done in the future)");
        RESET_COLOR();

        int input = input(3);
        int option;

        if (input == 1) {
            p.momentumValues();
            System.out.print("What would you like to enter?: \u001B[34m");
            option = s.nextInt();
            RESET_COLOR();

            if (option == 1) {
                if (storage.getMomentumMomentum() == defVal) {
                    System.out.print("Enter the momentum (kg * m/s): \u001B[34m");
                    storage.setMomentumMomentum(s.nextDouble());
                } else {
                    System.out.println("\u001B[31mYou already entered the momentum.");
                }

            } else if (option == 2) {
                if (storage.getMomentumMass() == defVal) {
                    System.out.print("Enter the mass (kg): \u001B[34m");
                    storage.setMomentumMass(s.nextDouble());
                } else {
                    System.out.println("\u001B[31mYou already entered the mass.");
                }

            } else if (option == 3) {
                if (storage.getMomentumVelocity() == defVal) {
                    System.out.print("Enter the velocity (m/s): \u001B[34m");
                    storage.setMomentumVelocity(s.nextDouble());
                } else {
                    System.out.println("\u001B[31mYou already entered the velocity.");
                }
            }
            RESET_COLOR();
            s.nextLine();
        } else {
            System.out.println("This is to be implemented in the future");
        }
        solveForValues();
    }

    // clear all existing variable values
    public void clearValues () {
        storage = new VariableStorage();
        p = new Print(storage);
    }

    // solve for values if all the other variables needed are inputted
    public void solveForValues() {
        if (storage.getMomentumMomentum() == defVal && storage.getMomentumMass() != defVal && storage.getMomentumVelocity() != defVal) {
            storage.Momentum_solveForMomentum();
            System.out.print("\u001B[32mSince you have the value of mass and velocity, ");
            System.out.println("momentum = " + storage.getMomentumMass() + " kg * " + storage.getMomentumVelocity() + " m/s = " + storage.getMomentumMomentum() + " kg * m/s");
        }

        if (storage.getMomentumMomentum() != defVal && storage.getMomentumMass() == defVal && storage.getMomentumVelocity() != defVal) {
            storage.Momentum_solveForMass();
            System.out.print("\u001B[32mSince you have the value of momentum and velocity, ");
            System.out.println("mass = " + storage.getMomentumMomentum() + " kg * m/s / " + storage.getMomentumVelocity() + " m/s = " + storage.getMomentumMass() + " kg");
        }

        if (storage.getMomentumMomentum() != defVal && storage.getMomentumMass() != defVal && storage.getMomentumVelocity() == defVal) {
            storage.Momentum_solveForVelocity();
            System.out.print("\u001B[32mSince you have the value of momentum and mass, ");
            System.out.println("velocity = " + storage.getMomentumMomentum() + " kg * m/s / " + storage.getMomentumMass() + " kg = " + storage.getMomentumVelocity() + " m/s");
        }
        RESET_COLOR();
    }

    public static void RESET_COLOR() {
        System.out.print("\u001B[0m");
    }

}