package iut.tdd;

public class RomanNumerals {
	public String convertToArabe(String roman) {
		int nbr = 0 ;
		for(int i = 0 ; i < roman.length() ; i++){
			int chiffre = charToArabe(roman.charAt(i));
			if(i+1 < roman.length() && chiffre < charToArabe(roman.charAt(i+1))){
				nbr -= chiffre ;
			}else{
			nbr += chiffre ;
			}
		}
		return ""+nbr ;
	}
	
	
	
	public String convertFromRoman(String roman) {
		return "1";
	}
	int charToArabe(char c){
		if(c == 'I'){
			return 1 ;
		}else if(c == 'V'){
			return 5 ;
		}else if(c == 'X'){
			return 10 ;
		}else if(c == 'L'){
			return 50 ;
		}else if(c == 'C'){
			return 100 ;
		}else if(c == 'D'){
			return 500 ;
		}else if(c == 'M'){
			return 1000 ;
		}
		return 0 ;
	}
	
	public String convertToRoman(String arabe){
		
	}
}
