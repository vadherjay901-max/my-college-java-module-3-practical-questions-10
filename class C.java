
package package2;

import package1.A;

public class C extends A {

    public void display() {

        System.out.println("Public: " + publicVar);

        // Private member cannot be accessed
        // System.out.println(privateVar);

        // Protected member accessible through inheritance
        System.out.println("Protected: " + protectedVar);

        // Default member cannot be accessed
        // System.out.println(defaultVar);
    }
}
