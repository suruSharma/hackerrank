package algos.implementation;

import java.util.Scanner;

public class ACMICPCTeam {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    String[] input = new String[n];
    for (int i = 0; i < n; i++) {
      input[i] = in.next();
    }

    int maxTopics = 0;
    int maxTeams = 0;
    for (int i = 0; i < n - 1; i++) {
      char[] first = input[i].toCharArray();
      for (int j = i + 1; j < n; j++) {
        char[] second = input[j].toCharArray();
        int topics = 0;
        for (int k = 0; k < m; k++) {
          if (first[k] == '1' || second[k] == '1') {
            topics++;
          }
        }
        if (topics > 0 && maxTopics < topics) {
          maxTopics = topics;
          maxTeams = 1;
        } else if (topics > 0 && maxTopics == topics) {
          maxTeams += 1;
        }
      }
    }
    
    System.out.println(maxTopics);
    System.out.println(maxTeams);
  }
}
