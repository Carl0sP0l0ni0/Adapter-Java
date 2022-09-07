/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oscarblancarte.ipd.adapter.creditapi.banky;

/**
 *
 * @author SANTINOGG
 */
public class YBankCreditSender {
    
    
    public void sendCreditForValidate(final YBankCreditApprove request,
final YBankCreditSenderListener listener) {

new Thread(new Runnable() {
@Override
 public void run() {
System.out.println("YBank recibió la solicitud en un momento y tendrá la respuesta, sea paciente por favor");
 YBankCreditApproveResult response = new YBankCreditApproveResult();
if (request.getCredit() <= 1500) {
response.setApproved("Y");
 } else {
 response.setApproved("N");
 }
 try {
 Thread.sleep(1000 * 30);
} catch (Exception e) {
 e.printStackTrace();
 }

 listener.notifyCreditResult(response);
 }
 }).start();
 } 
    
}
