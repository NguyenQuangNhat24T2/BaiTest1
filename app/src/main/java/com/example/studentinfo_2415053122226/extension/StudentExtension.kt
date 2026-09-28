package com.example.studentinfo_2415053122226.extension

import com.example.studentinfo_2415053122226.model.Student

fun Student.toDisplayInfo(): String {
    return """
Mã sinh viên: $mssv
Họ tên: $hoTen
Lớp: $lop
Tuổi: $tuoi
Điểm: $diem
Email: ${'$'}email
    """.trimIndent()
}