/**
 * Created by Ionut on 17.11.2017.
 */
public class BubbleSort {

    public void sortRepresentativeEarnings(SalesRepresentative[] reps) {

        SalesRepresentative temp = null;

        for (int i = 0; i< reps.length; i++){
            for (int j = 1; j< reps.length - i; j ++){

                int repEarnings = reps[j - 1].getEarnings();
                int repEarningsBigger = reps[j].getEarnings();
                 if(repEarnings < repEarningsBigger){
                     temp =reps[j - 1];
                     reps[j - 1] = reps[j];
                     reps[j] = temp;
                 }
            }
        }


    }
}
