package oops.objectClass;

public class Demo13Finalize {
    public static void main(String[] args) {
        class A {
            @Override
            protected void finalize() throws Throwable {
                super.finalize();
            }
        }
    }
}
