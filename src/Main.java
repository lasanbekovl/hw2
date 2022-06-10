public class Main {

    public static void main(String[] args) {
        System.out.println(mac(23 , 34));
        System.out.println(mac(56 , 1));
        System.out.println(mac(30 , 32));
        System.out.println(mac(5 , 233));
        System.out.println(mac(34 , 23));
    }

    public static String mac (int age, int temp ){
       String sd ="Можно идти гулять";
       String ds = "Оставайтесь дома";
       if (age > 20 && age < 45 || temp > -20 && temp < 45) {
           return sd;
       } else if (age < 20 || temp > 0 && temp < 28) {
           return sd;
       } else if (age > 45 || temp > -20 && temp < 25){
            return sd;

        }else {
           return ds;
       }
    }

}
