package exercise1;

public class Driver {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE



        // 1. the reason to use generics is that it allows to store different types in the same storage
        // 2. The benifits are that one doesnt have to create a field for every type


        //Class baCls = BankAccount.class;

        Class<BankAccount> baCls = BankAccount.class;

        Storage<BankAccount> aStorage = new Storage<>();

        Storage<String> sStorage = new Storage<>();

        System.out.println(baCls.getClass().toString());

        try {


            //Object myAccount = baCls.newInstance();
            // 3. Cannot access methods because its of type object

            //BankAccount myAccount =  baCls.newInstance();
            // 4. Cannot instanciate as the new instance will be of a type object.
            BankAccount myAccount =  (BankAccount) baCls.newInstance();
            // 5. works as Obejct type is downcasted to type BankAccount

            aStorage.setValue(myAccount);
            //Deposit
            myAccount.deposit(15);

        } catch (InstantiationException e) {
            // ...
        } catch (IllegalAccessException e) {
            // ... }

        }

        System.out.println( aStorage.getValue().showBalance() );
        if( aStorage.getClass() == sStorage.getClass() ) {
            System.out.println( "EQUAL" );
        } else {
            System.out.println("NOT EQUAL");
        }


    }
}
