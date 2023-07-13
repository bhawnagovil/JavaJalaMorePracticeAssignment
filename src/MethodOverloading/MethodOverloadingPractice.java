package MethodOverloading;

public class MethodOverloadingPractice {

    int shiptokennumbe;
    String shipName;

    int shipweight;

    double shiptokennumber;


    public void runShipComapny(int shiptokennumber, String shipName ){
        System.out.println("grow the company with this ship");
    } // same name but different number parameter
    public void runShipCompany(int shiptokennumber, String shipName, int shipweight){
        System.out.println("grow the company with other ship");

    }// same name different number of parameter
    public void runShipCompany(double shiptokennumber){
        System.out.println("grow the companywith other more ship");
    }// same name, same number of parameter but different datatype

    public void runShipComapny(int shiptokennumber){
        System.out.println("grow the company with this ship also");
    }// same name, same number of parameter but different datatype

   /* public int runShipCompany(double shiptokennumber, String shipName,int shipweight){
        this.shiptokennumber= shiptokennumber;
        this.shipName= shipName;
        this.shipweight= shipweight;
         int ship_capacity=  2* shipweight;
        return ship_capacity;
    }
    public double runShipCompany(double shiptokennumber, String shipName,int shipweight){
       double ship_quotation=  (double)(28* shiptokennumbe);
       return ship_quotation;


     //giving compiling error The compiler does not consider the return type while differentiating the overloaded method.
    But you cannot declare two methods with the same signature and different return types.
    It will throw a compile-time error, 3. We can not define more than one method with the same name, Order, and type of the arguments.
      It would be a compiler error.*/



    public static void main(String[] args) {
        MethodOverloadingPractice practice= new MethodOverloadingPractice();
        practice.runShipComapny(10,"Big5");

    }
}
