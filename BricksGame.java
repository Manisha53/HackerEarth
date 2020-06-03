import java.util.*;

class TestClass {

    public static void main(String args[] ) throws Exception {

        int n, i, m=0, p=0, c;

        Scanner s = new Scanner(System.in);

        n = s.nextInt();

        c = n;

        for(i=1; i<=n; i++)

        {

            p = p + i;

            m = m + i * 2;

            c = c - i - i * 2;

            if(p+m < n && c < i )

            {

                System.out.println("Patlu");

                System.exit(0);

            }

        }

        System.out.println("Motu");

    }

}
