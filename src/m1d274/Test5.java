package m1d274;

/*
 * 多态
 * Lion继承Animal  Snake继承Animal Lion与Snake无关系
 * 
 * 向上转型upcasting:低级转高级
 * 向下转型downcasting：高级转低级
 * 无论向上还是向下，两种类型直接必须要有继承关系
 * 
 * 父类型引用指向子类型对象这种机制导致程序在编译阶段绑定和运行阶段绑定两种不同的形态
 * 
 * 作用：降低耦合度
 * 		能用多态尽量用多态
 * 		父类型引用指向子类型对象
 * 
 * 核心：面向抽象编程
 */
public class Test5 {
	public static void main(String[] args) {
		/*
		 * Animal a1=new Animal(); a1.move();
		 * 
		 * Lion l1=new Lion(); l1.move(); l1.eat();
		 * 
		 * Snake s1=new Snake(); s1.move();
		 */
		
		Animal a2=new Lion();//向上转型，
		a2.move();//狂奔  调用的是Lion的move
		
		//当调用的方法或访问的属性是子类型特有的，必须向下转型
		Lion c1=(Lion)a2;//向下转型必须强制类型转换
		c1.eat();
		
		/*
		 * 以下程序编译通过，但运行出现
		 * java.lang.ClassCastException错误
		 * 称为类型转换异常，总是在向下转型发生
		 * 
		 * 解决方式：使用instanceof运算符
		 * 语法格式  
		 * 			（引用 instanceof 数据类型名）
		 * 运算结果类型为boolean。
		 * 		假设（a instanceof Animal）
		 * 		true表示： a这个引用指向的对象是一个Animal类型
		 * 							
		 * 		false表示：a这个引用指向的对象不是一个Animal类型
		 */
		//当a3引用的对象确实是一个Cat类型的时候 
		Animal a3=new Snake();
		if(a3 instanceof Lion){
			Lion c2=(Lion)a3;
			c2.eat();
		}
		else if(a3 instanceof Snake) {
			Snake s2=(Snake) a3;
			s2.swollen();
		}
		
			
		
		
	}

}
