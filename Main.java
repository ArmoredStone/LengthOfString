package pkg2;

public class Main {
    public static void main(String[] args) {
        String a= "netbeans rules";
        System.out.print("length of "+ a+ " - "+stringLength(a));    
    }
    public static int stringLength(String string){
    return string.toCharArray().length;
    }
    
}
