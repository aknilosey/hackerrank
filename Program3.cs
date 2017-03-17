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
        //LinkedList<int> dat=new LinkedList<int> ();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
        {
            arr[i] = Convert.ToInt32(temp.Split(' ')[i]);
            // Console.Write(arr[i]);
        }

        for (int i = 0; i < R; i++)
        {
            int first = arr[0];
            Array.Copy(arr, 1, arr, 0, N - 1);
            arr[N - 1] = first;
        }
        for (int i = 0; i <= N; i++)
        {
            Console.Write(arr[i].ToString() + " ");
        }

    }
}