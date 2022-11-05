package ro.ctrln.java.deprecated;

@SuppressWarnings({"deprecation","uncheked"}) //poti sa ii camunica copilatorului sa treaca peste Warningurile aplicatie tale
public class DepricationUsage {
    public static void main(String[] args) {
        Deprecation deprecation = new Deprecation();
        deprecation.doSomething();
    }
}
