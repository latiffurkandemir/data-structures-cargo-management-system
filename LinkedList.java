package cargo;

import java.util.ArrayList;

public class LinkedList {
	private Node first;
	private Node last;
	
	public LinkedList()
	{
		first = null;
		last = null;
	}
	
	public boolean isEmpty()
	{
		return (first == null);
	}
	
	public void insertAtFront(int cargoId, int cargoWeightKg, int cargoSizeVolumeM3, int cargoDestinationBranch, int cargoDestinationWarehouse, int cargoCurrentWarehouse, String cargoVehicleId)
	{
		if(isEmpty())
		{
			first=last= new Node(cargoId, cargoWeightKg,cargoSizeVolumeM3, cargoDestinationBranch, cargoDestinationWarehouse, cargoCurrentWarehouse, cargoVehicleId);
		}
		else
		{
			first = new Node(cargoId, cargoWeightKg,cargoSizeVolumeM3, cargoDestinationBranch, cargoDestinationWarehouse, cargoCurrentWarehouse, cargoVehicleId, first);
		}
	}
	
	public void insertAtBack(int cargoId, int cargoWeightKg, int cargoSizeVolumeM3, int cargoDestinationBranch, int cargoDestinationWarehouse, int cargoCurrentWarehouse, String cargoVehicleId)
	{
		if(isEmpty())
		{
			first=last= new Node(cargoId, cargoWeightKg,cargoSizeVolumeM3, cargoDestinationBranch, cargoDestinationWarehouse, cargoCurrentWarehouse, cargoVehicleId);
		}
		else
		{
			last.setItem(new Node(cargoId, cargoWeightKg,cargoSizeVolumeM3, cargoDestinationBranch, cargoDestinationWarehouse, cargoCurrentWarehouse, cargoVehicleId));
			last=last.getItem();
		}
		
	}
	
	public void removeFromFront()
	{
		if(isEmpty())
		{
			System.out.println("The list is empty!");
		}
		else
		{
			if(first == last)
				first = last = null;
			else
				first = first.getItem();
		}
	}
	public int removeItem(int id) {
		Node position = first;
		int idAtPosition;
		Node prev = first;
		if (first.getCargoId() == id)
		{
			first = first.getItem();
		}
		while (position != null)
		{
			idAtPosition = position.getCargoId();
			if (idAtPosition==id) {
				prev.setItem(position.getItem());
				position.setItem(null);
				return id;
			}
			else
				prev = position;
				position = position.getItem();
		}
		return 0; //no target
	}
	public void removeFromBack()
	{
		if(isEmpty())
		{
			System.out.println("The list is empty!");
		}
		else
		{
			if(first == last)
				first = last = null;
			else
			{
				Node current = first;
				while(current.getItem() != last) {
					current = current.getItem();
				}
				last = current;
				current.setItem(null);
			}
		}
	}
	
	public int size() 
	{
		Node current = first;
		int counter=0;
		while(current!=null)
		{
			counter++;
			current=current.getItem();
		}
		return counter;
	}
	
	public void displayList() {
		Node position = first;
		while(position !=null)
		{
			System.out.print("Cargo ID: " + position.getCargoId() +"\tWeight: "+ position.getCargoWeightKg() +"kg" + "\tSize: " + position.getCargoSizeVolumeM3() + "m3\tDestination Branch Zip Code " + position.getCargoDestinationBranch() +
					"\tDestination Warehouse Zip Code: "+ position.getCargoDestinationWarehouse() +"\tCurrent Warehouse Zip Code: " + position.getCargoCurrentWarehouse() + "\tCargo Vehicle ID: " + position.getCargoVehicleId() + "\n");

			position=position.getItem();
		}
	}
	
	public ArrayList<Node> getAllNodes()
	{
		ArrayList<Node> nodeList = new ArrayList<>();
		Node current = first;
		while (current != null)
		{
			nodeList.add(current);
			current = current.getItem( );
		}
		return nodeList;
	}
	

	
	public void search(int a) {
		Node curr = first;
		while(curr != null) {
			if(curr.getCargoId() == a) {
				System.out.println("cargoId: " + curr.getCargoId());
				System.out.println("Weight: " + curr.getCargoWeightKg() + "kg");
				System.out.println("Size: " + curr.getCargoSizeVolumeM3() + "m^3");
				System.out.println("Destination Branch: " + curr.getCargoDestinationBranch());
				System.out.println("Destination Warehouse: " + curr.getCargoDestinationWarehouse());
				System.out.println("Current Warehouse: " + curr.getCargoCurrentWarehouse());
				break;
			}
			else
				curr=curr.getItem();
		}
		if(curr == null)
			System.out.println(" Cargo ID not found!!");
		
	}
	
	
}
	
	
	

