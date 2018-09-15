using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace 连接数据库二
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        

        private void button1_Click(object sender, EventArgs e)
        {
            string constr = "data source = 172.30.2.31; integrated security = true; initial catalog = itcast2018 ";

            SqlConnection conn = new SqlConnection(constr);

            conn.Open();

            textBox1.Text = "ok";
            textBox1.BackColor = Color.Green;

            conn.Close();

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
