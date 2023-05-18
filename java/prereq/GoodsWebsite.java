package prereq;

// import apple.laf.JRSUIState.TitleBarHeightState;

public class GoodsWebsite {

   public static void main(String[] args) {
      
      Listing item1 = new Listing();
      Listing item2 = new Listing();
      Listing item3 = new Listing();

      // TODO: Create three listings, setting the properties
      
   item1.setTitle("Nordic Vase");
   item1.setPrice(49.95);
   item1.setSize("S");
   item1.setAbout("Crafted stoneware from Copenhagen.");
   item1.setMaterial("Stoneware");


   item2.setTitle("Abstract Vase");
   item2.setPrice(99.95);
   item2.setSize("M");
   item2.setAbout("Unique artful piece of decor for any space.");
   item2.setMaterial("Glass");

   item3.setTitle("Opulent Vase");
   item3.setPrice(139.95);
   item3.setSize("L");
   item3.setAbout("A timeless handcrafted centrepiece.");
   item3.setMaterial("Crystal");

      // TODO: Output all of the item

      item1.printInfo();
      item2.printInfo();
      item3.printInfo();
   }
}