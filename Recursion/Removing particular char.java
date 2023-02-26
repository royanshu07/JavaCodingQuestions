//Given a string, compute recursively a new string where all 'x' chars have been removed.


public class solution {

	// Return the changed string
	public static String removeX(String input){
		if(input.length()==0){
            return input;
        }
        else{
            String output = removeX(input.substring(1));
            if((input.charAt(0)=='X')||(input.charAt(0)=='x')){
                return output;
            }
            else{
                return input.charAt(0)+output;
            }
        }

	}
}
