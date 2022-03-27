import java.util.*;
class letters
{
    public static void main()
    {
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        char ch;
        System.out.println("Enter the string");
        String st=s.nextLine();
        System.out.println("Enter your desired character");
        char c=s1.next().charAt(0); 
        st=st.toUpperCase();
        int j,l=st.length();
        System.out.println("\f");
        for (int i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if (ch==' ')
            for (j=1;j<=2;j++)
            System.out.println();
            if (ch=='A')
            {
                for (j=1;j<=4;j++)
                System.out.print(c);
                System.out.println();
                System.out.println(c+"  "+c);
                for (j=1;j<=4;j++)
                System.out.print(c);
                System.out.println();
                System.out.println(c+"  "+c);
                System.out.println(c+"  "+c);
                System.out.println();
            }
            if (ch=='B')
            {
                System.out.println(""+c+c+c+" ");
                System.out.println(c+"  "+c);
                for (j=1;j<=4;j++)
                System.out.print(c);
                System.out.println();
                System.out.println(c+"  "+c);
                System.out.println(""+c+c+c+" ");
                System.out.println();
            }
            if (ch=='C')
            {
                for (j=1;j<=4;j++)
                System.out.print(c);
                System.out.println();
                for (j=1;j<=3;j++)
                System.out.println(c);
                for (j=1;j<=4;j++)
                System.out.print(c);
                System.out.println();
                System.out.println();
            }
            if (ch=='D')
            {
                for (j=1;j<=3;j++)
                System.out.print(c);
                System.out.println();
                for (j=1;j<=3;j++)
                System.out.println(c+"  "+c);
                for (j=1;j<=3;j++)
                System.out.print(c);
                System.out.println();
                System.out.println();
            }
            if (ch=='E')
            {
                for (j=1;j<=4;j++)
                System.out.print(c);
                System.out.println();
                System.out.println(c);
                for (j=1;j<=4;j++)
                System.out.print(c);
                System.out.println();
                System.out.println(c);
                for (j=1;j<=4;j++)
                System.out.print(c);
                System.out.println();
                System.out.println();
            }
            if (ch=='F')
            {
                for (j=1;j<=4;j++)
                System.out.print(c);
                System.out.println();
                System.out.println(c);
                for (j=1;j<=3;j++)
                System.out.print(c);
                System.out.println();
                System.out.println(c);
                System.out.println(c);
                System.out.println();
            }
            if (ch=='G')
            {
                for (j=1;j<=4;j++)
                System.out.print(c);
                System.out.println();
                System.out.println(c);
                System.out.println(c+" "+c+c);
                for (j=1;j<=4;j++)
                System.out.print(c);
                System.out.println();
                System.out.println();
            }
            if (ch=='H')
            {
                System.out.println(c+"  "+c);
                System.out.println(c+"  "+c);
                for (j=1;j<=4;j++)
                System.out.print(c);
                System.out.println();
                System.out.println(c+"  "+c);
                System.out.println(c+"  "+c);
                System.out.println(); 
            }
            if (ch=='I')
            {
                for (j=1;j<=5;j++)
                System.out.print(c);
                System.out.println();
                for (j=1;j<=3;j++)
                System.out.println("  "+c);
                for (j=1;j<=5;j++)
                System.out.print(c);
                System.out.println();
                System.out.println(); 
            }
            if (ch=='J')
            {
                for (j=1;j<=5;j++)
                System.out.print(c);
                System.out.println();
                for (j=1;j<=2;j++)
                System.out.println("  "+c);
                System.out.println(c+" "+c);
                for (j=1;j<=3;j++)
                System.out.print(c);
                System.out.println(); 
                System.out.println(); 
            }
            if (ch=='K')
            {
                System.out.println(c+"  "+c);
                System.out.println(c+" "+c);
                System.out.println(c+""+c);
                System.out.println(c+" "+c);
                System.out.println(c+"  "+c);
                System.out.println(); 
            }
            if (ch=='L')
            {
                for (j=1;j<=4;j++)
                System.out.println(c);
                for (j=1;j<=4;j++)
                System.out.print(c);
                System.out.println();
                System.out.println();
            }
            if (ch=='M')
            {
                System.out.println(c+"   "+c);
                System.out.println(""+c+c+" "+c+c);
                System.out.println(c+" "+c+" "+c);
                System.out.println(c+"   "+c);
                System.out.println(c+"   "+c);
                System.out.println();
            }
            if (ch=='N')
            {
                System.out.println(c+"   "+c);
                System.out.println(""+c+c+"  "+c);
                System.out.println(c+" "+c+" "+c);
                System.out.println(c+"  "+c+c);
                System.out.println(c+"   "+c);
                System.out.println();
            }
            if (ch=='O')
            {
                System.out.println(" "+c+c+" ");
                for (j=1;j<=3;j++)
                System.out.println(c+"  "+c);   
                System.out.println(" "+c+c+" ");
                System.out.println();
            }
            if (ch=='P')
            {
                System.out.println(c+""+c+c);
                System.out.println(c+"  "+c);
                System.out.println(c+""+c+c);
                for (j=1;j<=2;j++)
                System.out.println(c);
                System.out.println();
            }
            if (ch=='Q')
            {
                System.out.println("  "+c);
                for (j=1;j<=2;j++)
                System.out.println(c+"   "+c);
                System.out.println(c+" "+c+" "+c);
                System.out.println("  "+c+" "+c);
                System.out.println("      "+c);
                System.out.println();
            }
            if (ch=='R')
            {
                for (j=1;j<=3;j++)
                System.out.print(c);
                System.out.println();
                System.out.println(c+"  "+c);
                for (j=1;j<=3;j++)
                System.out.print(c);
                System.out.println();
                System.out.println(c+" "+c);
                System.out.println(c+"  "+c);
                System.out.println();
            }
            if (ch=='S')
            {
                for (j=1;j<=4;j++)
                System.out.print(c);
                System.out.println();
                System.out.println(c);
                for (j=1;j<=4;j++)
                System.out.print(c);
                System.out.println();
                System.out.println("   "+c);
                for (j=1;j<=4;j++)
                System.out.print(c);
                System.out.println();
                System.out.println();
            }
            if (ch=='T')
            {
                for (j=1;j<=5;j++)
                System.out.print(c);
                System.out.println();
                for (j=1;j<=4;j++)
                System.out.println("  "+c);
                System.out.println();
            }
            if (ch=='U')
            {
                for (j=1;j<=4;j++)
                System.out.println(c+"  "+c);
                for (j=1;j<=4;j++)
                System.out.print(c);
                System.out.println();
                System.out.println();
            }
            if (ch=='V')
            {
                for (j=1;j<=2;j++)
                System.out.println(c+"     "+c);
                System.out.println(" "+c+"   "+c);
                System.out.println("  "+c+" "+c);
                System.out.println("   "+c);
                System.out.println();
            }
            if (ch=='W')
            {
                for (j=1;j<=4;j++)
                System.out.println(c+"   "+c+"   "+c);
                System.out.println("  "+c+"   "+c);
                System.out.println();
            }
            if (ch=='X')
            {
                System.out.println(c+"   "+c);
                System.out.println(" "+c+" "+c);
                System.out.println("  "+c);
                System.out.println(" "+c+" "+c);
                System.out.println(c+"   "+c);
                System.out.println();
            }
            if (ch=='Y')
            {
                System.out.println(c+"   "+c);
                System.out.println(" "+c+" "+c);
                for (j=1;j<=3;j++)
                System.out.println("  "+c);
                System.out.println();
            }
            if (ch=='Z')
            {
                for (j=1;j<=5;j++)
                System.out.print(c);
                System.out.println();
                System.out.println("   "+c);
                System.out.println("  "+c);
                System.out.println(" "+c);
                for (j=1;j<=5;j++)
                System.out.print(c);
                System.out.println();
                System.out.println();
            }
        }
    }
}