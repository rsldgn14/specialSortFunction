


public class Main {




    public static void main(String[] args) {
        String[] input = {"aaaasd", "a", "aab", "aaabcd", "ef", "cssssssd", "fdz", "kf", "zc", "lklklklklklklklkl", "l"};
        //call function
        sortAlgoritm(input);




    }


    //Sort function
    public static void sortAlgoritm(String[] inputs){
        int i;
        int j;
        String temp;
        for(i=0;i<inputs.length-1;i++){

            for(j=0;j<inputs.length-i-1;j++){

                if(numberOfA(inputs,j)!=0){
                    if(numberOfA(inputs,j)<numberOfA(inputs,j+1)){

                        if(numberOfA(inputs,j)!=0){
                            temp = inputs[j];
                            inputs[j] = inputs[j+1];
                            inputs[j+1] = temp;
                        }


                    }



                }
                else {
                    if(lengthOfInput(inputs,j)<lengthOfInput(inputs,j+1)){
                        temp = inputs[j];
                        inputs[j] = inputs[j+1];
                        inputs[j+1] = temp;
                    }
                }
            }}
        for(String k:inputs){
            System.out.print('"'+k+'"'+',');
        }

    }

    //Separate input and determine a "a" number
    public static int numberOfA(String[] input,int i) {
        String[] separated = input[i].split("");
        int j;
        int counter =0;
        for (j = 0; j < separated.length; j++) {
            if (separated[j].contains("a")) {
                counter += 1;
            }
        }
        return counter;
    }
    //Determine input lengt
    public static int lengthOfInput(String[] input,int i){

        String[] separated = input[i].split("");



        return separated.length;
    }
}




