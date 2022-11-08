import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    Dog dog= new Dog();
//    dog.name="Rex";
//    dog.age=10;
//    dog.Country="Kyrgryzstan";
//
//    Cat cat= new Cat();
//    cat.name="Mia";
//    cat.age=5;
//    cat.Country="Russia";
//
//    Cow cow=new Cow();
//    cow.name="akui";
//    cow.age=10;
//    cow.Country="KAz";

//        Dog dog=new Dog();
//        dog.setName("Rex");
//        dog.setAge(10);
//        dog.setCountry("KGZ");
//
//        Cat cat =new Cat();
//        cat.setName("MIA");
//        cat.setAge(10);
//        cat.setCountry("RUS");
//
//        Cow cow=new Cow();
//        cow.setName("Ak");
//        cow.setAge(10);
//        cow.setCountry("Kaz");
//
//        System.out.println("name:"+dog.getName()+"\n"+"age:"+dog.getAge()+"\n"+"country:"+dog.getCountry());
//        System.out.println("name:"+cat.getName()+"\n"+"age:"+cat.getAge()+"\n"+"country:"+cat.getCountry());
//        System.out.println("name:"+cow.getName()+"\n"+"age:"+cow.getAge()+"\n"+"country:"+cow.getCountry());

     Country country1=new Country("Kyrgyzstan",7,200,"Kyrgyz");
     Country country2= new Country("Russia",127,1000,"Russia");
     Country country3= new Country("Kazakhstan",20,800,"KAZ");
        Country country4= new Country("USA",127,150,"USA");
        Country country5= new Country("England",100,100,"ENG");
        Country country6= new Country("Germany",127,1000,"Deutschland");
    Country[] countries= {country1,country2,country3,country4,country5,country6};
    Scanner scanner= new Scanner(System.in);



  int c = scanner.nextInt();
   switch (c){
        case 1:
        getMax(countries);
        break;
       case 2:
           findbycountryNmae(scanner.next(),countries);
        break;
       case 3:
           findAll(countries);
       default:
           System.out.println("myndai san jok");
   }
    }
   public  static  void getMax(Country[]countries){
        int max= countries[0].getS();
        int min=countries[0].getS();
       for (int i = 0; i < countries.length; i++) {
            max=Math.max(max,countries[i].getS());
            min= Math.min(min,countries[i].getS());

       }
       System.out.println(max);
       System.out.println(min);
   }
    public static void findbycountryNmae(String countryName,Country[]countries){
        for (Country country:countries){
            if(country.getName().equals(countryName)){
                System.out.println(country.toString());
            }
        }
              {

        }


    }
    public static void findAll(Country[]countries){
        for (Country country:countries) {
            System.out.println(country.toString());
        }
    }
}