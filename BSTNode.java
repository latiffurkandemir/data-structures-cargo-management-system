package cargo;
import java.util.Random;
public class BSTNode {
	 

		BSTNode left, right;
		private int cargoId;
		private int cargoWeightKg;
		private int cargoSizeVolumeM3;
		private int cargoDestinationBranch;
		private int cargoDestinationWarehouse;
		private int cargoCurrentWarehouse;
		private String cargoVehicleId;


		/* Constructor */

		public BSTNode()

		{

			left = null;

			right = null;

			cargoId = 0;

		}

		/* Constructor */

		public BSTNode(int n)

		{

			left = null;

			right = null;

			cargoId = n;

		}

		public BSTNode(int cargoId, int cargoWeightKg, int cargoSizeVolumeM3,
				int cargoDestinationBranch, int cargoDestinationWarehouse, int cargoCurrentWarehouse,
				String cargoVehicleId) {
			this.left = null;
			this.right = null;
			this.cargoId = cargoId;
			this.cargoWeightKg = cargoWeightKg;
			this.cargoSizeVolumeM3 = cargoSizeVolumeM3;
			this.cargoDestinationBranch = cargoDestinationBranch;
			this.cargoDestinationWarehouse = cargoDestinationWarehouse;
			this.cargoCurrentWarehouse = cargoCurrentWarehouse;
			this.cargoVehicleId = cargoVehicleId;
		}

		

		public BSTNode getLeft() {
			return left;
		}

		public void setLeft(BSTNode left) {
			this.left = left;
		}

		public BSTNode getRight() {
			return right;
		}

		public void setRight(BSTNode right) {
			this.right = right;
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
	}