public class Test {

    public static void main(String[] args) {

        B b = new B();
                b.a();
        System.out.println();
        System.out.println();
        System.out.println();

        C c = new C();
        c.a();
        System.out.println();
        System.out.println();

        D d = new D(); // 1

        d.a(); //4 3

        System.out.println();
        System.out.println();

        E e = new E(1); //1, 6
        e.a(); // 2

        System.out.println();
        System.out.println();

        G g = new G();
        g.a();
        System.out.println();
        System.out.println();
        H h = new H(1);
        h.a();
        System.out.println();
        System.out.println();

        I i = new I();
        i.a();
    }
}


class A {
    public A (){
        System.out.println("1");
    }
    public void a () {
        System.out.println("2");
    }

}

class B extends A {

}

class C extends A {
    @Override
    public void a() {
        System.out.println("3");
    }

}


class D extends C {
    public void a() {
        System.out.println("4");
        super.a();
    }
}


class E extends A {

    public E() {
        System.out.println("5");
    }

    public E(int a) {
        System.out.println("6");
    }
}


class I extends A {
    public I() {
        super();
        System.out.println("11");
    }
}


class F {

    public F(int a) { //F의 생성자 .
        System.out.println("7");
    }

    public void a() {
        System.out.println("8");
    }

}

class G extends F {
    public G() {
        super(3);
        System.out.println( "GGGG");
         }

}

class H extends E {
    public H(int a) {
        System.out.println("10");
    }
}