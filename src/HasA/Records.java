package HasA;

import Inheritance.Patients;
import Interface.Interface;

public class Records implements Interface {
	private String medicalImage;
	private String branch;
	private String date;
	private static int numOfRecord=0;
	
	
	public Records() {
	}

	public Records(String medicalImage, String branch,String date) {
		this.medicalImage = medicalImage;
		this.branch = branch;
		this.date=date;
		numOfRecord++;
	}

	
	public String getBranch() {
		return branch;
	}

	@Override
	public String toString() {
		return "\nBranch: " + branch + "\nDate:" + date+"\n";
	}


	@Override
	public String GenerateImageName(int branch) {
		String[] image = new String[] { "cardiac", "neuro", "ortho" };
		return image[branch];
		
	}

	public static int getNumOfRecord() {
		return numOfRecord;
	}
	
	
	
}