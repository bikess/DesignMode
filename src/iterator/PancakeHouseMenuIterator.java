package iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
	ArrayList menuItems = new ArrayList<>();
	int position = 0;
	public PancakeHouseMenuIterator(ArrayList menuItems){
		this.menuItems = menuItems;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(menuItems.isEmpty()){
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem item = (MenuItem) menuItems.get(position);
		menuItems.remove(position);
		return item;
	}

}
