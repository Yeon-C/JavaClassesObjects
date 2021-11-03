public class Garfield {
    private String day;
    private boolean isPest;
    private int numL;
    private int numC;

    private String pestType;
    private boolean happy;

    public Garfield() {
    }

    public Garfield(String day) {
        this.day = day;
    }

    public Garfield(String day, int numL) {
        this.day = day;
        this.numL = numL;
    }
    public Garfield(String day, boolean isPest, int numL, int numC) {
        this.day = day;
        this.isPest = isPest;
        this.numL = numL;
        this.numC = numC;
    }

    public String getday() {
        return day;
    }

    public void setday(String day) {
        this.day = day;
    }
    
    public boolean isPest() {
        return isPest;
    }

    public void setPest(boolean isPest) {
        this.isPest = isPest;
    }

    public int getnumL() {
        return numL;
    }

    public void setnumL(int numL) {
        this.numL = numL;
    }

    public int getnumC() {
        return numC;
    }

    public void setnumC(int numC) {
        this.numC = numC;
    }

    public String getPestType() {
        return pestType;
    }

    public void setPestType(String pestType) {
        this.pestType = pestType;
    }
    


	public String Jon() {
		return "Can you change the TV channel Jon?";
	}
    public String Odie() {
		return "Go away Odie.";
	}
    public boolean hatesMonday(){
        return true;
    }

    public boolean checkHappy(){
        if(day.equalsIgnoreCase("Monday")){
            happy = false;
        }else{
            if(this.numL + this.numC >= 5){
                happy = true;
            }else if(this.numL + this.numC < 5 || numL <= 0){
                happy = false;
            }
        }
        return happy;
    }

    public void catchP(){
        if(isPest){
            if(pestType.equalsIgnoreCase("Spider")){
                System.out.println("I don't care how I feel, need to kill spiders.");
            }else if(pestType.equalsIgnoreCase("Odie")){
                System.out.println(this.Odie());
            }else if(pestType.equalsIgnoreCase("Jon")){
                System.out.println(this.Jon());
            }else if(day.equalsIgnoreCase("Monday")){
                if(!pestType.equalsIgnoreCase("Spider"))
                System.out.println("It's Monday, cut me some slack.");
            }
            else{
                if(happy){
                    System.out.println("I had lots of lasagna, I'll get those pests.");
                }else if (!happy){
                    System.out.println("I don't really feel like doing anything about it.");
                }
            }
        }
    }
    public static void main(String[] args) {

    }

}
    

