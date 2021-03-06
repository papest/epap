package model;

public class Application {
    public static void main(String[] args)
    {
        Kotik kotik = new Kotik();
        kotik.setKotik(3,"Барсик",3,"Мииук");
        Kotik kotik1;
        kotik1 = new Kotik(2,"Тигрик", 1,"Мяу-Мяу");
        System.out.println("Имя котика "+ kotik1.getName()+"  Вес котика равен " + kotik1.getWeight() + "кг");
        System.out.println("Так мяукуют котики:" + kotik1.getMeow()+" " + kotik.getMeow()  );
       String str1 = kotik1.getMeow();
       String str2 = kotik.getMeow();
        // if (kotik1.getName().equals(kotik.getMeow())) {
        if (str1.equals(str2)) {
            System.out.println("Это одинаковые Мяу!");
        } else {System.out.println("Это разные Мяу!");

        }
        kotik1.liveAnotherDay();
       System.out.println("Число созданных котов: " + Kotik.count);



    }
}
