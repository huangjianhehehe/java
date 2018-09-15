using System;
using System.Collections.Generic;
using System.Text;
using System.Data.SqlClient;
using System.Xml;

namespace 控制台项目
{
    class ExecuteXmlReaderExample
    {
        static void Main(string[] args)
        {
            string constr = "data source = 172.30.2.31; initial catalog = itcast2018; integrated security = SSPI";

            SqlConnection conn = new SqlConnection(constr);
            conn.Open();
            string select = "select name,age from staff FOR XML AUTO";
            SqlCommand cmd = new SqlCommand(select, conn);
            XmlReader xl = cmd.ExecuteXmlReader();
            xl.Read();
            string data;
            do
            {
                data = xl.ReadOuterXml();
                if (!string.IsNullOrEmpty(data))
                {
                    Console.WriteLine(data);
                }
            } while (!string.IsNullOrEmpty(data));
            conn.Close();
            Console.ReadLine();
        }
    }
}
