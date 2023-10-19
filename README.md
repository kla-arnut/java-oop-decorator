# java-oop-decorator

- เพิ่มระบบ OT, ค่าเสี่ยงภัย, ค่ากะ
- ต้องส่วนเงินที่เพิ่มใน super class(Employee)
- ต้อง implement method salary เพราะต้องคิดเงินเดือนเพิ่ม
- วิธีนี้ ถ้าเพิ่มส่วนเงินที่จะต้องเพิ่มเข้าไปในเงินเดือนอีก ก็จะต้อง implement class Employee และ Class Engineer,Programmer,Accouning ทุกๆ ครั้ง
- ซึ่งผิดหลัก SOLID (O) open/close (การออกแบบซอฟต์แวร์ จะต้องเพิ่มความสามารถใหม่ๆให้ซอฟต์แวร์เราได้ โดยที่ห้ามไปยุ่งกับโค้ดเดิม)
    - อธิบาย open/close https://anurocha.com/2017/08/13/solid-ocp/
    - สรุป ไม่แก้ class เดิม , ทำให้เป็น abstract,interface ไปซะ 