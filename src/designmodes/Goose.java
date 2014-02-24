package designmodes;
// 鹅的类，当鸭子出现在这里，鹅也出现在这里
public class Goose {
	public void honk(){
		System.out.println("Honk");
	}
}
// 这里鹅只会咯咯不会呱呱，所以需要用适配器来将其配成鸭子