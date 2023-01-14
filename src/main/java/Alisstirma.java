public class Alisstirma {

    int f(int x) {
        return x*2 - 1;
    }

    int h() {
        int a = 3;
        int b = f(a) + f(4);
        return b;
    }
}
