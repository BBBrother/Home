package com.example.home.homework_14;

public class IncomingCall {
    private int id;
    private String reason;

    public IncomingCall() {
        this.reason = setReason();
        this.id = setId();
    }

    public int getId() {
        return id;
    }
    public String getReason () {
        return reason;
    }

    public int setId(){
        return id  = (int) (Math.random()*1000);
    }

    public String setReason() {
        int randomReason = (int) (Math.random()*8)+1;
        switch (randomReason){
            case 1:
                reason = "Заказать пиццу: Карбонад, салями и грудинка.";
                break;
            case 2:
                reason = "Заказать пиццу: Пепперони и колбаски.";
                break;
            case 3:
                reason = "Заказать пиццу: Салями с соусом чеддер.";
                break;
            case 4:
                reason = "Заказать пиццу: Ранч пицца.";
                break;
            case 5:
                reason = "Заказать пиццу: Цыпленок барбекю.";
                break;
            case 6:
                reason = "Заказать пиццу: Баварская.";
                break;
            case 7:
                reason = "Заказать пиццу: Гавайская.";
                break;
            case 8:
                reason = "Заказать пиццу: Грибная.";
                break;
        }
        return reason;
    }

    public void callInfo(String name){
        System.out.println("ID: " + getId() + "\nПричина: "+ getReason() +"\nОбработан: "+name);
    }
}
