using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.IO;

namespace 学生管理系统
{
    public partial class FrmMain : Form
    {

        private string fileName = string.Empty; //定义保存读取文件路径的变量

        private List<string> objListStudent = new List<string>(); //定义LIST存储读取到的学生信息

        private List<string> objListQuerry = new List<string>(); //定义List存储查询到的学生信息

        private int actionFlag = 0;//通过actionFlag来判断是添加还是修改,actionFlag=1(添加) actionFlag=2(修改)
       
        public FrmMain()
        {
            InitializeComponent();
            //禁用明细区域
            gboxStudentDetail.Enabled = false;
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void label9_Click(object sender, EventArgs e)
        {

        }

        private void textBox7_TextChanged(object sender, EventArgs e)
        {

        }
        //控件事件
        private void btnImport_Click(object sender, EventArgs e)//导入学生信息
        {
            //1.选择文件
            OpenFileDialog openfile = new OpenFileDialog();
            openfile.Filter = "CSV文件(*.csv)|*.csv|Txt文件(*.txt)|*.txt|所有文件(*.*)|*.*";
            if (openfile.ShowDialog() == DialogResult.OK)
            {
                fileName = openfile.FileName; //把选择的文件路径赋给全局变量fileName
            }
            //2.把文件的数据读取到List中
            try
            {
                //读取文件
                objListStudent = ReadFileToList(fileName);
            }
            catch (Exception ex)
            {

                MessageBox.Show("读取文件错误,错误信息如下:" + ex.Message, "系统消息", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            //3.把List中的数据展示到datagridview中
            LoadDataToDataGrid(objListStudent);

            //4.把dataGridView中第一条数据展示到下面的groupbox中
            string currentSNO = dgvStudent.Rows[0].Cells[0].Value.ToString();
            string [] currentDetail = GetStudentBySNO(currentSNO).Split(',');

            //把当前学生的数据展示到下面的groupbox中
            LoadDataToDetail(currentDetail[0],currentDetail[1],currentDetail[2],currentDetail[3],currentDetail[4],currentDetail[5],currentDetail[6],currentDetail[7]);

        }
        private void btnAdd_Click(object sender, EventArgs e)//增加学生信息
        {
            //添加过程 :点击添加按钮-->数据-->判断是否有效-->提交

            //控制启用和禁用按钮
            DisableButton();
            gboxStudentDetail.Enabled = true;
           
          
            txtSNO.Text = string.Empty;
            txtName.Text = string.Empty;
            rbMale.Checked = true;

            dtpBirthday.Text = DateTime.Now.ToString() ;
            txtMobile.Text = string.Empty;
            txtEmail.Text = string.Empty;
            txtHomeAddress.Text = string.Empty;
            pbCurrentPhoto.BackgroundImage = null;
            txtSNO.Focus(); //让学号的文本框获得焦点
            actionFlag = 1;

        }

        private void btnUpdate_Click(object sender, EventArgs e) //修改学生信息
        {
            //修改就是删除之后再添加

            //控制按钮
            DisableButton();

            //学号不允许修改
            txtSNO.Enabled = false;

            //让学生姓名文本框获得焦点
            txtName.Focus();

            //修改actionFlag标志为2
            actionFlag = 2;
        }

        private void btnDelete_Click(object sender, EventArgs e) //删除学生信息
        {

        }
        private void btnCommit_Click(object sender, EventArgs e) //提交操作
        {
            if (!ValiDate())
            {
                return;
            }
            else
            {
                //组合数据,准备添加到List中
                string sno = txtSNO.Text.Trim();
                string sname = txtName.Text.Trim();
                string sex = rbMale.Checked == true ? "男" : "女";
                string birthday = dtpBirthday.Text;
                string mobile = txtMobile.Text;
                string homeAddress = txtHomeAddress.Text;
                string photo = null;

                string currentStudent = sno + ',' + sname + ',' + sex + ',' + birthday + ',' + mobile + ',' + homeAddress + ','+photo;
                switch (actionFlag)
                {
                    case 1:  //添加功能
                        //把数据添加到list
                        objListStudent.Add(currentStudent);
                        //把添加后的list显示
                        dgvStudent.Rows.Clear();
                        LoadDataToDataGrid(objListStudent);
                        //提示添加成功
                        MessageBox.Show("学生信息添加成功", "系统信息", MessageBoxButtons.OK, MessageBoxIcon.Information);
                       EnableButton();
                        break;
                    case 2:  //修改功能
                        //删除原有的
                        for (int i = 0; i < objListStudent.Count; i++)
                        {
                            if (objListStudent[i].StartsWith(sno))
                            {
                                objListStudent.RemoveAt(i);
                                objListStudent.Insert(i, currentStudent);
                                break;
                            }
                        }
                        //提示修改成功
                        MessageBox.Show("学生信息修改成功!", "系统信息", MessageBoxButtons.OK, MessageBoxIcon.Information);
                     
                        break;
                    default:
                        break;
                }

            }
            
        }

        private void btnCancel_Click(object sender, EventArgs e) //取消
        {

        }

        //用户自定义方法
        private List<string> ReadFileToList(string filePath) //把一个文件读取,并以List方式返回给调用者
        { 
        
            List<string> objList = new List<string>();
            string line = "";
            try
            {
                StreamReader file = new StreamReader(filePath,Encoding.Default);
                while ((line=file.ReadLine())!=null)
                {
                    //如果行数据不为空,依次添加
                    objList.Add(line);
                }
                file.Close();
            }
            catch (Exception ex)
            {
                
                throw ex;
            }
            return objList;

        }

        private void LoadDataToDataGrid(List<string> objList)//把List数据展示到DataGridView中
        {
            //依次读取List中的数据
            foreach (string item in objList)
            {
                string[] studentArray = item.Split(',');
                //把读取到的当前学生信息插入到datagridview中
                DataGridViewRow row = new DataGridViewRow();
                row.CreateCells(dgvStudent);
                row.Cells[0].Value = studentArray[0];
                row.Cells[1].Value = studentArray[1];
                row.Cells[2].Value = studentArray[2];
                row.Cells[3].Value = studentArray[3];
                row.Cells[4].Value = studentArray[4];
                dgvStudent.Rows.Add(row);
            }
        }

        
        private void LoadDataToDetail(string sno,string sname,string sex,string birthday,string mobile,string email,string homeAddress,string photo)//把一个学生的数据展示到下面的groupbox中
        {
            txtSNO.Text = sno;
            txtName.Text = sname;
            if (sex == "男")
            {
                rbMale.Checked = true;
            }
            else if(sex=="女")
            { 
                rbFemale.Checked = true;
            }
            dtpBirthday.Text = birthday;
            txtMobile.Text = mobile;
            txtEmail.Text = email;
            txtHomeAddress.Text = homeAddress;
            if (photo == null) return;
           
        }
        private string GetStudentBySNO(string sno) //根据学生的学号,查询到学生信息
        {
            string currentStudent = "";
            foreach (string item in objListStudent)
            {
                if (item.StartsWith(sno))
                {
                    currentStudent = item;
                    break;
                }
            }
            return currentStudent;
        }

        private void dgvStudent_SelectionChanged(object sender, EventArgs e)
        {
            if (dgvStudent.CurrentRow.Selected==false)
            {
                return;
            }
            else
            {
                string currentSNO = dgvStudent.CurrentRow.Cells[0].Value.ToString();
                string[] currentDetail = GetStudentBySNO(currentSNO).Split(',');

                //把当前学生的数据展示到下面的groupbox中
                LoadDataToDetail(currentDetail[0], currentDetail[1], currentDetail[2], currentDetail[3], currentDetail[4], currentDetail[5], currentDetail[6], currentDetail[7]);
            }
        }

        private void txtQuerySNO_TextChanged(object sender, EventArgs e)  //根据学号查询
        {
            objListQuerry.Clear(); //清空
            foreach (string item in objListStudent)
            {
                if (item.StartsWith(txtQuerySNO.Text))
                {
                    objListQuerry.Add(item);
                }
            }
            //清空当前datagridview中的数据
            dgvStudent.Rows.Clear();
            //展示在datagridview中
            LoadDataToDataGrid(objListQuerry);

        }

        private void txtQueryName_TextChanged(object sender, EventArgs e) //根据姓名查询
        {
            objListQuerry.Clear(); //清空
            foreach (string item in objListStudent)
            {
                if (item.Contains(txtQueryName.Text))
                {
                    objListQuerry.Add(item);
                }
            }
            //清空当前datagridview中的数据
            dgvStudent.Rows.Clear();
            //展示在datagridview中
            LoadDataToDataGrid(objListQuerry);

        }

        private void txtQueryMobile_TextChanged(object sender, EventArgs e) //根据手机号码查询
        {
            objListQuerry.Clear(); //清空
            foreach (string item in objListStudent)
            {
                if (item.Contains(txtQueryMobile.Text))
                {
                    objListQuerry.Add(item);
                }
            }
            //清空当前datagridview中的数据
            dgvStudent.Rows.Clear();
            //展示在datagridview中
            LoadDataToDataGrid(objListQuerry);

        }

        private void DisableButton()//禁用按钮 
        {
            //禁用的按钮
            btnAdd.Enabled = false;
            btnImport.Enabled = false;
            btnUpdate.Enabled = false;
            btnDelete.Enabled = false;
            gboxStudentDetail.Enabled = true;
            
        }
        private void EnableButton()//启用按钮 
        {
            //启用按钮
            btnAdd.Enabled = true;
            btnImport.Enabled = true;
            btnUpdate.Enabled = true;
            btnDelete.Enabled = true;
            gboxStudentDetail.Enabled = false;


        }

        private bool ValiDate()//用户添加和修改的数据的校验 
        {
            bool b = true;
            //学号和姓名不能为空,且学号不能重复
            if (string.IsNullOrEmpty(txtSNO.Text))
            {
                MessageBox.Show("学号不能为空", "系统信息", MessageBoxButtons.OK, MessageBoxIcon.Information);
                txtSNO.Focus();
                b = false;

            }
            if (string.IsNullOrEmpty(txtName.Text))
            {
                MessageBox.Show("姓名不能为空", "系统信息", MessageBoxButtons.OK, MessageBoxIcon.Information);
                txtName.Focus();
                b = false;
            }
            if (actionFlag == 1)
            {
                if (GetStudentBySNO(txtSNO.Text.Trim()) != string.Empty)
                {
                    MessageBox.Show("该学号重复", "系统信息", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    txtName.Focus();
                    b = false;
                }

            }
            return b;
        }

       


    }
}
