# Package: data_source
## Chức năng
- Chứa các class nằm ở tầng Business cao nhất của app, các class ở đây không được phép sử dụng bất kì framework nào, và nên là thành phần ít bị thay đổi nhất khi sửa chữa sau này
## Các package con
- mappers: Chứa interface quy định các hành động của các mapper dùng để chuyển đổi giữa entities và business model 

- model: Chứa các business model của phần mềm, được dùng ở mọi nơi trong phần mềm, khác biệt so với entities của database dùng để quy định các bảng, cột... trong cơ sở dữ liệu thì đây là class quy định Business logic của cả ứng dụng

- repository: Chứa các interface quy định các phương thức cần phải có của repository

- use_case: Chứa các use cases quy định phương thức thao tác với dữ liệu

- utils: Chứa các file tiện ích hỗ trợ ứng dụg thực hiện
