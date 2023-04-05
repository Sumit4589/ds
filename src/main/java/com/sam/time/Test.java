package com.sam.time;

public class Test {
    public static void main(String[] args) {
        int[] doors = new int[100];
        int[] monkies = new int[100];

        for (int i = 1; i < monkies.length; i++) {
            int monkey = i + 1;
            int doorAccessedByMonkey = i - 1;
            while (doorAccessedByMonkey < doors.length) {
                if (doors[doorAccessedByMonkey] == 0) {
                    doors[doorAccessedByMonkey] = 1;
                } else {
                    doors[doorAccessedByMonkey] = 0;
                }
                doorAccessedByMonkey = doorAccessedByMonkey + monkey;
            }
        }

        int open = 0 , closed = 0;
        for(int door : doors){
            if(door == 0 )
                open++;
               else
                   closed++;
        }
        System.out.println(open);
        System.out.println(closed);
    }
}
