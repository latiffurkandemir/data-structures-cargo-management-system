package cargo;

public class BT {

		private BSTNode root;

		/* Constructor */

		public BT()

		{

			root = null;

		}

		/* Function to check if tree is empty */

		public boolean isEmpty()

		{

			return root == null;

		}

		/* Functions to insert data */

		public void insert(int cargoId, int cargoWeightKg, int cargoSizeVolumeM3, int cargoDestinationBranch,
				int cargoDestinationWarehouse, int cargoCurrentWarehouse, String cargoVehicleId)

		{

			root = insert(root, cargoId, cargoWeightKg, cargoSizeVolumeM3, cargoDestinationBranch, cargoDestinationWarehouse, cargoCurrentWarehouse, cargoVehicleId);

		}

		/* Function to insert data recursively */

		BSTNode insert(BSTNode node, int cargoId, int cargoWeightKg, int cargoSizeVolumeM3,
				int cargoDestinationBranch, int cargoDestinationWarehouse, int cargoCurrentWarehouse,
				String cargoVehicleId)

		{

			if (node == null)

				node = new BSTNode(cargoId, cargoWeightKg, cargoSizeVolumeM3, cargoDestinationBranch, cargoDestinationWarehouse, cargoCurrentWarehouse, cargoVehicleId);

			else

			{

				if (cargoDestinationWarehouse <= node.getCargoDestinationWarehouse())

					node.left = insert(node.left,  cargoId, cargoWeightKg, cargoSizeVolumeM3, cargoDestinationBranch, cargoDestinationWarehouse, cargoCurrentWarehouse, cargoVehicleId);

				else

					node.right = insert(node.right,  cargoId, cargoWeightKg, cargoSizeVolumeM3, cargoDestinationBranch, cargoDestinationWarehouse, cargoCurrentWarehouse, cargoVehicleId);

			}

			return node;

		}

		/* Functions to delete data */

		public void delete(int k)

		{

			if (isEmpty())

				System.out.println("Tree Empty");

			else if (search(k) == false)

				System.out.println("Sorry " + k + " is not present");

			else

			{

				root = delete(root, k);

				System.out.println(k + " deleted from the tree");

			}

		}

		private BSTNode delete(BSTNode root, int k)

		{

			BSTNode p, p2, n;

			if (root.getCargoId() == k)

			{

				BSTNode lt, rt;

				lt = root.getLeft();

				rt = root.getRight();

				if (lt == null && rt == null)

					return null;

				else if (lt == null)

				{

					p = rt;

					return p;

				}

				else if (rt == null)

				{

					p = lt;

					return p;

				}

				else

				{

					p2 = rt;

					p = rt;

					while (p.getLeft() != null)

						p = p.getLeft();

					p.setLeft(lt);

					return p2;

				}

			}

			if (k < root.getCargoId())

			{

				n = delete(root.getLeft(), k);

				root.setLeft(n);

			}

			else

			{

				n = delete(root.getRight(), k);

				root.setRight(n);

			}

			return root;

		}

		/* Functions to count number of nodes */

		public int countNodes()

		{

			return countNodes(root);

		}

		/* Function to count number of nodes recursively */

		private int countNodes(BSTNode r)

		{

			if (r == null)

				return 0;

			else

			{

				int l = 1;

				l += countNodes(r.getLeft());

				l += countNodes(r.getRight());

				return l;

			}

		}

		/* Functions to search for an element */

		public boolean search(int val)

		{

			return search(root, val);

		}

		/* Function to search for an element recursively */

		private boolean search(BSTNode r, int val)

		{

			boolean found = false;

			while ((r != null) && !found)

			{

				int rval = r.getCargoId();

				if (val < rval)

					r = r.getLeft();

				else if (val > rval)

					r = r.getRight();

				else

				{

					found = true;

					break;

				}

				found = search(r, val);

			}

			return found;

		}



		public void inorder()
		{
			inorder(root);
			System.out.print("\n");
		}

		private void inorder(BSTNode r)
		{

			if (r != null)

			{

				inorder(r.getLeft());

				System.out.print("Cargo ID: " + r.getCargoId() +"\tWeight: "+ r.getCargoWeightKg() +"kg" + "\tSize: " + r.getCargoSizeVolumeM3() + "m3\tDestination Branch: " + r.getCargoDestinationBranch() +
						"\tDestination Warehouse Zip Code: "+ r.getCargoDestinationWarehouse() +"\tCurrent Warehouse: " + r.getCargoCurrentWarehouse() + "\tCargo Vehicle ID: " + r.getCargoVehicleId() + "\n");

				inorder(r.getRight());

			}

		}


		public void preorder()

		{

			preorder(root);

		}

		private void preorder(BSTNode r)

		{

			if (r != null)

			{

				System.out.print(r.getCargoId() + " ");

				preorder(r.getLeft());

				preorder(r.getRight());

			}

		}

}