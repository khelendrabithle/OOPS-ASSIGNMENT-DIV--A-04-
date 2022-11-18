public class Time {
    public static void main(String[] args) {



            int hor = 23;
            int min = 60;
            int sec = 60;

            for (int i = 1; i <= hor; i++) 
            {
                for( int j=1; j<=min; j++)
                {
                    for( int k=1; k<=sec; k++){
                       
                        if(i==j && i==k && j==k)
                        {
                            System.out.println(i+":"+j+":"+k);
                        }

                    }
                } 
            }
         System.out.println();
    }
}
