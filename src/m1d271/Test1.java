package m1d271;

/*
 ���ж�����������ԣ���������������ı仯���仯ʱ����ʵ������
 
 ���ж�����������ԣ��������Ե�ֵ��һ�����þ�̬����static��
 
 ��̬�����������ʱ��ʼ�����洢�ڷ�������
 
 static���ε�Ԫ�ؿ�����(����.)�ķ�ʽ��Ҳ����(����.)�ķ�ʽ�������顿
 
 
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
