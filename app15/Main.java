public class Main {
    public static void main(String args[]){
        String s = null;
        try {
            s.length();
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public static void Change(){
        String lit = "三";
        try {
            int i = Integer.parseInt(lit);
        }
        catch(NumberFormatException e){
            e.getMessage();
        }
    }
}