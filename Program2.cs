using System;
using System.Collections.Generic;
using System.IO;
class Solution
{
    static void Main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */

        string input = Console.ReadLine();
        //int input=Convert.ToInt32(input_temp);
        int N = Convert.ToInt32(input.Split(' ')[0]);
        int Q = Convert.ToInt32(input.Split(' ')[1]);
        List<Int32>[] SeqList = new List<Int32>[N];

        for (int i = 0; i < N; i++)
        {
            SeqList[i] = new List<Int32>();
        }

        int lastAns = 0;
        for (int i = 0; i < Q; i++)
        {
            string query = Console.ReadLine();
            int num = Convert.ToInt32(query.Split(' ')[0]);

            int x = Convert.ToInt32(query.Split(' ')[1]);
            int y = Convert.ToInt32(query.Split(' ')[2]);

            int index = (x ^ lastAns) % N;
            if (num == 1)
            {
                SeqList[index].Add(y);


            }
            else if (num == 2)
            {
                lastAns = SeqList[index][y % SeqList[index].Count];
                Console.WriteLine(lastAns);
            }
        }
    }
}


