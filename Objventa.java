public class Objventa {
    private int NumeroFactura;
    private String NombreCliente;
    private String NombreVendedor;
    private double TotalVenta;
    private int CantidadProductos;
    private int Estado; // Estado de lavents: Registrada 1 | Cancelada 0

    public Objventa(){
        
    }


    public Objventa(int numeroFactura, String nombreCliente, String nombreVendedor, double totalVenta,
            int cantidadProductos, int estado) {
        NumeroFactura = numeroFactura;
        NombreCliente = nombreCliente;
        NombreVendedor = nombreVendedor;
        TotalVenta = totalVenta;
        CantidadProductos = cantidadProductos;
        Estado = estado;
    }
    public int getNumeroFactura() {
        return NumeroFactura;
    }
    public void setNumeroFactura(int numeroFactura) {
        NumeroFactura = numeroFactura;
    }
    public String getNombreCliente() {
        return NombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }
    public String getNombreVendedor() {
        return NombreVendedor;
    }
    public void setNombreVendedor(String nombreVendedor) {
        NombreVendedor = nombreVendedor;
    }
    public double getTotalVenta() {
        return TotalVenta;
    }
    public void setTotalVenta(double totalVenta) {
        TotalVenta = totalVenta;
    }
    public int getCantidadProductos() {
        return CantidadProductos;
    }
    public void setCantidadProductos(int cantidadProductos) {
        CantidadProductos = cantidadProductos;
    }
    public int getEstado() {
        return Estado;
    }
    public void setEstado(int estado) {
        Estado = estado;
    }

    




}
