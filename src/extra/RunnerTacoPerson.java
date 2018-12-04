package extra;

public class RunnerTacoPerson {
public static void main(String[] args) {
	Person person1= new Person();
	Person person2= new Person();
	Person person3= new Person();
	
	person1.setname("Joe");
	person2.setname("Ben");
	person3.setname("Ted");
	
	person1.setsuperpower("laser eyes");
	person2.setsuperpower("invisability");
	person3.setsuperpower("teleportation");
	
	System.out.println(person1);
	System.out.println(person2);
	System.out.println(person3);
	
	
}
}
