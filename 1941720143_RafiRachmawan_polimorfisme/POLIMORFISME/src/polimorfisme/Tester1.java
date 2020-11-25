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
public class Tester1 {
      public static void main (String[] args){
        PermanentEmploye pEmp = new PermanentEmploye("Dedik", 500);
        IntershipEmploye iEmp = new IntershipEmploye("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        Employe e;
        Payable p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    } 
}
