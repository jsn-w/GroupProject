import java.util.Scanner;

public class Logic {

    private final double defVal;
    private VariableStorage storage;
    private Print p;
    final private Scanner s;

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


    public int input (int numValues) {
        int input;
        do {
            System.out.print("Enter a valid option: ");
            input = s.nextInt();
            s.nextLine();
        } while (input < 1 || input > numValues + 1);
        return input;
    }


    public void checkOption(int choice) {
        if (choice == 1) {
            System.out.print("Would you like all values to be printed?: ");
            String filler = s.nextLine();
            if (filler.equals("y")) {
                printValues(true);
            } else {
                printValues();
            }
        } else if (choice == 2) {
            enterValues();
        } else if (choice == 3) {
            System.out.print("How many questions would you like to answer?: ");
            int numQuestions = s.nextInt();
            s.nextLine();
            new PracticeProblems(numQuestions);
        } else if (choice == 4) {
            clearValues();
        }
    }


    public void printValues () {
        p.momentumValues();
    }


    public void printValues (boolean allValues) {
        p.momentumValues();
//        p.elasticValues();
//        p.inelasticValues();
    }


    public void enterValues () {

        System.out.println("1) Momentum");
//        System.out.println("X) Elastic Collisions    (to be done in the future)");
//        System.out.println("X) Inelastic Collisions  (to be done in the future)");
        int input = input(3);
        int option;

        if (input == 1) {
            p.momentumValues();
            System.out.print("What would you like to enter?: ");
            option = s.nextInt();

            if (option == 1) {
                if (storage.getMomentumMomentum() == defVal) {
                    System.out.print("Enter the momentum (kg * m/s): ");
                    storage.setMomentumMomentum(s.nextDouble());
                } else {
                    System.out.println("You already entered the momentum.");
                }

            } else if (option == 2) {
                if (storage.getMomentumMass() == defVal) {
                    System.out.print("Enter the mass (kg): ");
                    storage.setMomentumMass(s.nextDouble());
                } else {
                    System.out.print("You already entered the mass.");
                }

            } else if (option == 3) {
                if (storage.getMomentumVelocity() == defVal) {
                    System.out.println("Enter the velocity (m/s): ");
                    storage.setMomentumVelocity(s.nextDouble());
                } else {
                    System.out.println("You already entered the velocity.");
                }
            }
            s.nextLine();
//        } else {
//            System.out.println("This is to be implemented in the future");
        }
        solveForValues();
    }


    public void clearValues () {
        storage = new VariableStorage();
        p = new Print(storage);
    }


    public void solveForValues() {
        if (storage.getMomentumMomentum() == defVal && storage.getMomentumMass() != defVal && storage.getMomentumVelocity() != defVal) {
            storage.Momentum_solveForMomentum();
            System.out.print("Since you have the value of mass and velocity, ");
            System.out.println("momentum = " + storage.getMomentumMass() + " kg * " + storage.getMomentumVelocity() + " m/s = " + storage.getMomentumMomentum() + " kg * m/s");
        }

        if (storage.getMomentumMomentum() != defVal && storage.getMomentumMass() == defVal && storage.getMomentumVelocity() != defVal) {
            storage.Momentum_solveForMass();
            System.out.print("Since you have the value of momentum and velocity, ");
            System.out.println("mass = " + storage.getMomentumMomentum() + " kg * m/s / " + storage.getMomentumVelocity() + " m/s = " + storage.getMomentumMass() + " kg");
        }

        if (storage.getMomentumMomentum() != defVal && storage.getMomentumMass() != defVal && storage.getMomentumVelocity() == defVal) {
            storage.Momentum_solveForVelocity();
            System.out.print("Since you have the value of momentum and mass, ");
            System.out.println("velocity = " + storage.getMomentumMomentum() + " kg * m/s / " + storage.getMomentumMass() + " kg = " + storage.getMomentumVelocity() + " m/s");
        }
    }

}