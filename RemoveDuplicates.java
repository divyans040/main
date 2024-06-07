public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "madam";
        String output = "";

        for(int i=0;i<input.length();i++){
            boolean check = false;

            for(int j=0;j<output.length();j++){
                if(output.charAt(j)==input.charAt(i)){
                    check = true;
                    break;
                }
            }
            if(!check){
                output = output + input.charAt(i);
            }
        }
        System.out.println(output);
    }
}
