# java-oop-decorator

- ทำให้ลบ code ส่วน + ot, shift, risk ใน superclass Employee ได้
- เพิ่ม abstract class SalaryAddon extend จาก Employee
- สร้าง decorator class (Addovertime, Addrisk, AddShift) 
  - โดย inject obj Employee เข้าไป 
  - และ implement ส่วนเงินเพิ่มในนี้