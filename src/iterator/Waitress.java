package iterator;

public class Waitress {
	PancakeHouseMenu pHouseMenu;
	DinerMenu dinerMenu;
	public Waitress(Menu pHouseMenu,Menu dinerMenu){
		this.pHouseMenu =(PancakeHouseMenu) pHouseMenu;
		this.dinerMenu = (DinerMenu) dinerMenu;
	}
	
	public void printMenu(){
		Iterator pIterator = pHouseMenu.createIterator();
		Iterator dIterator = dinerMenu.createIterator();
		System.out.println("Menu\n----\nBreakfirst");
		printMenu(pIterator);
		System.out.println("Menu\n----\nLunch");
		printMenu(dIterator);
	}
	public void printMenu(Iterator iterator){
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName()+",");
			System.out.print(menuItem.getPrice()+"--");
			System.out.println(menuItem.getDescription());
		}
	}
}
