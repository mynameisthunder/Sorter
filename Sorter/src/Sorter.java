import java.util.List;


public class Sorter {
int num;

public static <T extends Comparable<T>> List<T> selectionsort(List<T> list ){
if(list.size()<2){
	return  list;
}
for(int x=0; x<list.size() -1; x++ ){
	int smallestindex=x; //at first this is true
	for(int y=x;y<list.size(); y++){
	if(list.get(smallestindex).compareTo(list.get(y))     >0 ){ //remeber cTo is a.Cto(b) and it returns a-b so if a-b is postive then b is before a
		smallestindex=y;
	}
	}
	//now that you done comparing it with all the rest 
	//swap the x with the smallest yo
	T temp=list.get(x);
	list.set(x, list.get(smallestindex));
	list.set(smallestindex, temp);
}
return  list;
}


public static <T extends Comparable> void print(List<T> list){
	System.out.print("[");
	for(int x=0; x<list.size();x++){
		System.out.print(list.get(x).toString()+", ");
	}
	System.out.println("]");
}
}



