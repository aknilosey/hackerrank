using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution
{

    static void Main(String[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine());
        int i = 0;
        string[] arr_temp = Console.ReadLine().Split(' ');
        int[] arr = Array.ConvertAll(arr_temp, Int32.Parse);
        int[] arrrev = new int[n];
        int j = 0;
        for (i = n - 1; i >= 0; i--)
        {
            arrrev[j] = arr[i];
            Console.Write(arrrev[j].ToString() + " ");
            j++;

        }


    }
}
