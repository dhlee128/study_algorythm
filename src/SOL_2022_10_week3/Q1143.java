package SOL_2022_10_week3;

public class Q1143 {
    public static int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();

        int[][] dp = new int[len1+1][len2+1];

        for(int i=0; i<=len1; i++) {
            for(int j=0; j<=len2; j++) {
                if(i==0 || j==0) {
                    dp[i][j]=0;
                } else if(text1.charAt(i-1)==text2.charAt(j-1)) {
                    dp[i][j]=dp[i-1][j-1]+1;
                } else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[len1][len2];
    }

    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";

        System.out.println(longestCommonSubsequence(text1,text2));
    }

}
