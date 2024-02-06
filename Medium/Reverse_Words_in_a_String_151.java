class Solution {
    public String reverseWords(String st) {
       String[] s = st.split("");
       int count = 0;
		 int first = 0;
		 String se = "";
		 for(int i=0; i<s.length; i++) {
			 if(s[i].equals(" ")) {
				 if(first == 1) {
					 count++;
				 }
			 }
			 else{
				 if(count >0) {
					 se+=" ";
					 count = 0;
					 i--;
				 }
				 else {
					 first = 1;
					 se+=s[i];
				 }
			 }
		 }
		 String[] temp = se.split(" ");
		 String re = "";
		 for(int i=temp.length-1; i>=0; i--) {
			 if(i==0) {
				 re+=temp[i];
			 }
			 else {
				 re+=(temp[i]+" ");
			 }
		 }
		 
		 return re;
    }
}