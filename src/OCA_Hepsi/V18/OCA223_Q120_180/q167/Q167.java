package OCA_Hepsi.V18.OCA223_Q120_180.q167;

public class Q167 {

	public static void main(String[] args) {
		int x=100;
		int a=x++;
		int b=++x;
		int c =x++;
		int d=(a<b) ? (a<c)? a:(b<c)? b: c: x;
		System.out.println(d);
	}

}
