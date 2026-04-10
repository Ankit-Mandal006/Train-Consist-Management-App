public class GoodsBogie {
    private String shape;
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String newCargo) {
        // Business Rule: Rectangular bogies cannot carry Petroleum
        if (this.shape.equalsIgnoreCase("Rectangular") && newCargo.equalsIgnoreCase("Petroleum")) {
            throw new CargoSafetyException("Safety Violation: Rectangular bogies cannot carry Petroleum!");
        }
        this.cargo = newCargo;
        System.out.println("Assignment Successful: " + newCargo + " loaded into " + shape + " bogie.");
    }

    public String getShape() { return shape; }
}