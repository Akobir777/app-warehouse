package cambridge.uz.omborxona.payload;

import cambridge.uz.omborxona.entity.Input;
import cambridge.uz.omborxona.entity.Product;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Date;

public class InputProductDto {
    private Integer id;
    private Integer productId;
    private double amount;
    private double price;
    private Date expireDate;
    private Integer inputId;
}
