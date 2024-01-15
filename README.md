# Mini-Store-Manager
Ứng dụng quản lí cửa hàng tiện lợi Mini Store!
<br>Công nghệ sử dụng: Java Swing, JDBC, POI Apache, iText API
<br>Công cụ sử dụng: IntelliJ, NetBeans, MSSQL, Draw.io (vẽ ERD)

## Hướng dẫn cài đặt
Bước 1: Khởi tạo tài khoản login trên SQL server (project dùng tài khoảng login mặc định là tk="sa" mk="12345")
<br>Nếu đã có tài khoản như trên rồi thì có thể bỏ qua bước này
<br>Hướng dẫn chi tiết tại https://www.youtube.com/watch?v=dJ6c3OgIVDM 
<br> hoặc từ silde 8 - 11 https://drive.google.com/file/d/1M1YI1cSB3jthtPXM8A6fBg27VVEOSok-/view

Bước 2: Truy cập resource/sql và mở file GenerateScripts(new).sql rồi chạy Script (sử dụng MSSQL Management Studio 18) 
<br> => database sẽ được khởi tạo

Bước 3: Khởi tạo dự án trong Project Structure (trong phần cài đặt của IntelliJ), trong đó ta chọn các bước thực hiện như sau:
- Modules -> Add -> Import Modules -> Chọn file Mini-Store-Manager.iml để khởi tạo cấu hình (Nếu đã có rồi thì không cần bước này)
- Cấu hình Compiler Output cho project (khởi tạo thư mục file out trong mục Project (nếu đã có rồi thì bỏ qua))
- Cấu hình các đường dẫn Libraries cần thiết như: iTextPDF, POI Apache, JDBC (tất cả file thư viện đều được chứa trong thư mục lib, bao gồm POI Apache, JDBC và itextpdf-5.5)
- Tiếp đó là cấu hình JDK cho dự án trong Project Structure
- Kiểm tra trong Project Structure > Module xem phần src có màu xanh hay chưa, nếu chưa click chuột phải và chọn <Source>

Bước 4: Sau khi hoàn thành xong các bước cấu hình. Khởi chạy file EntryMain (đường dẫn: src/_Entry/EntryMain) để khởi động chương trình

## Team Member
| TenSV                 | MaSV       |
|-----------------------|------------|
| Trần Nguyên Lộc       | 3120410297 |
| Võ Đăng Quang         | 3120410429 |
| Nguyễn Văn Tấn Quân   | 3120410437 |
| Triệu Khánh Quang     | 3120410428 |
| Trương Tấn Đạt        | 3120410124 |
 
  
