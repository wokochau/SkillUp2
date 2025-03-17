import java.util.Random;
public class Birthday
{
    //33
    int days = 365;
    int people = 33;
    int count = 10000;
    int sharedBirthday = 0;
    Random random = new Random();
    //double probabilty = calculateProbability(size , birthday);
    public void Birthday()
    {
           for (int i = 0; i < count; i++) {
            if (hasSharedBirthday(people)) {
                sharedBirthday++;
            }
        }

        double probability = (double) sharedBirthday / count * 100;
        System.out.printf("In a group of %d people, the probability of at least two people sharing a birthday is %.2f%%\n", people, probability);
    }
    private boolean hasSharedBirthday(int people) 
    {
        int[] birthdays = new int[365];

        for (int i = 0; i < people; i++)
        {
              int birthday = random.nextInt(365); 
            if (birthdays[birthday] > 0) 
            {
                return true; 
            }
            birthdays[birthday]++;
        }
        return false;
    }
}
