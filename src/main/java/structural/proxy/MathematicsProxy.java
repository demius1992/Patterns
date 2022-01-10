package structural.proxy;

// proxy class
class MathematicsProxy implements IMathematics {

    // a mathematical object whose mathematical operations are hidden
    private Mathematics math;

    public MathematicsProxy() {
        math = new Mathematics();
    }

    // invoke hidden operations
    @Override
    public double Addition(double x, double y) {
        return math.Addition(x, y);
    }

    @Override
    public double Subtraction(double x, double y) {
        return math.Subtraction(x, y);
    }

    @Override
    public double Multiplication(double x, double y) {
        return math.Multiplication(x, y);
    }

    @Override
    public double Division(double x, double y) {
        return math.Division(x, y);
    }
}
