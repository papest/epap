package model;

class Kotik {
// Класс котик
    private int h = 6;
    private int i;
    private int fullness = 2;
    static int count = 0;
    private String name;
    private String meow;
    private int prettiness;
    private int weight;
    
    public Kotik (int prettiness, String name, int weight, String meow) {
        // Конструктор с параметрами
        this.meow = meow;
        this.name = name;
        this.weight = weight;
        this.prettiness = prettiness;
        count++;
    }
    public Kotik () {
        // Конструктор без параметров
        setKotik(prettiness, name, weight, meow);
        count++;
    }
    
    

private boolean play () {
// Метод play
    
   if (fullness>0 )
   {
    fullness--;
       System.out.println ("Котик играет!");
       return true;
   }
   else return false;
}

private boolean sleep() {
// Метод sleep
    
    if (fullness>0 )
    {
        fullness--;
    System.out.println ("Котик спит!");
        return true;
    }
    else return false;

}

private boolean chaseMouse() {
// Метод chaseMouse
    if (fullness>0 )
    {
        fullness--;
    System.out.println ("Котик ловит мышь!");
        return true;
    }
    else return false;
}
    
    private void eat( int incFullness )
    {
// Метод eat
        fullness += incFullness;
   //System.out.println("Котик ест!"+fullness+" "+incFullness+" ");
        System.out.println("Котик ест!");
    }
    
    
   private void eat( int incFullness, String food )
    {
        // Метод eat
        fullness += incFullness;
       // System.out.println("Котик ест"+ food + "!" + fullness+" "+incFullness+" ");
        System.out.println("Котик ест"+ food + "!");
    }


private void eat() {
// Метод eat
    eat( 1, " что-то ");
 //   System.out.println ("Котик ест!"+fullness+" ");
    
}


private boolean sharpensItsClaws(){
// Метод sharpensItsClaws
    if (fullness>0 )
    {
        fullness--;

    System.out.println ("Котик точит ногти!");
        return true;
    }
    else return false;

    }
    
private boolean meow(){
        // Метод meow
    if (fullness>0 )
    {
        fullness--;
        System.out.println ("Котик мяукает!");
    return true;
}
    else return false;

    }
    
    public String getName() {
    
        // Сообщить имя
        
        return name;
    }
    
    public void setName(String name) {
        
        // Присвоить имя
        
        this.name = name;
    }
    public String getMeow() {
        
        // Сообщить мяв
        
        return meow;
    }
    
    public void setMeow(String meow) {
        
        // Присвоить мяв
        
        this.meow = meow;
        System.out.println (" "+ meow);
    }

    
    public int getPrettiness() {
        
        // Узнать миловидность
        
        return  prettiness;
    }
    
    public void setPrettiness(int prettiness) {
        
        // Присвоить миловидность
        
        this.prettiness =  prettiness;
    }
    
    public int getWeight() {
        
        //Узнать вес
        
        return weight;
    }
    
    public void setWeight(int weight) {
        
        //Присвоить вес
        
        this.weight = weight;
    }
    public void setKotik(int prettiness, String name, int weight, String meow) {
        
        //Инициализировать параметры
        this.meow = meow;
        this.name = name;
        this.weight = weight;
        this.prettiness = prettiness;
    }
    
    
public void  liveAnotherDay() {
// Метод liveAnotherDay
    System.out.println (" Еще один день Котика");
// 24 дела Котика
    for( i = 0; i < 24 ; i++)
    {
       
    int k = (int)(Math.random()*h+1);
    // System.out.print ("i = "+ i +" k = "+ k + " ");
        System.out.print ("i = "+ i +" ");

   switch(k) {
           
    case 1 :
     if (!play () )
    
     { eat();
     }
    break;
           
    case 2 :
           if (!sleep())
               
           { eat();
           }
    break;
           
    case 3 :
           if (!chaseMouse() )
               
           { eat();
           }

    
     break;
    case 4 :
           if ( !sharpensItsClaws())
               
           { eat();
           }
   
     break;
    case 5 :
    eat();
    break;
    case 6 :
           if ( !meow() )
               
           { eat();
           }

           
    
    break;

        }
     //   System.out.println(" k = "+ k + " ");
    
                
    }
    
    }



public static void main( String[] args) {


   Kotik kotik = new Kotik();
    kotik.setMeow("Мяу");
    kotik.liveAnotherDay();

}
}
