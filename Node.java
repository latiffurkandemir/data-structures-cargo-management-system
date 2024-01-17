package cargo;

public class Node {
	private int cargoId;
	private int cargoWeightKg;
	private int cargoSizeVolumeM3;
	private int cargoDestinationBranch;//ilçe
	private int cargoDestinationWarehouse;
	private int cargoCurrentWarehouse;
	private String cargoVehicleId;
	private Node item;
	
	public Node() {
		item=null;
	}
	
	public Node(int cargoId, int cargoWeightKg, int cargoSizeVolumeM3, int cargoDestinationBranch,
			int cargoDestinationWarehouse, int cargoCurrentWarehouse, String cargoVehicleId) {
		super();
		this.cargoId = cargoId;
		this.cargoWeightKg = cargoWeightKg;
		this.cargoSizeVolumeM3 = cargoSizeVolumeM3;
		this.cargoDestinationBranch = cargoDestinationBranch;
		this.cargoDestinationWarehouse = cargoDestinationWarehouse;
		this.cargoCurrentWarehouse = cargoCurrentWarehouse;
		this.cargoVehicleId = cargoVehicleId;
		this.item=null;
	}



	public Node(int cargoId, int cargoWeightKg, int cargoSizeVolumeM3, int cargoDestinationBranch,
			int cargoDestinationWarehouse, int cargoCurrentWarehouse, String cargoVehicleId, Node item) {
		this.cargoId = cargoId;
		this.cargoWeightKg = cargoWeightKg;
		this.cargoSizeVolumeM3 = cargoSizeVolumeM3;
		this.cargoDestinationBranch = cargoDestinationBranch;
		this.cargoDestinationWarehouse = cargoDestinationWarehouse;
		this.cargoCurrentWarehouse = cargoCurrentWarehouse;
		this.cargoVehicleId = cargoVehicleId;
		this.item = item;
	}
	
	public int getCargoId() {
		return cargoId;
	}
	public void setCargoId(int cargoId) {
		this.cargoId = cargoId;
	}
	public int getCargoWeightKg() {
		return cargoWeightKg;
	}
	public void setCargoWeightKg(int cargoWeightKg) {
		this.cargoWeightKg = cargoWeightKg;
	}
	public int getCargoSizeVolumeM3() {
		return cargoSizeVolumeM3;
	}
	public void setCargoSizeVolumeM3(int cargoSizeVolumeM3) {
		this.cargoSizeVolumeM3 = cargoSizeVolumeM3;
	}
	public int getCargoDestinationBranch() {
		return cargoDestinationBranch;
	}
	public void setCargoDestinationBranch(int cargoDestinationBranch) {
		this.cargoDestinationBranch = cargoDestinationBranch;
	}
	public int getCargoDestinationWarehouse() {
		return cargoDestinationWarehouse;
	}
	public void setCargoDestinationWarehouse(int cargoDestinationWarehouse) {
		this.cargoDestinationWarehouse = cargoDestinationWarehouse;
	}
	public int getCargoCurrentWarehouse() {
		return cargoCurrentWarehouse;
	}
	public void setCargoCurrentWarehouse(int cargoCurrentWarehouse) {
		this.cargoCurrentWarehouse = cargoCurrentWarehouse;
	}
	public String getCargoVehicleId() {
		return cargoVehicleId;
	}
	public void setCargoVehicleId(String cargoVehicleId) {
		this.cargoVehicleId = cargoVehicleId;
	}
	public Node getItem() {
		return item;
	}
	public void setItem(Node item) {
		this.item = item;
	}
	
	
	
	
	
	
}
