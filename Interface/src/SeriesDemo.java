//implements series.
class ByTwos implements Series{
    int start;
    int val;
    ByTwos(){
        start = val = 0;
    }
    public int getNext(){
        val += 2;
        return val;
    }
    public void reset(){
        start = val = 0;
    }
    public void setStart(int x){
        start = x;
        val = x;
    }
}
class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();
        for(int i = 0; i<5; i++)
            System.out.println("Next Value is "+ ob.getNext());
        System.out.println("\nResetting");
        ob.reset();
        for(int i = 0; i<5; i++)
            System.out.println("Next Value is "+ ob.getNext());
        System.out.println("\nResetting");
        ob.setStart(100);
        for(int i = 0; i<5; i++)
            System.out.println("Next Value is "+ ob.getNext());    
    }
}
