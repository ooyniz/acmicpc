package bronze3;

import java.util.*;

public class No1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, w, h, one, two;
		x = sc.nextInt();
		y = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		sc.close();
		if (w - x < x) {
			one = w - x;
		} else {
			one = x;
		}
		if (h - y < y) {
			two = h - y;
		} else {
			two = y;
		}
		if (one > two) {
			System.out.println(two);
		} else {
			System.out.println(one);
		}
	}

}
