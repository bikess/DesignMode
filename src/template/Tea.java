package template;

// 这是咖啡饮料，继承在超类咖啡因饮料，需要自行实现冲泡与添加调料的算法
public class Tea extends CaffenineBeverge {

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding Lemon");
	}

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Steeping the tea");
	}

}
