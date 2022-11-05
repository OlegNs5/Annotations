package ro.ctrln.java.annotations;


public class BittnetCourseAnnotated {
    @BittnetAdnotation(location = "Bucuseti",courses =10, category = "Programare")
    public static void main(String[] args) {
        System.out.println("Aceasta este o clasa adnotata");
    }
}

