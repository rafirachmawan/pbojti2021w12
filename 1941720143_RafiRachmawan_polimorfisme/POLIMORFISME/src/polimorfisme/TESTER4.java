/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme;

/**
 *
 * @author Rafi Rachmawan
 */
public class TESTER4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill);//pay for electricity bill
        System.out.println("-------------------------------");

        PermanentEmploye pEmp = new PermanentEmploye("Dedik", 500);
        ow.pay(pEmp);//pay for permanent employee
        System.out.println("-------------------------------");

        IntershipEmploye iEmp = new IntershipEmploye("Sunarto", 5);
        ow.showMyEmploye(iEmp);//show permanent employee info
        System.out.println("-------------------------------");
        ow.showMyEmploye(iEmp);//show internship employee info
    }
}
