package m1d274;

/*
 * ��̬
 * Lion�̳�Animal  Snake�̳�Animal Lion��Snake�޹�ϵ
 * 
 * ����ת��upcasting:�ͼ�ת�߼�
 * ����ת��downcasting���߼�ת�ͼ�
 * �������ϻ������£���������ֱ�ӱ���Ҫ�м̳й�ϵ
 * 
 * ����������ָ�������Ͷ������ֻ��Ƶ��³����ڱ���׶ΰ󶨺����н׶ΰ����ֲ�ͬ����̬
 * 
 * ���ã�������϶�
 * 		���ö�̬�����ö�̬
 * 		����������ָ�������Ͷ���
 * 
 * ���ģ����������
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
		
		Animal a2=new Lion();//����ת�ͣ�
		a2.move();//��  ���õ���Lion��move
		
		//�����õķ�������ʵ����������������еģ���������ת��
		Lion c1=(Lion)a2;//����ת�ͱ���ǿ������ת��
		c1.eat();
		
		/*
		 * ���³������ͨ���������г���
		 * java.lang.ClassCastException����
		 * ��Ϊ����ת���쳣������������ת�ͷ���
		 * 
		 * �����ʽ��ʹ��instanceof�����
		 * �﷨��ʽ  
		 * 			������ instanceof ������������
		 * ����������Ϊboolean��
		 * 		���裨a instanceof Animal��
		 * 		true��ʾ�� a�������ָ��Ķ�����һ��Animal����
		 * 							
		 * 		false��ʾ��a�������ָ��Ķ�����һ��Animal����
		 */
		//��a3���õĶ���ȷʵ��һ��Cat���͵�ʱ�� 
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
