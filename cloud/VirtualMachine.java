package cloud;


import java.util.HashMap;

import cloud.util.CloudUtil;

public class VirtualMachine {
	final String id;         // Identificador único
	int cpuCount;            // Número de CPU
	long memoryGB;           // Memoria en GB
	boolean powerStatus;     // Estado
	String name;             // Nombre
	String guestOS;          // Sistema Operativo
	
	/* 
	 * VirtualMachine[1]:
	 * Variable nics de ser un arreglo de
	 * tipo NetworkCard a un HashMap de tipo 
	 * HashMap<Integer, NetworkCard> 
	 */
	HashMap<Integer, NetworkCard> nics;  // Tarjetas de Red Virtuales
	/*
	 * VirtualMachine[10]
	 * Agregar variable hdds de tipo 
	 * HashMap<Integer, HardDiskDrive>
	 */
	HashMap<Integer, HardDiskDrive> hdds;            // Discos duros virtuales

	private static final int MIN_CPUS = 1;
	private static final long MIN_MEMORY = 1024;
	private static final int MIN_NAME_LEN = 5;
	/*
	 * VirtualMachine[6]
	 * Constructor debe validar lo siguiente:
	 * - cpuCount(int) mayor a 0
	 * - memoryGB(long) mayor o igual a 1024 y/o múltiplo de 1024
	 * - name(String) mayor a 5 caracteres
	 * - guestOS(String) mayor a 5 caracteres
	 */
	VirtualMachine(int cpuCount, long memoryGB, String guestOS){
		// Escribe tu código {
		if  (cpuCount < MIN_CPUS) {
			this.cpuCount = MIN_CPUS;
			System.out.println ("La cantidad minima de CPUs es" + MIN_CPUS);
		}
		if  (memoryGB < MIN_MEMORY && memoryGB % MIN_MEMORY != 0) {
			this.memoryGB = MIN_MEMORY;
			System.err.println ("La cantidad minima de memoria es " + MIN_MEMORY);
		}
		if  (guestOS.lenght() < MIN_NAME_LEN) {
			System.err.println("La longitud minima del Guest OS es" + MIN_NAME_LEN);
		}
		this.guestOS = guestOS;
		// }
		this.id = CloudUtil.getUUID();
	}
	
	VirtualMachine(int cpuCount, long memoryGB, String name, String guestOS){
		// Escribe tu código {
		
		this.guestOS = guestOS;
		// }
		this.id = CloudUtil.getUUID();
	}
	
	String getID(){
		return this.id;
	}
	/*
	 * VirtualMachine[9]
	 * Crear método isPoweredOn regresando 
	 * un Boolean si la VM está prendida.
	 */
	boolean isPoweredOn() {
		/* Validar si la VM está prendida */
		// Escribe tu código {

		// }
		}
	/*
	 * VirtualMachine[8]
	 * Crear método isPoweredOff regresando 
	 * un Boolean si la VM está apagada.
	 */
	boolean isPoweredOff(){
		// Escribe tu código {

		// }
	}
	
	int numberOfCPUs() {
		/* Obtener el número de CPUs de la VM */
		return this.cpuCount;
		}
	/* 
	 * VirtualMachine[4]
	 * Complementar Método powerOn: validar si la
	 *  VM está prendida e imprimir mensaje 
	 * informando que el estado es prendido.
	 */
	void powerOn() {
		/* Encender la VM */
		// Escribe tu código {
			this.powerStatus = true;
			System.out.println("La maquina virtual esta encendida");
		// }
		}
	
	/* 
	 * VirtualMachine[5]
	 * Método powerOff: validar si la VM está apagada
	 * e imprimir mensaje informando que el estado es apagado.
	 */
	void powerOff() {
		// Escribe tu código {
			this.powerStatus = false;
			System.out.println ("La maquina virtual esta apagada");
		// }
		}
	
	void setName(String name) {
		/* Asignar nombre a la VM */
		this.name = name;
		}
	/* 
	 * VirtualMachine[2]
	 * Complementar Método addNIC(NetworkCard nic). 
	 * el id debe ser el valor de unitNumber
	 */
	void addNIC(NetworkCard nic) {
		/* Agregar NIC a la VM */
		// Escribe tu código {
			this.nics.put(nic.unitNumber, nic);
		// }
		}
	
	/* 
	 * VirtualMachine [3]
	 * Complementar Método addNICs 
	 * (HashMap<Integer, NetworkCard> nics)
	 */
	void addNICs(HashMap<Integer, NetworkCard> nics){
		/* Inicializar nics con un arrayList*/
		// Escribe tu código {
			this.nics = nics;
		// }
	}
	
	/*
	 * VirtualMachine 11
	 * Crear Métodos addHDD(HardDiskDrive hdd) y 
	 * addHDDs(HashMap<Integer, HardDiskDrive>) 
	 */
	void addHDD(HardDiskDrive hdd){
		/* Agregar HDD a la VM */
		// Escribe tu código {

		// }	
	}
	
	void addHDDs(HashMap<Integer, HardDiskDrive> hdds){
		/* Agregar HDDs a la VM */
		// Escribe tu código {

		// }	
	}
	/*
	 * VirtualMachine[7]
	 * Sobrecargar el método java.lang.Object.toString() para mostrar
	 *  la representación en String de VirtualMachine 
	 *  como lo hacía CloudUtil.printVMInfo() incluyendo:
	 *  - Los objetos NICs
	 *  - Los objetos HDDs
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		// Escribe tu código {

		// }
		return sb.toString();
	}
}
