import java.util.Scanner;

public class Program {
	public static void bubbleSort(short[] arr){
		for(int i = arr.length-1 ; i > 0 ; i--){
			for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                short tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		char[] chars = string.toCharArray();
		short[] alph = new short[65626];
		System.out.println(chars);
		for (char i: chars){
			alph[i]++;
		}
		bubbleSort(alph);
		for (int i = 0; i < 4; i++) {
			System.out.println(alph[i]);
		}
	}
}
