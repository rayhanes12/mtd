public class NewFile {
    public static void HitungJumlah() {
        int i=2;
        int j=4;

        int hasil  = i+j;
        System.out.println(hasil);
    }

    public static void HitungKali(int u, int o) {
        int hasil1 = u*o;
        System.out.println(hasil1);

    }

    public static void main(String[] args) {
        HitungJumlah();

        int u=5;
        int o=10;
        HitungKali(u, o); //==HitungKali(5,10);
    }
} //
