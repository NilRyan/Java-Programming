
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.advance(1);
    }

    public void advance(int increment) {
        this.day += increment;
        
        
        if (this.day > 30) {
            this.month = this.month + this.day / 30;
            this.day = increment % 30;

            if (this.month > 12) {
                this.year = this.year + this.month / 12;
                this.month = this.month % 12;
            }
        }   
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        int day = this.day + days;
        int month = this.month;
        int year = this.year;
        
        if (day > 30) {
            month = month + day / 30;
            day = days % 30;

            if ( month > 12) {
                year = year + month / 12;
                month= month % 12;
            }
        } 
        
        SimpleDate newDate = new SimpleDate(day, month, year);
        
        return newDate;
    }

}
