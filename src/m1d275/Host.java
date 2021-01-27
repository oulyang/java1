package m1d275;

/*
public class Host {

	public void feed(Lion l) {
		l.eat();
	}
	public void feed(Snake s) {
		s.move();
	}
}
*/

//降低耦合度，提高扩展力【解耦合】
public class Host {

	//面向的是一个抽象的Animal类，不再面向具体的动物
	public void feed(Animal a) {
		a.eat();
	}

}
