

public class Pokemon
{
   private int hp;
   private int attack; 
   private int defense;
   private int spAttack;
   private int spDefense;
   private int speed;
   private String name;
   
   public int getHp()
   {
       return hp;
   }
   public int getAttack()
   {
       return attack;
   }
   public int getDefense()
   {
       return defense;
   }
   public int getSpeed()
   {
       return speed;
   }
   public String getName()
   {
       return name;
   }
   public void setName(String userName)
   {
       name = userName;
   }
   public  void setHp(int userHp)
   {
       hp = userHp;
   }
   public void setAttack(int userAttack)
   {
       attack = userAttack;
   }
   public void setDefense(int userDefense)
   {
       defense = userDefense;
   }
   public void setSpeed(int userSpeed)
   {
       speed = userSpeed;
   }
}
