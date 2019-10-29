package cloud;

import cloud.exceptions.CloudGenericException;

public class Main {

	public static void createVM(int memory, int cpu, int diskCapacity, int suffix, String os)
			throws CloudGenericException
	{
		String name = "VirtualMachine_" + suffix;
		VirtualMachine vm = new VirtualMachine(cpu, memory, name, os);
	
		NetworkCard nic1 = new NetworkCard("133.33.33.33", 2, 1000);
		vm.addNIC(nic1);

		HardDiskDrive hdd1 = new HardDiskDrive(diskCapacity, 1);
		vm.addHDD(hdd1);
	
		// 5. Imprimiendo variables de VM1
		System.out.println(vm.toString());

		// 6. Imprimiendo variables de VM1.nics
		vm.nics.forEach((id, nic) -> {
			System.out.println(nic.toString());
		});
		// }
		
		// 7. Imprimiendo variables de VM1.hdds
		vm.hdds.forEach((id, hdd) -> {
			System.out.println(hdd.toString());
		});

		return;
	}

	// Método principal
	public static void main(String[] args) {
		int[] memories = {0, 1024, 2048, 4096};
		int[] cpus = {2, 1, 0, 2};
		int[] disks = {10, 0, 40, 10};
		String[] os = {"Ubuntu", "CentOS", "Windows", "OSX"};

		try {
			for (int i = 0; i < 4; i++) {
				Main.createVM(memories[i], cpus[i], disks[i], i, os[i]);
			}		
		} catch(Exception e) {
			System.err.println("Hubo un error: " + e.toString());
			return;
		}

	}
	
}
