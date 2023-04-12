package it.develhope.primi_passi_first.API_05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {
    private String id; //(mandatory)
    private String modelName; //(mandatory)
    private double price;
}
