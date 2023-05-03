// .Create a mini project in Java that models a simple online shopping system. The system should allow users to view products, add them to a shopping cart, and check out. The project should utilize inheritance, interfaces, overriding, collections, and custom exceptions.
// Here are the basic requirements:
// Create an interface called "Product" that defines the basic properties of a product such as the name, description, price, and quantity.
// Create two classes that implement the "Product" interface: "ElectronicProduct" and "ClothingProduct". "ElectronicProduct" should have additional properties such as brand and warranty while "ClothingProduct" should have additional properties such as size and color.
// Create a class called "ShoppingCart" that stores the products selected by the user.
// Create a class called "Checkout" that handles the payment and shipping of the products in the shopping cart.
// Use custom exceptions to handle cases such as insufficient stock or invalid payment information.
// Implement additional features such as search,
import java.util.*;

interface Product {
  String getName();

  String getDescription();

  double getPrice();

  int getQuantity();
}

class ElectronicProducts implements Product {
  private String name;
  private String description;
  private double price;
  private int quantity;
  private String brand;
  private int warranty;

  ElectronicProducts(String name, String description, double price, int quantity, String brand, int warranty) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
    this.brand = brand;
    this.warranty = warranty;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getBrand() {
    return brand;
  }

  public int getWarranty() {
    return warranty;
  }
}

class ClothingProduct implements Product {
  private String name;
  private String description;
  private double price;
  private int quantity;
  private String size;
  private String color;

  ClothingProduct(String name, String description, double price, int quantity, String size, String color) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
    this.size = size;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getSize() {
    return size;
  }

  public String getColor() {
    return color;
  }
}

class ShoppingCart {
  Scanner s = new Scanner(System.in);
  // ArrayList<ElectronicProducts> pro = new ArrayList<ElectronicProducts>();
  // ArrayList<ClothingProduct> cloth = new ArrayList<ClothingProduct>();

  public void addProduct(ArrayList<ElectronicProducts> pro) {
    System.out.println(" Enter name of the product");
    String name = s.next();
    System.out.println(" Enter description of the product");
    String description = s.next();
    System.out.println(" Enter price of the product");
    double price = s.nextDouble();
    System.out.println(" Enter quantity of the product");
    int quantity = s.nextInt();
    System.out.println(" Enter brand of the product");
    String brand = s.next();
    System.out.println(" Enter warranty of the product");
    int warranty = s.nextInt();
    pro.add(new ElectronicProducts(name, description, price, quantity, brand, warranty));
  }

  public void addClothProduct(ArrayList<ClothingProduct> cloth) {
    System.out.println(" Enter name of the product");
    String name = s.next();
    System.out.println(" Enter description of the product");
    String description = s.next();
    System.out.println(" Enter price of the product");
    double price = s.nextDouble();
    System.out.println(" Enter quantity of the product");
    int quantity = s.nextInt();
    System.out.println(" Enter color of the product");
    String color = s.next();
    System.out.println(" Enter size of the product");
    String size = s.next();
    cloth.add(new ClothingProduct(name, description, price, quantity, size, color));
  }

  public void displayElectronics(ArrayList<ElectronicProducts> pro) {
    if (pro.size() == 0) {
      System.out.println("There is no products shop is EMPTY !!");
    } else {
      System.out.println("The products which are currently available in the shop are ");
      for (ElectronicProducts electronics : pro) {
        System.out.println("Name of the product is : " + electronics.getName());
        System.out.println("Price of the product is : " + electronics.getPrice());
        System.out.println("Description of the product is : " + electronics.getDescription());
        System.out.println("Quantity of the product is : " + electronics.getQuantity());
        System.out.println("Brand of the product is : " + electronics.getBrand());
        System.out.println("Warranty of the product is : " + electronics.getWarranty());
        System.out.println();
        System.out.println("************");
        System.out.println();
      }
    }
  }

  public void displayCloths(ArrayList<ClothingProduct> cloth) {
    if (cloth.size() == 0) {
      System.out.println("There is no cloths,, shop is EMPTY !!");
    } else {
      System.out.println("The products which are currently available in the shop are ");
      for (ClothingProduct c : cloth) {
        System.out.println("Name of the cloth is : " + c.getName());
        System.out.println("Price of the cloth is : " + c.getPrice());
        System.out.println("Description of the cloth is : " + c.getDescription());
        System.out.println("Quantity of the cloth is : " + c.getQuantity());
        System.out.println("Size of the cloth is : " + c.getSize());
        System.out.println("Colour of thecloth is : " + c.getColor());
        System.out.println();
        System.out.println("************");
        System.out.println();
      }
    }
  }
}

class InvalidPayMentException extends Exception {
  InvalidPayMentException(String str) {
    super(str);
  }
}

class CheckOut extends ShoppingCart {
  double totalPrice;
  // ShoppingCart listOfProducts = new ShoppingCart();
  Scanner s = new Scanner(System.in);

  // void list() {
  // System.out.println("List of Electronic products in the shop");
  // displayElectronics();
  // System.out.println("List of clothing in the shop ");
  // displayCloths();
  // }

  ArrayList<String> cart = new ArrayList<String>();

  void bill(ArrayList<ClothingProduct> cloth, ArrayList<ElectronicProducts> pro) {
    for (String c : cart) {
      for (ElectronicProducts ele : pro) {
        if (c.equals(ele.getName())) {
          totalPrice = totalPrice + ele.getPrice();
        }
      }
      for (ClothingProduct clo : cloth) {
        if (c.equals(clo.getName())) {
          totalPrice = totalPrice + clo.getPrice();
        }
      }
    }
    System.out.println("Total biil is " + totalPrice);

  }

  void purchase() {

    // displayElectronics(ArrayList<ElectronicProducts> pro);
    // displayCloths(ArrayList<ClothingProduct> cloth);
    System.out.println("Enter how many products your are going to buy ");
    int n = s.nextInt();
    System.out.println("Enter products name ");
    for (int i = 0; i < n; i++) {
      cart.add(s.next());
    }

  }

  public void payment() throws InvalidPayMentException {
    System.out.println("Enter amount you have to pay ");
    double amount = s.nextDouble();
    if (amount != totalPrice) {
      throw new InvalidPayMentException("Please pay proper amount as same to total price");
    } else {
      System.out.println("Thank you:: purchase finished!!");
    }
  }
}

class OnlineShopping {

  public int choice() {
    System.out.println("1, To Add Electronic products");
    System.out.println("2, To Add Clothing products");
    System.out.println("3, To view Electronic products in the shop");
    System.out.println("4, To view Clothing products in the shop ");
    System.out.println("5 To purchase products ");
    System.out.println("6, To make payment after purchasing");
    System.out.println("7, To EXIT");
    System.out.println("Enter your choice");
    Scanner s = new Scanner(System.in);
    int choice = s.nextInt();
    return choice;
  }

  public static void main(String args[]) {
    ArrayList<ElectronicProducts> pro = new ArrayList<ElectronicProducts>();
    ArrayList<ClothingProduct> cloth = new ArrayList<ClothingProduct>();
    CheckOut check = new CheckOut();
    Scanner s = new Scanner(System.in);
    OnlineShopping mini = new OnlineShopping();
    ShoppingCart shop = new ShoppingCart();
    int opt = 0;
    do {
      opt = mini.choice();
      switch (opt) {
        case 1: {
          shop.addProduct(pro);
          break;
        }
        case 2: {
          shop.addClothProduct(cloth);
          break;
        }
        case 3: {
          shop.displayElectronics(pro);
          break;
        }
        case 4: {
          shop.displayCloths(cloth);
          break;
        }
        case 5: {
          System.out.println("See below Products to purchase ");
          shop.displayElectronics(pro);
          shop.displayCloths(cloth);
          check.purchase();
          check.bill(cloth, pro);
          break;
        }
        case 6: {
          try {
            check.payment();
          } catch (InvalidPayMentException e) {
            System.out.println(e);
          }
        }
        case 7: {
          System.out.println("THANK YOU !! Visit Again");
          break;
        }
      }
    } while (opt != 7);
  }
}