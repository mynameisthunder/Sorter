public class StringLength implements Comparable<StringLength>{
		String string;
		public StringLength(String s){
			string=s;
		}
		public int length(){
			return string.length();
			
		}
		public String toString(){
		return string;	
		}
		public int compareTo(StringLength s){
			if(string.length() ==s.length()){
				return 0;
			}
			return ((string.length() < s.length())? -1: 1  );
			
		}
	}

