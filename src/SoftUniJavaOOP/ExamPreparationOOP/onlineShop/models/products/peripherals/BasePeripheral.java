package SoftUniJavaOOP.ExamPreparationOOP.onlineShop.models.products.peripherals;

import SoftUniJavaOOP.ExamPreparationOOP.onlineShop.models.products.BaseProduct;

public abstract class BasePeripheral extends BaseProduct implements Peripheral {
    private String connectionType;

    public BasePeripheral(int id, String manufacturer, String model, double price, double overallPerformance, String connectionType) {
        super(id, manufacturer, model, price, overallPerformance);
        this.connectionType = connectionType;
    }

    @Override
    public String getConnectionType() {
        return this.connectionType;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Connection Type: %s", this.connectionType);
    }
}
