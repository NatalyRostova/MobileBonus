public class Main {
    public static void main(String[] args) {

        int account = 100; // сумма на счету
        int refill = 1300; // сумма пополнения

        int bonus;
        if (refill < 1000) {
            bonus = 0;
            
        } else {
            bonus = refill / 100;  
        }
        int total = account + refill + bonus; // итоговая сумма на счету с учетом бонуса
        
        System.out.println ("Итоговый счёт: " + total);
        System.out.println ("Бонусы: " + bonus);
        

    }
}