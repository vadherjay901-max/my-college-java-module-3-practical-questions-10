
package package1;

public class B {

    public static void main(String[] args) {

        A obj = new A();

        System.out.println("Public: " + obj.publicVar);
        // System.out.println(obj.privateVar); // Error
        System.out.println("Protected: " + obj.protectedVar);
        System.out.println("Default: " + obj.defaultVar);
    }
}
