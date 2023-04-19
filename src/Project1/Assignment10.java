package Project1;

public class Assignment10 {
    public static void main(String[] args) {
        String[] seasons = {"Spring", "Fall", "Summer", "Summer", "Winter", "Winter"};

        for (int i = 0; i < seasons.length-1; i++)
        {
            for (int j = i+1; j < seasons.length; j++)
            {
                if( (seasons[i].equals(seasons[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+seasons[j]);
                }
            }
        }
    }
}

