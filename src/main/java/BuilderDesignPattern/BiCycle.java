package BuilderDesignPattern;

public class BiCycle {
    private int gears;
    private int stands;
    private int seats;

    private int carrier;

    public BiCycle(Builder builder)
    {
        this.gears=builder.gears;
        this.stands=builder.stands;
        this.seats=builder.seats;
        this.carrier=builder.carrier;
    }

    public int getGears() {
        return gears;
    }

    public int getStands() {
        return stands;
    }

    public int getSeats() {
        return seats;
    }
    public int getCarrier() {
        return carrier;
    }

    public static class Builder {
        private int gears;
        private int stands;
        private int seats;
        private int carrier;

        public Builder() {

        }

        public Builder gears(int gears)
        {
            this.gears = gears;
            return this;
        }
        public Builder stands(int stands)
        {
            this.stands = stands;
            return this;
        }
        public Builder seats(int seats)
        {
            this.seats = seats;
            return this;
        }
        public Builder carrier(int carrier)
        {
            this.carrier = carrier;
            return this;
        }
        public BiCycle build()
        {
            return new BiCycle(this);
        }
    }
}
