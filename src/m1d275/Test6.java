package m1d275;

/*
 * 
 */
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Host h=new Host();
		//Lion l=new Lion();
		//h.feed(l);
		
		//Snake s=new Snake();
		//h.feed(s);
		
		h.feed(new Lion());
		h.feed(new Snake());
		h.feed(new Pig());
		
	}

}
