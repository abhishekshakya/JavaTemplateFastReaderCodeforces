 import java.util.*;
 import java.lang.*;
 import java.io.*;

 public class Main
 {
     static long M = 998244353;
     static final PrintWriter out =new PrintWriter(System.out);
     static final FastReader fs = new FastReader();
     static boolean prime[];
    
     public static void main (String[] args) throws java.lang.Exception
     {
           int t = fs.nextInt();
           while(t-->0)solve();
           out.flush();
    }

    static void solve(){
        out.println("GG");
    }
  
  static long mod(long a)
  {
      return (a%M + M) % M;
  }
  static void sieveOfEratosthenes(int n)
    {
         prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
            prime[0]=false;
            if(1<=n)
            prime[1]=false;
        for (int p = 2; p * p <= n; p++)
        {
            
            if (prime[p] == true)
            {
               
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
    }
         static class FastReader 
         {
         BufferedReader br;
         StringTokenizer st;
  
         public FastReader()
         {
             br = new BufferedReader(
                 new InputStreamReader(System.in));
         }
  
         String next()
         {
             while (st == null || !st.hasMoreElements()) {
                 try {
                     st = new StringTokenizer(br.readLine());
                     }
                 catch (IOException e) {
                     e.printStackTrace();
                     }
         }
             return st.nextToken();
         }
  
         int nextInt() { return Integer.parseInt(next()); }
  
         long nextLong() { return Long.parseLong(next()); }
  
         double nextDouble()
         {
             return Double.parseDouble(next());
         }
  
         String nextLine()
         {
             String str = "";
             try {
                 str = br.readLine();
             }
             catch (IOException e) {
                 e.printStackTrace();
             }
             return str;
         }
 long [] arrayIn(int n) throws IOException
     {
         long  arr[] = new long[n];
         for(int i=0; i<n; i++)
         {
             arr[i] = nextLong();
         }
         return arr;
     }
     }
     
     public static class Pairs implements Comparable<Pairs>
     {
         int value,index;
         Pairs(int value, int index)
         {
             this.value = value;
             this.index = index;
         }
         public int compareTo(Pairs p)
         {
             return Integer.compare(this.value, p.value);
         }
     }
     static final Random random = new Random();
  
     static void ruffleSort(int arr[])
     {
         int n = arr.length;
         for(int i=0; i<n; i++)
         {
             int j = random.nextInt(n),temp = arr[j];
             arr[j] = arr[i];
             arr[i] = temp;
         }
         Arrays.sort(arr);
     }
     static long nCk(int n, int k) {
         return (modMult(fact(n),fastexp(modMult(fact(n-k),fact(k)),M-2)))%M;
     }
  
     static long fact (long n) {
         long fact =1;
         for(int i=1; i<=n; i++) {
             fact = modMult(fact,i)%M;
         }
         return fact%M;
     }
  
     static long modMult(long a,long b) {
         a=a%M; b=b%M;
         return ((a%M)*(b%M))%M;
     }
  
     static long fastexp(long x, long y){
         x=x&M;
         y=y%M;
         if(y==1) return x;
         long ans = fastexp(x,y/2);
         if(y%2 == 0) return modMult(ans,ans)%M;
         else return modMult(ans,modMult(ans,x))%M;
     }
 }