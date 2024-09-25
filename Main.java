public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder();
        System.out.println(f);
        System.out.println(f.getCurrentFood());
        //System.out.println(f.currentFood);
        
        Feeder g = new Feeder(500);
        System.out.println(g.getCurrentFood());
        
        int random = (int)(Math.random() * 10 + 1);
        System.out.println(random);
        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood());

        Feeder h = new Feeder(1000);
        h.simulateOneDay(22);
        System.out.println(h.getCurrentFood());

        Feeder i = new Feeder(100);
        i.simulateOneDay(5);
        System.out.println(i);

        Feeder j = new Feeder(2400);
        System.out.println(j.simulateManyDays(10, 4));
    }

}
