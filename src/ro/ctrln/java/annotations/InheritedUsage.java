package ro.ctrln.java.annotations;

public class InheritedUsage {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Pisica pisica = new Pisica();
        Ragdoll ragdoll = new Ragdoll();

        System.out.println(animal.getClass().getAnnotation(AdnotareMostenita.class));
        System.out.println(pisica.getClass().getAnnotation(AdnotareMostenita.class));
        System.out.println(ragdoll.getClass().getAnnotation(AdnotareMostenita.class));
        System.out.println(animal.getClass().getAnnotation(AdnotariNemostenite.class));
    }
}
