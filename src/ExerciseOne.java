public class ExerciseOne {

    public static int sumValue(int value){

        if(value == 0){
            return 0;
        }

        return value % 10 + sumValue(value / 10);
    }
}
