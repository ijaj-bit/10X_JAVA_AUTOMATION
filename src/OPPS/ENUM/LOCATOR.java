package OPPS.ENUM;


enum Locators {
    page_button("#btn"),
    page_input("#input2");

    private String Locators;

    Locators(String Locators)
    {
        this.Locators=Locators;
    }
    String getLocators(){
        return this.Locators;
    }

}