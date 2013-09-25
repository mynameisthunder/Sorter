import java.util.List;
import java.util.ArrayList;
public class SorterTest {

	public static void main(String [] args){
		List<String> list1=new ArrayList<String>();
		List<StringLength> list2=new ArrayList<StringLength>();
		List<Integer> list3=new ArrayList<Integer>();
		String[] strings={"b","a", "c", "eeeee", "errewr","qweegefsdfgrs", "1", "404", "Omari",
				"Leonard", "ADrain", "Chaz", "Manny"};
		Integer[] ints={1,2,34,4,3,0,12,4,55,123,6,9,12};
		for(int x=0; x<strings.length;x++){
			StringLength s=new StringLength(strings[x]);
			list1.add(strings[x]);
			list2.add( s  );
			list3.add(ints[x]);
			
		}
		Sorter.selectionsort(list1);
		Sorter.selectionsort(list2);
		Sorter.selectionsort(list3);
		System.out.println(list1.get(0));
		System.out.println(list1.get(list1.size()-1));

	Sorter.print(list1);
	Sorter.print(list2);
	Sorter.print(list3);
		
	}
	
		
		
		

	
}
