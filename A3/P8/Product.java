package A3.P8;

class Product {
    String name;
    int stock;

    Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    void purchase(int qty) throws OutOfStockException {
        if (qty > stock) {
            throw new OutOfStockException("Product " + name + " is out of stock. Available stock: " + stock);
        }
        stock -= qty;
        System.out.println("Purchased " + qty + " of " + name + ". Remaining stock: " + stock);
    }

}
