package String;

public class IPv6_Detection {
    public static String ipv6Detection(String s){
        return s.replace("." , "[.]");
    }
    public static void main(String[] args) {
        String s = "1.1.1.1";
        System.out.println(ipv6Detection(s));
    }
}
