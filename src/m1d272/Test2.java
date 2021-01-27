package m1d272;

/*
 * 方法什么时候定义为静态的？
	方法描述的是动作，当所有的对象执行这个操作的时候，
	最终产生影响是一样的，那么这个动作不在属于某一个对象的动作了，
	此时可以将这个动作提升为类级别动作
*/


/*
 *  继承
 *  	作用：代码复用，有了继承才有后面方法的覆盖和多态机制。
 *  	
 *  	语法格式：
 *  	[修饰符列表] class 类名 extends 父类名{
 *  							类体;
 *  						//类体=属性＋方法
 *  	}
 *  	
 *  	java只支持单继承，但一个类可以间接继承其他类，c++支持多继承
 *  	C extends B{
 *  	}
 *  	B extends A{
 *  	}
 *  	A extends T{
 *  	}
 *  	C类直接继承B类，间接继承A T类
 *  	
 *  B类继承A类，其中
 *  	A类称为父类 基类 超类 superclass
 *  	B类称为子类 派生类 subclass
 *  
 *  子类继承父类数据：
 *  		私有的不支持继承 构造方法不支持继承，其他都可以
 *  
 *  java中假设一个类没有显示继承任何类，则默认
 *  继承JavaSE库当中的java.lang.Object类
 *  
 *  
 *  	
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditAccount c1=new CreditAccount();
		c1.setActno("112");
		c1.setBalance(1000.0);
		c1.setCredit(0.8);
		
		System.out.println(c1.getActno()+","+c1.getBalance()+","+c1.getCredit());
		
	}

}
