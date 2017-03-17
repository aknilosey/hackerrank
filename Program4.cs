using System;
using System.Collections.Generic;
using System.IO;
class Solution
{
    static void Main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        string str = Console.ReadLine();
        int N = Convert.ToInt32(str);
        string[] arr = new string[N];

        for (int i = 0; i < N; i++)
        {
            arr[i] = Console.ReadLine();
            // Console.WriteLine(arr[i]);

        }
        string str1 = Console.ReadLine();
        int Q = Convert.ToInt32(str1);
        //Console.WriteLine(Q);
        string[] arr_1 = new string[Q];

        for (int i = 0; i < Q; i++)
        {
            int count = 0;

            arr_1[i] = Console.ReadLine();
            //Console.WriteLine(arr_1[i]);
            for (int j = 0; j < N; j++)
            {
                //Console.WriteLine(arr[j]);
                if (arr_1[i].CompareTo(arr[j]) == 0)
                {
                    count++;
                }
            }
            Console.WriteLine(count);
        }


    }
}