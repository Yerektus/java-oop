package practice2;

public class Program3 {
	public static void main(String[] main) {
		Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal()); 
        System.out.println(t.toStandard());

        Time t2 = new Time(4, 24, 33);
        t2.add(t);

        System.out.println(t2.toUniversal());
        System.out.println(t2.toStandard());
        
        Time t3 = Time.add(t, t2);
        System.out.println(t3.toUniversal());
        System.out.println(t3.toStandard());
	}
}
