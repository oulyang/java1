package m1d272;

/*
 * ����ʲôʱ����Ϊ��̬�ģ�
	�����������Ƕ����������еĶ���ִ�����������ʱ��
	���ղ���Ӱ����һ���ģ���ô���������������ĳһ������Ķ����ˣ�
	��ʱ���Խ������������Ϊ�༶����
*/


/*
 *  �̳�
 *  	���ã����븴�ã����˼̳в��к��淽���ĸ��ǺͶ�̬���ơ�
 *  	
 *  	�﷨��ʽ��
 *  	[���η��б�] class ���� extends ������{
 *  							����;
 *  						//����=���ԣ�����
 *  	}
 *  	
 *  	javaֻ֧�ֵ��̳У���һ������Լ�Ӽ̳������࣬c++֧�ֶ�̳�
 *  	C extends B{
 *  	}
 *  	B extends A{
 *  	}
 *  	A extends T{
 *  	}
 *  	C��ֱ�Ӽ̳�B�࣬��Ӽ̳�A T��
 *  	
 *  B��̳�A�࣬����
 *  	A���Ϊ���� ���� ���� superclass
 *  	B���Ϊ���� ������ subclass
 *  
 *  ����̳и������ݣ�
 *  		˽�еĲ�֧�ּ̳� ���췽����֧�ּ̳У�����������
 *  
 *  java�м���һ����û����ʾ�̳��κ��࣬��Ĭ��
 *  �̳�JavaSE�⵱�е�java.lang.Object��
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
