package cargo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static LinkedList cargo;
	public static void main(String[] args) {
		
		cargo = new LinkedList();
		cargo.insertAtFront(007, 30, 5, 19300, 19000, 43000, "0002");
		cargo.insertAtFront(006, 70, 15, 19300, 19000, 43000, "0002");
		cargo.insertAtFront(005, 60, 10, 20700, 20000, 43000, "0006");
		cargo.insertAtFront(001, 22, 10,34300, 34000, 43000, "0001");
		cargo.insertAtFront(004, 72, 28, 14200, 14000, 43000, "0003");
		cargo.insertAtFront(003, 40, 8,  34700, 34000, 43000, "0001");
		cargo.insertAtFront(002, 90, 15, 19330, 19000, 43000, "0002");
		wareHouseManagerMenu();
		}
	
		public static void addCargo() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("ENTER CARGO INFORMATIONS");
			
			System.out.print("Cargo Id:");
			int cargoId = sc.nextInt();
			
			System.out.print("Weight:");
			int weight = sc.nextInt();
			
			System.out.print("Size:");
			int size = sc.nextInt();
			
			System.out.print("Destination Branch Zip Code:");
			int cargoDestinationBranch = sc.nextInt();
			
			System.out.print("Destination Warehouse Zip Code:");
			int cargoDestinationWarehouse = sc.nextInt();
			
			System.out.print("Current Warehouse Zip Code:");
			int cargoCurrentWarehouse = sc.nextInt();
			
			System.out.print("Cargo Vehicle Id:");
			String cargoVehicleId=sc.next();
			
			cargo.insertAtFront(cargoId, weight, size, cargoDestinationBranch, cargoDestinationWarehouse, cargoCurrentWarehouse, cargoVehicleId);
		}
	
		public static void sortCargo(){
		ArrayList<Node> cargoList = cargo.getAllNodes(); //takes the nodes
		BT btCargo = new BT();
		for (Node node : cargoList) {
			btCargo.insert(node.getCargoId(), node.getCargoWeightKg(), node.getCargoSizeVolumeM3(), node.getCargoDestinationBranch(), 
					node.getCargoDestinationWarehouse(), node.getCargoCurrentWarehouse(), node.getCargoVehicleId());
		}
		btCargo.inorder();
		}
		
		public static void deleteCargo(int id) {
			cargo.removeItem(id);
			sortCargo();
		}
		
		public static void wareHouseManagerMenu() {
			System.out.println("Cargo Management System");
			//add 
			//delete
			//sorted by cargoDestinationWarehouse
			System.out.println("Operations: \nPress 1 to add cargo \nPress 2 to delete cargo \nPress 3 to dislplay list of cargoes \nPress 4 to sort cargos by warehouse zip code");
			Scanner s = new Scanner(System.in);
			System.out.print("Select the operation:");
			int operation = s.nextInt();
			while(true) {
				if(operation==1) {
					addCargo();
					System.out.println("Cargo is added to the system.");
					System.out.println("Press 0 to exit or 9 to return main menu");
					int option = s.nextInt();
					if(option==0) {
						System.out.println("Have a good day");
						break;
					}
					else if (option==9){
						wareHouseManagerMenu();
					}
				}
				else if(operation==2) {
					cargo.displayList();
					System.out.print("Choose the cargo id that you want to delete:");
					int cargoId=s.nextInt();
					deleteCargo(cargoId);
					System.out.println("Cargo that has " + cargoId + " is deleted.");
					System.out.println("Press 0 to exit or 9 to return main menu");
					int option = s.nextInt();
					if(option==0) {
						System.out.println("Have a good day");
						break;
					}
					else if (option==9){
						wareHouseManagerMenu();
					}
				}
				else if(operation==3) {
					System.out.println("List of cargoes");
					cargo.displayList();
					System.out.println("Press 0 to exit or 9 to return main menu");
					int option = s.nextInt();
					if(option==0) {
						System.out.println("Have a good day");
						break;
					}
					else if (option==9){
						wareHouseManagerMenu();
					}
				}
				else if(operation==4) {
					sortCargo();
					System.out.println("Cargoes are sorted by their destination warehouse zip code."); 
					System.out.println("Press 0 to exit or 9 to return main menu");
					int option = s.nextInt();
					if(option==0) {
						System.out.println("Have a good day");
						break;
					}
					else if (option==9){
						wareHouseManagerMenu();
					}
				}
				else {
					System.out.println("There is no operation for this number");
				}

				break;
			}
			
		}
		
		
}