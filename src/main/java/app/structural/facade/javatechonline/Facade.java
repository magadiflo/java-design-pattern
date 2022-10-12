package app.structural.facade.javatechonline;

/**
 * Sin embargo, los nombres de los métodos que se muestran a continuación indican claramente lo que hacen.
 * Además, estos métodos ocultan las interacciones de Class1, Class2 y Class3 del código de cliente.
 */
public class Facade {

    public int cuboDeX(int x) {
        Class1 class1 = new Class1();
        return class1.hacerAlgoComplicado(x);
    }

    public int cuboDeX2Veces(int x) {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        return class2.hacerOtraCosa(class1, x);
    }

    public int multiplicarAmbos(int x) {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();
        return class3.hacerMasCosas(class1, class2, x);
    }

}
