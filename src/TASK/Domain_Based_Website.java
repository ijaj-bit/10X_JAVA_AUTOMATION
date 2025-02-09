package TASK;

import java.util.Scanner;

public class Domain_Based_Website {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE SITE URL:");
        String URL = sc.next();

        String domain="";
        int lastdotindex=URL.lastIndexOf(".");

        if(lastdotindex !=-1)
        {
            domain=URL.substring(lastdotindex);
        }

        if(domain.equals("example.com"))
        {
            System.out.println(domain+">THE WEBSITE TYPE IS COMMERCIAL WEBSITE");

        } else if (domain.equals("example.org"))
        {
            System.out.println(URL+">THE WEBSITE TYPE IS NON-PROFIT ORGANIZATION");
        } else if (domain.equals("example.edu"))
        {
            System.out.println(domain+">THE WEBSITE TYPE IS EDUCATIONAL INSTITUTION");
        }
    }
}
