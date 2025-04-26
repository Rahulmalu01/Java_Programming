import java.util.*;
public class xo
{
    String a=" ",b=" ",c=" ",e=" ",d=" ",f=" ",g=" ",h=" ",i=" ";
    private Scanner sca = new Scanner(System.in);
    private static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        xo xo=new xo();
        System.out.println("Let's Start the Game");
        System.out.print("Enter the name of player1 : ");
        String player1 = sc.nextLine();
        System.out.print("Enter the name of player2 : ");
        String player2 = sc.nextLine();
        xo.sample();
        for(int t=1;t<10;t++)
        {
            t=xo.board(t);
            xo.printb();
            xo.check(player1,player2);
        }
    }
    void sample()
    {
        System.out.println("The XO Game begins");
        System.out.println("Sample XO board");
        System.out.println("1 | 2 | 3");
        System.out.println("--+---+--");
        System.out.println("4 | 5 | 6");
        System.out.println("--+---+--");
        System.out.println("7 | 8 | 9");
    }
    
    void check(String player1, String player2)
    {
        String q=null;
        if(a==b && b==c && a!=" ")
            q=a;
        else if(d==e && e==f && e!=" ")
            q=e;
        else if(g==h && h==i && h!=" ")
            q=h;
        else if(a==d && d==g && a!=" ")
            q=d;
        else if(b==e && e==h && e!=" ")
            q=e;
        else if(c==f && f==i && i!=" ")
            q=c;
        else if(a==e && e==i && a!=" ")
            q=a;
        else if(c==e && e==g && e!=" ")
            q=c;
        else
            System.out.print("");           
        if(q=="X")
        {
            System.out.println(player1 + "is the winner");
            main(null);
        }           
        if(q=="O")
        {
            System.out.println(player2 + "is the winner");
            main(null);
        }         
    }
    
    void printb()
    {
        System.out.println(a+" | "+b+" | "+c);
        System.out.println("--+---+--");
        System.out.println(d+" | "+e+" | "+f);
        System.out.println("--+---+--");
        System.out.println(g+" | "+h+" | "+i);
    }
    int board(int t)
    {
        System.out.print("Enter a number : ");
        int inp=sca.nextInt();
        String q;
        if(t%2==1)
            q="X";
        else
            q="O";
        if(inp==1 && a==" ")
            a=q;
        else if(inp==2 && b==" ")
            b=q;
        else if(inp==3 && c==" ")
            c=q;
        else if(inp==4 && d==" ")
            d=q;
        else if(inp==5 && e==" ")
            e=q;
        else if(inp==6 && f==" ")
            f=q;
        else if(inp==7 && g==" ")
            g=q;
        else if(inp==8 && h==" ")
            h=q;
        else if(inp==9 && i==" ")
            i=q;
        else 
        {
            System.out.println("Invalid Input");
            t-=1;
        }
        return t;
    }
}