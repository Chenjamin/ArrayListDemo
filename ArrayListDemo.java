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

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> a){

		for(int i = 0; i<(a.size()-1); i++){
			for(int j = i+1; j < a.size(); j++){
				if(a.get(i) == a.get(j)){
					a.remove(j);
					j--;
				}
			}
		}
		return a;
	}

	public static void main(String [] args){
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 1; i<=10; i++){
			a.add(i);
		}
		ArrayList<Integer> b = new ArrayList<>();
		for(int i = 1; i<=10; i++){
			b.add(i);
		}

		System.out.println(combine(a,b));
		print(a);
		System.out.println(removeDuplicates(a));
		System.out.println("Hello");

	}
}
