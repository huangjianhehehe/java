using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace 连接数据库SQL
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string constr = "data source = 172.30.2.31; initial catalog = itcast2018; integrated security = true";

            using (SqlConnection conn = new SqlConnection(constr))
            {
                string select = "update staff set name= 'tim' where name= '黄健'";
                conn.Open();
                this.textBox1.BackColor = Color.Green;
                this.textBox1.Text = "OK";
                SqlCommand cmd = new SqlCommand(select, conn);
                int rowsreturn = cmd.ExecuteNonQuery();

                this.textBox2.Text = rowsreturn.ToString();
            }
                                                    


        }

        private void button2_Click(object sender, EventArgs e)
        {
            string constr = "server = 172.30.2.31;" + "database = itcast2018;" + "integrated security = SSPI ";
           
                using (SqlConnection conn = new SqlConnection(constr))
                {

                    conn.Open();
                    this.textBox1.BackColor = Color.Green;
                    this.textBox1.Text = "OK";

                }
            
           
        }

        private void button3_Click(object sender, EventArgs e)
        {
            string constr = "data source=172.30.2.31; initial catalog=itcast2018; integrated security=true";

            using (SqlConnection conn = new SqlConnection(constr))
            {

                string select = "select name,age from staff";
                conn.Open();
                this.textBox1.BackColor = Color.Green;
                this.textBox1.Text = "OK";
                SqlCommand cmd = new SqlCommand(select, conn);
                SqlDataReader rowsreader = cmd.ExecuteReader();
                while (rowsreader.Read()) {
                    this.textBox2.Text = "name:" + rowsreader[0]+"age:"+rowsreader[1];
                    
                }
                

            }
            
        }
    }
}
