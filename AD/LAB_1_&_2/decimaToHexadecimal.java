
public class decimaToHexadecimal {

	public static void main(String[] args) {
		
		System.out.println(ToHexadecimal(65," "));
		
	}
	
static String 	ToHexadecimal(int num, String s){
	if(num/16==0) return s;
		s=s+num%16;
		num/=16;
		return ToHexadecimal(num,s);
		
	}

}
