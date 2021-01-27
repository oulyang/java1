package m1d273;

/*
 * 方法覆盖又称方法重写override
 * 
 * 当父类中的方法无法满足子类的业务需求，有必要对继承来的方法进行重写
 * 
 * 
 *  
 * 方法重写条件：
 * 方法重写发生在具有继承关系的父子类中
 * 方法重写时
 *  	     返回值类型一致 方法名一致 形参列表一致（尽量复制粘贴）
 *  	     访问权限不能更低，可以更高
 *  	     抛出异常不能更多，可以更少
 *  
 *  私有方法不能继承，故不能覆盖
 *  构造方法不能继承，故不能覆盖
 *  静态方法不存在覆盖
 *  
 *  覆盖只针对方法，不谈属性
 */
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.move();
		
		Lion l=new Lion();
		l.move();
		
		Snake s=new Snake();
		s.move();
		
		TIger t=new TIger();
		t.move();
		
	}

}
