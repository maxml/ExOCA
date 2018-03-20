package com.maxml.oca;

public class SixthTheme {

    public static void main(String[] Args) {
//        try {
//            exException();
//        } catch (Exception ex) {
//        } catch (OpenException e) {
//            System.out.println("sdfsd");
//        } catch (CloseException e) {
//            System.out.println("asdfvsd");
//        }

//        C obj = exExtends();
//        System.out.println(obj.toString());
//        System.out.println(obj instanceof C);
//        System.out.println(obj instanceof A);

//        try {
//            exAutoCloseable2();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        exError();

//        exFailClose();
    }


    private static class OpenException extends Exception {
    }

    private static class CloseException extends Exception {
    }

    // https://docs.oracle.com/javase/8/docs/technotes/guides/language/catch-multiple.html
    private static void exException() throws OpenException, CloseException {
        // more precise rethrow
        boolean flag = true;
        try {
            if (flag) {
                throw new OpenException();
            } else {
                throw new CloseException();
            }
        } catch (Exception e) {
            throw e;
        }

//        try {
//            throw new Error();
//        } catch (Throwable e) {
//            throw e;
//        }
    }

    private static class A extends C {
        @Override
        public String toString() {
            return "A";
        }
    }

    private static class B extends C {
        @Override
        public String toString() {
            return "B";
        }
    }

    private static class C {
        @Override
        public String toString() {
            return "C";
        }
    }

    private static C exExtends() {
        boolean flag = true;
        if (flag) {
            return new A();
        } else {
            return new B();
        }
    }

    private static void exError() {
        try {
            throw new RuntimeException();
        } catch (Error e) {

        }

        try {
//            if (tr ue) {
            throw new Error();
//            } else {
//                throw new Error();
//            }
        } finally {
            System.out.println("sdf");
        }
//        System.out.println("sdfdv");

    }


    private static void exError2() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } catch (Error e) {
            System.out.println("1");
        } finally {
            System.out.println("3");
        }
//        System.out.println("2");
    }

    private static class D implements AutoCloseable {

        @Override
        public void close() throws Exception {
            System.out.println("asv");
        }
    }

    private static void exAutoCloseable() {
        try (D d = new D()) {
            System.out.println("sdf");
            throw new OpenException();
        } catch (Exception e) {
//            d.close();
            System.out.println("yguk");
        } finally {
            System.out.println("asdf");
        }
        System.out.println("iyl");
    }

    private static void exAutoCloseable2() throws Exception {
        D dext = new D();
        try (D d = dext) {
            System.out.println("sdf");
            throw new OpenException();
        } catch (Exception e) {
            dext.close();
            System.out.println("yguk");
        }
    }

    private static class Y {
        public Y() {
            throw new RuntimeException();
        }
    }

    private static void exFailInit() {
        int x;
        if (true) {
            x = 1;
        }
//        System.out.println(x);

        Y y;
        try {
            y = new Y();
        } catch (Exception ex) {

        }
//        System.out.println(y);
    }

    private static class FailClose implements AutoCloseable {
        public FailClose() throws Exception {
            System.out.println("start");
            throw new CloseException();
        }

        @Override
        public void close() throws Exception {
            System.out.println("close");
            throw new OpenException();
        }
    }

    private static void exFailClose() {
        try (FailClose fc = new FailClose(); FailClose fc2 = new FailClose()) {
            System.out.println("body");
            throw new Exception("dfdfd");
        } catch (OpenException e) {
            System.out.println("open exception");
        } catch (CloseException e) {
            System.out.println("close exception");
        } catch (Exception e) {
            System.out.println("catch exception");
        }
    }
}
