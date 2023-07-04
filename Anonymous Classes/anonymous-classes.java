// Created by Guy Robbins



public class Main
{
    public static void main(String[] args) {
    
    
   //your code goes here
        
 Purchase customer = new Purchase();
 
 Purchase specialCustomer = new Purchase(){ 
      public int totalAmount(int price) {
      return price - (price*20)/100;
      };
    };

System.out.println(customer.totalAmount(1000));
System.out.println(specialCustomer.totalAmount(100000));        
        
       
    }
}


class Purchase {
    int price;
    
    public int totalAmount(int price) {
        return price - (price*10)/100;
    }
}
