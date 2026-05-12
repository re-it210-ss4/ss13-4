package org.example.demoss12maven.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "prescriptions")
@Getter @Setter @NoArgsConstructor
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String doctorName; // Tên bác sĩ kê đơn
    private java.util.Date createDate;

    // Bài 3: CascadeType.ALL giúp lưu/xóa chi tiết tự động khi tác động vào đơn thuốc
    @OneToMany(mappedBy = "prescription", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PrescriptionDetail> details = new ArrayList<>();
}