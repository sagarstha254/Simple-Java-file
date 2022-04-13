public class Staff{
    
    private int Staff_id;
    private String Staff_Name;
    private String Staff_Address;

    public Staff(int Staff_id, String Staff_Name)  /* constructing a method*/
    {
        this.Staff_Address =  "";
    }

    /*initializing getter method */
    public int getStaff_id(){
        return this.Staff_id;
    }

    public String getStaff_Name(){
        return this.Staff_Name;
    }

    public String getStaff_Address(){
        return this.Staff_Address;
    }

    /*
    public void setStaff_id(int Staff_id){
    this.Staff_id = Staff_id;
    }

    public void setStaff_Name(String Staff_Name){
    this.Staff_Name = Staff_Name;
    }

     */

    /* initializing setter method*/
    public void setStaff_Address(String Staff_Address){
        this.Staff_Address = Staff_Address;
    }

    /* constructing display method */
    public void display(){
        System.out.println(" The id of the staff is " + getStaff_id());
        System.out.println(" The name of the staff is " + getStaff_Name());
        System.out.println(" The address of the staff is " + getStaff_Address());

        if(this.Staff_Address != ""){                /* using conditional phase*/
            System.out.println(" The address of the staff is " + getStaff_Address());
        }

    }
}