public class VariableStorage {

    final double defaultValue = 0;

    private double momentum_mass;
    private double momentum_velocity;
    private double momentum_momentum;

    private double elastic_massOfA;
    private double elastic_initialVelocityA;
    private double elastic_finalVelocityA;
    private double elastic_massOfB;
    private double elastic_initialVelocityB;
    private double elastic_finalVelocityB;

    private double inelastic_massOfA;
    private double inelastic_initialVelocityA;
    private double inelastic_massOfB;
    private double inelastic_initialVelocityB;
    private double inelastic_finalVelocity;
    private double inelastic_finalMass;

    public VariableStorage () {
        momentum_mass = defaultValue;
        momentum_velocity = defaultValue;
        momentum_momentum = defaultValue;

        elastic_massOfA = defaultValue;
        elastic_initialVelocityA = defaultValue;
        elastic_finalVelocityA = defaultValue;
        elastic_massOfB = defaultValue;
        elastic_initialVelocityB = defaultValue;
        elastic_finalVelocityB = defaultValue;

        inelastic_massOfA = defaultValue;
        inelastic_initialVelocityA = defaultValue;
        inelastic_massOfB = defaultValue;
        inelastic_initialVelocityB = defaultValue;
        inelastic_finalVelocity = defaultValue;
        inelastic_finalMass = defaultValue;
    }

    public VariableStorage (double defaultValue) {
        momentum_mass = defaultValue;
        momentum_velocity = defaultValue;
        momentum_momentum = defaultValue;

        elastic_massOfA = defaultValue;
        elastic_initialVelocityA = defaultValue;
        elastic_finalVelocityA = defaultValue;
        elastic_massOfB = defaultValue;
        elastic_initialVelocityB = defaultValue;
        elastic_finalVelocityB = defaultValue;

        inelastic_massOfA = defaultValue;
        inelastic_initialVelocityA = defaultValue;
        inelastic_massOfB = defaultValue;
        inelastic_initialVelocityB = defaultValue;
        inelastic_finalVelocity = defaultValue;
        inelastic_finalMass = defaultValue;
    }

    public void setMomentumMass(double mass) {
        momentum_mass = mass;
    }

    public void setMomentumVelocity(double velocity) {
        momentum_velocity = velocity;
    }

    public void setMomentumMomentum(double momentum) {
        momentum_momentum = momentum;
    }

    public void setElasticMassOfA(double mass) {
        elastic_massOfA = mass;
    }

    public void setElasticInitialVelocityA(double velocity) {
        elastic_initialVelocityA = velocity;
    }

    public void setElasticFinalVelocityA(double velocity) {
        elastic_finalVelocityA = velocity;
    }

    public void setElasticMassOfB(double mass) {
        elastic_massOfB = mass;
    }

    public void setElasticInitialVelocityB(double velocity) {
        elastic_initialVelocityB = velocity;
    }

    public void setElasticFinalVelocityB(double velocity) {
        elastic_finalVelocityB = velocity;
    }

    public void setInelasticMassOfA(double mass) {
        inelastic_massOfA = mass;
    }

    public void setInelasticInitialVelocityA(double velocity) {
        inelastic_initialVelocityA = velocity;
    }

    public void setInelasticMassOfB(double mass) {
        inelastic_massOfB = mass;
    }

    public void setInelasticInitialVelocityB(double velocity) {
        inelastic_initialVelocityB = velocity;
    }

    public void setInelasticFinalVelocity(double velocity) {
        inelastic_finalVelocity = velocity;
    }

    public void setInelasticFinalMass(double mass) {
        inelastic_finalMass = mass;
    }

    public double getMomentumMass() {
        return momentum_mass;
    }

    public double getMomentumVelocity() {
        return momentum_velocity;
    }

    public double getMomentumMomentum() {
        return momentum_momentum;
    }

    public double getElasticMassOfA() {
        return elastic_massOfA;
    }

    public double getElasticInitialVelocityA() {
        return elastic_initialVelocityA;
    }

    public double getElasticFinalVelocityA() {
        return elastic_finalVelocityA;
    }

    public double getElasticMassOfB() {
        return elastic_massOfB;
    }

    public double getElasticInitialVelocityB() {
        return elastic_initialVelocityB;
    }

    public double getElasticFinalVelocityB() {
        return elastic_finalVelocityB;
    }

    public double getInelasticMassOfA() {
        return inelastic_massOfA;
    }

    public double getInelasticInitialVelocityA() {
        return inelastic_initialVelocityA;
    }

    public double getInelasticMassOfB() {
        return inelastic_massOfB;
    }

    public double getInelasticInitialVelocityB() {
        return inelastic_initialVelocityB;
    }

    public double getInelasticFinalVelocity() {
        return inelastic_finalVelocity;
    }

    public double getInelasticFinalMass() {
        return inelastic_finalMass;
    }

    public void Momentum_solveForMomentum() {
        momentum_momentum = momentum_mass * momentum_velocity;
    }

    public void Momentum_solveForMass() {
        momentum_mass = momentum_momentum / momentum_velocity;
    }

    public void Momentum_solveForVelocity() {
        momentum_velocity = momentum_momentum / momentum_mass;
    }
}