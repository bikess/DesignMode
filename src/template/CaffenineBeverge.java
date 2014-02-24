package template;

// 咖啡因饮料的一个抽象类
public abstract class CaffenineBeverge {
//	定义此方法为final，不允许子类进行覆盖修改
	final void prepareRecipe(){
		boilWater();//不同咖啡因饮料的煮水算法相同
		
		brew();//不同咖啡因饮料的泡的方式不同，因此次方法定义为抽象方法，有子类具体实现
		pourIncup();//不同咖啡因饮料的倒水方式相同
		addCondiments();//不同咖啡因饮料的添加调料方式不同，因此次方法定义为抽象方法，有子类具体实现
	}

	abstract void addCondiments();

	private void pourIncup() {
		// TODO Auto-generated method stub
		System.out.println("Pouring into cup");
	}

	abstract void brew();

	private void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("Boiling water");
	}
}
