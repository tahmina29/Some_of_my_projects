﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using DataAccess;
using DataAccess.Entities;
using System.Data.SqlClient;

namespace Hospital_Management_System
{
    public partial class Form8 : Form
    {
        public Form8()
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

        private void button1_Click(object sender, EventArgs e)
        {
            this.Hide();
            Form3 f3 = new Form3();
            f3.Show();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            this.Hide();
            Form2 f2 = new Form2();
            f2.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            int insertId = Convert.ToInt32(textBox1.Text);
            string insertName = textBox2.Text;
            string insertUserName = textBox3.Text;
            string insertPass = textBox4.Text;
            string insertAddress = textBox5.Text;
            string insertSal = textBox6.Text;
            Manager mng = new Manager();

            mng.Id = Convert.ToInt32(textBox1.Text);
            mng.Name = textBox2.Text;
            mng.UserName = textBox3.Text;
            mng.Password = textBox4.Text;
            mng.Address = textBox5.Text;
            mng.Salary = textBox6.Text;

            Database db = new Database();
            bool rs = db.Managers.Insert(mng);
            if (rs)
            {
                dataGridView1.DataSource = db.Managers.GetAllManagers();
                MessageBox.Show("Manager Inserted");

            }
            else
            {
                MessageBox.Show("Failed to insert");
            }

        }

        private void textBox5_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox6_TextChanged(object sender, EventArgs e)
        {

        }

        private void Form8_Load(object sender, EventArgs e)
        {

        }
    }
}
