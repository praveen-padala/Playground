//import required packages here
 import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
    public void setPrice(int price)
    {
         this.price = price;
    }
    public int  getPrice()
    {
         return this.price;
    }
        
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void setProduct(String product)
  {
       this.product = product;
  }
  public void setQuantity(int quantity)
  {
       this.quantity = quantity;
  }
  public int getQuantity()
  {
      return this.quantity;
  }
}

class Bill
{
  //implement your logic to calculate total price
   public void caluculateBill(Customer customer, Item item)
   {
       int bill = customer.getQuantity() * item.getPrice();
       System.out.println("Total Price is : "+bill);
   }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in  = new Scanner(System.in);
    String product = in.nextLine();
    int price = in.nextInt();
    int quantity = in.nextInt();
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
    i.setPrice(price);
    c.setProduct(product);
    c.setQuantity(quantity);
    obj.caluculateBill(c, i);
  }
}