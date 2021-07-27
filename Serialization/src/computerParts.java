import java.io.*;

public class computerParts implements Serializable{
	
	private String cpu;
	private String gpu;
	private String motherboard;
	private String ram;
	private transient String warrantyid;
	
	public computerParts() {
		
	}
	
	public computerParts(String Cpu, String Gpu, String Motherboard, String Ram, String warranty) {
		this.cpu = Cpu;
		this.gpu = Gpu;
		this.motherboard = Motherboard;
		this.ram = Ram;
		this.warrantyid = warranty;
	}
	
	public String getCpu() {
		return cpu;
	}
	
	public String getGpu() {
		return gpu;
	}
	
	public String getMotherboard() {
		return motherboard;
	}
	
	public String getRam() {
		return ram;
	}
	
	public String getWarrantyid() {
		return warrantyid;
	}
	
	//setters
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	
	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}
	
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public void setWarrantyid(String warrantyid) {
		this.warrantyid = warrantyid;
	}
 
	@Override
	public String toString() {
		return "CPU:" + getCpu() + "\nGPU:" + getGpu() + "\nMotherBoard:" + getMotherboard() + "\nRAM:" + getRam() + "\nWarranty ID:" + getWarrantyid();	
		}
	
	public boolean equals(Object obj) {
		if(obj instanceof computerParts) {
			computerParts p = (computerParts) obj;
				if(this.warrantyid == p.warrantyid) {
					return true;
				}else {
					return false;
				}
		}
		return false;
	}
	
	
	
}
