public class Print {

    private VariableStorage n;

    public Print(VariableStorage store) {
        n = store;
    }

    // prints main menu of the program
    public static void mainMenu () {
        System.out.println("\u001B[36m-------------------------------------------------------\u001B[0m");
        System.out.println("MAIN MENU");
        System.out.println("\t1) Print values");
        System.out.println("\t2) Enter values");
        System.out.println("\t3) Practice problems");
        System.out.println("\t4) Clear values");
        System.out.println("\t5) Quit");
    }

    // prints all values for momentum
    public void momentumValues () {
        System.out.println("\u001B[35m-------------- MOMENTUM --------------\u001B[0m");

        if (n.getMomentumMomentum() == 0) {
            System.out.println("\t1) Momentum: no value");
        } else {
            System.out.println("\t1) Momentum: \u001B[34m" + n.getMomentumMomentum() + " kg * m/s");
        }
        RESET_COLOR();

        if (n.getMomentumMass() == 0) {
            System.out.println("\t2) Mass:     no value");
        } else {
            System.out.println("\t2) Mass:     \u001B[34m" + n.getMomentumMass() + " kg");
        }
        RESET_COLOR();

        if (n.getMomentumVelocity() == 0) {
            System.out.println("\t3) Velocity: no value");
        } else {
            System.out.println("\t3) Velocity: \u001B[34m" + n.getMomentumVelocity() + " m/s\n");
        }
        RESET_COLOR();
    }

    // prints all values for elastic collisions
    public void elasticValues () {
        System.out.println("\u001B[35m--------- ELASTIC COLLISIONS ---------\u001B[0m");
        System.out.println("\t\u001B[30mObject A: ");
        System.out.println("\t\tMass:             " + n.getElasticMassOfA());
        System.out.println("\t\tInitial Velocity: " + n.getElasticInitialVelocityA());
        System.out.println("\t\tFinal Velocity:   " + n.getElasticFinalVelocityA());
        System.out.println("\tObject B: ");
        System.out.println("\t\tMass:             " + n.getElasticMassOfB());
        System.out.println("\t\tInitial Velocity: " + n.getElasticInitialVelocityB());
        System.out.println("\t\tFinal Velocity:   " + n.getElasticFinalVelocityB() + "\n");
        RESET_COLOR();
    }

    // prints all values for inelastic collisions
    public void inelasticValues () {
        System.out.println("\u001B[35m-------- INELASTIC COLLISIONS --------\u001B[0m");
        System.out.println("\t\u001B[30m  Object A: ");
        System.out.println("\t\tMass:             " + n.getInelasticMassOfA());
        System.out.println("\t\tInitial Velocity: " + n.getInelasticInitialVelocityA());
        System.out.println("\tObject B: ");
        System.out.println("\t\tMass:             " + n.getInelasticMassOfB());
        System.out.println("\t\tInitial Velocity: " + n.getInelasticInitialVelocityB());
        System.out.println("\tFinal mass:     " + n.getInelasticFinalMass());
        System.out.println("\tFinal velocity: " + n.getInelasticFinalVelocity() + "\n");
        RESET_COLOR();
    }

    // resets the color of the text to the default color
    public static void RESET_COLOR () {
        System.out.print("\u001B[0m");
    }
}