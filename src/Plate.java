class Plate {
    public Plate(int food) {
        this.food = food;
    }
    private int food;
    public void info(){
        System.out.println(food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food += food;
    }
    public void decreaseFood(int n){
        if(food >= n) {
            food -= n;
                    } else{
            System.out.println("Мало еды!");
        }
    }


}
class Cat {
    private String name;
    private int appetite;
    protected boolean feelFull = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate p){
        p.decreaseFood(appetite);

    }

    public boolean isFeelFull() {
        return feelFull;
    }

    public void setFeelFull(boolean feelFull) {
        this.feelFull = feelFull;
    }
    public void feelFull(Plate p){
        if(p.getFood() > appetite){
            feelFull = true;
        }
    }

}
class Main{
    public static void main(String[] args) {
        Plate plate = new Plate(110);
        plate.setFood(100);
        Cat[] cats = {new Cat("Vaska", 60), new Cat("Murzik", 40), new Cat ("Barsik", 80)};
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].feelFull(plate);
            cats[i].eat(plate);
            System.out.println("Накормить котика " + cats[i].getName() + ": " + cats[i].isFeelFull());
        }

        plate.info();


    }
}