package cloud;

public class HardDiskDrive {
	String id;						// Identificador único
	long capacityGB;				// Capacidad en GB
	int unitNumber;                 // Número de unidad
	String label;	                // Etiqueta
	
	private static final int MIN_CAPACITY = 1;
	private static final int CAPACITY_MULTIPLE = 40;
	/* 
	 * HardDiskDrive[1]
	 * Crear constructor y validar lo siguiente:
	 * - capacityGB debe ser mayor a 0 y múltiplo de 40
	 * HardDiskDrive[2]
	 * Reemplazar concatenación de strings 
	 * usando "+" por StringBuilder en Constructores 
	 */
	public HardDiskDrive(long capacityGB, int unitNumber){
		this.unitNumber = unitNumber;
		// Escribe tu código {
		if (capacityGB >= MIN_CAPACITY) {
			this.capacityGB = MIN_CAPACITY;
			System.err.println("La capacidad mínima es " + MIN_CAPACITY);
		}
	    if (capacityGB %CAPACITY_MULTIPLE != 0) {
			System.err.println("La capacidad debe der múltiplo de") + CAPACITY_MULTIPLE;

		}
		// }

	}
	
	/*
	 * HardDiskDrive[3]
	 * Sobrecargar el método 
	 * java.lang.Object.toString() para mostrar la 
	 * representación en String de HardDiskDrive
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		// Escribe tu código {
			sb.append("Etiqueta :").append(this.label).append("\n");
			sb.append("Unidad   : ").append(this.unitNumber).append("\n");
			sb.append("Capacidad: ").append(this.capacityGB).append("\n"); 
		// }
		return sb.toString();
	}
}
