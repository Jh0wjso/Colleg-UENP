class Main {
    public static void main(String[] args) throws InterruptedException {
        Onibus o = new Onibus();

        Passageiro p1 = new Passageiro("A", o, 1);
        Passageiro p2 = new Passageiro("B", o, 2);
        Passageiro p3 = new Passageiro("C", o, 3);
        Passageiro p4 = new Passageiro("D", o, 4);
        Passageiro p5 = new Passageiro("E", o, 5);
        Passageiro p6 = new Passageiro("F", o, 6);
        Passageiro p7 = new Passageiro("G", o, 7);
        Passageiro p8 = new Passageiro("H", o, 8);
        Passageiro p9 = new Passageiro("I", o, 2);
        Passageiro p10 = new Passageiro("J", o, 9);
        Passageiro p11 = new Passageiro("K", o, 11);
        Passageiro p12 = new Passageiro("L", o, 10);
        Passageiro p13 = new Passageiro("M", o, 15);
        Passageiro p14 = new Passageiro("N", o, 20);
        Passageiro p15 = new Passageiro("O", o, 13);
        Passageiro p16 = new Passageiro("P", o, 5);
        Passageiro p17 = new Passageiro("Q", o, 18);
        Passageiro p18 = new Passageiro("R", o, 23);
        Passageiro p19 = new Passageiro("S", o, 3);
        Passageiro p20 = new Passageiro("T", o, 4);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        p9.start();
        p10.start();
        p11.start();
        p12.start();
        p13.start();
        p14.start();
        p15.start();
        p16.start();
        p17.start();
        p18.start();
        p19.start();
        p20.start();
    }
}