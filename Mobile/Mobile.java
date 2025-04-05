public class Mobile {
    private String mobileOwnerName;
    private String mobileNumber;
    private double mobileBalance;
    private String mobileOSName;
    private boolean lock; 

   
    public Mobile() {}

 
    public Mobile(String mobileOwnerName, String mobileNumber, double mobileBalance, String mobileOSName, boolean lock) {
        this.mobileOwnerName = mobileOwnerName;
        this.mobileNumber = mobileNumber;
        this.mobileBalance = mobileBalance;
        this.mobileOSName = mobileOSName;
        this.lock = lock;
    }

    
    public void setMobileOwnerName(String mobileOwnerName) {
		this.mobileOwnerName = mobileOwnerName; }
	public String getMobileOwnerName() { 
	    return mobileOwnerName; }
    public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber; }
	public String getMobileNumber() { 
	    return mobileNumber; }
    public void setMobileBalance(double mobileBalance) { 
	    this.mobileBalance = mobileBalance; }
	public double getMobileBalance() {
		return mobileBalance; }
    public void setMobileOSName(String mobileOSName) { 
	    this.mobileOSName = mobileOSName; }
	public String getMobileOSName() { 
	    return mobileOSName; }
    public void setLock(boolean lock) { 
	    this.lock = lock; }
	public boolean isLocked() { 
	    return lock; }
 
    public void showDetails() {
        if (lock) {
            System.out.println("Phone is locked. Unlock it to see details.");
        } else {
            System.out.println("Owner Name: " + mobileOwnerName);
            System.out.println("Mobile Number: " + mobileNumber);
            System.out.println("Balance: " + mobileBalance);
            System.out.println("OS: " + mobileOSName);
            System.out.println("Lock Status: " + (lock ? "Locked" : "Unlocked"));
        }
    }

   
    public void recharge(int amount) {
        if (lock) {
            System.out.println("Phone is locked. Unlock it to recharge.");
        } else {
            mobileBalance += amount;
            System.out.println("Recharged " + amount + " Taka. New balance: " + mobileBalance);
        }
    }

   
    public float adjustAfterCall(float timeDuration, float costPerMinute) {
        if (lock) {
            System.out.println("Phone is locked. Unlock it to make a call.");
            return 0;
        }

        float cost = timeDuration * costPerMinute;
        if (cost > mobileBalance) {
            System.out.println("Insufficient balance. Cannot make the call.");
            return 0;
        }

        mobileBalance -= cost;
        System.out.println("Call duration: " + timeDuration + " minutes. Cost: " + cost);
        System.out.println("New balance: " + mobileBalance);
        return cost;
    }
}
