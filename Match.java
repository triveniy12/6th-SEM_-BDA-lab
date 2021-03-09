import java.io.*;

class Player
{
    int id;
    String name;
    int score1;
    int score2;
    int score3;
    int n_played;
     
    Player(int id1,String name1,int score11,int score12,int score13,int played)
    {
        this.id = id1;
        this.name = name1;
        this.score1 =score11;
        this.score2 = score12;
        this.score3 = score13;
        this.n_played = played;
    }
    
    int calculate(int score1,int score2,int score3)
    {
        int avg;
        avg = (score1+score2+score3)/3;
        return avg;
        
    }
}
class Match
{
     public static void main (String[] args) 
     {
        Player p1 = new Player(12,"Triveni",45,56,47,4);
        Player p2  = new Player(23,"Swathi",54,12,21,5);
        int p1_avg = p1.calculate(p1.score1,p1.score2,p1.score3);
        int p2_avg = p2.calculate(p2.score1,p2.score2,p2.score3);
        if(p1_avg > p2_avg)
        {
            System.out.println("The details of the player "+p1.name+" with the highest averge value");
            System.out.println("id" +p1.id);
            System.out.println("name" +p1.name);
            System.out.println("Average Score" +p1_avg );
            System.out.println("Total number of games played" +p1.n_played);
            
        }
        else
        {
            System.out.println("The details of the player "+p2.name+" with the highest averge value");
            System.out.println("id" +p2.id);
            System.out.println("name" +p2.name);
            System.out.println("Average Score" +p2_avg );
            System.out.println("Total number of games played" +p2.n_played);
             
        }
        
    }
}
