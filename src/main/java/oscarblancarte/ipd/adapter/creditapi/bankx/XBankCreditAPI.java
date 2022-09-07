/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oscarblancarte.ipd.adapter.creditapi.bankx;

/**
 *
 * @author SANTINOGG
 */
public class XBankCreditAPI {

public XBankCreditResponse sendCreditRequest(XBankCreditRequest request){
 XBankCreditResponse response =new XBankCreditResponse();
if(request.getRequestAmount()<= 5000){
response.setAproval(true);
}else{
 response.setAproval(false);
 }
 return response;
 }
 }