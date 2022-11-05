package ro.ctrln.java.deprecated;

/**
 * @deprecated Aceasta clasa vafi in curind scoasa in urmatoarele versiuni {}
 */
@Deprecated
public class Deprecation {

    /**
     * @deprecated Ar trebui sa foloseti alta metoda; incearca {@link #doSomethingNew() doSomethigNew()}
     */
    @Deprecated
    public void doSomething() {

    }

    /**
     * Aceasta ar trebui folosita in locul; {@link #doSomething() doSomethig()}
     */
    public void doSomethingNew() {

    }

}
