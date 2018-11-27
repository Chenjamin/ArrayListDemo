import java.util.ArrayList;

public class ArrayListDemo{

	public static ArrayList<Integer> combine(ArrayList <Integer> a, ArrayList <Integer> b){
		for(int i = 0; i < b.size(); i++){
			a.add(b.get(i));
		}
		return a;
	}
}
