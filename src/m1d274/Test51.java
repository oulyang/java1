package m1d274;

public class Test51 {
	public static void main(String[] args) {
		Animal a1=new Lion();
		Animal a2=new Snake();
		
		if(a1 instanceof Lion) {
			Lion l1=(Lion)a1;
		}
		if(a2 instanceof Snake) {
			 Snake s1=(Snake)a2;
		}
}
}
