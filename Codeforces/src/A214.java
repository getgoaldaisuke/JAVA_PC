


import java.io.*;
import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.lang.Integer.*;




public class A214 {
	int INF = Integer.MAX_VALUE / 100;
	static Scanner sc = null;
	static BufferedReader br = null;
	static PrintStream out = null;
	static BufferedWriter bw = null;
	int N = 0;
	
	public void solve() throws Exception{

		int n = nextInt();
		for(int x = 1; x <= 4; x++){
			int[] ns = nextInts();
			int a, b, c, d;
			a = ns[0];
			b = ns[1];
			c = ns[2];
			d = ns[3];
			
			if(min(a, b) + min(c, d) <= n){
				int a1 = min(a, b);
				int a2 = n - a1;
				out.println(x + " " + a1 + " " + a2);
				return;
			}
			

		}
		
		
		System.out.println("-1");
	
		
	}
	

    public int[] readIntArray(int n) {
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            ret[i] = sc.nextInt();
        }
        return ret;
    }

	private int nextInt() throws IOException{
		String s = br.readLine();
		return parseInt(s);
	}
	
	private int[] nextInts() throws IOException{
		String s = br.readLine();
		String[] sp = s.split(" ");
		int[] r = new int[sp.length];
		for(int i = 0;i < sp.length; i++){
			r[i] = parseInt(sp[i]);
		}
		return r;
	}
    
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		File file = new File("input.txt");
		if(file.exists()){
			System.setIn(new BufferedInputStream(new FileInputStream("input.txt")));
		}
		out = System.out;
		bw = new BufferedWriter(new PrintWriter(out));
		//sc =  new Scanner(System.in);
		br = new BufferedReader(new InputStreamReader(System.in));
		A214 t = new A214();
		t.solve();
		bw.close();
	}

}
