package ro.ctrln.java.override;

public class JavaCouse extends BittnetCouse{

    @Override //@Overrride apare cind metoda este mostenita dintr-o super classa, sau clasa parinte
    public String printMessage(String message) {
        return super.printMessage(message);
    }
}
