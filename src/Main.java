public class Main {
    public static void main(String[] args) {
        //task8.1
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        System.out.println(weights[0]);
        System.out.println(weights[1]);
        System.out.println(weights[2]);
        // в одной строке
        System.out.print (weights[0] +",");
        System.out.print (weights[1] + ",");
        System.out.print (weights[2]);
        System.out.print('\n');
        // в другом порядке
        System.out.print (weights[2] +",");
        System.out.print (weights[1] + ",");
        System.out.print (weights[0]);
        System.out.print('\n');
        //четные
        for (int i=0; i<3; i+=2)
            System.out.print (i);
            System.out.print('\n');

        //task8.2
        double[] w = {1.57, 7.654, 9.986};
        System.out.println(w[0]);
        System.out.println(w[1]);
        System.out.println(w[2]);
        // в одной строке
        System.out.print (w[0]+",");
        System.out.print (w[1]+ ",");
        System.out.print (w[2]);
        System.out.print('\n');
        // в другом порядке
        System.out.print (w[2]+",");
        System.out.print (w[1]+ ",");
        System.out.print (w[0]);
        System.out.print('\n');


        //task8.3
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn" };
        System.out.println(seasons[0]);
        System.out.println(seasons[1]);
        System.out.println(seasons[2]);
        System.out.println(seasons[3]);

        // в одной строке
        System.out.print(seasons[0] +",");
        System.out.print(seasons[1] +",");
        System.out.print(seasons[2]+",");
        System.out.print(seasons[3]);
        System.out.print('\n');
        // в другом порядке
        System.out.print(seasons[3] +",");
        System.out.print(seasons[2] +",");
        System.out.print(seasons[1]+",");
        System.out.print(seasons[0]);
















    }
}