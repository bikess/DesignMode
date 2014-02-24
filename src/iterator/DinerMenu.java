package iterator;

public class DinerMenu implements Menu{
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	
	public DinerMenu(){
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegetarian BLT", "Bacon with lecture & tomato on whole wheat", true, 2.99);
		addItem("hotodog", "a hot dog,with saurkaut", false, 3.05);
	}
	
	public void addItem(String name,String description,
			boolean vegetarian,double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >=MAX_ITEMS){
			System.err.println("sorry ,menu is full!");
		}
		else{
			menuItems[numberOfItems]=menuItem;
			numberOfItems= numberOfItems+1;
		}
	}
	
//	public MenuItem[] getMenuItems(){
//		return menuItems;
//	}
	public Iterator createIterator(){
		return new DinerMenuIterator(menuItems);
	}
}
