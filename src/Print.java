public class Print {

    private VariableStorage n;

    public Print(VariableStorage store) {
        n = store;
    }

    public static void mainMenu () {
        System.out.println("-------------------------------------------------------");
        System.out.println("MAIN MENU");
        System.out.println("\t1) Print values");
        System.out.println("\t2) Enter values");
        System.out.println("\t3) Practice problems");
        System.out.println("\t4) Clear values");
        System.out.println("\t5) Quit");
    }

    public void momentumValues () {
        System.out.println("----------- MOMENTUM -----------");

        if (n.getMomentumMomentum() == 0) {
            System.out.println("\t1) Momentum: no value");
        } else {
            System.out.println("\t1) Momentum: " + n.getMomentumMomentum() + " kg * m/s");
        }

        if (n.getMomentumMass() == 0) {
            System.out.println("\t2) Mass:     no value");
        } else {
            System.out.println("\t2) Mass:     " + n.getMomentumMass() + " kg");
        }

        if (n.getMomentumVelocity() == 0) {
            System.out.println("\t3) Velocity: no value");
        } else {
            System.out.println("\t3) Velocity: " + n.getMomentumVelocity() + " m/s\n");
        }
    }

//    public void elasticValues () {
//        System.out.println("------ ELASTIC COLLISIONS ------");
//        System.out.println("\tObject A: ");
//        System.out.println("\t\t            Mass: " + n.getElasticMassOfA());
//        System.out.println("\t\tInitial Velocity: " + n.getElasticInitialVelocityA());
//        System.out.println("\t\t  Final Velocity: " + n.getElasticFinalVelocityA());
//        System.out.println("\tObject B: ");
//        System.out.println("\t\t            Mass: " + n.getElasticMassOfB());
//        System.out.println("\t\tInitial Velocity: " + n.getElasticInitialVelocityB());
//        System.out.println("\t\t  Final Velocity: " + n.getElasticFinalVelocityB() + "\n");
//    }
//
//    public void inelasticValues () {
//        System.out.println("----- INELASTIC COLLISIONS -----");
//        System.out.println("\t  Object A: ");
//        System.out.println("\t\tMass:             " + n.getInelasticMassOfA());
//        System.out.println("\t\tInitial Velocity: " + n.getInelasticInitialVelocityA());
//        System.out.println("\t  Object B: ");
//        System.out.println("\t\tMass:             " + n.getInelasticMassOfB());
//        System.out.println("\t\tInitial Velocity: " + n.getInelasticInitialVelocityB());
//        System.out.println("\tFinal mass: " + n.getInelasticFinalMass());
//        System.out.println("\tFinal velocity: " + n.getInelasticFinalVelocity() + "\n");
//    }
}