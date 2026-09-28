package com.example.studentinfo_2415053122226

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studentinfo_2415053122226.databinding.ActivityMainBinding
import com.example.studentinfo_2415053122226.extension.toDisplayInfo
import com.example.studentinfo_2415053122226.model.Student

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val student = Student(
            mssv = "2415053122226",
            hoTen = "Nguyen Quang Nhat",
            lop = "CNTT",
            tuoi = 20,
            diem = 8.5,
            email = "nguyenquangnhat200806@gmail.com"
        )

        binding.tvInfo.text = student.toDisplayInfo()
    }
}