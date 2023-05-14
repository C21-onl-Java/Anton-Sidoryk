package teachmeskills.homework7.task3;

import java.util.Date;

public class ContractForItems extends Document {
    private String itemsType;
    private int quantity;

    public ContractForItems(int number, Date date, String goodsType, int quantity) {
        super(number, date);
        this.itemsType = goodsType;
        this.quantity = quantity;
    }

    public String getItemsType() {
        return itemsType;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "GoodsContract [number=" + getNumber() + ", date=" + getDate() + ", type=" + getItemsType() + ", quantity=" + getQuantity() + "]";
    }
}
