package src.polymorphism.ex.pay0;

import static src.polymorphism.ex.pay0.PayStore.findPay;

public class PayService {
    void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        Pay pay = PayStore .findPay(option);
        boolean result= pay.pay(amount);;

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 성공했습니다.");
        }
    }
}
