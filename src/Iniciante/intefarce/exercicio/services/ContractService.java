package Iniciante.intefarce.exercicio.services;

import Iniciante.intefarce.exercicio.entities.Contract;
import Iniciante.intefarce.exercicio.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    public void processContract(Contract contract, int months){
        double basicQuota=contract.getTotalValue()/months;
        for(int i=1;i<=months;i++){
            double updatedQuota=basicQuota+onlinePaymentService.interest(basicQuota,i);
            double fullQuota=updatedQuota+onlinePaymentService.paymentFee(updatedQuota);
            Date dueDate=addMonths(contract.getDate(),i);
            //contract.getInstallments().add(new Installment(dueDate,fullQuota));
            contract.addInstallments(new Installment(dueDate,fullQuota));
        }
    }

    private static Date addMonths(Date date, int n){
        Calendar cal= Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH,n);
        return cal.getTime();
    }
}
