public class single_inheritance {
    int a = 0;
    int b = 10;
}

class A extends SingleInheritance {

    int c = 20;

    @Override
    public void main(String[] args) {
        System.out.println("A");
        System.err.println(a, "/t", b, "/t", c);
    }

}