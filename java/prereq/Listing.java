package prereq;

public class Listing {
   // These are examples properties
   private String title;
   private double price;

   // TODO: Add more properties
   private String size;
   private String about; 
   private String material;

   // TODO: Add your setter/getter here
   
   
   public void setTitle(String title) {
     this.title = title;
   }

   public String getTitle() {
      return this.title;
   }

   public void setPrice(double price) {
      this.price = price;
    }
 
    public double getPrice() {
       return this.price;
    }

    public void setSize(String size) {
      this.size = size;
    }
 
    public String getSize() {
       return this.size;
    }

    public void setAbout(String about) {
      this.about = about;
    }
 
    public String getAbout() {
       return this.about;
    }
   
    public void setMaterial(String material) {
      this.material = material;
    }
 
    public String getMaterial() {
       return this.material;
    }


   public void printInfo() {
      // TODO: Complete this to print out the information of the Listing
      System.out.println("Item: " + title);
      System.out.println("\tPrice: " + price);
      System.out.println("\tSize: " + size);
      System.out.println("\tAbout: " + about);
      System.out.println("\tMaterial: " + material);
      System.out.println();
   }
}