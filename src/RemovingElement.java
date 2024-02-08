public class RemovingElement {
    public static void main(String[] args) {
        remove("aaaafayaaaeaaadaaa",0);
        System.out.println(s);
    }
    static String s=new String();
    static void remove(String str,int i){
        if(i==str.length()-1) {
            return;
        }

        if(str.charAt(i)=='a'){
          remove(str,i+1);
        }
        else{
            s+=str.charAt(i);
            remove(str,i+1);
        }

    }

}
