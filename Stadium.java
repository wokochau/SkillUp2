
public class Stadium 
{
   public void battle (Pokemon p1, Pokemon p2)
   {
       // normally check speed first 
       
       Pokemon first;
       Pokemon second;
       if (p1.getSpeed() > p2.getSpeed())
       {
           first = p1;
           second = p2;
       } else{
           first = p2;
           second = p1;
       }
       
       while ( p1.getHp() > 0 && p2.getHp() > 0)
       {
           int damageToSecond = first.getAttack() - second.getDefense();
           second.setHp(second.getHp() - damageToSecond);
           if (second.getHp() <= 0)
           {
               System.out.println(second.getName() + " is defeated");
               break;
           }
           int damageToFirst = second.getAttack() - first.getDefense();
           first.setHp(first.getHp() - damageToFirst);
           if (p1.getHp() <= 0)
           {
               System.out.println(first.getName() + " is defeated");
               break;
           }
       }
       if (first.getHp() > 0) 
       {
           System.out.println(first.getName() + " wins");
           
       }else{ 
           System.out.println(second.getName() + " wins");
       }
    }
}
       
       // put this in a loop until one is defeated 
       // p1 attacks p2 // battle math subtract from hp the difference of teh attack and defense
       //check other pokemon if hp over 0;
       // p2 attacks p1
       // 

