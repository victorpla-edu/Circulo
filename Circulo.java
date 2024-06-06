public class Circulo {
    /**
     * @param radio la variable radio de la figura
     */
    private double radio;

    /**
     * 
     * @param Circulo Pongo el constructor Circulo con la variable radio
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    /* Esta clase está descontinuada, se debe usar en su lugar calcularArea() */
    /**
     * @deprecated se debe usar la nueva variable calcularArea
     */
    public double calculoArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * @param calcularArea metodo que te calcula el area
     * @throws IllegalArgumentException Si el radio es negativo te suelta una
     *                                  exsepción
     * @return devuelve el resultado de la operacion de PI * radio al cuadrado
     */
    public double calcularArea() {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * @param calcularCircunferencia calcula la circuferencia
     * @return devuelve el resultado de la operación 2 * PI * radio
     */
    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    /**
     * @param getRadio metodo que utiliza la funcíon get
     *
     */
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}