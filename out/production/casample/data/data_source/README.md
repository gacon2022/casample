# Package: data_source
## Chức năng
- Chứa các class liên quan tới cơ sở dữ liệu, thao tác với các server khác...
## Các package con
- adapter: Phần kết nối giữa repository (thao tác với database) và tầng use cases

- database: Chứa các class config dùng để kết nối tới cơ sở dữ liệu, và lớp DAO nơi chứa các phương thức thực sự giao tiếp với database (Các câu truy vấn...)

- entities: Đây là nơi chứa các lớp model thường các class này dùng để định nghĩa các trường, cột, bảng có trong database

- mappers: Chứa các lớp mapper để chuyển đổi dữ liệu từ dạng dữ liệu cơ bản của database sang dữ liệu được xử dụng trong Business logic
