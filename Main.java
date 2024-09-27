public class Main
{
    public static void main(String[] args)
    {
        //Test Case 1
        Feeder a = new Feeder(500);
        a.simulateOneDay(12);
        System.out.println(a);
        //Test Case 2
        Feeder b = new Feeder(1000);
        b.simulateOneDay(22);
        System.out.println(b);
        //Test Case 3
        Feeder c = new Feeder(100);
        c.simulateOneDay(5);
        System.out.println(c);
        //Test Case 4
        Feeder f = new Feeder(2400);
        System.out.println(f.simulateManyDays(10, 4));
        //Test Case 5
        Feeder k = new Feeder(250);
        System.out.println(k.simulateManyDays(10, 5));
        //Test Case 6
        Feeder g = new Feeder(0);
        System.out.println(g.simulateManyDays(5, 10));
    }

}
