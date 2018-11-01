import java.util.Scanner;
class UTS{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
        int a,b,c;

        System.out.print("Masukkan nilai a : ");
        a = input.nextInt();
        System.out.print("Masukkan nilai b : ");
        b = input.nextInt();
        System.out.print("Masukkan nilai c : ");
        c = input.nextInt();

        if(a==b || b==c || c==a){
        	System.out.print("Sama kaki");
        }
        if(a==b && b==c){
        	System.out.print("Sama sisi");
        }	
        else {
        	System.out.print("SEMBARANG");
        }
	}
}