/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oscarblancarte.ipd.adapter;


import oscarblancarte.ipd.adapter.impl.BankCreditRequest;
import oscarblancarte.ipd.adapter.impl.BankCreditResponse;
import oscarblancarte.ipd.adapter.impl.IBankAdapter;
 import oscarblancarte.ipd.adapter.impl.XBankCreditAdaptee;
import oscarblancarte.ipd.adapter.impl.YBankCreditAdaptee;


/**
 *
 * @author SANTINOGG
 */
public class AdapterMain {
    
    public static void main(String[] args) {
//Request genérico para las dos API's
 BankCreditRequest request = new BankCreditRequest();
request.setCustomer("Oscar Blancarte");
request.setAmount(1000);

 IBankAdapter xBank = new XBankCreditAdaptee();
 BankCreditResponse xresponse = xBank.sendCreditRequest(request);
System.out.println("xBank approved > " + xresponse.isApproved() + "\n");

IBankAdapter yBank = new YBankCreditAdaptee();
 BankCreditResponse yresponse = yBank.sendCreditRequest(request);
 System.out.println("yBank approved > " + yresponse.isApproved() + "\n");

 if (xresponse.isApproved()) {
 System.out.println("xBank aprobó su crédito, felicidades!!");
 } else if (yresponse.isApproved()) {
 System.out.println("yBank aprobó su crédito, felicidades!!");
 } else {
 System.out.println("lo sentimos su crédito no ha sido aprobado");
 }
 } 
    
}
