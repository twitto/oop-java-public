package exams.oop24b_scecs.moeda.q1_store_class;

public class Main {
    public static void main(String[] args) {
        // Create some Store objects
        Store store1 = new Store("TechWorld", 50, "ElectronicsPlus", false);
        Store store2 = new Store("FashionHub", 30, "ClothingChain", true);
        Store store3 = new Store("GadgetCenter", 70, "ElectronicsPlus", false);
        Store store4 = new Store("BargainOutfit", 25, "ClothingChain", true);

        // Use toString to display information about the stores
        System.out.println(store1);
        System.out.println(store2);
        System.out.println(store3);
        System.out.println(store4);

        // Update the number of employees in store1
        store1.updateNumberOfEmployees(10);
        System.out.println("After updating number of employees in TechWorld:");
        System.out.println(store1);

        // Update the name of store2
        store2.updateName("FashionOutlet");
        System.out.println("After updating the name of FashionHub:");
        System.out.println(store2);

        // Check equality between store2 and store4
        boolean areEqual = store2.equals(store4);
        System.out.println("Are store2 and store4 equal? " + areEqual);

        // Create an array of stores
        Store[] stores = {store1, store2, store3, store4};

        // Find the largest store by number of employees
        Store largestStore = Store.findLargestStore(stores);
        System.out.println("The largest store is: " + largestStore);

        // Find all outlet stores
        Store[] outletStores = Store.findOutletStores(stores);
        System.out.println("All outlet stores:");
        for (Store store : outletStores) {
            System.out.println(store);
        }
    }
}

