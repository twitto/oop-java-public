package exams.oop24b_scecs.moeda.q1_store_class;

public class Store {
    private String name;
    private int numberOfEmployees;
    private String chain;
    private boolean isOutlet;

    // Constructor
    public Store(String name, int numberOfEmployees, String chain, boolean isOutlet) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Store name cannot be null or empty.");
        }
        if (numberOfEmployees <= 0) {
            throw new IllegalArgumentException("Number of employees must be positive.");
        }
        if (chain == null || chain.isEmpty()) {
            throw new IllegalArgumentException("Chain cannot be null or empty.");
        }
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.chain = chain;
        this.isOutlet = isOutlet;
    }

    // toString method
    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                ", chain='" + chain + '\'' +
                ", isOutlet=" + isOutlet +
                '}';
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Store store = (Store) obj;
        return numberOfEmployees == store.numberOfEmployees &&
                isOutlet == store.isOutlet &&
                name.equals(store.name) &&
                chain.equals(store.chain);
    }

    // Method to update number of employees
    public void updateNumberOfEmployees(int change) {
        if (this.numberOfEmployees + change <= 0) {
            throw new IllegalArgumentException("Number of employees after update must be positive.");
        }
        this.numberOfEmployees += change;
    }

    // Method to update store name
    public void updateName(String newName) {
        if (newName == null || newName.isEmpty()) {
            throw new IllegalArgumentException("Store name cannot be null or empty.");
        }
        this.name = newName;
    }

    // Static method to find the largest store
    public static Store findLargestStore(Store[] stores) {
        if (stores == null || stores.length == 0) {
            throw new IllegalArgumentException("Store array cannot be null or empty.");
        }

        Store largestStore = stores[0];
        for (Store store : stores) {
            if (store.numberOfEmployees > largestStore.numberOfEmployees) {
                largestStore = store;
            }
        }
        return largestStore;
    }

    // Static method to find all outlet stores
    public static Store[] findOutletStores(Store[] stores) {
        if (stores == null || stores.length == 0) {
            throw new IllegalArgumentException("Store array cannot be null or empty.");
        }

        int outletCount = 0;
        for (Store store : stores) {
            if (store.isOutlet) {
                outletCount++;
            }
        }

        Store[] outletStores = new Store[outletCount];
        int index = 0;
        for (Store store : stores) {
            if (store.isOutlet) {
                outletStores[index++] = store;
            }
        }
        return outletStores;
    }
}

