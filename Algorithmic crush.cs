using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution
{
    static void Main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        string temp = Console.ReadLine();
        long N = Convert.ToInt32(temp.Split(' ')[0]);
        long M = Convert.ToInt32(temp.Split(' ')[1]);
        long[] arr = new long[N + 1];
        long sum = 0;
        long max = 0;

        for (long i = 0; i < M; i++)
        {
            string[] value = Console.ReadLine().Split(' ');
            long a = Convert.ToInt64(value[0]);
            long b = Convert.ToInt64(value[1]);
            long k = Convert.ToInt64(value[2]);

            arr[a] += k;
            if ((b + 1) <= N)
            {
                arr[b + 1] -= k;
            }
        }

        for (long i = 1; i <= N; i++)
        {
            sum += arr[i];
            if (max < sum)
                max = sum;
        }

        Console.WriteLine(max);
    }
}