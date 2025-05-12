package template_method.example;

public abstract class HouseTemplate {

    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();

        System.out.println("House is built...");
    }

    // default implementation, hook method
    private void buildWindows(){
        System.out.println("Installing glass windows.");
    }

    public abstract void buildWalls();
    public abstract void buildPillars();

    private void buildFoundation(){
        System.out.println("Building foundations with cement, iron rods and sand.");
    }

}

class WoodenHouse extends HouseTemplate{
    @Override
    public void buildWalls() {
        System.out.println("Building wooden walls.");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building pillars with wood coating.");
    }
}

class GlassHouse extends HouseTemplate{
    @Override
    public void buildWalls() {
        System.out.println("Building glass walls.");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building pillars with glass coating.");
    }
}