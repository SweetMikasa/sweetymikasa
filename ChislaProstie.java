import java.util.Scanner;

public class ChislaProstie{
	public static void main(String[] args){
       System.out.println("Type a number: ");
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        boolean b = true;
        for (int P=2; P < input; P++){
           for(int i=2; i<P; i++){
               if(P % i == 0){
                    b=false;
                    break;
               }
          }
           if (b) System.out.println(P);
           else b = true;
        }
	}
}
