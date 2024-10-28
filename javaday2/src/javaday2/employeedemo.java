package javaday2;

public class employeedemo {
	public static void main(String[] arg) {
		int m1=100;
		employee e1 = new employee();
		employee e2 = new employee();
		employee e3 = new employee();
		
		e1.eid=101;
		e1.Username="Hema";
		e1.City="Auroville";
		
		e2.eid=102;
		e2.Username="Sundar";
		e2.City="Pondicherry";
		
		e3.eid=103;
		e3.Username="Hi";
		e3.City="IFETCE";
		
		System.out.println("Employee Id:"+e1.eid+ "\nEmployee Name:"+e1.Username+"\nCity:"+e1.City);
		System.out.println("\n\nEmployee Id:"+e2.eid+ "\nEmployee Name:"+e2.Username+"\nCity:"+e2.City);
		System.out.println("\n\nEmployee Id:"+e3.eid+ "\nEmployee Name:"+e3.Username+"\nCity:"+e3.City);
	}

}
