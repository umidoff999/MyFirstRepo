 class Dastur_1 {
    public static void main(String[] args) {
        class Car {
            private String rang;
            private String model;
            private double narx;
            private boolean avtomatik;

            public Car(String rang, String model, double narx, boolean avtomatik) {
                this.rang = rang;
                this.model = model;
                this.narx = narx;
                this.avtomatik = avtomatik;
            }

            public String getRang() {
                return rang;
            }

            public void setRang(String rang) {
                this.rang = rang;
            }

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }

            public double getNarx() {
                return narx;
            }

            public void setNarx(double narx) {
                this.narx = narx;
            }

            public boolean isAvtomatik() {
                return avtomatik;
            }

            public void setAvtomatik(boolean avtomatik) {
                this.avtomatik = avtomatik;
            }
        }

        public class Triangle {
            private double a;
            private double b;
            private double c;

             Triangle(double a, double b, double c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }

            public double getA() {
                return a;
            }

            public void setA(double a) {
                this.a = a;
            }

            public double getB() {
                return b;
            }

            public void setB(double b) {
                this.b = b;
            }

            public double getC() {
                return c;
            }

            public void setC(double c) {
                this.c = c;
            }
        }

        class Person {
            private String ism;
            private int yosh;

            public Person(String ism, int yosh) {
                this.ism = ism;
                this.yosh = yosh;
            }

            public String getIsm() {
                return ism;
            }

            public void setIsm(String ism) {
                this.ism = ism;
            }

            public int getYosh() {
                return yosh;
            }

            public void setYosh(int yosh) {
                this.yosh = yosh;
            }
        }

    }
}
