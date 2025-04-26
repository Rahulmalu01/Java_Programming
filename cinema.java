import java.util.*;
public class cinema
{
  static char[] b1 = new char[100];
  static char[] b2 = new char[100];
  static char[] b3 = new char[100];
  static char[] b4 = new char[100];
  static char[] b5 = new char[100];
  static char[] b6 = new char[100];
  public static void main(String args[])
  {
    Scanner in=extracted();
    cinema ci = new cinema();
    ci.value();
    int amu=0;
    for (int m=1;m<=10;m++)
    {
      System.out.print("Enter your name : ");
      String name=in.nextLine();
      System.out.print("Enter phone number : ");
      long o=(in.nextLong())/100;
      if(o>=10000000&&o<=99999999.99)
      {
        System.out.println(" WELCOME TO");
        System.out.println("VENUS CINEMA BOOKING CENTER");
        System.out.println("Movie language are");
        System.out.println("English 1");
        System.out.println("Kannada 2");
        System.out.println("Hindi 3");        
        int t=in.nextInt();
        if(t==1)
        {
          System.out.println("name of film  | time |number|screen no");
          System.out.println("frozen 2      |1:10  |1     |1");
          System.out.println("joker         |1:00  |2     |2");
          int v=in.nextInt();
          if(v==1)
          {
            ci.printseat(t,v);
            System.out.println("enter number of  seat");
            int c=in.nextInt();
            if(c==1)
            { 
              System.out.println("number of seat");
              int f=in.nextInt();
              b6[f-1]='b';
              amu=250;
              System.out.println("the amount is = 250");
              ci.print();
            }
            else if(c>=2&&c<=49)
            {
              System.out.println("from ");
              int d= in.nextInt();
              System.out.println("seat number are");             
              for(int l=1;l<=c;l++)
              {
                System.out.print(d+" ");
                b6[l-1]='b';
                d=d+1;
              }                                                     
              System.out.println();
              amu=250*c;
              System.out.println("the amount is = "+amu);
              ci.print();
            }
            else 
              System.out.println("invalid input");
          }
          else if(v==2)
          {
            ci.printseat(t,v);
            System.out.println("enter number of  seat");
            int c=in.nextInt();         
            if(c==1)
            { 
              System.out.println("Seat number");
              int f=in.nextInt();
              b1[f-1]='b';
              amu=250;
              System.out.println("the amount is = 250");
              ci.print();
            }
            else if(c>=2&&c<=49)
            {
              System.out.println("from ");
              int d= in.nextInt();
              System.out.println("seat number are");
              for(int l=1;l<=c;l++)
              {
                System.out.print(d+" ");
                b1[l-1]='b';
                d=d+1;
              }
              System.out.println();
              amu=250*c;
              System.out.println("the amount is = "+amu);
              ci.print();
            }
            else 
              System.out.println("invalid input");  
          }
          else
            System.out.println("invalid input");
        }
        else  if(t==2)
        {
          System.out.println("name of film | time |number|screen no");
          System.out.println("pailwan      |1:10  |1     |3");
          System.out.println("kurkshetra  |1:10  |2     |4");
          int v=in.nextInt();
          if(v==1)
          {
            ci.printseat(t,v);
            System.out.println("enter number of  seat");
            int c=in.nextInt();
            if(c==1)
            { 
              System.out.println("Seat number");
              int f=in.nextInt();
              b2[f-1]='b';
              amu=250;
              System.out.println("the amount is = 250");
              ci.print();
            }
            else if(c>=2&&c<=49)
            {
              System.out.println("from ");
              int d= in.nextInt();
              System.out.println("seat number are");
              for(int l=1;l<=c;l++)
              {
                System.out.print(d+" ");
                b2[l-1]='b';
                d=d+1;
              }                                                     
              System.out.println();
              amu=250*c;
              System.out.println("the amount is = "+amu);
              ci.print();
            }
            else 
              System.out.println("invalid input");
          }
          else if(v==2)
          {
            ci.printseat(t,v);
            System.out.println("enter number of  seat");
            int c=in.nextInt();
            if(c==1)
            { 
              System.out.println("Seat number");
              int f=in.nextInt();
              b3[f-1]='b';
              amu=250;
              System.out.println("the amount is = 250");
              ci.print();
            }
            else if(c>=2&&c<=49)
            {
              System.out.println("from ");
              int d= in.nextInt();
              System.out.println("seat number are");
              for(int l=1;l<=c;l++)
              {
                System.out.print(d+" ");
                b3[l-1]='b';
                d=d+1;
              }
              System.out.println();
              amu=250*c;
              System.out.println("the amount is = "+amu);
              ci.print();
            }
            else 
              System.out.println("invalid input");  
          }
          else
            System.out.println("invalid input");
        }
        else if(t==3)
        {
          System.out.println("name of film | time |number|screen no");
          System.out.println("Bala         |1:10  |1     |5");
          System.out.println("War          |1:00  |2     |6");
          int v=in.nextInt();
          if(v==1)
          {
            ci.printseat(t,v);
            System.out.println("enter number of  seat");
            int c=in.nextInt();
            if(c==1)
            { 
              System.out.println("Seat number");
              int f=in.nextInt();
              b4[f-1]='b';
              amu=250;
              System.out.println("the amount is = 250");
              ci.print();
            }
            else if(c>=2&&c<=49)
            {
              System.out.println("from ");
              int d= in.nextInt();
              System.out.println("seat number are");
              for(int l=1;l<=c;l++)
              {
                System.out.print(d+" ");
                b4[l-1]='b';
                d=d+1;
              }
              System.out.println();
              amu=250*c;
              System.out.println("the amount is = "+amu);
              ci.print();
            }
            else 
              System.out.println("invalid input");
          }
          else if(v==2)
          {
            ci.printseat(t,v);
            System.out.println("enter number of  seat");
            int c=in.nextInt();
            if(c==1)
            { 
              System.out.println("Seat number");
              int f=in.nextInt();
              b5[f-1]='b';
              amu=250;
              System.out.println("the amount is = 250");
              ci.print();
            }
            else if(c>=2&&c<=49)
            {
              System.out.println("from ");
              int d= in.nextInt();
              System.out.println("seat number are");
              for(int l=1;l<=c;l++)
              {
                System.out.print(d+" ");
                b5[l-1]='b';
                d=d+1;
              }
              System.out.println();
              amu=250*c;
              System.out.println("the amount is = "+amu);
              ci.print();
            }
            else 
              System.out.println("invalid input");  
          }
          else
            System.out.println("invalid input");
        }
        else
          System.out.println("invalid input");
      }
      else
        System.out.println("invalid input");
      System.out.println("Name       : "+name);
      System.out.println("Phone No   : "+o);
      System.out.println("Price      : "+amu);
    }        
  }
  private static Scanner extracted() {
    return new Scanner(System.in);
  }
  void print()
  {
    Scanner in = extracted();
    System.out.println("internet banking 1");
    System.out.println("reserve the seates 2 ");
    int i=in.nextInt();
    if(i==1)
    {
      System.out.println("Phone pay");
      System.out.println("Paytm");
      System.out.println("Google pay");
      System.out.println("Pay pal");
      System.out.println("****");
      System.out.println("");
      System.out.println("the money has been transfered");
      System.out.println("your tickets have been booked");
      System.out.println("THANKYOU FOR BOOKING");
      System.out.println("HAVE A GREAT DAY");
    }
    else if(i==2)
    {
      System.out.println("your tickets are reserved");
      System.out.println("Please come 25min before the film starts ");
      System.out.println("HAVE A GREAT DAY");
    }
    else
      System.out.println("invalid input");
  }
  void printseat(int t,int v)
  {
    char[] b = new char[100];
    if(t==1)
    {
      if(v==1)
        b=b6;
      else
        b=b1;
    }
    else if(t==2)
    {
      if(v==1)
        b=b2;
      else
        b=b3;
    }
    else if(t==3)
    {
      if(v==1)
        b=b4;
      else
        b=b5;
    }
    System.out.println("Seats are as follows");
    for(int r=1;r<=50;r++)
    {
      if(b[r-1]!='b')
      {
        System.out.print(r+" ");                       
      }
      if(r%10==0)
        System.out.println();
    }
  }
  void value()
  {
    for (int i = 0; i < 100; i++) 
    {
      b1[i]='u';
      b2[i]='u';
      b3[i]='u';
      b4[i]='u';
      b5[i]='u';
      b6[i]='u';  
    }
  }
}