public abstract class Hero extends Character{

   private String name;
   private int size; 
   private int speed;
   private int health;
   
   public int injured(int damage){
      health -= damage;
      return health;
   }
   public int hit(int damage){
      //Villain.getHealth() -= damage;
      return damage;
   }
   public boolean move(String direction);
   public boolean jump(boolean doubleJump);
   
   }