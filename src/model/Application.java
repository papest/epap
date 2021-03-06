package model;

public class Application {
    public static void main(String[] args)
    {
        Kotik kotik = new Kotik();
        kotik.setKotik(3,"Барсик",3,"Мяу-Мяу");
        Kotik kotik1;
        kotik1 = new Kotik(2,"Тигрик", 1,"Мииук");
        System.out.println("Имя котика "+ kotik1.getName()+"  Вес котика равен " + kotik1.getWeight() + "кг");
        System.out.println("Так мяукуют котики:" + kotik1.getMeow()+" " + kotik.getMeow()  );
        if (kotik1.getName().compareTo(kotik.getMeow()) == 0) {
            System.out.println("Это одинаковые Мяу!");
        } else {System.out.println("Это разные Мяу!");

        }
        kotik1.liveAnotherDay();
       System.out.println("Число созданных котов: " + Kotik.count);



    }
}
