using System;
using System.Collections.Generic;
using System.IO;
class Solution
{
    static void Main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        string data = Console.ReadLine();
        int N = Convert.ToInt32(data.Split(' ')[0]);
        int R = Convert.ToInt32(data.Split(' ')[1]);

        string temp = Console.ReadLine();
        int[] a = new int[N];
        int[] arr = new int[N];

        // element => Convert.ToInt32(element));
        string[] splittemp = temp.Split(' ');

        for (int i = 0; i < N; i++)
        {
            a[i] = Convert.ToInt32(splittemp[i]);
        }


        for (int i = 0; i < N; i++)
        {
            if (i + R >= N)
            {
                arr[i] = a[R + i - (N)];
            }
            else
            {
                arr[i] = a[i + R];
            }
            Console.Write(arr[i].ToString() + " ");
        }
    }
}