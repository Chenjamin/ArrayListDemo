import java.util.ArrayList;

public class ArrayListDemo{

	public static ArrayList<Integer> combine(ArrayList<Integer> a, ArrayList<Integer> b){
		for(int i = 0; i < b.size(); i++){
			a.add(b.get(i));
		}
		return a;
	}

	public static void print(ArrayList<Integer> a){
		for(int i = 0; i < a.size(); i++){
			System.out.print(a.get(i) + ", ");
		}
		System.out.println("");
	}
}
