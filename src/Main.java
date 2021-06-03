import java.util.Scanner;

public class Main {

	private static SnackMachine myVM;
	
	public static void main(String[]args){
		myVM = new SnackMachine();
		myVM.fillMachine();
		myVM.run();
	}
}
