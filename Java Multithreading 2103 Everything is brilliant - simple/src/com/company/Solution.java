package com.company;

/*

2103 Everything is brilliant - simple
Simplify. Do not rename variables, leave comments.
Requirements:
1. The calculate method must be static.
2. The calculate method should return a boolean value.
3. The calculate method must accept four boolean parameters.
4. The calculate method should be as simple as possible (the behavior should remain the same).


 */

    public class Solution {
        public static boolean calculate(boolean a, boolean b, boolean c, boolean d) {
            return c;
        }

        public static void main(String[] args) {
            System.out.println(calculate (true,true,true, true));
            System.out.println(calculate (true,true,true, false));

            System.out.println(calculate (true,true,false, false));
            System.out.println(calculate (true,true,false, true));

            System.out.println(calculate (true,false,false, true));
            System.out.println(calculate (true,false,true, true));
            System.out.println(calculate (false,false,false, true));
            System.out.println(calculate (true,false,true, false));

            System.out.println(calculate (false,true,false, true));
            System.out.println(calculate (true,false,true, true));
        }
    }

