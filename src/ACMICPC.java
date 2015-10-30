import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ACMICPC {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int people = in.nextInt();
		int totalTopics = in.nextInt();
		String[] knowledge = new String[people];
		for (int i = 0; i < people; i++) {
			knowledge[i] = in.next();
		}

		long maxTopics = 0;
		int totalTeams = 0;

		for (int i = 0; i < people-1; i++) {
			char[] player1 = knowledge[i].toCharArray();
			for (int j = i + 1; j < people; j++) {
				char[] player2 = knowledge[j].toCharArray();
				int total = 0;
				for(int k = 0;k<totalTopics;k++)
				{
					if(player1[k] == '1' || player2[k] == '1')
					{
						total++;
						if(total > maxTopics)
						{
							maxTopics = total;
							totalTeams = 1;
						}
						else if(total == maxTopics)
						{
							totalTeams++;
						}
					}
				}
			}
		}

		System.out.println(maxTopics);
		System.out.println(totalTeams);

		// System.out.println(maxTopics);
	}
}