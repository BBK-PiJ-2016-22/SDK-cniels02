package singleton;

/**
 * Created by Casper on 21/02/2017.
 */
public class AnswerA {

    public static void main(String[] args) {
        // a)

        /* eager will create an instance at run time, even if its never instanciated.
        * this is a waste of resources.
        */
        //EagerSingleton e = EagerSingleton.getInstance();

        /* lazy will only be created when instanciated.
        * it will save resources
        */
        LazySingleton l = LazySingleton.getInstance();

    }
}
