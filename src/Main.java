public class Main {

    public static void main(String[] args) {

        SalesRepresentative[] reps;
        BubbleSort bubbleSort = new BubbleSort();

        SalesRepresentative Guy1sales = new SalesRepresentative("Maria",10,400,4000);
        SalesRepresentative Guy2sales = new SalesRepresentative("Aiste",9,500,4500);
        SalesRepresentative Guy3sales = new SalesRepresentative("Cosi",8,450,3600);
        SalesRepresentative Guy4sales = new SalesRepresentative("Martin",12,500,6000);

        reps = new SalesRepresentative[]{Guy1sales, Guy2sales, Guy3sales, Guy4sales};

        System.out.println("The biggest earnings from top to buttom");
        System.out.println("");

         bubbleSort.sortRepresentativeEarnings(reps);

        for(SalesRepresentative rep : reps){
            System.out.println(rep.toString());
        }
    }
}
