using System;
using System.Collections.Generic;
using System.Text;

namespace 委托示例
{
    delegate double DoubleOp(double x); //声明委托
    class MathOperations
    {
        public static double MultiplyByTwo(double value)
        {
            return value * 2;
        }
        public static double Square(double value)
        {
            return value * value;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            DoubleOp[] operations ={
                                                                                    MathOperations.MultiplyByTwo,
                                                                                    MathOperations.Square
                                   };//委托实例设置 
            for (int i = 0; i < operations.Length; i++)
            {
                Console.WriteLine("Using operations[{0}]:",i);
                ProcessAddDisplayNumber(operations[i], 3.5);
                
                //Console.WriteLine();
               
            }
            Console.ReadKey();
        }
        static void ProcessAddDisplayNumber(DoubleOp action, double value)
        {
            double result = action(value);
            Console.WriteLine("Value is {0},result of operation is {1}",value,result);
        }
    }
}
