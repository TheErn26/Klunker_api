package co.ReaperDev.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceDTO {
    private int id;
    private int carId;
    private String servDetail;
    private Date date;
    private double cost;
    private int servMileage;
}