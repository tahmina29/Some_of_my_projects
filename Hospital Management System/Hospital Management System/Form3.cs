using DataAccess;
using DataAccess.Entities;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;


namespace Hospital_Management_System
{
    public partial class Form3 : Form
    {
        public Form3()
        {
            InitializeComponent();
            Database db = new Database();
            try
            {
                dataGridView1.DataSource = db.Managers.GetAllManagers();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button4_Click(object sender, EventArgs e)
        {
            this.Hide();
            Form2 f2 = new Form2();
            f2.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            string updatedName = textBox2.Text;
            string updatedAddress = textBox3.Text;
            string updatedSalary = textBox4.Text;
            Manager mng = new Manager();

            mng.UserName = textBox1.Text;
            mng.Name = textBox2.Text;
            mng.Address = textBox3.Text;
            mng.Salary = textBox4.Text;

            Database db = new Database();
            bool rs = db.Managers.Update(mng);
            if (rs)
            {
                dataGridView1.DataSource = db.Managers.GetAllManagers();
                MessageBox.Show("Updated");

            }
            else
            {
                MessageBox.Show("Failed to update");
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string uname = textBox1.Text;
            Database db = new Database();
            Manager mng = db.Managers.Search(uname);
            if (mng == null)
            {
                MessageBox.Show("Employee not found");
                textBox2.Text = "";
                textBox3.Text = "";
                textBox4.Text = "";
            }
            else
            {
                textBox2.Text = mng.Name;
                textBox3.Text = mng.Address;
                textBox4.Text = mng.Salary;
            }


        }

        private void button2_Click(object sender, EventArgs e)
        {
            string username = textBox1.Text;
            Database db = new Database();
            bool rs = db.Managers.Delete(username);
            if (rs)
            {
                dataGridView1.DataSource = db.Managers.GetAllManagers();
                MessageBox.Show("Deleted");
            }
            else
            {
                MessageBox.Show("Failed to delete");
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void button5_Click(object sender, EventArgs e)
        {
           
        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox5_TextChanged(object sender, EventArgs e)
        {

        }

        private void dataGridView1_CellContentClick_1(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void button5_Click_1(object sender, EventArgs e)
        {
            this.Hide();
            Form8 f8 = new Form8();
            f8.Show();
        }
    }
}
