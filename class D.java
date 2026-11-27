
package package2;

import package1.A;

public class D {

    public static void main(String[] args) {

        A obj = new A();

        System.out.println("Public: " + obj.publicVar);

        // Not accessible outside the package
        // System.out.println(obj.privateVar);
        // System.out.println(obj.protectedVar);
        // System.out.println(obj.defaultVar);
    }
}
