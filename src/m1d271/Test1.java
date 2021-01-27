package m1d271;

/*
 所有对象都有这个属性，但这个属性随对象的变化而变化时，用实例变量
 
 所有对象都有这个属性，而且属性的值都一样，用静态变量static。
 
 静态变量在类加载时初始化，存储在方法区中
 
 static修饰的元素可以用(类名.)的方式，也可用(引用.)的方式【不建议】
 
 
 */

public class Test1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		Person p1=new Person("12212","zhang","China");
		System.out.println(p1.id+","+p1.name+","+p1.country);
		
		Person p2=new Person("1455","li","China");
		System.out.println(p2.id+","+p2.name+","+p2.country);
		*/
		
		Person p1=new Person("12212","zhang");
		System.out.println(p1.id+","+p1.name+","+Person.country);
		
		Person p2=new Person("1455","li");
		System.out.println(p2.id+","+p2.name+","+Person.country);
		
	}

}
