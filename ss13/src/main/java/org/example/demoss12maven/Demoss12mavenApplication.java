package org.example.demoss12maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;

// Loại bỏ cấu hình JPA tự động để dùng HibernateConfig thủ công của bạn
@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
public class Demoss12mavenApplication {

    public static void main(String[] args) {
        // Chạy ứng dụng và lấy Context
        ApplicationContext context = SpringApplication.run(Demoss12mavenApplication.class, args);

        // Thông báo khi hệ thống sẵn sàng (Bài tập 1)
        System.out.println("Hospital Web Service is ready on Embedded Tomcat!");

        // Kiểm tra xem Hibernate SessionFactory đã được khởi tạo chưa
        boolean hasSessionFactory = context.containsBean("sessionFactory");
        System.out.println("Hibernate SessionFactory initialized: " + hasSessionFactory);
    }
}