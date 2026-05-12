Phần 1: Phân tích
So sánh:

Native Query: Viết bằng SQL thuần, phụ thuộc vào tên cột/bảng trong DB. Đổi tên cột là code "chết".

HQL (Hibernate Query Language): Viết dựa trên tên Class và tên thuộc tính Java. Nếu bạn đổi tên cột trong DB nhưng vẫn giữ nguyên tên biến trong Java (thông qua @Column), code HQL vẫn chạy bình thường. Nó giúp mã nguồn độc lập với Database.
