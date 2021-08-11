
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public int getPrice() {
        return this.squares * this.princePerSquare;
    }

    public int getSquares() {
        return squares;
    }

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return getSquares() > compared.getSquares();
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(getPrice() - compared.getPrice());
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return getPrice() > compared.getPrice();
    }
}
