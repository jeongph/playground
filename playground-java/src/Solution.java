import java.util.ArrayList;

class Solution {
    public String solution(String compressed) {
        String answer = "";
        String com = compressed;

        ArrayList<String> al = new ArrayList<>();

        boolean isComEnd = false;
        while (!isComEnd) {
            String temp = "";
            int r = 0;
            int open = 0, end = 0;

            for (int i = 0; i < com.length(); i++) {
                char c = com.charAt(i);
                temp += c;

                if (c == '(') ++open;
                else if (c == ')') ++end;

                if (open == 1 && c == '(') {
                    for (int j = 0; j < temp.length(); j++) {
                        if (Character.isDigit(temp.charAt(j))) {
                            r = Integer.parseInt(temp.substring(j, temp.length() - 1));
                        }
                    }
                    temp = "(";
                    continue;
                }

                if (open != 0 && open == end) {
                    com = com.replace("" + r + temp, cv(r, temp.substring(1, temp.length() - 1)));
                    break;
                }
            }

            for (int i = 0; i < com.length(); i++) {
                if (Character.isDigit(com.charAt(i))) { // 숫자가있다?
                    isComEnd = false;
                    break;
                } else isComEnd = true;
            }
        }


        /*
        String com = compressed;
        boolean notYet = true;
//        while (notYet) {
        for (int te = 0; te < 2; te++) {
            boolean isRead = false;
            String number = "";
            String str = "";

            System.out.println("com: " + com);
            for (int i = 0; i < com.length(); i++) {
                char c = com.charAt(i);

                if (isRead) str += c;
                if (Character.isDigit(c)) {
                    number += c;
                } else {
                    if (c == ')') { // 기록
                        al.add(str.substring(1, str.length() - 1) + "/" + number);
                        com = com.substring(0, i - (str.length() - 1)) + com.substring(i + 1);
                        number = "";
                    } else if (c == '(') {
                        isRead = true;
                        str = "(";
                    }
                }

            }

            if (com.length() <= 0) notYet = false;
        }

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

         */

        return com;
    }

    public String cv(int r, String str) {
        String cvStr = "";

        for (int i = 0; i < r; i++) {
            cvStr += str;
        }

        return cvStr;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String temp =
//        s.solution("3(hi)");
                s.solution("2(2(hi)2(co))x2(bo)");

        System.out.println(temp);
    }
}